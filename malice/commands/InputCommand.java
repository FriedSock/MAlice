package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InputCommand implements Command{

    private String variableName;

    public InputCommand(String variableName){
        this.variableName = variableName;
    }

    public String getVariableName(){
        return variableName;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<String> getUsedVariables() {
        return new HashSet<String>(Arrays.asList(variableName));
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return aVariableName.equals(variableName);
    }

}
