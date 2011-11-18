package malice.commands;

import malice.Type;

public class VariableDeclarationCommand implements Command {
    
    private String variableName;
    private Type type;

    public VariableDeclarationCommand(String variableName, Type type) {
        this.variableName = variableName;
        this.type = type;
    }

    @Override
    public String toString() {
        return variableName + " was a " + type;
    }
}