package malice.expressions;

public class CharacterExpression implements Expression {

    private char character;

    public CharacterExpression(char c){
        character = c;
    }

    public char character(){
        return character;
    }

    @Override
    public String toString() {
        return "'" + character + "'";
    }
}
