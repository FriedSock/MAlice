package malice.symbols;

public class Symbol {

    private final Type type;
    private Storage storage;
    private boolean initialised;

    public Symbol(Type type) {
        this.type = type;
        storage = Register.NONE;
        initialised = false;
    }

    public Type getType() {
        return type;
    }
    
    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public boolean isInitialised() {
        return initialised;
    }
    
    public void initialise() {
        initialised = true;
    }
}