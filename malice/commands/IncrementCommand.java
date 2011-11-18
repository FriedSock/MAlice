package malice.commands;

public class IncrementCommand implements Command {
    
    private String variableName;

    public IncrementCommand(String variableName) {
        this.variableName = variableName;
    }
    
    @Override
    public String toString() {
        return variableName + " ate";
    }
}