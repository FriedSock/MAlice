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
            die("Please provide a file name of a malice file as an argument to this program");
        }

        String maliceFileName = args[0];
        if (!new File(maliceFileName).exists()) {
            die("Malice input file not found: " + maliceFileName);
        }

        //CharStream charStream = new ANTLRStringStream("b was a number and b became 0+10*6^2+2. b became 5+5. b spoke. c was a letter. c became 'f'. e was a number. e became 10 . b became 10+10+e. b became 5*5/3+1. b became ~3.");
        ANTLRFileStream fileStream = null;
        try {
            fileStream = new ANTLRFileStream(maliceFileName);
        } catch (IOException ex) {
            die("Build", ex);
        }

        MAliceLexer lexer = new MAliceLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ParseTreeBuilder builder = new ParseTreeBuilder("prog");
        MAliceParser maliceParser = new MAliceParser(tokenStream, builder);
        try {
            maliceParser.prog();
        } catch (RecognitionException ex) {
            die("Parser", ex);
        }

        Parser parser = new Parser();
        try {
            parser.parseProg(builder.getTree());
        } catch (RuntimeException ex) {
            die("Build", ex);
        }


        //System.out.println("CODE GEN:");
        CodeGenerator codeGenerator = new CodeGenerator(parser.getCommands(), parser.getSymbolTable());
        List<String> assembly = codeGenerator.generateCode();
        /*for (String asm : assembly) {
        System.out.println(asm);
        }*/

        String baseFileName = maliceFileName.replaceAll(".alice$", "");
        String assemblyFileName = baseFileName + ".asm";

        try {
            writeAssembly(assemblyFileName, assembly);
        } catch (IOException ex) {
            die("Writing assembly file", ex);
        }

        try {
            buildAssembly(assemblyFileName, baseFileName);
        } catch (Exception ex) {
            die("Assembly build", ex);
        }
    }

    private static void writeAssembly(String assemblyFileName, List<String> assembly) throws IOException {
        File assemblyFile = new File(assemblyFileName);

        FileWriter fstream = new FileWriter(assemblyFile);
        PrintWriter out = new PrintWriter(fstream);
        for (String asm : assembly) {
            out.println(asm);
        }
        out.close();
    }

    private static void buildAssembly(String assemblyFileName, String baseFileName) throws Exception {
        String nasmProgram = "nasm -f elf64 -g -F stabs " + assemblyFileName;
        System.out.println(nasmProgram);

        Process p = Runtime.getRuntime().exec(nasmProgram);
        int exitCode = p.waitFor();

        if (exitCode != 0) {
            die("Assembly build failed: 'nasm' returned non-zero exit code");
        }

        String ldProgram = "ld -o " + baseFileName + " " + baseFileName + ".o";
        System.out.println(ldProgram);
        p = Runtime.getRuntime().exec(ldProgram);

        if (exitCode != 0) {
            die("Assembly build failed: 'ld' returned non-zero exit code");
        }
    }

    private static void die(String message) {
        System.err.println(message);
        System.exit(1);
    }

    private static void die(String failedTarget, Exception ex) {
        System.err.println(failedTarget + " failed with following exception:");
        ex.printStackTrace();
        System.exit(1);
    }
}