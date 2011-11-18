package malice.commands;

public class SpeakCommand implements Command {

    private String variableName;

    public SpeakCommand(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return variableName + " spoke";
    }
}