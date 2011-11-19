package malice.commands;

public interface Command {

    void acceptVisitor(CommandVisitor visitor);
}