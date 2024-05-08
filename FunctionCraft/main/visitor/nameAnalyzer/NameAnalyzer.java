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
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        //TODO: addFunctions,
        //Code handles duplicate function declarations by renaming and adding them to the symbol table.
        int duplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                duplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + String.valueOf(duplicateFunctionId);
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItem = new FunctionItem(functionDeclaration);
                functionItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }
        //TODO:visitFunctions
        //Iterates over function declarations, assigns symbol tables, visits declarations, and manages symbol table stack.
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            functionDeclaration.accept(this);
            visitingFunctionIndex += 1;
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            patternDeclaration.accept(this);
            visitingPatternIndex += 1;
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
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        for (Expression expression:loopDoStatement.getLoopConditions()){
            expression.accept(this);
        }
        for (Statement statement:loopDoStatement.getLoopBodyStmts()){
            statement.accept(this);
        }
        loopDoStatement.getLoopRetStmt().accept(this);
        return null;
    }

    public Void visit(ForStatement forStatement){
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);

    }

    //TODO:visit all other AST nodes and find name errors
    public Void visit(Identifier identifier){

    }


}