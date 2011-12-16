package malice.symbols;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    
    private Map<String, Map<String, Symbol>> symbolTable;
    
    public SymbolTable() {
        symbolTable = new HashMap<String, Map<String, Symbol>>();
        symbolTable.put("", new HashMap<String, Symbol>()); // global scope
    }
    
    // Copy constructor
    public SymbolTable(SymbolTable other) {
        symbolTable.putAll(other.symbolTable);
    }
    
    public void addVariable(String variableName, Type variableType, String scope) {
        Map<String, Symbol> scopeSymbolTable = getScopeSymbolTable(scope);
        scopeSymbolTable.put(variableName, new Symbol(variableType));
    }
    
    public boolean containsVariable(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            return true;
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        return scopeSymbolTable.containsKey(variableName);
    }
    
    public boolean containsVariableStrictlyInScope(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getScopeSymbolTable(scope);
        return scopeSymbolTable.containsKey(variableName);
    }
    
    public Type getVariableType(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            return scopeSymbolTable.get(variableName).getType();
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        return scopeSymbolTable.get(variableName).getType();
    }
    
    public Storage getVariableStorage(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            return scopeSymbolTable.get(variableName).getStorage();
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        return scopeSymbolTable.get(variableName).getStorage();
    }
    
    public void setVariableStorage(String variableName, Storage storage, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            scopeSymbolTable.get(variableName).setStorage(storage);
        } else {
            scopeSymbolTable = getScopeSymbolTable(scope);
            scopeSymbolTable.get(variableName).setStorage(storage);
        }
    }
    
    public boolean isInitialisedVariable(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            return scopeSymbolTable.get(variableName).isInitialised();
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        return scopeSymbolTable.get(variableName).isInitialised();
    }
    
    public void initialiseVariable(String variableName, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        if (scopeSymbolTable.containsKey(variableName)) {
            scopeSymbolTable.get(variableName).initialise();
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        scopeSymbolTable.get(variableName).initialise();
    }

    //TODO - Check if this works (Don't think we ever use it)
    public boolean usesStorage(Storage storage, String scope) {
        Map<String, Symbol> scopeSymbolTable = getGlobalScopeSymbolTable();
        for (Symbol s : scopeSymbolTable.values()){
            if (s.getStorage().equals(storage)) {
                return true;
            }
        }
        
        scopeSymbolTable = getScopeSymbolTable(scope);
        for (Symbol s : scopeSymbolTable.values()){
            if (s.getStorage().equals(storage)) {
                return true;
            }
        }
        return false;
    }

    private Map<String, Symbol> getGlobalScopeSymbolTable() {
        return symbolTable.get("");
    }
    
    public Map<String, Symbol> getScopeSymbolTable(String scope) {
        Map<String, Symbol> scopeSymbolTable = symbolTable.get(scope);
        if (scopeSymbolTable == null) {
            scopeSymbolTable = new HashMap<String, Symbol>();
            symbolTable.put(scope, scopeSymbolTable);
        }
        return scopeSymbolTable;
    }
}