package malice.commands;

public class SpeakCommand implements Command {

    private String variableName;

    public SpeakCommand(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitSpeak(this);
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return variableName.equals(aVariableName);
    }
    
    @Override
    public String toString() {
        return variableName + " spoke";
    }
}