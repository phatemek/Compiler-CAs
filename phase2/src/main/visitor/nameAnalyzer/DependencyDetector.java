package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
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
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        return null;
    }
    //TODO:visit function declarations and construct dependency graph
    public Void visit(FunctionDeclaration functionDeclaration){
        SymbolTable.root = new SymbolTable();
        for (VarDeclaration varDeclaration:functionDeclaration.getArgs())
            varDeclaration.accept(this);
        for (Statement statement:functionDeclaration.getBody()){
            statement.accept(this);
        }
        ArrayList<String> adj = SymbolTable.root.keyList();
        for (String u:adj){
            if (u != functionDeclaration.getFunctionName().getName())
                dependencyGraph.addEdge(functionDeclaration.getFunctionName().getName(), u);
        }
        return null;
    }

    public Void visit(ReturnStatement returnStatement){
        if (returnStatement.hasRetExpression()){
            returnStatement.getReturnExp().accept(this);
        }
        return null;
    }

    public Void visit(IfStatement ifStatement){
        for (Expression expression: ifStatement.getConditions()){
            expression.accept(this);
        }
        for (Statement statement: ifStatement.getThenBody()){
            statement.accept(this);
        }
        for (Statement statement: ifStatement.getElseBody()){
            statement.accept(this);
        }
        return null;
    }

    public Void visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }

    public Void visit(LenStatement lenStatement){
        lenStatement.getExpression().accept(this);
        return null;
    }
    public Void visit(PushStatement pushStatement){
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    public Void visit(LoopDoStatement loopDoStatement){
        for (Expression expression:loopDoStatement.getLoopConditions())
            expression.accept(this);

        for (Statement statement:loopDoStatement.getLoopBodyStmts())
            statement.accept(this);

        return null;
    }

    public Void visit(ForStatement forStatement){
        Identifier identifier = forStatement.getIteratorId();
        VarItem iteratorId = new VarItem(identifier);
        for (Expression expression:forStatement.getRangeExpressions())
            expression.accept(this);

        for (Statement statement:forStatement.getLoopBody())
            statement.accept(this);

        for (Expression expression:forStatement.getLoopBodyExpressions())
            expression.accept(this);
        if (forStatement.getReturnStatement() != null)
            forStatement.getReturnStatement().accept(this);
        return null;
    }

    public Void visit(MatchPatternStatement matchPatternStatement){
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
        assignStatement.getAssignExpression().accept(this);
        if (assignStatement.isAccessList()){
            assignStatement.getAccessListExpression().accept(this);
        }
        return null;
    }

    public Void visit(ExpressionStatement expressionStatement){
        expressionStatement.getExpression().accept(this);
        return null;
    }

    public Void visit(VarDeclaration varDeclaration){
        if (varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);
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
                VarItem item = new VarItem(((Identifier) accessExpression.getAccessedExpression()));
                try{
                    SymbolTable.root.put(item);
                }catch (ItemAlreadyExists ignore){}
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
        for (VarDeclaration varDeclaration:lambdaExpression.getDeclarationArgs()){
            varDeclaration.accept(this);
        }
        for (Statement statement: lambdaExpression.getBody()){
            statement.accept(this);
        }
        return null;
    }

    public Void visit(ListValue listValue){
        for (Expression expression:listValue.getElements())
            expression.accept(this);
        return null;
    }



    public Void findDependency(){
        //TODO:find dependencies by analyzing dependency graph
        ArrayList<List<String>> cycles = dependencyGraph.findCycles();
        for (List<String> cycle:cycles){
            dependencyError.add(new CircularDependency(cycle));
        }
        return null;
    }

}
