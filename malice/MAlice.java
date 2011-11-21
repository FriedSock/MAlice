package malice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.ParseTreeBuilder;

public class MAlice {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name of a malice file as an " +
                    "argument to this program");
            System.exit(1);
        }
        
        String maliceFileName = args[0];
        if (!new File(maliceFileName).exists()) {
            System.out.println("Malice input file not found: " + maliceFileName);
            System.exit(1);
        }
        
        //CharStream charStream = new ANTLRStringStream("b was a number and b became 0+10*6^2+2. b became 5+5. b spoke. c was a letter. c became 'f'. e was a number. e became 10 . b became 10+10+e. b became 5*5/3+1. b became ~3.");
        ANTLRFileStream fileStream = null;
        try {
            fileStream = new ANTLRFileStream(maliceFileName);
        } catch (IOException ex) {
            System.out.println("Build failed with following exception:");
            ex.printStackTrace();
            System.exit(1);
        }
        
        MAliceLexer lexer = new MAliceLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        MAliceParser maliceParser = new MAliceParser(tokenStream, builder);

        try {
            maliceParser.prog();
        } catch (RecognitionException ex) {
            System.out.println("Parser failed with following exception:");
            ex.printStackTrace();
            System.exit(1);
        }

        Parser parser = new Parser();
        try {
            parser.parseProg(builder.getTree());
        } catch (RuntimeException e) {
            System.out.println("Build failed with following exception:");
            e.printStackTrace();
            System.exit(1);
        }


        System.out.println("CODE GEN:");
        CodeGenerator codeGenerator = new CodeGenerator(parser.getCommands(), parser.getSymbolTable());
        List<String> assembly = codeGenerator.generateCode();
        for (String asm : assembly) {
            System.out.println(asm);
        }

        String assemblyFileName = maliceFileName.replaceAll(".alice$", ".asm");
        File assemblyFile = new File(assemblyFileName);
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
        }

        //TODO - nasm -f elf64 -g -F stabs assemblyFile
        //TODO - ld -o matmult matmult.o
        //TODO - ./matmult


    }
}