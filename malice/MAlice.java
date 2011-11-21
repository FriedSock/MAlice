package malice;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.ParseTreeBuilder;

public class MAlice {

    public static void main(String[] args) {
        // TODO - reading from a file

        //File inputFile = new File(args[0]);
        //String assemblyFileName = args[0].replaceAll(".alice$", ".asm");

        CharStream charStream = new ANTLRStringStream("b was a number and b became 0+10*6^2+2. b became 5+5. b spoke. c was a letter. c became 'f'. e was a number. e became 10 . b became 10+10+e. b became 5*5/3+1. b became ~3.");
        MAliceLexer lexer = new MAliceLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        MAliceParser maliceParser = new MAliceParser(tokenStream, builder);

        try {
            maliceParser.prog();
        } catch (RecognitionException ex) {
            System.out.println("Parser failed with the following exception:");
            ex.printStackTrace();
            System.exit(1);
        }

        Parser parser = new Parser();
        try {
            parser.parseProg(builder.getTree());
        } catch (RuntimeException e) {
            System.out.println("Build failed with the following exception:");
            e.printStackTrace();
            System.exit(1);
        }


        System.out.println("CODE GEN:");
        CodeGenerator codeGenerator = new CodeGenerator(parser.getCommands(), parser.getSymbolTable());
        List<String> assembly = codeGenerator.generateCode();
        for (String asm : assembly) {
            System.out.println(asm);
        }

        /*File assemblyFile = new File(assemblyFileName);
        try {
            FileWriter fstream = new FileWriter(assemblyFile);
            PrintWriter out = new PrintWriter(fstream);
            out.write("Hello Java");
            for (String asm : assembly) {
                out.println(asm);
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Error writing assembly file: ");
            e.printStackTrace();
        }*/

        //TODO - nasm -f elf64 -g -F stabs assemblyFile
        //TODO - ld -o matmult matmult.o
        //TODO - ./matmult


    }
}