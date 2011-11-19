package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DecrementCommand implements Command {
    
    private String variableName;

    public DecrementCommand(String variableName) {
        this.variableName = variableName;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitDecrement(this);
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
    public String toString() {
        return variableName + " drank";
    }

}