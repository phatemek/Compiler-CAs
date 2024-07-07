package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;
    private ArrayList<String> ends = new ArrayList<String>();
    private ArrayList<String> begins = new ArrayList<String>();

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
            }
        }
        return type;
    }

    public String getPrimitiveType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "I";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "Ljava/util/ArrayList;";
            case BoolType boolType -> type += "Z";
            case null, default -> {
                type += "V";
            }
        }
        return type;
    }

    private boolean iType(Type type){
        return (type instanceof IntType || type instanceof BoolType);
    }



    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    public String getActualJava(Type element){
        String className = "";
        switch (element){
            case StringType stringType -> className += "java/lang/String";
            case IntType intType -> className += "java/lang/Integer";
            case BoolType boolType -> className += "java/lang/Boolean";
            case null -> className += "java/lang/Object";
            default -> {}
        }
        return className;
    }

    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();

        SymbolTable.push(new SymbolTable());
        String commands = "";
        String args = ""; // TODO and add to the slots
        for (int i = 0; i < this.curFunction.getArgumentTypes().size(); i++) {
            slotOf(functionDeclaration.getArgs().get(i).getName().getName());
            args += getPrimitiveType(this.curFunction.getArgumentTypes().get(i));
            VarItem varItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
            varItem.setType(this.curFunction.getArgumentTypes().get(i));
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){
                try {
                    varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varItem.getName());
                } catch (ItemNotFound ignored1) {}
                varItem.setType(this.curFunction.getArgumentTypes().get(i));
            }
        }
        args = "(" + args + ")";
        String returnType = getPrimitiveType(this.curFunction.getReturnType()); // TODO
        commands += ".method public static " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        boolean returns = false;
        for (Statement statement : functionDeclaration.getBody()) {
            commands += statement.accept(this) + "\n";
            if (statement instanceof ReturnStatement)
                returns = true;
        }
        if (!returns)
            commands += "return" + "\n";
        commands += ".end method\n";
        SymbolTable.pop();

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this);
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(AccessExpression accessExpression){
        String commands = "";
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = "(";
            String returnType = "";
            Type functionType = functionName.accept(typeChecker);
            String name = "";
            if (!(functionType instanceof FptrType)){
                name = functionName.getName();
            }else{
                FptrType fptr = (FptrType) functionType;
                name = fptr.getFunctionName();
            }
            FunctionItem funcItem = null;
            try {
                funcItem = (FunctionItem) SymbolTable.root.getItem("Function:" + name);
            }catch (ItemNotFound ignore){}
            returnType = getPrimitiveType(funcItem.getReturnType());
            for (Expression expression: accessExpression.getArguments()){
                Type argType = expression.accept(typeChecker);
                args += getPrimitiveType(argType);
                commands += expression.accept(this) + "\n";
            }
            for (int i = accessExpression.getArguments().size(); i < funcItem.getArgumentTypes().size(); i++){
                Type argType = funcItem.getArgumentTypes().get(i);
                args += getPrimitiveType(argType);
                commands += funcItem.getFunctionDeclaration().getArgs().get(i).getDefaultVal().accept(this) + "\n";
            }
            args += ")";
            commands += "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            commands += accessExpression.getAccessedExpression().accept(this) + "\n";
            commands += accessExpression.getDimentionalAccess().get(0).accept(this) + "\n";
            ListType listType = (ListType) accessExpression.getAccessedExpression().accept(typeChecker);
            commands += "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n";
            commands += "checkcast " + getActualJava(listType.getType()) + "\n";
            if (listType.getType() instanceof BoolType)
                commands += "invokevirtual " + "java/lang/Boolean/booleanValue()Z\n";
            if (listType.getType() instanceof IntType) {
                commands += "invokevirtual " + "java/lang/Integer/intValue()I\n";
            }
        }
        return commands;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        String commands = "";
        Type assignedType = assignStatement.getAssignExpression().accept(typeChecker);
        AssignOperator assignOperator = assignStatement.getAssignOperator();

        if (!assignStatement.isAccessList()) {
            commands += assignStatement.getAssignExpression().accept(this) + "\n";
            int assignedSlot = slotOf(assignStatement.getAssignedId().getName());

            if (assignOperator == AssignOperator.ASSIGN) {
                VarItem varItem = new VarItem(assignStatement.getAssignedId());
                varItem.setType(assignedType);
                try {
                    SymbolTable.top.put(varItem);
                }catch (ItemAlreadyExists ignored){
                    VarItem item = null;
                    try {
                        item = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varItem.getName());
                    } catch (ItemNotFound ignored1) {}
                    item.setType(assignedType);
                }
                if (assignedType instanceof IntType || assignedType instanceof BoolType)
                    commands += "istore ";
                else
                    commands += "astore ";
                commands += assignedSlot + "\n";
            }
            else if (assignOperator == AssignOperator.PLUS_ASSIGN) {
                commands += "iload " + assignedSlot + "\n" +
                        "iadd" + "\n" +
                        "istore " + assignedSlot + "\n";
            }
            else if (assignOperator == AssignOperator.MINUS_ASSIGN) {
                commands += "iload " + assignedSlot + "\n" +
                        "swap\n"+
                        "ineg" + "\n" +
                        "iadd" + "\n" +
                        "istore " + assignedSlot + "\n";
            }
            else if (assignOperator == AssignOperator.MULT_ASSIGN) {
                commands += "iload " + assignedSlot + "\n" +
                        "imul" + "\n" +
                        "istore " + assignedSlot + "\n";
            }
            else if (assignOperator == AssignOperator.DIVIDE_ASSIGN) {
                commands += "iload " + assignedSlot + "\n" +
                        "swap\n" +
                        "idiv" + "\n" +
                        "istore " + assignedSlot + "\n";
            }
            else if (assignOperator == AssignOperator.MOD_ASSIGN) {
                commands += "iload " + assignedSlot + "\n" +
                        "swap\n"+
                        "irem" + "\n" +
                        "istore " + assignedSlot + "\n";
            }
        }
        else {
            commands += assignStatement.getAssignedId().accept(this) + "\n" +
                    assignStatement.getAccessListExpression().accept(this) + "\n";

            if (assignOperator == AssignOperator.ASSIGN) {
                commands += assignStatement.getAssignExpression().accept(this) + "\n";
                if (assignedType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;" + "\n";
                else if (assignedType instanceof BoolType){
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;" + "\n";
                }
                commands += "checkcast " + getActualJava(null) + "\n";
                commands += "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;" + "\n";
            }
            else {
                commands += assignStatement.getAssignedId().accept(this) + "\n" +
                        assignStatement.getAccessListExpression().accept(this) + "\n" +
                        "invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;" + "\n" +
                        "checkcast " + getActualJava(new IntType()) + "\n" +
                        "invokevirtual java/lang/Integer/intValue()I" + "\n" +
                        assignStatement.getAssignExpression().accept(this) + "\n";
                if (assignOperator == AssignOperator.PLUS_ASSIGN)
                    commands += "iadd" + "\n";
                if (assignOperator == AssignOperator.MINUS_ASSIGN)
                    commands += "swap\n" + "ineg" + "\n" +
                            "iadd" + "\n";
                if (assignOperator == AssignOperator.MULT_ASSIGN)
                    commands += "imul" + "\n";
                if (assignOperator == AssignOperator.DIVIDE_ASSIGN)
                    commands += "swap\n" + "idiv" + "\n";
                if (assignOperator == AssignOperator.MOD_ASSIGN)
                    commands += "swap\n" + "irem" + "\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;" + "\n" +
                        "checkcast " + getActualJava(null) + "\n" +
                        "invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;" + "\n";
            }

        }

        return commands;
    }
    @Override
    public String visit(IfStatement ifStatement){
        String commands = "";

        String labelThen = getFreshLabel();
        String labelElse = getFreshLabel();
        String labelAfter = getFreshLabel();

        for (Expression expression : ifStatement.getConditions()) {
            commands += expression.accept(this);
        }

        commands += "ifeq " + labelElse + "\n" +
                labelThen + ":" + "\n";
        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : ifStatement.getThenBody()) {
            commands += statement.accept(this) + "\n";
        }
        SymbolTable.pop();
        commands += "goto " + labelAfter + "\n" +
                labelElse + ":" + "\n";
        if (!ifStatement.getElseBody().isEmpty()) {
            SymbolTable.push(SymbolTable.top.copy());
            for (Statement statement : ifStatement.getElseBody())
                commands += statement.accept(this) + "\n";
            SymbolTable.pop();
        }
        commands += labelAfter + ":" + "\n";

        return commands;
    }
    @Override
    public String visit(PutStatement putStatement){
        String commands = "";

        commands += "getstatic java/lang/System/out Ljava/io/PrintStream;" + "\n";
        commands += putStatement.getExpression().accept(this) + "\n";
        Type expressionType = putStatement.getExpression().accept(typeChecker);
        commands += "invokevirtual java/io/PrintStream/println("+getPrimitiveType(expressionType) + ")V\n";
        return commands;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        String commands = "";

        if (returnStatement.getReturnExp() == null || returnStatement.getReturnExp().accept(typeChecker) instanceof NoType) {
            commands += "return" + "\n";
        }
        else {
            Type returnType = returnStatement.getReturnExp().accept(typeChecker);
            commands += returnStatement.getReturnExp().accept(this) + "\n";
            if (iType(returnType))
                commands += "ireturn" + "\n";
            else
                commands += "areturn" + "\n";
        }

        return commands;
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        String commands = "";

        commands += binaryExpression.getFirstOperand().accept(this) + "\n";
        commands += binaryExpression.getSecondOperand().accept(this) + "\n";

        BinaryOperator operator = binaryExpression.getOperator();
        Type opType = binaryExpression.getFirstOperand().accept(typeChecker);

        String labelOne = getFreshLabel();
        String labelTwo = getFreshLabel();

        if (operator == BinaryOperator.PLUS)
            commands += "iadd" + "\n";
        else if (operator == BinaryOperator.MINUS)
            commands += "isub" + "\n";
        else if (operator == BinaryOperator.MULT)
            commands += "imul" + "\n";
        else if (operator == BinaryOperator.DIVIDE)
            commands += "idiv" + "\n";
        else {
            if (operator == BinaryOperator.GREATER_THAN)
                commands += "if_icmpgt " + labelOne + "\n";
            else if (operator == BinaryOperator.LESS_THAN)
                commands += "if_icmplt " + labelOne + "\n";
            else if (operator == BinaryOperator.GREATER_EQUAL_THAN)
                commands += "if_icmpge " + labelOne + "\n";
            else if (operator == BinaryOperator.LESS_EQUAL_THAN)
                commands += "if_icmple " + labelOne + "\n";
            else if (operator == BinaryOperator.EQUAL) {
                if (iType(opType))
                    commands += "if_icmpeq " + labelOne + "\n";
                else
                    commands += "if_acmpeq " + labelTwo + "\n";
            }
            else if (operator == BinaryOperator.NOT_EQUAL) {
                if (iType(opType))
                    commands += "if_icmpne " + labelOne + "\n";
                else
                    commands += "if_acmpne " + labelTwo + "\n";
            }
            commands += "ldc 0" + "\n" +
                    "goto " + labelTwo + "\n" +
                    labelOne + ":" + "\n" +
                    "ldc 1" + "\n" +
                    labelTwo + ":" + "\n";
        }
        return commands;
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        String commands = "";

        commands += unaryExpression.getExpression().accept(this) + "\n";
        UnaryOperator op = unaryExpression.getOperator();

        if (op == UnaryOperator.INC) {
            if (unaryExpression.getExpression() instanceof Identifier id) {
                commands += "ldc 1" + "\n" +
                        "iadd" + "\n" +
                        "istore " + slotOf(id.getName()) + "\n";
            } else {
                commands += "ldc 1" + "\n" +
                        "iadd" + "\n";
            }
        }
        else if (op == UnaryOperator.DEC) {
            if (unaryExpression.getExpression() instanceof Identifier id) {
                commands += "ldc -1" + "\n" +
                        "iadd" + "\n" +
                        "istore " + slotOf(id.getName()) + "\n";
            } else {
                commands += "ldc -1" + "\n" +
                        "iadd" + "\n";
            }
        }
        else if (op == UnaryOperator.MINUS)
            commands += "ineg" + "\n";
        else if (op == UnaryOperator.NOT)
            commands += "ldc 1" + "\n" +
                    "ixor" + "\n";

        return commands;
    }
    @Override
    public String visit(Identifier identifier){
        String commands = "";
        Type idType = identifier.accept(typeChecker);

        if (idType instanceof FptrType fptr)
            commands += "new Fptr" + "\n" +
                    "dup" + "\n" +
                    "aload_0" + "\n" +
                    "ldc " + "\"" + fptr.getFunctionName() + "\"" + "\n" +
                    "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V" + "\n";
        else if (iType(idType))
            commands += "iload " + slotOf(identifier.getName()) + "\n";
        else
            commands += "aload " + slotOf(identifier.getName()) + "\n";

        return commands;
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        String commands = "";

        ends.add(getFreshLabel());
        begins.add(getFreshLabel());

        String labelBegin = begins.getLast();
        String labelEnd =  ends.getLast();

        commands += labelBegin + ":" + "\n";
        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : loopDoStatement.getLoopBodyStmts())
            commands += statement.accept(this) + "\n";
        SymbolTable.pop();
        commands += "goto " + labelBegin + "\n" +
                labelEnd + ":" + "\n";

        ends.removeLast();
        begins.removeLast();

        return commands;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        String commands = "";
        commands += "goto " + ends.getLast() + "\n";
        return commands;
    }
    @Override
    public String visit(NextStatement nextStatement){
        String commands = "";
        commands += "goto " + begins.getLast() + "\n";
        return commands;
    }
    @Override
    public String visit(LenStatement lenStatement){
        String commands = "";
        commands += lenStatement.getExpression().accept(this) + "\n";
        Type type = lenStatement.getExpression().accept(typeChecker);
        if (type instanceof ListType) {
            commands += "invokevirtual java/util/ArrayList/size()I\n";
        }else {
            commands += "invokevirtual java/lang/String/length()I\n";
        }
        return commands;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        String commands = chopStatement.getChopExpression().accept(this) + "\n" +
                "dup" + "\n" +
                "invokevirtual java/lang/String/length()I" + "\n" +
                "ldc -1" + "\n" +
                "iadd" + "\n" +
                "ldc 0" + "\n" +
                "swap" + "\n" +
                "invokevirtual java/lang/String/substring(II)Ljava/lang/String;" + "\n";
        return commands;
    }
    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        String commands = "";
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        commands += "astore " + slotOf("array_") + "\n";
        for (Expression expression : listValue.getElements()){
            commands += "aload " + slotOf("array_") + "\n";
            commands += expression.accept(this) + "\n";
            Type type = expression.accept(typeChecker);
            if (iType(type))
                commands += "invokestatic " + getActualJava(type) + "/valueOf(" + getPrimitiveType(type) + ")" + getType(type) + "\n";

            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        commands += "aload " + slotOf("array_") + "\n";
        return commands;
    }
    @Override
    public String visit(IntValue intValue){
        String commands = "ldc " + intValue.getIntVal() + "\n";
        return commands;
    }
    @Override
    public String visit(BoolValue boolValue){
        String commands;
        if (boolValue.getBool() == true)
            commands = "ldc 1" + "\n";
        else
            commands = "ldc 0" + "\n";
        return commands;
    }
    @Override
    public String visit(StringValue stringValue){
        String commands = "ldc " + stringValue.getStr() + "\n";
        return commands;
    }
}