package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;
import java.util.function.Function;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    public ArrayList<Type> returnTypes = new ArrayList<>();

    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < currentArgTypes.size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
            for (int i = currentArgTypes.size(); i < functionDeclaration.getArgs().size(); i++){
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                Type type = functionDeclaration.getArgs().get(i).getDefaultVal().accept(this);
                argItem.setType(type);
                try{
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}
        returnTypes = new ArrayList<>();
        for(Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }
        if (returnTypes.isEmpty()) {
            SymbolTable.pop();
            return new NoType();
        }
        for (int i = 1; i < returnTypes.size(); i++) {
            if (!returnTypes.get(i).sameType(returnTypes.get(i-1))) {
                typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getFunctionName().getLine(),
                        functionDeclaration.getFunctionName().getName()));
                SymbolTable.pop();
                return new NoType();
            }
        }
        //TODO:Figure out whether return types of functions are not the same.
        //done
        SymbolTable.pop();
        if (returnTypes.isEmpty())
            return new NoType();
        return returnTypes.get(0);
        //TODO:Return the infered type of the function
        //done
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
            //TODO:1-figure out whether return expression of different cases in pattern are of the same type/2-return the infered type
        }catch (ItemNotFound ignored){}
        returnTypes = new ArrayList<>();
        Type returnType = new NoType();
        for(Expression expression : patternDeclaration.getReturnExp()) {
            returnType =  expression.accept(this);
        }
        SymbolTable.pop();
        return returnType;
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        for (Statement statement:mainDeclaration.getBody()){
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            //TODO:function is called here.set the arguments type and visit its declaration
            //done
            try{
                FunctionItem functionItem = (FunctionItem)SymbolTable.root.getItem(FunctionItem.START_KEY +
                        ((Identifier)accessExpression.getAccessedExpression()).getName());
                ArrayList<Type> argTypes = new ArrayList<>();
                for (Expression arg : accessExpression.getArguments()) {
                    argTypes.add(arg.accept(this));
                }
                functionItem.setArgumentTypes(argTypes);
                Type functionType = functionItem.getFunctionDeclaration().accept(this);
                if (functionType instanceof NoType){
                    return new NoType();
                }
                if (!accessExpression.getDimentionalAccess().isEmpty()){
                    Type type = accessExpression.getDimentionalAccess().get(0).accept(this);
                    if (!(type instanceof IntType)){
                        typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                        return new NoType();
                    }
                    // TODO nemidoonam NoType ro che konam
                    if (!(functionType instanceof StringType) && !(functionType instanceof ListType)){
                        typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                        return new NoType();
                    }
                    if (functionType instanceof StringType)
                        return new StringType();
                    return ((ListType)functionType).getType();
                }
                return functionType;
            }catch (ItemNotFound ignored){}
            return new NoType();
        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            //TODO:index of access list must be int
            //done
            boolean noType = false;
            for (Expression index : accessExpression.getDimentionalAccess()) {
                Type typeInd = index.accept(this);
                if (!(typeInd instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(index.getLine()));
                    noType = true;
                }
            }
            if (accessedType instanceof NoType) noType = true;

            if (noType) return new NoType();
            if (accessedType instanceof StringType){
                return new StringType();
            }
            return ((ListType)accessedType).getType();
        }
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        // TODO:Visit return statement.Note that return type of functions are specified here
        //done
        Expression returnExp = returnStatement.getReturnExp();
        if (returnExp == null)
            return new NoType(); //void??
        else {
            Type type = returnExp.accept(this);
            if (!(type instanceof NoType))
                returnTypes.add(type);
            return type;
        }
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        //
        System.out.println(expressionStatement.getLine());
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type type = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(type);
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            // TODO:assignment to list
            //done
            VarItem listIdentifier = null;
            try {
                listIdentifier = (VarItem) SymbolTable.top.getItem("VAR:" + assignStatement.getAssignedId().getName());
                if (!(listIdentifier.getType() instanceof ListType) && !(listIdentifier.getType() instanceof StringType)){
                    typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                }
            }
            catch (ItemNotFound ignore){}
            Type accessExpressionType = assignStatement.getAccessListExpression().accept(this);
            if (!(accessExpressionType instanceof IntType)){
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
            }
            Type assignExpressionType = assignStatement.getAssignExpression().accept(this);
            if (!assignExpressionType.sameType(((ListType)listIdentifier.getType()).getType())) {
                typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
            }
        }
        else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            Type expressionType = assignStatement.getAssignExpression().accept(this);
            newVarItem.setType(expressionType);
            // TODO:maybe new type for a variable
            //done
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored){
                SymbolTable.top.delete(newVarItem);
                try{
                    SymbolTable.top.put(newVarItem);
                }catch (ItemAlreadyExists ignore){}
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(PushStatement pushStatement){
        //TODO:visit push statement
        //done
        Type initialType = pushStatement.getInitial().accept(this);
        Type toBeAddedType = pushStatement.getToBeAdded().accept(this);
        if (!(initialType instanceof ListType) && !(initialType instanceof StringType)){
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            return new NoType();
        }
        if ((initialType instanceof StringType)){
            if (!(toBeAddedType instanceof StringType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                return new NoType();
            }
            return new NoType();
        }
        else {
            if (((ListType) initialType).isTypeSet()) {
                if (toBeAddedType.sameType(((ListType) initialType).getType()))
                    return new NoType();
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                return new NoType();
            }
            if (pushStatement.getInitial() instanceof Identifier identifier) {
                try {
                    VarItem initItem = (VarItem) SymbolTable.top.getItem("VAR:" + identifier.getName());
                    if (((ListType)initItem.getType()).isTypeSet()){
                        if (toBeAddedType.sameType(((ListType) initItem.getType()).getType()))
                            return new NoType();
                        typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                        return new NoType();
                    }else {
                        ((ListType) initItem.getType()).setType(toBeAddedType);
                        return new NoType();
                    }
                }catch (ItemNotFound ignored){}

            }
        }

        if (((ListValue) pushStatement.getInitial()).getElements().isEmpty()){

        }
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        //TODO:visit putStatement
        //done
        putStatement.getExpression().accept(this);
        return new NoType();

    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        // TODO:visit listValue
        //done
        ListType listType = new ListType(new IntType());
        if (!listValue.getElements().isEmpty()){
            Type firstType = listValue.getElements().get(0).accept(this);
            listType.setType(firstType);
            boolean error = false;
            for (Expression element:listValue.getElements()){
                Type elementType = element.accept(this);
                if (!elementType.sameType(firstType)){
                    error = true;
                }
            }
            if (error) {
                typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
                return new NoType();
            }
        }
        return listType;
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        //TODO:visit binary expression
        //done
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        if (firstType instanceof NoType || secondType instanceof NoType) {
            return new NoType();
        }
        if (!firstType.sameType(secondType)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new NoType();
        }
        if (!(firstType instanceof FloatType) && !(firstType instanceof IntType)){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().name()));
            return new NoType();
        }
        BinaryOperator operator = binaryExpression.getOperator();
        if (operator.equals(BinaryOperator.DIVIDE) ||
        operator.equals(BinaryOperator.MINUS) ||
        operator.equals(BinaryOperator.MULT) ||
        operator.equals(BinaryOperator.PLUS))
            return firstType;
        return new BoolType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        //TODO:visit unaryExpression
        //done
        Type type = unaryExpression.getExpression().accept(this);
        UnaryOperator op = unaryExpression.getOperator();
        if (((type instanceof IntType) || (type instanceof FloatType)) && op != UnaryOperator.NOT)
            return type;
        if (type instanceof BoolType && op == UnaryOperator.NOT)
            return type;
        typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
        return new NoType();
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        // TODO:visit Identifier
        //done
        try {
            VarItem varItem = (VarItem) SymbolTable.top.getItem("VAR:" + identifier.getName());
            return varItem.getType();
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(LenStatement lenStatement){
        //TODO:visit LenStatement.Be carefull about the return type of LenStatement.
        //done
        Type type = lenStatement.getExpression().accept(this);
        if (!(type instanceof StringType) && !(type instanceof ListType)){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        }
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();
        if(rangeType.equals(RangeType.LIST)){
            // TODO --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
            //done
            ListType listType = new ListType(new IntType());
            ArrayList<Expression> listVals = rangeExpression.getRangeExpressions();
            if (!listVals.isEmpty()){
                Type firstType = listVals.get(0).accept(this);
                listType.setType(firstType);
                boolean error = false;
                for (Expression element:listVals){
                    Type elementType = element.accept(this);
                    if (!elementType.sameType(firstType)){
                        error = true;
                    }
                }
                if (error) {
                    typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                    return new NoType();
                }
            }
            return listType.getType();
        }
        else if (rangeType.equals(RangeType.DOUBLE_DOT)) {
            ArrayList<Expression> vals = rangeExpression.getRangeExpressions();
            Type firstType = vals.get(0).accept(this);
            Type secondType = vals.get(1).accept(this);
            if (!(firstType instanceof IntType) || !(secondType instanceof IntType)) {
                typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
            }
            return new IntType();
        }
        else {
            try {
                Identifier id = (Identifier) rangeExpression.getRangeExpressions().get(0);
                VarItem varItem = (VarItem) SymbolTable.top.getItem("VAR:" + id.getName());
                if (!(varItem.getType() instanceof ListType)) {
                    typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                    return new NoType();
                }
                return ((ListType)varItem.getType()).getType();
            }
            catch(ItemNotFound ignored){}
            return new NoType();
        }
    }
}
