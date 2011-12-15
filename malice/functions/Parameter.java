package malice.functions;

import malice.symbols.Type;

public class Parameter {

    private String name;
    private Type type;
    private boolean passByReference;

    public Parameter() {
        passByReference = false;
    }
    
    public Parameter(String name, Type type, boolean passByReference) {
        this.name = name;
        this.type = type;
        this.passByReference = passByReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public boolean isPassByReference() {
        return passByReference;
    }

    public void setPassByReference(boolean passByReference) {
        this.passByReference = passByReference;
    }
    
    @Override
    public String toString() {
        return (passByReference ? "spider " : "") + type + " " + name;
    }
}