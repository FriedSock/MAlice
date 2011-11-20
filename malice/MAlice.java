package malice;

import java.util.List;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.runtime.tree.Tree;

public class MAlice {
    
    public static void main(String[] args) {
        // TODO - reading from a file
        
        //File programFile = new File(args[0]);
        
        CharStream charStream = new ANTLRStringStream("b was a number and b became 0+10*6^2+2. b became 5+5. b spoke. c was a letter. c became 'f'. e was a number. e became 10 . b became 10+10+e. b became 5*5/3+1. b became ~3.");
        MAliceLexer lexer = new MAliceLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        
        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        
        MAliceParser maliceParser = new MAliceParser(tokenStream, builder);
        try {
            
            MAliceParser.prog_return r = maliceParser.prog();
            
            System.out.println("Original tree: " + ((Tree) r.tree).toStringTree());
            
            //traverse(builder.getTree(), 0);
        } catch (RecognitionException ex) {
            ex.printStackTrace();
        }
        
        
        
        
        Parser parser = new Parser();
        try {
            parser.parseProg(builder.getTree());
        } catch (RuntimeException e) {
            System.out.println("Build failed with following exception:");
            e.printStackTrace();
            return;
        }
        
        
        System.out.println("PARSER:");
        System.out.println(parser);
        
        
        System.out.println("\n\n\n");
        System.out.println("CODE GEN:");
        CodeGenerator codeGenerator = new CodeGenerator(parser.getCommands(), parser.getSymbolTable());
        List<String> assembly = codeGenerator.generateCode();
        System.out.println(assembly.size());
        for (String asm : assembly) {
            System.out.println(asm);
        }
    }

    private static void traverse(Tree tree, int depth) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            
            for (int j = 0; j < depth; j++) {
                System.out.print(" ");
            }
            
            System.out.println(child.toStringTree());
            if (child.getChildCount() != 0) {
                traverse(child, depth + 2);
            }
        }
    }
}
