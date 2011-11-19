package malice.commands;

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
    public String toString() {
        return variableName + " drank";
    }
}