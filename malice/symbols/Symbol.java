package malice.symbols;

public class Symbol {

    private final Type type;
    private Register register;

    public Symbol(Type type) {
        this.type = type;
        register = Register.NONE;
    }

    public Type getType() {
        return type;
    }
    
    public Register getRegister() {
        return register;
    }
}