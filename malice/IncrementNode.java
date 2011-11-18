/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

import malice.commands.Command;

/**
 *
 * @author jack
 */
public class IncrementNode implements Command {
    private String variable;

    public IncrementNode(String v) {
        variable = v;
    }

}
