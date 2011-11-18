package malice;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;

public class MAlice {

    public static void main(String[] args) {
        // TODO - reading from a file
        CharStream charStream = new ANTLRStringStream("b was a number.\nb became 10+10.");

        MAliceLexer lexer = new MAliceLexer(charStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        MAliceParser parser = new MAliceParser(tokenStream, builder);
        try {
            parser.prog();
            System.out.println(builder.getTree().toStringTree());
            traverse((Tree)builder.getTree(),0);
        } catch (RecognitionException ex) {
            Logger.getLogger(MAlice.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    private static void traverse(Tree tree, int depth) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            
            for (int j = 0; j < depth; j++) {
                System.out.print(" ");
            }
            
            System.out.println(child.toString());
            if (child.getChildCount() != 0) {
                System.out.println("my arse");
                traverse(child, depth + 2);
            }
        }
    }
}
