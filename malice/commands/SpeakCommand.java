package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    public Set<String> getUsedVariables() {
        return new HashSet<String>(Arrays.asList(variableName));
    }
    
    @Override
    public boolean updatesVariable(String aVariableName) {
        return false;
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return variableName.equals(aVariableName);
    }
    
    @Override
    public String toString() {
        return variableName + " spoke";
    }

    public String variable(){
        return variableName;
    }
}