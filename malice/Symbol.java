package malice;

public class Symbol {

    private final Type type;
    private Register register;

    public Symbol(Type type) {
        this.type = type;
        register = Register.none;
    }

    public Type getType() {
        return type;
    }
    
    public Register getRegister() {
        return register;
    }
}