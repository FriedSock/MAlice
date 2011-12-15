package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import malice.symbols.Type;

public class ArrayDeclarationCommand implements Command {
    
    private String variableName;
    private Type type;
    private int size;

    public ArrayDeclarationCommand(String variableName, Type type, int size) {
        this.variableName = variableName;
        this.type = type;
        this.size = size;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    @Override
    public Set<String> getUsedVariables() {
        return new HashSet<String>(Arrays.asList(variableName));
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return variableName.equals(aVariableName);
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        //visitor.visitVariableDeclaration(this);
    }
    
    /*@Override
    public String toString() {
        return variableName + " was a " + type;
    }*/
}