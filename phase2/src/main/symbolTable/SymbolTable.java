package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static SymbolTable pre;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;

    public void add(String key, SymbolTableItem val){
        items.put(key, val);
    }

    public ArrayList<String> keyList(){
        ArrayList<String> arr = new ArrayList<String>();
        for (String key : items.keySet()){
            arr.add(key);
        }
        return arr;
    }

    public void copyItem(SymbolTable symbolTable){
        for (String key : items.keySet()) {
            symbolTable.add(key, items.get(key));
        }
    }

    public void print(){
        for (String key:items.keySet()){
            System.out.println(key);
        }
    }

    public static void push(SymbolTable symbolTable) {
        if (top != null) {
            top.copyItem(symbolTable);
            stack.push(top);
        }
        top = symbolTable;
    }
    public static void pop() {
        top = stack.pop();
    }
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getName()))
            throw new ItemAlreadyExists();
        items.put(item.getName(), item);
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if( symbolTableItem != null ){
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }
}
