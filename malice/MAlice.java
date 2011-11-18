package malice;

import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.runtime.tree.Tree;

public class MAlice {

    /*private static List<Command> parseCommandTree(Tree tree) {
        List<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            String childToken = child.getText();
            if (childToken.equals("prog")) {
                return parseCommandTree(child);
            }
            if (childToken.equals("statement")) {
                
            }
        }
        //tree.getChild(childIndex);
        
        
        return commands;
    }*/
    
    public static void main(String[] args) {
        // TODO - reading from a file
        CharStream charStream = new ANTLRStringStream("b was a number and b became 10+10*2. b spoke. c was a letter. c became 'f'. d became 10+10+e.");

        MAliceLexer lexer = new MAliceLexer(charStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        


        
        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        
        MAliceParser parser = new MAliceParser(tokenStream, builder);
        try {
            
            parser.prog();
            //System.out.println(builder.epsilonNode().toStringTree());
            
            //parseStatementTree(builder.getTree());
            
            traverse(builder.getTree(), 0);
        } catch (RecognitionException ex) {
            ex.printStackTrace();
        }
        
        
        
       /* try {
            MAliceParser.prog_return prog = parser.prog();

            
            
            Tree tree = (Tree) prog.tree;

            traverse(tree, 0);

             String[] a = parser.get
            for (String b : a) {
            System.out.println(b);
            }

            //System.out.println(prog.getTree());
        } catch (RecognitionException ex) {
            Logger.getLogger(MAlice.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    private static void traverse(Tree tree, int depth) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            
            for (int j = 0; j < depth; j++) {
                System.out.print(" ");
            }
            
            System.out.println(child.getText());
            if (child.getChildCount() != 0) {
               // System.out.println("my arse");
                traverse(child, depth + 2);
            }
        }
    }
}
