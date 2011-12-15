/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice.commands;

import java.util.Set;

/**
 *
 * @author jack
 */
public class FunctionReturnCommand implements Command{

    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<String> getUsedVariables() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean usesVariable(String aVariableName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
