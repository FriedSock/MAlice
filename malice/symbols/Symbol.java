package malice.symbols;

public class Symbol {

    private final Type type;
    private Register register;
    private boolean initialised;

    public Symbol(Type type) {
        this.type = type;
        register = Register.NONE;
        initialised = false;
    }

    public Type getType() {
        return type;
    }
    
    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public boolean isInitialised() {
        return initialised;
    }
    
    public void initialise() {
        initialised = true;
    }
}