package malice.symbols;

public class MemoryLocation implements Storage {
    
    private final String variableName;
    
    public MemoryLocation(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public boolean isRegister() {
        return false;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    @Override
    public String toString() {
        return "[" + variableName + "]";
    }
}