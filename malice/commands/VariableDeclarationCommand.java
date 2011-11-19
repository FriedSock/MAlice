package malice.commands;

import malice.symbols.Type;

public class VariableDeclarationCommand implements Command {
    
    private String variableName;
    private Type type;

    public VariableDeclarationCommand(String variableName, Type type) {
        this.variableName = variableName;
        this.type = type;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        //TODO - check for variable in expression
        return variableName.equals(aVariableName);
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitVariableDeclaration(this);
    }
    
    @Override
    public String toString() {
        return variableName + " was a " + type;
    }
}