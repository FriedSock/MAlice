package malice.symbols;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    
    private Map<String, Symbol> symbolTable;
    
    public SymbolTable() {
        symbolTable = new HashMap<String, Symbol>();
    }
    
    public void addVariable(String variableName, Type variableType) {
        symbolTable.put(variableName, new Symbol(variableType));
    }
    
    public boolean containsVariable(String variableName) {
        return symbolTable.containsKey(variableName);
    }
    
    public Type getVariableType(String variableName) {
        return symbolTable.get(variableName).getType();
    }
    
    public Register getVariableRegister(String variableName) {
        return symbolTable.get(variableName).getRegister();
    }
    
    public void initialiseVariable(String variableName) {
        symbolTable.get(variableName).initialise();
    }
}
