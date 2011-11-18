/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class DecrementNode implements Command {
    private String variable;

    public DecrementNode(String v) {
        variable = v;
    }

}
