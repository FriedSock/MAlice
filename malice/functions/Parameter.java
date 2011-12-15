package malice.functions;

import malice.symbols.Type;


public class Parameter {

    private String name;
    private Type type;
    private boolean passByReference;

    public Parameter(String name, Type type, boolean passByReference) {
        this.name = name;
        this.type = type;
        this.passByReference = passByReference;
    }
}