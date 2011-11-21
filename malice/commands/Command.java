package malice.commands;

import java.util.Set;

public interface Command {

    void acceptVisitor(CommandVisitor visitor);
    
    /**
     * @return all variable identifiers used by the command.
     */
    Set<String> getUsedVariables();
    
    /**
     * @return true, if given variable identifier is used by the command.
     */
    boolean usesVariable(String aVariableName);
}