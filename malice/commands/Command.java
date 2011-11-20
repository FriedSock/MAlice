package malice.commands;

import java.util.Set;

public interface Command {

    void acceptVisitor(CommandVisitor visitor);
    
    Set<String> getUsedVariables();
    
    boolean updatesVariable(String aVariableName);
    
    boolean usesVariable(String aVariableName);
}