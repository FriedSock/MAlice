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
public class ThroughCommand implements Command{

    private String lookingGlassName;
    private String variableName;
    public ThroughCommand(String variable, String lookingGlassName){

    }

    public String getLookingGlassName() {
        return lookingGlassName;
    }

    public String getVariableName() {
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
