package malice.commands;

public interface Command {

    void acceptVisitor(CommandVisitor visitor);
    
    boolean usesVariable(String aVariableName);
}