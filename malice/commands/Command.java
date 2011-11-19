package malice.commands;

import java.util.Set;

public interface Command {

    void acceptVisitor(CommandVisitor visitor);
    
    Set<String> getUsedVariables();
    
    boolean usesVariable(String aVariableName);
}