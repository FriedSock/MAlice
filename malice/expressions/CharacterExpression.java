package malice.expressions;

public class CharacterExpression implements Expression {

    private char character;

    public CharacterExpression(char c){
        character = c;
    }

    public char getCharacter(){
        return character;
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
