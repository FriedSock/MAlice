/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class VariableAssignmentNode implements Command {
    private String variable;
    private String type;

    public VariableAssignmentNode(String v, String t) {
        variable = v;
        type = t;
    }


}
