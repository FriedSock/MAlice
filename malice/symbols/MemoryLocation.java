package malice.symbols;

public class MemoryLocation implements Storage {
    
    private final int address;
    
    public MemoryLocation(int address) {
        this.address = address;
    }

    @Override
    public boolean isRegister() {
        return false;
    }
    
    @Override
    public String toString() {
        return "[" + address + "]";
    }
}