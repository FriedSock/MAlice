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
    
    public Storage getVariableStorage(String variableName) {
        return symbolTable.get(variableName).getStorage();
    }
    
    public void setVariableStorage(String variableName, Storage storage) {
        symbolTable.get(variableName).setStorage(storage);
    }
    
    public boolean isInitialisedVariable(String variableName) {
        return symbolTable.get(variableName).isInitialised();
    }
    
    public void initialiseVariable(String variableName) {
        symbolTable.get(variableName).initialise();
    }

    //TODO - Check if this works
    public boolean usesStorage(Storage storage) {
        for(Symbol s : symbolTable.values()){
            if(s.getStorage().equals(storage)) {
                return true;
            }
        }
        return false;
    }

}