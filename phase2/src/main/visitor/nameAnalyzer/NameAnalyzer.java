package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.security.spec.ECField;
import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        //TODO: addFunctions,
        //Code handles duplicate function declarations by renaming and adding them to the symbol table.
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
            }
        }

        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
            }
        }
        //TODO:visitFunctions
        //Iterates over function declarations, assigns symbol tables, visits declarations, and manages symbol table stack.
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        //visitPatterns
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            patternDeclaration.accept(this);
        }
        //visitMain
        program.getMain().accept(this);
        return null;
    }

    public Void visit(MainDeclaration mainDeclaration){
        SymbolTable mainSymbolTable = new SymbolTable();
        SymbolTable.push(mainSymbolTable);
        for (Statement statement:mainDeclaration.getBody()){
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    public Void visit(ReturnStatement returnStatement){
        if (returnStatement.hasRetExpression()){
            returnStatement.getReturnExp().accept(this);
        }
        return null;
    }

    public Void visit(IfStatement ifStatement){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        for (Expression expression: ifStatement.getConditions()){
            expression.accept(this);
        }
        for (Statement statement: ifStatement.getThenBody()){
            statement.accept(this);
        }
        for (Statement statement: ifStatement.getElseBody()){
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    public Void visit(PutStatement putStatement){
        if (putStatement.getExpression() != null)
            putStatement.getExpression().accept(this);
        return null;
    }

    public Void visit(LenStatement lenStatement){
        if (lenStatement.getExpression() != null)
            lenStatement.getExpression().accept(this);
        return null;
    }
    public Void visit(PushStatement pushStatement){
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    public Void visit(LoopDoStatement loopDoStatement){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        for (Expression expression:loopDoStatement.getLoopConditions())
            expression.accept(this);

        for (Statement statement:loopDoStatement.getLoopBodyStmts())
            statement.accept(this);

        if (loopDoStatement.getLoopRetStmt() != null)
            loopDoStatement.getLoopRetStmt().accept(this);
        SymbolTable.pop();
        return null;
    }

    public Void visit(ForStatement forStatement){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        Identifier identifier = forStatement.getIteratorId();
        VarItem iteratorId = new VarItem(identifier);
        try{
            symbolTable.put(iteratorId);
        }catch (ItemAlreadyExists ignore){}

        for (Expression expression:forStatement.getRangeExpressions())
            expression.accept(this);

        for (Statement statement:forStatement.getLoopBody())
            statement.accept(this);

        for (Expression expression:forStatement.getLoopBodyExpressions())
            expression.accept(this);
        if (forStatement.getReturnStatement() != null)
            forStatement.getReturnStatement().accept(this);
        SymbolTable.pop();
        return null;
    }

    public Void visit(MatchPatternStatement matchPatternStatement){
        try{
            SymbolTableItem pattern = SymbolTable.top.getItem(matchPatternStatement.getPatternId().getName());
            if (!(pattern instanceof PatternItem)){
                nameErrors.add(new PatternNotDeclared(matchPatternStatement.getLine(),
                        matchPatternStatement.getPatternId().getName()));
            }
        }catch (ItemNotFound itemNotFound){
            nameErrors.add(new PatternNotDeclared(matchPatternStatement.getLine(),
                    matchPatternStatement.getPatternId().getName()));
        }
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    public Void visit(ChopStatement chopStatement){
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    public Void visit(ChompStatement chompStatement){
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    public Void visit(AssignStatement assignStatement){
        Identifier identifier = assignStatement.getAssignedId();
//        identifier.accept(this);
        if (assignStatement.getAssignExpression() != null)
            assignStatement.getAssignExpression().accept(this);
        VarItem assignedId = new VarItem(identifier);
        if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN) {
            try {
                SymbolTable.top.put(assignedId);
            } catch (ItemAlreadyExists ignore) {
            }
            if (assignStatement.isAccessList()) {
                assignStatement.getAccessListExpression().accept(this);
            }
        }else{
            assignStatement.getAssignedId().accept(this);
        }
        return null;
    }

    public Void visit(ExpressionStatement expressionStatement){
        if (expressionStatement.getExpression() != null)
            expressionStatement.getExpression().accept(this);
        return null;
    }

    public Void visit(VarDeclaration varDeclaration){
        VarItem name = new VarItem(varDeclaration.getName());
        if (varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);
        try{
            SymbolTable.top.put(name);
        }catch (ItemAlreadyExists ignore){}
//        varDeclaration.getName().accept(this);
        return null;
    }

    public Void visit(FunctionDeclaration functionDeclaration){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
//        functionDeclaration.getFunctionName().accept(this);
        for (VarDeclaration varDeclaration:functionDeclaration.getArgs()){
            if (varDeclaration.getName().getName().equals(functionDeclaration.getFunctionName().getName())){
                nameErrors.add(new IdenticalArgFunctionName(varDeclaration.getLine(),
                        varDeclaration.getName().getName()));
            }else{
                VarItem var = new VarItem(varDeclaration.getName());
                try{
                    symbolTable.put(var);
                }catch (ItemAlreadyExists itemAlreadyExists){
                    try{
                        SymbolTableItem item = symbolTable.getItem(var.getName());
                        if (item instanceof VarItem){
                            nameErrors.add(new DuplicateArg(varDeclaration.getLine(),
                                    varDeclaration.getName().getName()));
                        }
                    }catch (ItemNotFound ignore){}
                }
            }
            varDeclaration.accept(this);
        }
        for (Statement statement:functionDeclaration.getBody()){
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    public Void visit(PatternDeclaration patternDeclaration){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        if (patternDeclaration.getTargetVariable().getName().equals(patternDeclaration.getPatternName().getName())){
            nameErrors.add(new IdenticalArgPatternName(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
        }
        VarItem item = new VarItem(patternDeclaration.getTargetVariable());
        try{
            SymbolTable.top.put(item);
        }catch (ItemAlreadyExists ignore){}
        patternDeclaration.getTargetVariable().accept(this);
        for (Expression expression: patternDeclaration.getConditions()){
            expression.accept(this);
        }
        for (Expression expression: patternDeclaration.getReturnExp()){
            expression.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    public Void visit(AppendExpression appendExpression){

        if (appendExpression.getAppendee() != null)
            appendExpression.getAppendee().accept(this);
        for (Expression expression:appendExpression.getAppendeds()){
            expression.accept(this);
        }
        return null;
    }

    public Void visit(BinaryExpression binaryExpression){
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    public Void visit(UnaryExpression unaryExpression){
        unaryExpression.getExpression().accept(this);
        return null;
    }

    public Void visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()){
            if (accessExpression.getAccessedExpression() instanceof Identifier){
                try{
                    SymbolTableItem item = SymbolTable.top.getItem(((Identifier) accessExpression.getAccessedExpression()).getName());
                    if (!(item instanceof FunctionItem)){
                        nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(),
                                ((Identifier) accessExpression.getAccessedExpression()).getName()));
                    }else{
                        FunctionDeclaration funDec = ((FunctionItem) item).getFunctionDeclaration();
                        int cntMin = 0;
                        int cntMax = funDec.getArgs().size();
                        for (VarDeclaration var:funDec.getArgs()){
                            if (var.getDefaultVal() == null)
                                cntMin += 1;
                        }
                        if (accessExpression.getArguments().size() < cntMin || accessExpression.getArguments().size() > cntMax){
                            nameErrors.add(new ArgMisMatch(accessExpression.getLine(),
                                    funDec.getFunctionName().getName()));
                        }
                    }
                }catch (ItemNotFound itemNotFound){
                    nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(),
                            ((Identifier) accessExpression.getAccessedExpression()).getName()));
                }

            }
            else if(accessExpression.getAccessedExpression() instanceof LambdaExpression){
                int cntMin = 0;
                int cntMax = ((LambdaExpression) accessExpression.getAccessedExpression()).getDeclarationArgs().size();
                for (VarDeclaration var:((LambdaExpression) accessExpression.getAccessedExpression()).getDeclarationArgs()){
                    if (var.getDefaultVal() == null)
                        cntMin+=1;
                }
                if (accessExpression.getArguments().size() < cntMin || accessExpression.getArguments().size() > cntMax){
                    nameErrors.add(new ArgMisMatch(accessExpression.getLine(), "lambda"));
                }
                accessExpression.getAccessedExpression().accept(this);
            }
        }
        else
            accessExpression.getAccessedExpression().accept(this);
        for (Expression expression:accessExpression.getDimentionalAccess()){
            expression.accept(this);
        }
        for (Expression expression: accessExpression.getArguments()){
            expression.accept(this);
        }
        return null;
    }

    public Void visit(LambdaExpression lambdaExpression){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        for (VarDeclaration varDeclaration:lambdaExpression.getDeclarationArgs()){
            varDeclaration.accept(this);
        }
        for (Statement statement: lambdaExpression.getBody()){
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    public Void visit(ListValue listValue){
        for (Expression expression:listValue.getElements())
            expression.accept(this);
        return null;
    }

    public Void visit(FunctionPointer functionPointer) {
        try {
            SymbolTableItem item = SymbolTable.top.getItem(functionPointer.getId().getName());
            if (!(item instanceof FunctionItem)){
                nameErrors.add(new FunctionNotDeclared(functionPointer.getLine(),
                        functionPointer.getId().getName()));
            }
        }catch (ItemNotFound itemNotFound){
            nameErrors.add(new FunctionNotDeclared(functionPointer.getLine(),
                    functionPointer.getId().getName()));
        }
        return null;
    }

    public Void visit(Identifier identifier){
        try{
            SymbolTable.top.getItem(identifier.getName());
        }catch (ItemNotFound itemNotFound){
            nameErrors.add(new VariableNotDeclared(identifier.getLine(),
                    identifier.getName()));
        }
        return null;
    }

}