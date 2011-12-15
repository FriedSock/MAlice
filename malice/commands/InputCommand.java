/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jack
 */
public class InputCommand implements Command{

    private String variableName;

    public InputCommand(String variableName){
        this.variableName = variableName;
    }

    public String getVariableName(){
        return variableName;
    }

    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<String> getUsedVariables() {
        return new HashSet<String>(Arrays.asList(variableName));
    }

    public boolean usesVariable(String aVariableName) {
        return aVariableName.equals(variableName);
    }

}
