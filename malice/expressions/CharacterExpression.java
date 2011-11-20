package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class CharacterExpression implements Expression {

    private char character;

    public CharacterExpression(char c){
        character = c;
    }

    public char getCharacter(){
        return character;
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
        return "'" + character + "'";
    }
}
