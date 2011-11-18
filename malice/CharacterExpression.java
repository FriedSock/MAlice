/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class CharacterExpression implements Expression {
    private char character;

    public CharacterExpression(char c){
        character = c;
    }

    public char character(){
        return character;
    }

}
