package malice.commands;

import java.util.HashSet;
import java.util.Set;

public class ThroughCommand implements Command{

    private String lookingGlassName;
    private String variableName;
    
    public ThroughCommand(String variableName, String lookingGlassName) {
        this.variableName = variableName;
        this.lookingGlassName = lookingGlassName;
    }

    public String getLookingGlassName() {
        return lookingGlassName;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        //TODO - acceptVisitor
    }

    @Override
    public Set<String> getUsedVariables() {
        return new HashSet<String>();
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return false;
    }
    
    @Override
    public String toString() {
        return variableName + " went through " + lookingGlassName;
    }
}