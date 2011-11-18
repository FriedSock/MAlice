package malice.commands;

public class DecrementCommand implements Command {
    
    private String variableName;

    public DecrementCommand(String variableName) {
        this.variableName = variableName;
    }
    
    @Override
    public String toString() {
        return variableName + " drank";
    }
}