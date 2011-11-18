/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class VariableDeclarationNode implements Command {
    private String variable;
    private String value;

    public VariableDeclarationNode(String var, String val) {
        variable = var;
        value = val;
    }

}
