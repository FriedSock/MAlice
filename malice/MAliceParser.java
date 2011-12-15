// $ANTLR 3.4 /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g 2011-12-15 10:58:07

	package malice;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MAliceParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALICE_FOUND", "BECAUSE", "CHANGED_A", "CHAR", "CONNECTOR", "CONTAINED_A", "EITHER", "ENOUGH_TIMES", "EVENTUALLY", "ID", "INT", "OR", "OR_MAYBE", "PERHAPS", "PROCEDURE", "SAID_ALICE", "SENTENCE", "SO", "SPIDER", "THE_LOOKING_GLASS", "THE_ROOM", "THOUGHT_ALICE", "TYPE", "UNSURE", "WAS_A", "WENT_THROUGH", "WHAT_WAS", "WS", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'\\'s'", "'^'", "'became'", "'had'", "'piece'", "'spoke'", "'|'", "'||'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int ALICE_FOUND=4;
    public static final int BECAUSE=5;
    public static final int CHANGED_A=6;
    public static final int CHAR=7;
    public static final int CONNECTOR=8;
    public static final int CONTAINED_A=9;
    public static final int EITHER=10;
    public static final int ENOUGH_TIMES=11;
    public static final int EVENTUALLY=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int OR=15;
    public static final int OR_MAYBE=16;
    public static final int PERHAPS=17;
    public static final int PROCEDURE=18;
    public static final int SAID_ALICE=19;
    public static final int SENTENCE=20;
    public static final int SO=21;
    public static final int SPIDER=22;
    public static final int THE_LOOKING_GLASS=23;
    public static final int THE_ROOM=24;
    public static final int THOUGHT_ALICE=25;
    public static final int TYPE=26;
    public static final int UNSURE=27;
    public static final int WAS_A=28;
    public static final int WENT_THROUGH=29;
    public static final int WHAT_WAS=30;
    public static final int WS=31;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred1_MAlice", "synpred62_MAlice", "synpred60_MAlice", 
    "synpred48_MAlice", "synpred26_MAlice", "program", "synpred16_MAlice", 
    "comparison", "function_call", "synpred43_MAlice", "synpred57_MAlice", 
    "value", "synpred14_MAlice", "synpred47_MAlice", "through", "function_return", 
    "synpred63_MAlice", "synpred5_MAlice", "synpred30_MAlice", "conditional", 
    "variable_assignment", "synpred18_MAlice", "procedure", "synpred35_MAlice", 
    "synpred50_MAlice", "synpred2_MAlice", "synpred11_MAlice", "input", 
    "synpred58_MAlice", "synpred3_MAlice", "synpred31_MAlice", "expression", 
    "function", "synpred39_MAlice", "synpred38_MAlice", "array_piece", "statement", 
    "synpred40_MAlice", "synpred6_MAlice", "synpred17_MAlice", "mexpr", 
    "synpred61_MAlice", "synpred51_MAlice", "synpred53_MAlice", "expression_spoke", 
    "synpred49_MAlice", "synpred45_MAlice", "synpred15_MAlice", "synpred19_MAlice", 
    "synpred9_MAlice", "boolean_expression", "synpred59_MAlice", "synpred46_MAlice", 
    "synpred7_MAlice", "variable_declaration", "synpred13_MAlice", "synpred44_MAlice", 
    "synpred29_MAlice", "synpred42_MAlice", "synpred34_MAlice", "synpred52_MAlice", 
    "synpred24_MAlice", "synpred41_MAlice", "synpred56_MAlice", "synpred37_MAlice", 
    "synpred36_MAlice", "synpred33_MAlice", "synpred27_MAlice", "synpred64_MAlice", 
    "synpred20_MAlice", "comment", "array_declaration", "while_not", "synpred32_MAlice", 
    "synpred55_MAlice", "command", "output", "synpred8_MAlice", "synpred23_MAlice", 
    "synpred54_MAlice", "synpred10_MAlice", "synpred12_MAlice", "looking_glass", 
    "hexpr", "synpred4_MAlice", "synpred28_MAlice", "synpred25_MAlice", 
    "synpred21_MAlice", "synpred22_MAlice"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, true, true, false, false, true, false, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, true, false, false, 
        false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public MAliceParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public MAliceParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public MAliceParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return MAliceParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:1: program : ( statement )* ( function | looking_glass )* ;
    public final MAliceParser.program_return program() throws RecognitionException {
        MAliceParser.program_return retval = new MAliceParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MAliceParser.statement_return statement1 =null;

        MAliceParser.function_return function2 =null;

        MAliceParser.looking_glass_return looking_glass3 =null;



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:8: ( ( statement )* ( function | looking_glass )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:11: ( statement )* ( function | looking_glass )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(17,11);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:11: ( statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ALICE_FOUND||LA1_0==CHAR||LA1_0==EITHER||(LA1_0 >= EVENTUALLY && LA1_0 <= INT)||LA1_0==PERHAPS||LA1_0==SENTENCE||LA1_0==WHAT_WAS||LA1_0==36||LA1_0==40||LA1_0==55) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:11: statement
            	    {
            	    dbg.location(17,11);
            	    pushFollow(FOLLOW_statement_in_program48);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(17,22);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:22: ( function | looking_glass )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=3;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==THE_ROOM) ) {
                    alt2=1;
                }
                else if ( (LA2_0==THE_LOOKING_GLASS) ) {
                    alt2=2;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:23: function
            	    {
            	    dbg.location(17,23);
            	    pushFollow(FOLLOW_function_in_program52);
            	    function2=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function2.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:34: looking_glass
            	    {
            	    dbg.location(17,34);
            	    pushFollow(FOLLOW_looking_glass_in_program56);
            	    looking_glass3=looking_glass();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, looking_glass3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:1: statement : command ( CONNECTOR command )* CONNECTOR ;
    public final MAliceParser.statement_return statement() throws RecognitionException {
        MAliceParser.statement_return retval = new MAliceParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONNECTOR5=null;
        Token CONNECTOR7=null;
        MAliceParser.command_return command4 =null;

        MAliceParser.command_return command6 =null;


        CommonTree CONNECTOR5_tree=null;
        CommonTree CONNECTOR7_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:10: ( command ( CONNECTOR command )* CONNECTOR )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:13: command ( CONNECTOR command )* CONNECTOR
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(19,13);
            pushFollow(FOLLOW_command_in_statement66);
            command4=command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, command4.getTree());
            dbg.location(19,21);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:21: ( CONNECTOR command )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==CONNECTOR) ) {
                    int LA3_1 = input.LA(2);

                    if ( (synpred4_MAlice()) ) {
                        alt3=1;
                    }


                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:22: CONNECTOR command
            	    {
            	    dbg.location(19,22);
            	    CONNECTOR5=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_statement69); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CONNECTOR5_tree = 
            	    (CommonTree)adaptor.create(CONNECTOR5)
            	    ;
            	    adaptor.addChild(root_0, CONNECTOR5_tree);
            	    }
            	    dbg.location(19,32);
            	    pushFollow(FOLLOW_command_in_statement71);
            	    command6=command();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, command6.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(19,42);
            CONNECTOR7=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_statement75); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONNECTOR7_tree = 
            (CommonTree)adaptor.create(CONNECTOR7)
            ;
            adaptor.addChild(root_0, CONNECTOR7_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"


    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "command"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:1: command : ( expression_spoke | variable_assignment | variable_declaration | array_declaration | procedure | function_call | function_return | through | while_not | conditional | input | output | comment );
    public final MAliceParser.command_return command() throws RecognitionException {
        MAliceParser.command_return retval = new MAliceParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MAliceParser.expression_spoke_return expression_spoke8 =null;

        MAliceParser.variable_assignment_return variable_assignment9 =null;

        MAliceParser.variable_declaration_return variable_declaration10 =null;

        MAliceParser.array_declaration_return array_declaration11 =null;

        MAliceParser.procedure_return procedure12 =null;

        MAliceParser.function_call_return function_call13 =null;

        MAliceParser.function_return_return function_return14 =null;

        MAliceParser.through_return through15 =null;

        MAliceParser.while_not_return while_not16 =null;

        MAliceParser.conditional_return conditional17 =null;

        MAliceParser.input_return input18 =null;

        MAliceParser.output_return output19 =null;

        MAliceParser.comment_return comment20 =null;



        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:8: ( expression_spoke | variable_assignment | variable_declaration | array_declaration | procedure | function_call | function_return | through | while_not | conditional | input | output | comment )
            int alt4=13;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case 40:
            case 55:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred6_MAlice()) ) {
                    alt4=2;
                }
                else if ( (synpred7_MAlice()) ) {
                    alt4=3;
                }
                else if ( (synpred8_MAlice()) ) {
                    alt4=4;
                }
                else if ( (synpred9_MAlice()) ) {
                    alt4=5;
                }
                else if ( (synpred10_MAlice()) ) {
                    alt4=6;
                }
                else if ( (synpred12_MAlice()) ) {
                    alt4=8;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 36:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case SENTENCE:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else if ( (true) ) {
                    alt4=13;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred5_MAlice()) ) {
                    alt4=1;
                }
                else if ( (synpred16_MAlice()) ) {
                    alt4=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ALICE_FOUND:
                {
                alt4=7;
                }
                break;
            case EVENTUALLY:
                {
                alt4=9;
                }
                break;
            case EITHER:
            case PERHAPS:
                {
                alt4=10;
                }
                break;
            case WHAT_WAS:
                {
                alt4=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:11: expression_spoke
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,11);
                    pushFollow(FOLLOW_expression_spoke_in_command83);
                    expression_spoke8=expression_spoke();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_spoke8.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:30: variable_assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,30);
                    pushFollow(FOLLOW_variable_assignment_in_command87);
                    variable_assignment9=variable_assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_assignment9.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:52: variable_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,52);
                    pushFollow(FOLLOW_variable_declaration_in_command91);
                    variable_declaration10=variable_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_declaration10.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:75: array_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,75);
                    pushFollow(FOLLOW_array_declaration_in_command95);
                    array_declaration11=array_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_declaration11.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:95: procedure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,95);
                    pushFollow(FOLLOW_procedure_in_command99);
                    procedure12=procedure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedure12.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:107: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,107);
                    pushFollow(FOLLOW_function_call_in_command103);
                    function_call13=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call13.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:123: function_return
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,123);
                    pushFollow(FOLLOW_function_return_in_command107);
                    function_return14=function_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_return14.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:141: through
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,141);
                    pushFollow(FOLLOW_through_in_command111);
                    through15=through();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, through15.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:151: while_not
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,151);
                    pushFollow(FOLLOW_while_not_in_command115);
                    while_not16=while_not();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_not16.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:163: conditional
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,163);
                    pushFollow(FOLLOW_conditional_in_command119);
                    conditional17=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional17.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:177: input
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,177);
                    pushFollow(FOLLOW_input_in_command123);
                    input18=input();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, input18.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:185: output
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,185);
                    pushFollow(FOLLOW_output_in_command127);
                    output19=output();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, output19.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:194: comment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(21,194);
                    pushFollow(FOLLOW_comment_in_command131);
                    comment20=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 200);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"


    public static class variable_assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_assignment"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:1: variable_assignment : ( ID | array_piece ) 'became' ( expression | SENTENCE | CHAR ) ;
    public final MAliceParser.variable_assignment_return variable_assignment() throws RecognitionException {
        MAliceParser.variable_assignment_return retval = new MAliceParser.variable_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID21=null;
        Token string_literal23=null;
        Token SENTENCE25=null;
        Token CHAR26=null;
        MAliceParser.array_piece_return array_piece22 =null;

        MAliceParser.expression_return expression24 =null;


        CommonTree ID21_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree SENTENCE25_tree=null;
        CommonTree CHAR26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:20: ( ( ID | array_piece ) 'became' ( expression | SENTENCE | CHAR ) )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:22: ( ID | array_piece ) 'became' ( expression | SENTENCE | CHAR )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(25,22);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:22: ( ID | array_piece )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==47) ) {
                    alt5=2;
                }
                else if ( (LA5_1==49) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:23: ID
                    {
                    dbg.location(25,23);
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_variable_assignment141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID21_tree = 
                    (CommonTree)adaptor.create(ID21)
                    ;
                    adaptor.addChild(root_0, ID21_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:28: array_piece
                    {
                    dbg.location(25,28);
                    pushFollow(FOLLOW_array_piece_in_variable_assignment145);
                    array_piece22=array_piece();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_piece22.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(25,41);
            string_literal23=(Token)match(input,49,FOLLOW_49_in_variable_assignment148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal23_tree = 
            (CommonTree)adaptor.create(string_literal23)
            ;
            adaptor.addChild(root_0, string_literal23_tree);
            }
            dbg.location(25,50);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:50: ( expression | SENTENCE | CHAR )
            int alt6=3;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case 36:
            case 40:
            case 55:
                {
                alt6=1;
                }
                break;
            case SENTENCE:
                {
                alt6=2;
                }
                break;
            case CHAR:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:51: expression
                    {
                    dbg.location(25,51);
                    pushFollow(FOLLOW_expression_in_variable_assignment151);
                    expression24=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression24.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:64: SENTENCE
                    {
                    dbg.location(25,64);
                    SENTENCE25=(Token)match(input,SENTENCE,FOLLOW_SENTENCE_in_variable_assignment155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SENTENCE25_tree = 
                    (CommonTree)adaptor.create(SENTENCE25)
                    ;
                    adaptor.addChild(root_0, SENTENCE25_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:75: CHAR
                    {
                    dbg.location(25,75);
                    CHAR26=(Token)match(input,CHAR,FOLLOW_CHAR_in_variable_assignment159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR26_tree = 
                    (CommonTree)adaptor.create(CHAR26)
                    ;
                    adaptor.addChild(root_0, CHAR26_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable_assignment"


    public static class variable_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_declaration"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:1: variable_declaration : ID WAS_A TYPE ;
    public final MAliceParser.variable_declaration_return variable_declaration() throws RecognitionException {
        MAliceParser.variable_declaration_return retval = new MAliceParser.variable_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID27=null;
        Token WAS_A28=null;
        Token TYPE29=null;

        CommonTree ID27_tree=null;
        CommonTree WAS_A28_tree=null;
        CommonTree TYPE29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:21: ( ID WAS_A TYPE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:23: ID WAS_A TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,23);
            ID27=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration167); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID27_tree = 
            (CommonTree)adaptor.create(ID27)
            ;
            adaptor.addChild(root_0, ID27_tree);
            }
            dbg.location(27,26);
            WAS_A28=(Token)match(input,WAS_A,FOLLOW_WAS_A_in_variable_declaration169); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAS_A28_tree = 
            (CommonTree)adaptor.create(WAS_A28)
            ;
            adaptor.addChild(root_0, WAS_A28_tree);
            }
            dbg.location(27,32);
            TYPE29=(Token)match(input,TYPE,FOLLOW_TYPE_in_variable_declaration171); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE29_tree = 
            (CommonTree)adaptor.create(TYPE29)
            ;
            adaptor.addChild(root_0, TYPE29_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable_declaration"


    public static class array_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_declaration"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:1: array_declaration : ID 'had' expression TYPE ;
    public final MAliceParser.array_declaration_return array_declaration() throws RecognitionException {
        MAliceParser.array_declaration_return retval = new MAliceParser.array_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID30=null;
        Token string_literal31=null;
        Token TYPE33=null;
        MAliceParser.expression_return expression32 =null;


        CommonTree ID30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree TYPE33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "array_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:18: ( ID 'had' expression TYPE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:20: ID 'had' expression TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,20);
            ID30=(Token)match(input,ID,FOLLOW_ID_in_array_declaration178); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID30_tree = 
            (CommonTree)adaptor.create(ID30)
            ;
            adaptor.addChild(root_0, ID30_tree);
            }
            dbg.location(29,23);
            string_literal31=(Token)match(input,50,FOLLOW_50_in_array_declaration180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal31_tree = 
            (CommonTree)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);
            }
            dbg.location(29,29);
            pushFollow(FOLLOW_expression_in_array_declaration182);
            expression32=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression32.getTree());
            dbg.location(29,40);
            TYPE33=(Token)match(input,TYPE,FOLLOW_TYPE_in_array_declaration184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE33_tree = 
            (CommonTree)adaptor.create(TYPE33)
            ;
            adaptor.addChild(root_0, TYPE33_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(29, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "array_declaration"


    public static class procedure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:1: procedure : ID PROCEDURE ;
    public final MAliceParser.procedure_return procedure() throws RecognitionException {
        MAliceParser.procedure_return retval = new MAliceParser.procedure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID34=null;
        Token PROCEDURE35=null;

        CommonTree ID34_tree=null;
        CommonTree PROCEDURE35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:10: ( ID PROCEDURE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:13: ID PROCEDURE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(31,13);
            ID34=(Token)match(input,ID,FOLLOW_ID_in_procedure192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID34_tree = 
            (CommonTree)adaptor.create(ID34)
            ;
            adaptor.addChild(root_0, ID34_tree);
            }
            dbg.location(31,16);
            PROCEDURE35=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PROCEDURE35_tree = 
            (CommonTree)adaptor.create(PROCEDURE35)
            ;
            adaptor.addChild(root_0, PROCEDURE35_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedure"


    public static class expression_spoke_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_spoke"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:1: expression_spoke : ( boolean_expression | expression | SENTENCE | CHAR ) 'spoke' ;
    public final MAliceParser.expression_spoke_return expression_spoke() throws RecognitionException {
        MAliceParser.expression_spoke_return retval = new MAliceParser.expression_spoke_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SENTENCE38=null;
        Token CHAR39=null;
        Token string_literal40=null;
        MAliceParser.boolean_expression_return boolean_expression36 =null;

        MAliceParser.expression_return expression37 =null;


        CommonTree SENTENCE38_tree=null;
        CommonTree CHAR39_tree=null;
        CommonTree string_literal40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression_spoke");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:17: ( ( boolean_expression | expression | SENTENCE | CHAR ) 'spoke' )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:25: ( boolean_expression | expression | SENTENCE | CHAR ) 'spoke'
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,25);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:25: ( boolean_expression | expression | SENTENCE | CHAR )
            int alt7=4;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
            case 40:
            case 55:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred20_MAlice()) ) {
                    alt7=1;
                }
                else if ( (synpred21_MAlice()) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred20_MAlice()) ) {
                    alt7=1;
                }
                else if ( (synpred21_MAlice()) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred20_MAlice()) ) {
                    alt7=1;
                }
                else if ( (synpred21_MAlice()) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 36:
                {
                int LA7_4 = input.LA(2);

                if ( (synpred20_MAlice()) ) {
                    alt7=1;
                }
                else if ( (synpred21_MAlice()) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case SENTENCE:
                {
                alt7=3;
                }
                break;
            case CHAR:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:26: boolean_expression
                    {
                    dbg.location(33,26);
                    pushFollow(FOLLOW_boolean_expression_in_expression_spoke209);
                    boolean_expression36=boolean_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression36.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:47: expression
                    {
                    dbg.location(33,47);
                    pushFollow(FOLLOW_expression_in_expression_spoke213);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression37.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:60: SENTENCE
                    {
                    dbg.location(33,60);
                    SENTENCE38=(Token)match(input,SENTENCE,FOLLOW_SENTENCE_in_expression_spoke217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SENTENCE38_tree = 
                    (CommonTree)adaptor.create(SENTENCE38)
                    ;
                    adaptor.addChild(root_0, SENTENCE38_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:71: CHAR
                    {
                    dbg.location(33,71);
                    CHAR39=(Token)match(input,CHAR,FOLLOW_CHAR_in_expression_spoke221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR39_tree = 
                    (CommonTree)adaptor.create(CHAR39)
                    ;
                    adaptor.addChild(root_0, CHAR39_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(33,77);
            string_literal40=(Token)match(input,52,FOLLOW_52_in_expression_spoke224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal40_tree = 
            (CommonTree)adaptor.create(string_literal40)
            ;
            adaptor.addChild(root_0, string_literal40_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_spoke");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression_spoke"


    public static class while_not_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_not"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:1: while_not : EVENTUALLY boolean_expression ')' BECAUSE ( statement )* ENOUGH_TIMES ;
    public final MAliceParser.while_not_return while_not() throws RecognitionException {
        MAliceParser.while_not_return retval = new MAliceParser.while_not_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EVENTUALLY41=null;
        Token char_literal43=null;
        Token BECAUSE44=null;
        Token ENOUGH_TIMES46=null;
        MAliceParser.boolean_expression_return boolean_expression42 =null;

        MAliceParser.statement_return statement45 =null;


        CommonTree EVENTUALLY41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree BECAUSE44_tree=null;
        CommonTree ENOUGH_TIMES46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "while_not");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:10: ( EVENTUALLY boolean_expression ')' BECAUSE ( statement )* ENOUGH_TIMES )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:13: EVENTUALLY boolean_expression ')' BECAUSE ( statement )* ENOUGH_TIMES
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(35,13);
            EVENTUALLY41=(Token)match(input,EVENTUALLY,FOLLOW_EVENTUALLY_in_while_not232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EVENTUALLY41_tree = 
            (CommonTree)adaptor.create(EVENTUALLY41)
            ;
            adaptor.addChild(root_0, EVENTUALLY41_tree);
            }
            dbg.location(35,24);
            pushFollow(FOLLOW_boolean_expression_in_while_not234);
            boolean_expression42=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression42.getTree());
            dbg.location(35,43);
            char_literal43=(Token)match(input,37,FOLLOW_37_in_while_not236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal43_tree = 
            (CommonTree)adaptor.create(char_literal43)
            ;
            adaptor.addChild(root_0, char_literal43_tree);
            }
            dbg.location(35,47);
            BECAUSE44=(Token)match(input,BECAUSE,FOLLOW_BECAUSE_in_while_not238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BECAUSE44_tree = 
            (CommonTree)adaptor.create(BECAUSE44)
            ;
            adaptor.addChild(root_0, BECAUSE44_tree);
            }
            dbg.location(35,55);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:55: ( statement )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==ALICE_FOUND||LA8_0==CHAR||LA8_0==EITHER||(LA8_0 >= EVENTUALLY && LA8_0 <= INT)||LA8_0==PERHAPS||LA8_0==SENTENCE||LA8_0==WHAT_WAS||LA8_0==36||LA8_0==40||LA8_0==55) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:55: statement
            	    {
            	    dbg.location(35,55);
            	    pushFollow(FOLLOW_statement_in_while_not240);
            	    statement45=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement45.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(35,66);
            ENOUGH_TIMES46=(Token)match(input,ENOUGH_TIMES,FOLLOW_ENOUGH_TIMES_in_while_not243); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ENOUGH_TIMES46_tree = 
            (CommonTree)adaptor.create(ENOUGH_TIMES46)
            ;
            adaptor.addChild(root_0, ENOUGH_TIMES46_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_not");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "while_not"


    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:1: conditional : ( PERHAPS | EITHER ) boolean_expression SO ( statement )* ( OR_MAYBE boolean_expression SO ( statement )* )* ( OR ( statement )* )? UNSURE ;
    public final MAliceParser.conditional_return conditional() throws RecognitionException {
        MAliceParser.conditional_return retval = new MAliceParser.conditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set47=null;
        Token SO49=null;
        Token OR_MAYBE51=null;
        Token SO53=null;
        Token OR55=null;
        Token UNSURE57=null;
        MAliceParser.boolean_expression_return boolean_expression48 =null;

        MAliceParser.statement_return statement50 =null;

        MAliceParser.boolean_expression_return boolean_expression52 =null;

        MAliceParser.statement_return statement54 =null;

        MAliceParser.statement_return statement56 =null;


        CommonTree set47_tree=null;
        CommonTree SO49_tree=null;
        CommonTree OR_MAYBE51_tree=null;
        CommonTree SO53_tree=null;
        CommonTree OR55_tree=null;
        CommonTree UNSURE57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:12: ( ( PERHAPS | EITHER ) boolean_expression SO ( statement )* ( OR_MAYBE boolean_expression SO ( statement )* )* ( OR ( statement )* )? UNSURE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:15: ( PERHAPS | EITHER ) boolean_expression SO ( statement )* ( OR_MAYBE boolean_expression SO ( statement )* )* ( OR ( statement )* )? UNSURE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(37,15);
            set47=(Token)input.LT(1);

            if ( input.LA(1)==EITHER||input.LA(1)==PERHAPS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set47)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(37,34);
            pushFollow(FOLLOW_boolean_expression_in_conditional259);
            boolean_expression48=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression48.getTree());
            dbg.location(37,53);
            SO49=(Token)match(input,SO,FOLLOW_SO_in_conditional261); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SO49_tree = 
            (CommonTree)adaptor.create(SO49)
            ;
            adaptor.addChild(root_0, SO49_tree);
            }
            dbg.location(37,56);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:56: ( statement )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==ALICE_FOUND||LA9_0==CHAR||LA9_0==EITHER||(LA9_0 >= EVENTUALLY && LA9_0 <= INT)||LA9_0==PERHAPS||LA9_0==SENTENCE||LA9_0==WHAT_WAS||LA9_0==36||LA9_0==40||LA9_0==55) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:56: statement
            	    {
            	    dbg.location(37,56);
            	    pushFollow(FOLLOW_statement_in_conditional263);
            	    statement50=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement50.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(37,67);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:67: ( OR_MAYBE boolean_expression SO ( statement )* )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR_MAYBE) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:68: OR_MAYBE boolean_expression SO ( statement )*
            	    {
            	    dbg.location(37,68);
            	    OR_MAYBE51=(Token)match(input,OR_MAYBE,FOLLOW_OR_MAYBE_in_conditional267); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR_MAYBE51_tree = 
            	    (CommonTree)adaptor.create(OR_MAYBE51)
            	    ;
            	    adaptor.addChild(root_0, OR_MAYBE51_tree);
            	    }
            	    dbg.location(37,77);
            	    pushFollow(FOLLOW_boolean_expression_in_conditional269);
            	    boolean_expression52=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression52.getTree());
            	    dbg.location(37,96);
            	    SO53=(Token)match(input,SO,FOLLOW_SO_in_conditional271); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SO53_tree = 
            	    (CommonTree)adaptor.create(SO53)
            	    ;
            	    adaptor.addChild(root_0, SO53_tree);
            	    }
            	    dbg.location(37,99);
            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:99: ( statement )*
            	    try { dbg.enterSubRule(10);

            	    loop10:
            	    do {
            	        int alt10=2;
            	        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==ALICE_FOUND||LA10_0==CHAR||LA10_0==EITHER||(LA10_0 >= EVENTUALLY && LA10_0 <= INT)||LA10_0==PERHAPS||LA10_0==SENTENCE||LA10_0==WHAT_WAS||LA10_0==36||LA10_0==40||LA10_0==55) ) {
            	            alt10=1;
            	        }


            	        } finally {dbg.exitDecision(10);}

            	        switch (alt10) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:99: statement
            	    	    {
            	    	    dbg.location(37,99);
            	    	    pushFollow(FOLLOW_statement_in_conditional273);
            	    	    statement54=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement54.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(10);}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(37,112);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:112: ( OR ( statement )* )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==OR) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:113: OR ( statement )*
                    {
                    dbg.location(37,113);
                    OR55=(Token)match(input,OR,FOLLOW_OR_in_conditional279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR55_tree = 
                    (CommonTree)adaptor.create(OR55)
                    ;
                    adaptor.addChild(root_0, OR55_tree);
                    }
                    dbg.location(37,116);
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:116: ( statement )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==ALICE_FOUND||LA12_0==CHAR||LA12_0==EITHER||(LA12_0 >= EVENTUALLY && LA12_0 <= INT)||LA12_0==PERHAPS||LA12_0==SENTENCE||LA12_0==WHAT_WAS||LA12_0==36||LA12_0==40||LA12_0==55) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:116: statement
                    	    {
                    	    dbg.location(37,116);
                    	    pushFollow(FOLLOW_statement_in_conditional281);
                    	    statement56=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(37,129);
            UNSURE57=(Token)match(input,UNSURE,FOLLOW_UNSURE_in_conditional286); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNSURE57_tree = 
            (CommonTree)adaptor.create(UNSURE57)
            ;
            adaptor.addChild(root_0, UNSURE57_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 134);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditional"


    public static class input_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "input"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:1: input : WHAT_WAS ( ID | array_piece ) ;
    public final MAliceParser.input_return input() throws RecognitionException {
        MAliceParser.input_return retval = new MAliceParser.input_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHAT_WAS58=null;
        Token ID59=null;
        MAliceParser.array_piece_return array_piece60 =null;


        CommonTree WHAT_WAS58_tree=null;
        CommonTree ID59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "input");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:6: ( WHAT_WAS ( ID | array_piece ) )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:10: WHAT_WAS ( ID | array_piece )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(41,10);
            WHAT_WAS58=(Token)match(input,WHAT_WAS,FOLLOW_WHAT_WAS_in_input297); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHAT_WAS58_tree = 
            (CommonTree)adaptor.create(WHAT_WAS58)
            ;
            adaptor.addChild(root_0, WHAT_WAS58_tree);
            }
            dbg.location(41,19);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:19: ( ID | array_piece )
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==47) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==CONNECTOR) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:20: ID
                    {
                    dbg.location(41,20);
                    ID59=(Token)match(input,ID,FOLLOW_ID_in_input300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID59_tree = 
                    (CommonTree)adaptor.create(ID59)
                    ;
                    adaptor.addChild(root_0, ID59_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:25: array_piece
                    {
                    dbg.location(41,25);
                    pushFollow(FOLLOW_array_piece_in_input304);
                    array_piece60=array_piece();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_piece60.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(41, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "input");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "input"


    public static class output_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "output"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:1: output : ( boolean_expression | expression | SENTENCE | CHAR ) SAID_ALICE ;
    public final MAliceParser.output_return output() throws RecognitionException {
        MAliceParser.output_return retval = new MAliceParser.output_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SENTENCE63=null;
        Token CHAR64=null;
        Token SAID_ALICE65=null;
        MAliceParser.boolean_expression_return boolean_expression61 =null;

        MAliceParser.expression_return expression62 =null;


        CommonTree SENTENCE63_tree=null;
        CommonTree CHAR64_tree=null;
        CommonTree SAID_ALICE65_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "output");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:7: ( ( boolean_expression | expression | SENTENCE | CHAR ) SAID_ALICE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:11: ( boolean_expression | expression | SENTENCE | CHAR ) SAID_ALICE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(43,11);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:11: ( boolean_expression | expression | SENTENCE | CHAR )
            int alt15=4;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case 40:
            case 55:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred31_MAlice()) ) {
                    alt15=1;
                }
                else if ( (synpred32_MAlice()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred31_MAlice()) ) {
                    alt15=1;
                }
                else if ( (synpred32_MAlice()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred31_MAlice()) ) {
                    alt15=1;
                }
                else if ( (synpred32_MAlice()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 36:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred31_MAlice()) ) {
                    alt15=1;
                }
                else if ( (synpred32_MAlice()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case SENTENCE:
                {
                alt15=3;
                }
                break;
            case CHAR:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:12: boolean_expression
                    {
                    dbg.location(43,12);
                    pushFollow(FOLLOW_boolean_expression_in_output315);
                    boolean_expression61=boolean_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression61.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:33: expression
                    {
                    dbg.location(43,33);
                    pushFollow(FOLLOW_expression_in_output319);
                    expression62=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression62.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:46: SENTENCE
                    {
                    dbg.location(43,46);
                    SENTENCE63=(Token)match(input,SENTENCE,FOLLOW_SENTENCE_in_output323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SENTENCE63_tree = 
                    (CommonTree)adaptor.create(SENTENCE63)
                    ;
                    adaptor.addChild(root_0, SENTENCE63_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:57: CHAR
                    {
                    dbg.location(43,57);
                    CHAR64=(Token)match(input,CHAR,FOLLOW_CHAR_in_output327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR64_tree = 
                    (CommonTree)adaptor.create(CHAR64)
                    ;
                    adaptor.addChild(root_0, CHAR64_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(43,63);
            SAID_ALICE65=(Token)match(input,SAID_ALICE,FOLLOW_SAID_ALICE_in_output330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SAID_ALICE65_tree = 
            (CommonTree)adaptor.create(SAID_ALICE65)
            ;
            adaptor.addChild(root_0, SAID_ALICE65_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(43, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "output");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "output"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:1: function : THE_ROOM ID '(' ( SPIDER )? TYPE ID ( CONNECTOR ( SPIDER )? TYPE ID )* ')' CONTAINED_A TYPE ( statement )* ;
    public final MAliceParser.function_return function() throws RecognitionException {
        MAliceParser.function_return retval = new MAliceParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token THE_ROOM66=null;
        Token ID67=null;
        Token char_literal68=null;
        Token SPIDER69=null;
        Token TYPE70=null;
        Token ID71=null;
        Token CONNECTOR72=null;
        Token SPIDER73=null;
        Token TYPE74=null;
        Token ID75=null;
        Token char_literal76=null;
        Token CONTAINED_A77=null;
        Token TYPE78=null;
        MAliceParser.statement_return statement79 =null;


        CommonTree THE_ROOM66_tree=null;
        CommonTree ID67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree SPIDER69_tree=null;
        CommonTree TYPE70_tree=null;
        CommonTree ID71_tree=null;
        CommonTree CONNECTOR72_tree=null;
        CommonTree SPIDER73_tree=null;
        CommonTree TYPE74_tree=null;
        CommonTree ID75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree CONTAINED_A77_tree=null;
        CommonTree TYPE78_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:9: ( THE_ROOM ID '(' ( SPIDER )? TYPE ID ( CONNECTOR ( SPIDER )? TYPE ID )* ')' CONTAINED_A TYPE ( statement )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:12: THE_ROOM ID '(' ( SPIDER )? TYPE ID ( CONNECTOR ( SPIDER )? TYPE ID )* ')' CONTAINED_A TYPE ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(45,12);
            THE_ROOM66=(Token)match(input,THE_ROOM,FOLLOW_THE_ROOM_in_function338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THE_ROOM66_tree = 
            (CommonTree)adaptor.create(THE_ROOM66)
            ;
            adaptor.addChild(root_0, THE_ROOM66_tree);
            }
            dbg.location(45,21);
            ID67=(Token)match(input,ID,FOLLOW_ID_in_function340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID67_tree = 
            (CommonTree)adaptor.create(ID67)
            ;
            adaptor.addChild(root_0, ID67_tree);
            }
            dbg.location(45,24);
            char_literal68=(Token)match(input,36,FOLLOW_36_in_function342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal68_tree = 
            (CommonTree)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);
            }
            dbg.location(45,28);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:28: ( SPIDER )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==SPIDER) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:28: SPIDER
                    {
                    dbg.location(45,28);
                    SPIDER69=(Token)match(input,SPIDER,FOLLOW_SPIDER_in_function344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SPIDER69_tree = 
                    (CommonTree)adaptor.create(SPIDER69)
                    ;
                    adaptor.addChild(root_0, SPIDER69_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(45,36);
            TYPE70=(Token)match(input,TYPE,FOLLOW_TYPE_in_function347); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE70_tree = 
            (CommonTree)adaptor.create(TYPE70)
            ;
            adaptor.addChild(root_0, TYPE70_tree);
            }
            dbg.location(45,41);
            ID71=(Token)match(input,ID,FOLLOW_ID_in_function349); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID71_tree = 
            (CommonTree)adaptor.create(ID71)
            ;
            adaptor.addChild(root_0, ID71_tree);
            }
            dbg.location(45,44);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:44: ( CONNECTOR ( SPIDER )? TYPE ID )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==CONNECTOR) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:45: CONNECTOR ( SPIDER )? TYPE ID
            	    {
            	    dbg.location(45,45);
            	    CONNECTOR72=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_function352); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CONNECTOR72_tree = 
            	    (CommonTree)adaptor.create(CONNECTOR72)
            	    ;
            	    adaptor.addChild(root_0, CONNECTOR72_tree);
            	    }
            	    dbg.location(45,55);
            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:55: ( SPIDER )?
            	    int alt17=2;
            	    try { dbg.enterSubRule(17);
            	    try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==SPIDER) ) {
            	        alt17=1;
            	    }
            	    } finally {dbg.exitDecision(17);}

            	    switch (alt17) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:55: SPIDER
            	            {
            	            dbg.location(45,55);
            	            SPIDER73=(Token)match(input,SPIDER,FOLLOW_SPIDER_in_function354); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SPIDER73_tree = 
            	            (CommonTree)adaptor.create(SPIDER73)
            	            ;
            	            adaptor.addChild(root_0, SPIDER73_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(17);}

            	    dbg.location(45,63);
            	    TYPE74=(Token)match(input,TYPE,FOLLOW_TYPE_in_function357); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TYPE74_tree = 
            	    (CommonTree)adaptor.create(TYPE74)
            	    ;
            	    adaptor.addChild(root_0, TYPE74_tree);
            	    }
            	    dbg.location(45,68);
            	    ID75=(Token)match(input,ID,FOLLOW_ID_in_function359); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID75_tree = 
            	    (CommonTree)adaptor.create(ID75)
            	    ;
            	    adaptor.addChild(root_0, ID75_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(45,73);
            char_literal76=(Token)match(input,37,FOLLOW_37_in_function363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal76_tree = 
            (CommonTree)adaptor.create(char_literal76)
            ;
            adaptor.addChild(root_0, char_literal76_tree);
            }
            dbg.location(45,77);
            CONTAINED_A77=(Token)match(input,CONTAINED_A,FOLLOW_CONTAINED_A_in_function365); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTAINED_A77_tree = 
            (CommonTree)adaptor.create(CONTAINED_A77)
            ;
            adaptor.addChild(root_0, CONTAINED_A77_tree);
            }
            dbg.location(45,89);
            TYPE78=(Token)match(input,TYPE,FOLLOW_TYPE_in_function367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE78_tree = 
            (CommonTree)adaptor.create(TYPE78)
            ;
            adaptor.addChild(root_0, TYPE78_tree);
            }
            dbg.location(45,94);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:94: ( statement )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==ALICE_FOUND||LA19_0==CHAR||LA19_0==EITHER||(LA19_0 >= EVENTUALLY && LA19_0 <= INT)||LA19_0==PERHAPS||LA19_0==SENTENCE||LA19_0==WHAT_WAS||LA19_0==36||LA19_0==40||LA19_0==55) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:94: statement
            	    {
            	    dbg.location(45,94);
            	    pushFollow(FOLLOW_statement_in_function369);
            	    statement79=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement79.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(45, 103);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"


    public static class function_return_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_return"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:1: function_return : ALICE_FOUND ( expression | CHAR ) ;
    public final MAliceParser.function_return_return function_return() throws RecognitionException {
        MAliceParser.function_return_return retval = new MAliceParser.function_return_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALICE_FOUND80=null;
        Token CHAR82=null;
        MAliceParser.expression_return expression81 =null;


        CommonTree ALICE_FOUND80_tree=null;
        CommonTree CHAR82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_return");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:16: ( ALICE_FOUND ( expression | CHAR ) )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:18: ALICE_FOUND ( expression | CHAR )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(47,18);
            ALICE_FOUND80=(Token)match(input,ALICE_FOUND,FOLLOW_ALICE_FOUND_in_function_return377); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALICE_FOUND80_tree = 
            (CommonTree)adaptor.create(ALICE_FOUND80)
            ;
            adaptor.addChild(root_0, ALICE_FOUND80_tree);
            }
            dbg.location(47,30);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:30: ( expression | CHAR )
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= ID && LA20_0 <= INT)||LA20_0==36||LA20_0==40||LA20_0==55) ) {
                alt20=1;
            }
            else if ( (LA20_0==CHAR) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:31: expression
                    {
                    dbg.location(47,31);
                    pushFollow(FOLLOW_expression_in_function_return380);
                    expression81=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression81.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:44: CHAR
                    {
                    dbg.location(47,44);
                    CHAR82=(Token)match(input,CHAR,FOLLOW_CHAR_in_function_return384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR82_tree = 
                    (CommonTree)adaptor.create(CHAR82)
                    ;
                    adaptor.addChild(root_0, CHAR82_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(47, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_return");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_return"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:1: function_call : ID '(' expression ( CONNECTOR expression )* ')' ;
    public final MAliceParser.function_call_return function_call() throws RecognitionException {
        MAliceParser.function_call_return retval = new MAliceParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID83=null;
        Token char_literal84=null;
        Token CONNECTOR86=null;
        Token char_literal88=null;
        MAliceParser.expression_return expression85 =null;

        MAliceParser.expression_return expression87 =null;


        CommonTree ID83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree CONNECTOR86_tree=null;
        CommonTree char_literal88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:14: ( ID '(' expression ( CONNECTOR expression )* ')' )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:17: ID '(' expression ( CONNECTOR expression )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(49,17);
            ID83=(Token)match(input,ID,FOLLOW_ID_in_function_call393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID83_tree = 
            (CommonTree)adaptor.create(ID83)
            ;
            adaptor.addChild(root_0, ID83_tree);
            }
            dbg.location(49,20);
            char_literal84=(Token)match(input,36,FOLLOW_36_in_function_call395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = 
            (CommonTree)adaptor.create(char_literal84)
            ;
            adaptor.addChild(root_0, char_literal84_tree);
            }
            dbg.location(49,24);
            pushFollow(FOLLOW_expression_in_function_call397);
            expression85=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression85.getTree());
            dbg.location(49,35);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:35: ( CONNECTOR expression )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==CONNECTOR) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:36: CONNECTOR expression
            	    {
            	    dbg.location(49,36);
            	    CONNECTOR86=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_function_call400); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CONNECTOR86_tree = 
            	    (CommonTree)adaptor.create(CONNECTOR86)
            	    ;
            	    adaptor.addChild(root_0, CONNECTOR86_tree);
            	    }
            	    dbg.location(49,46);
            	    pushFollow(FOLLOW_expression_in_function_call402);
            	    expression87=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression87.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(49,59);
            char_literal88=(Token)match(input,37,FOLLOW_37_in_function_call406); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal88_tree = 
            (CommonTree)adaptor.create(char_literal88)
            ;
            adaptor.addChild(root_0, char_literal88_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_call"


    public static class looking_glass_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "looking_glass"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:1: looking_glass : THE_LOOKING_GLASS ID CHANGED_A TYPE ( statement )* ;
    public final MAliceParser.looking_glass_return looking_glass() throws RecognitionException {
        MAliceParser.looking_glass_return retval = new MAliceParser.looking_glass_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token THE_LOOKING_GLASS89=null;
        Token ID90=null;
        Token CHANGED_A91=null;
        Token TYPE92=null;
        MAliceParser.statement_return statement93 =null;


        CommonTree THE_LOOKING_GLASS89_tree=null;
        CommonTree ID90_tree=null;
        CommonTree CHANGED_A91_tree=null;
        CommonTree TYPE92_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "looking_glass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:14: ( THE_LOOKING_GLASS ID CHANGED_A TYPE ( statement )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:17: THE_LOOKING_GLASS ID CHANGED_A TYPE ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(51,17);
            THE_LOOKING_GLASS89=(Token)match(input,THE_LOOKING_GLASS,FOLLOW_THE_LOOKING_GLASS_in_looking_glass414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THE_LOOKING_GLASS89_tree = 
            (CommonTree)adaptor.create(THE_LOOKING_GLASS89)
            ;
            adaptor.addChild(root_0, THE_LOOKING_GLASS89_tree);
            }
            dbg.location(51,35);
            ID90=(Token)match(input,ID,FOLLOW_ID_in_looking_glass416); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID90_tree = 
            (CommonTree)adaptor.create(ID90)
            ;
            adaptor.addChild(root_0, ID90_tree);
            }
            dbg.location(51,38);
            CHANGED_A91=(Token)match(input,CHANGED_A,FOLLOW_CHANGED_A_in_looking_glass418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHANGED_A91_tree = 
            (CommonTree)adaptor.create(CHANGED_A91)
            ;
            adaptor.addChild(root_0, CHANGED_A91_tree);
            }
            dbg.location(51,48);
            TYPE92=(Token)match(input,TYPE,FOLLOW_TYPE_in_looking_glass420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE92_tree = 
            (CommonTree)adaptor.create(TYPE92)
            ;
            adaptor.addChild(root_0, TYPE92_tree);
            }
            dbg.location(51,53);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:53: ( statement )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==ALICE_FOUND||LA22_0==CHAR||LA22_0==EITHER||(LA22_0 >= EVENTUALLY && LA22_0 <= INT)||LA22_0==PERHAPS||LA22_0==SENTENCE||LA22_0==WHAT_WAS||LA22_0==36||LA22_0==40||LA22_0==55) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:53: statement
            	    {
            	    dbg.location(51,53);
            	    pushFollow(FOLLOW_statement_in_looking_glass422);
            	    statement93=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement93.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(51, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "looking_glass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "looking_glass"


    public static class through_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "through"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:1: through : ID WENT_THROUGH ID ;
    public final MAliceParser.through_return through() throws RecognitionException {
        MAliceParser.through_return retval = new MAliceParser.through_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID94=null;
        Token WENT_THROUGH95=null;
        Token ID96=null;

        CommonTree ID94_tree=null;
        CommonTree WENT_THROUGH95_tree=null;
        CommonTree ID96_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "through");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:8: ( ID WENT_THROUGH ID )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:11: ID WENT_THROUGH ID
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(53,11);
            ID94=(Token)match(input,ID,FOLLOW_ID_in_through431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID94_tree = 
            (CommonTree)adaptor.create(ID94)
            ;
            adaptor.addChild(root_0, ID94_tree);
            }
            dbg.location(53,14);
            WENT_THROUGH95=(Token)match(input,WENT_THROUGH,FOLLOW_WENT_THROUGH_in_through433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WENT_THROUGH95_tree = 
            (CommonTree)adaptor.create(WENT_THROUGH95)
            ;
            adaptor.addChild(root_0, WENT_THROUGH95_tree);
            }
            dbg.location(53,27);
            ID96=(Token)match(input,ID,FOLLOW_ID_in_through435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID96_tree = 
            (CommonTree)adaptor.create(ID96)
            ;
            adaptor.addChild(root_0, ID96_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(53, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "through");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "through"


    public static class array_piece_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_piece"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:57:1: array_piece : ID '\\'s' expression 'piece' ;
    public final MAliceParser.array_piece_return array_piece() throws RecognitionException {
        MAliceParser.array_piece_return retval = new MAliceParser.array_piece_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID97=null;
        Token string_literal98=null;
        Token string_literal100=null;
        MAliceParser.expression_return expression99 =null;


        CommonTree ID97_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree string_literal100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "array_piece");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:57:12: ( ID '\\'s' expression 'piece' )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:57:15: ID '\\'s' expression 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(57,15);
            ID97=(Token)match(input,ID,FOLLOW_ID_in_array_piece445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID97_tree = 
            (CommonTree)adaptor.create(ID97)
            ;
            adaptor.addChild(root_0, ID97_tree);
            }
            dbg.location(57,18);
            string_literal98=(Token)match(input,47,FOLLOW_47_in_array_piece447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal98_tree = 
            (CommonTree)adaptor.create(string_literal98)
            ;
            adaptor.addChild(root_0, string_literal98_tree);
            }
            dbg.location(57,24);
            pushFollow(FOLLOW_expression_in_array_piece449);
            expression99=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression99.getTree());
            dbg.location(57,35);
            string_literal100=(Token)match(input,51,FOLLOW_51_in_array_piece451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal100_tree = 
            (CommonTree)adaptor.create(string_literal100)
            ;
            adaptor.addChild(root_0, string_literal100_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array_piece");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "array_piece"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:1: expression : mexpr ( ( '&' | '^' | '|' ) mexpr )* ;
    public final MAliceParser.expression_return expression() throws RecognitionException {
        MAliceParser.expression_return retval = new MAliceParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set102=null;
        MAliceParser.mexpr_return mexpr101 =null;

        MAliceParser.mexpr_return mexpr103 =null;


        CommonTree set102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:11: ( mexpr ( ( '&' | '^' | '|' ) mexpr )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:14: mexpr ( ( '&' | '^' | '|' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(59,14);
            pushFollow(FOLLOW_mexpr_in_expression459);
            mexpr101=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr101.getTree());
            dbg.location(59,20);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:20: ( ( '&' | '^' | '|' ) mexpr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==35||LA23_0==48||LA23_0==53) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:21: ( '&' | '^' | '|' ) mexpr
            	    {
            	    dbg.location(59,21);
            	    set102=(Token)input.LT(1);

            	    if ( input.LA(1)==35||input.LA(1)==48||input.LA(1)==53 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set102)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(59,39);
            	    pushFollow(FOLLOW_mexpr_in_expression474);
            	    mexpr103=mexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr103.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(59, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"


    public static class mexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mexpr"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:61:1: mexpr : hexpr ( ( '+' | '-' ) hexpr )* ;
    public final MAliceParser.mexpr_return mexpr() throws RecognitionException {
        MAliceParser.mexpr_return retval = new MAliceParser.mexpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set105=null;
        MAliceParser.hexpr_return hexpr104 =null;

        MAliceParser.hexpr_return hexpr106 =null;


        CommonTree set105_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:61:6: ( hexpr ( ( '+' | '-' ) hexpr )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:61:10: hexpr ( ( '+' | '-' ) hexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(61,10);
            pushFollow(FOLLOW_hexpr_in_mexpr485);
            hexpr104=hexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hexpr104.getTree());
            dbg.location(61,16);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:61:16: ( ( '+' | '-' ) hexpr )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= 39 && LA24_0 <= 40)) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:61:17: ( '+' | '-' ) hexpr
            	    {
            	    dbg.location(61,17);
            	    set105=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 39 && input.LA(1) <= 40) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set105)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(61,29);
            	    pushFollow(FOLLOW_hexpr_in_mexpr496);
            	    hexpr106=hexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexpr106.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(61, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mexpr"


    public static class hexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexpr"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:63:1: hexpr : value ( ( '*' | '/' | '%' ) value )* ;
    public final MAliceParser.hexpr_return hexpr() throws RecognitionException {
        MAliceParser.hexpr_return retval = new MAliceParser.hexpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set108=null;
        MAliceParser.value_return value107 =null;

        MAliceParser.value_return value109 =null;


        CommonTree set108_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:63:6: ( value ( ( '*' | '/' | '%' ) value )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:63:10: value ( ( '*' | '/' | '%' ) value )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(63,10);
            pushFollow(FOLLOW_value_in_hexpr507);
            value107=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, value107.getTree());
            dbg.location(63,16);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:63:16: ( ( '*' | '/' | '%' ) value )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==33||LA25_0==38||LA25_0==41) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:63:17: ( '*' | '/' | '%' ) value
            	    {
            	    dbg.location(63,17);
            	    set108=(Token)input.LT(1);

            	    if ( input.LA(1)==33||input.LA(1)==38||input.LA(1)==41 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set108)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(63,35);
            	    pushFollow(FOLLOW_value_in_hexpr522);
            	    value109=value();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, value109.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(63, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hexpr"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:1: value : ( '~' | '-' )* ( ID | INT | function_call | array_piece | '(' expression ')' ) ;
    public final MAliceParser.value_return value() throws RecognitionException {
        MAliceParser.value_return retval = new MAliceParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set110=null;
        Token ID111=null;
        Token INT112=null;
        Token char_literal115=null;
        Token char_literal117=null;
        MAliceParser.function_call_return function_call113 =null;

        MAliceParser.array_piece_return array_piece114 =null;

        MAliceParser.expression_return expression116 =null;


        CommonTree set110_tree=null;
        CommonTree ID111_tree=null;
        CommonTree INT112_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:6: ( ( '~' | '-' )* ( ID | INT | function_call | array_piece | '(' expression ')' ) )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:10: ( '~' | '-' )* ( ID | INT | function_call | array_piece | '(' expression ')' )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(65,10);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:10: ( '~' | '-' )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==40||LA26_0==55) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:
            	    {
            	    dbg.location(65,10);
            	    set110=(Token)input.LT(1);

            	    if ( input.LA(1)==40||input.LA(1)==55 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set110)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(65,23);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:23: ( ID | INT | function_call | array_piece | '(' expression ')' )
            int alt27=5;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt27=3;
                    }
                    break;
                case 47:
                    {
                    alt27=4;
                    }
                    break;
                case EOF:
                case CONNECTOR:
                case SAID_ALICE:
                case SO:
                case TYPE:
                case 32:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 48:
                case 51:
                case 52:
                case 53:
                case 54:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:24: ID
                    {
                    dbg.location(65,24);
                    ID111=(Token)match(input,ID,FOLLOW_ID_in_value543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID111_tree = 
                    (CommonTree)adaptor.create(ID111)
                    ;
                    adaptor.addChild(root_0, ID111_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:29: INT
                    {
                    dbg.location(65,29);
                    INT112=(Token)match(input,INT,FOLLOW_INT_in_value547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT112_tree = 
                    (CommonTree)adaptor.create(INT112)
                    ;
                    adaptor.addChild(root_0, INT112_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:35: function_call
                    {
                    dbg.location(65,35);
                    pushFollow(FOLLOW_function_call_in_value551);
                    function_call113=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call113.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:51: array_piece
                    {
                    dbg.location(65,51);
                    pushFollow(FOLLOW_array_piece_in_value555);
                    array_piece114=array_piece();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_piece114.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:65:65: '(' expression ')'
                    {
                    dbg.location(65,65);
                    char_literal115=(Token)match(input,36,FOLLOW_36_in_value559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = 
                    (CommonTree)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    dbg.location(65,69);
                    pushFollow(FOLLOW_expression_in_value561);
                    expression116=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression116.getTree());
                    dbg.location(65,80);
                    char_literal117=(Token)match(input,37,FOLLOW_37_in_value563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = 
                    (CommonTree)adaptor.create(char_literal117)
                    ;
                    adaptor.addChild(root_0, char_literal117_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(65, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "value"


    public static class boolean_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_expression"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:69:1: boolean_expression : comparison ( ( '==' | '!=' | '&&' | '||' ) comparison )* ;
    public final MAliceParser.boolean_expression_return boolean_expression() throws RecognitionException {
        MAliceParser.boolean_expression_return retval = new MAliceParser.boolean_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set119=null;
        MAliceParser.comparison_return comparison118 =null;

        MAliceParser.comparison_return comparison120 =null;


        CommonTree set119_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "boolean_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:69:19: ( comparison ( ( '==' | '!=' | '&&' | '||' ) comparison )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:69:21: comparison ( ( '==' | '!=' | '&&' | '||' ) comparison )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(69,21);
            pushFollow(FOLLOW_comparison_in_boolean_expression573);
            comparison118=comparison();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison118.getTree());
            dbg.location(69,32);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:69:32: ( ( '==' | '!=' | '&&' | '||' ) comparison )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==32||LA28_0==34||LA28_0==44||LA28_0==54) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:69:33: ( '==' | '!=' | '&&' | '||' ) comparison
            	    {
            	    dbg.location(69,33);
            	    set119=(Token)input.LT(1);

            	    if ( input.LA(1)==32||input.LA(1)==34||input.LA(1)==44||input.LA(1)==54 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set119)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(69,61);
            	    pushFollow(FOLLOW_comparison_in_boolean_expression592);
            	    comparison120=comparison();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison120.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(69, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boolean_expression"


    public static class comparison_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparison"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:1: comparison : ( expression ( '<' | '<=' | '==' | '>=' | '>' | '!=' ) expression | '(' boolean_expression ')' );
    public final MAliceParser.comparison_return comparison() throws RecognitionException {
        MAliceParser.comparison_return retval = new MAliceParser.comparison_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set122=null;
        Token char_literal124=null;
        Token char_literal126=null;
        MAliceParser.expression_return expression121 =null;

        MAliceParser.expression_return expression123 =null;

        MAliceParser.boolean_expression_return boolean_expression125 =null;


        CommonTree set122_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal126_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comparison");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:11: ( expression ( '<' | '<=' | '==' | '>=' | '>' | '!=' ) expression | '(' boolean_expression ')' )
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( ((LA29_0 >= ID && LA29_0 <= INT)||LA29_0==40||LA29_0==55) ) {
                alt29=1;
            }
            else if ( (LA29_0==36) ) {
                int LA29_4 = input.LA(2);

                if ( (synpred64_MAlice()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:14: expression ( '<' | '<=' | '==' | '>=' | '>' | '!=' ) expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(71,14);
                    pushFollow(FOLLOW_expression_in_comparison602);
                    expression121=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression121.getTree());
                    dbg.location(71,25);
                    set122=(Token)input.LT(1);

                    if ( input.LA(1)==32||(input.LA(1) >= 42 && input.LA(1) <= 46) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set122)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(71,65);
                    pushFollow(FOLLOW_expression_in_comparison628);
                    expression123=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression123.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:78: '(' boolean_expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(71,78);
                    char_literal124=(Token)match(input,36,FOLLOW_36_in_comparison632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal124_tree = 
                    (CommonTree)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);
                    }
                    dbg.location(71,82);
                    pushFollow(FOLLOW_boolean_expression_in_comparison634);
                    boolean_expression125=boolean_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression125.getTree());
                    dbg.location(71,101);
                    char_literal126=(Token)match(input,37,FOLLOW_37_in_comparison636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal126_tree = 
                    (CommonTree)adaptor.create(char_literal126)
                    ;
                    adaptor.addChild(root_0, char_literal126_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(71, 103);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparison");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comparison"


    public static class comment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comment"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:74:1: comment : SENTENCE THOUGHT_ALICE ;
    public final MAliceParser.comment_return comment() throws RecognitionException {
        MAliceParser.comment_return retval = new MAliceParser.comment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SENTENCE127=null;
        Token THOUGHT_ALICE128=null;

        CommonTree SENTENCE127_tree=null;
        CommonTree THOUGHT_ALICE128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:74:8: ( SENTENCE THOUGHT_ALICE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:74:11: SENTENCE THOUGHT_ALICE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(74,11);
            SENTENCE127=(Token)match(input,SENTENCE,FOLLOW_SENTENCE_in_comment645); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SENTENCE127_tree = 
            (CommonTree)adaptor.create(SENTENCE127)
            ;
            adaptor.addChild(root_0, SENTENCE127_tree);
            }
            dbg.location(74,20);
            THOUGHT_ALICE128=(Token)match(input,THOUGHT_ALICE,FOLLOW_THOUGHT_ALICE_in_comment647); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THOUGHT_ALICE128_tree = 
            (CommonTree)adaptor.create(THOUGHT_ALICE128)
            ;
            adaptor.addChild(root_0, THOUGHT_ALICE128_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(74, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comment"

    // $ANTLR start synpred4_MAlice
    public final void synpred4_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:22: ( CONNECTOR command )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:19:22: CONNECTOR command
        {
        dbg.location(19,22);
        match(input,CONNECTOR,FOLLOW_CONNECTOR_in_synpred4_MAlice69); if (state.failed) return ;
        dbg.location(19,32);
        pushFollow(FOLLOW_command_in_synpred4_MAlice71);
        command();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_MAlice

    // $ANTLR start synpred5_MAlice
    public final void synpred5_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:11: ( expression_spoke )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:11: expression_spoke
        {
        dbg.location(21,11);
        pushFollow(FOLLOW_expression_spoke_in_synpred5_MAlice83);
        expression_spoke();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_MAlice

    // $ANTLR start synpred6_MAlice
    public final void synpred6_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:30: ( variable_assignment )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:30: variable_assignment
        {
        dbg.location(21,30);
        pushFollow(FOLLOW_variable_assignment_in_synpred6_MAlice87);
        variable_assignment();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_MAlice

    // $ANTLR start synpred7_MAlice
    public final void synpred7_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:52: ( variable_declaration )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:52: variable_declaration
        {
        dbg.location(21,52);
        pushFollow(FOLLOW_variable_declaration_in_synpred7_MAlice91);
        variable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_MAlice

    // $ANTLR start synpred8_MAlice
    public final void synpred8_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:75: ( array_declaration )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:75: array_declaration
        {
        dbg.location(21,75);
        pushFollow(FOLLOW_array_declaration_in_synpred8_MAlice95);
        array_declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_MAlice

    // $ANTLR start synpred9_MAlice
    public final void synpred9_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:95: ( procedure )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:95: procedure
        {
        dbg.location(21,95);
        pushFollow(FOLLOW_procedure_in_synpred9_MAlice99);
        procedure();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_MAlice

    // $ANTLR start synpred10_MAlice
    public final void synpred10_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:107: ( function_call )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:107: function_call
        {
        dbg.location(21,107);
        pushFollow(FOLLOW_function_call_in_synpred10_MAlice103);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_MAlice

    // $ANTLR start synpred12_MAlice
    public final void synpred12_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:141: ( through )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:141: through
        {
        dbg.location(21,141);
        pushFollow(FOLLOW_through_in_synpred12_MAlice111);
        through();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_MAlice

    // $ANTLR start synpred16_MAlice
    public final void synpred16_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:185: ( output )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:185: output
        {
        dbg.location(21,185);
        pushFollow(FOLLOW_output_in_synpred16_MAlice127);
        output();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_MAlice

    // $ANTLR start synpred20_MAlice
    public final void synpred20_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:26: ( boolean_expression )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:26: boolean_expression
        {
        dbg.location(33,26);
        pushFollow(FOLLOW_boolean_expression_in_synpred20_MAlice209);
        boolean_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_MAlice

    // $ANTLR start synpred21_MAlice
    public final void synpred21_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:47: ( expression )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:47: expression
        {
        dbg.location(33,47);
        pushFollow(FOLLOW_expression_in_synpred21_MAlice213);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_MAlice

    // $ANTLR start synpred31_MAlice
    public final void synpred31_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:12: ( boolean_expression )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:12: boolean_expression
        {
        dbg.location(43,12);
        pushFollow(FOLLOW_boolean_expression_in_synpred31_MAlice315);
        boolean_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_MAlice

    // $ANTLR start synpred32_MAlice
    public final void synpred32_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:33: ( expression )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:33: expression
        {
        dbg.location(43,33);
        pushFollow(FOLLOW_expression_in_synpred32_MAlice319);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_MAlice

    // $ANTLR start synpred64_MAlice
    public final void synpred64_MAlice_fragment() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:14: ( expression ( '<' | '<=' | '==' | '>=' | '>' | '!=' ) expression )
        dbg.enterAlt(1);

        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:71:14: expression ( '<' | '<=' | '==' | '>=' | '>' | '!=' ) expression
        {
        dbg.location(71,14);
        pushFollow(FOLLOW_expression_in_synpred64_MAlice602);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(71,25);
        if ( input.LA(1)==32||(input.LA(1) >= 42 && input.LA(1) <= 46) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }

        dbg.location(71,65);
        pushFollow(FOLLOW_expression_in_synpred64_MAlice628);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_MAlice

    // Delegated rules

    public final boolean synpred9_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred16_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred21_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred7_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred64_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred32_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred12_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_MAlice() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred31_MAlice_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statement_in_program48 = new BitSet(new long[]{0x0080011041927492L});
    public static final BitSet FOLLOW_function_in_program52 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_looking_glass_in_program56 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_command_in_statement66 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CONNECTOR_in_statement69 = new BitSet(new long[]{0x0080011040127490L});
    public static final BitSet FOLLOW_command_in_statement71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CONNECTOR_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_spoke_in_command83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assignment_in_command87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_command91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_declaration_in_command95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_command99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_command103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_return_in_command107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_through_in_command111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_not_in_command115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_command119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_command123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_command127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_command131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_assignment141 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_array_piece_in_variable_assignment145 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_variable_assignment148 = new BitSet(new long[]{0x0080011000106080L});
    public static final BitSet FOLLOW_expression_in_variable_assignment151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENTENCE_in_variable_assignment155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_variable_assignment159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration167 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_WAS_A_in_variable_declaration169 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_variable_declaration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_declaration178 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_array_declaration180 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_array_declaration182 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_array_declaration184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedure192 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_expression_spoke209 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_expression_in_expression_spoke213 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SENTENCE_in_expression_spoke217 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_CHAR_in_expression_spoke221 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression_spoke224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENTUALLY_in_while_not232 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_boolean_expression_in_while_not234 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_while_not236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BECAUSE_in_while_not238 = new BitSet(new long[]{0x0080011040127C90L});
    public static final BitSet FOLLOW_statement_in_while_not240 = new BitSet(new long[]{0x0080011040127C90L});
    public static final BitSet FOLLOW_ENOUGH_TIMES_in_while_not243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conditional251 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_boolean_expression_in_conditional259 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SO_in_conditional261 = new BitSet(new long[]{0x008001104813F490L});
    public static final BitSet FOLLOW_statement_in_conditional263 = new BitSet(new long[]{0x008001104813F490L});
    public static final BitSet FOLLOW_OR_MAYBE_in_conditional267 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_boolean_expression_in_conditional269 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SO_in_conditional271 = new BitSet(new long[]{0x008001104813F490L});
    public static final BitSet FOLLOW_statement_in_conditional273 = new BitSet(new long[]{0x008001104813F490L});
    public static final BitSet FOLLOW_OR_in_conditional279 = new BitSet(new long[]{0x0080011048127490L});
    public static final BitSet FOLLOW_statement_in_conditional281 = new BitSet(new long[]{0x0080011048127490L});
    public static final BitSet FOLLOW_UNSURE_in_conditional286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHAT_WAS_in_input297 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_input300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_piece_in_input304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_output315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_expression_in_output319 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SENTENCE_in_output323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHAR_in_output327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SAID_ALICE_in_output330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_ROOM_in_function338 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_function340 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_function342 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_SPIDER_in_function344 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_function347 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_function349 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_CONNECTOR_in_function352 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_SPIDER_in_function354 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_function357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_function359 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_37_in_function363 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONTAINED_A_in_function365 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_function367 = new BitSet(new long[]{0x0080011040127492L});
    public static final BitSet FOLLOW_statement_in_function369 = new BitSet(new long[]{0x0080011040127492L});
    public static final BitSet FOLLOW_ALICE_FOUND_in_function_return377 = new BitSet(new long[]{0x0080011000006080L});
    public static final BitSet FOLLOW_expression_in_function_return380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_function_return384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call393 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_function_call395 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_function_call397 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_CONNECTOR_in_function_call400 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_function_call402 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_37_in_function_call406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_LOOKING_GLASS_in_looking_glass414 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_looking_glass416 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHANGED_A_in_looking_glass418 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TYPE_in_looking_glass420 = new BitSet(new long[]{0x0080011040127492L});
    public static final BitSet FOLLOW_statement_in_looking_glass422 = new BitSet(new long[]{0x0080011040127492L});
    public static final BitSet FOLLOW_ID_in_through431 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_WENT_THROUGH_in_through433 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_through435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_piece445 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_array_piece447 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_array_piece449 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_array_piece451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_expression459 = new BitSet(new long[]{0x0021000800000002L});
    public static final BitSet FOLLOW_set_in_expression462 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_mexpr_in_expression474 = new BitSet(new long[]{0x0021000800000002L});
    public static final BitSet FOLLOW_hexpr_in_mexpr485 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_mexpr488 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_hexpr_in_mexpr496 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_value_in_hexpr507 = new BitSet(new long[]{0x0000024200000002L});
    public static final BitSet FOLLOW_set_in_hexpr510 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_value_in_hexpr522 = new BitSet(new long[]{0x0000024200000002L});
    public static final BitSet FOLLOW_ID_in_value543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_value551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_piece_in_value555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_value559 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_value561 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_value563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_boolean_expression573 = new BitSet(new long[]{0x0040100500000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression576 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_comparison_in_boolean_expression592 = new BitSet(new long[]{0x0040100500000002L});
    public static final BitSet FOLLOW_expression_in_comparison602 = new BitSet(new long[]{0x00007C0100000000L});
    public static final BitSet FOLLOW_set_in_comparison604 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_comparison628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_comparison632 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_boolean_expression_in_comparison634 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_comparison636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENTENCE_in_comment645 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THOUGHT_ALICE_in_comment647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECTOR_in_synpred4_MAlice69 = new BitSet(new long[]{0x0080011040127490L});
    public static final BitSet FOLLOW_command_in_synpred4_MAlice71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_spoke_in_synpred5_MAlice83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assignment_in_synpred6_MAlice87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_synpred7_MAlice91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_declaration_in_synpred8_MAlice95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_synpred9_MAlice99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred10_MAlice103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_through_in_synpred12_MAlice111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_synpred16_MAlice127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_synpred20_MAlice209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred21_MAlice213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_synpred31_MAlice315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred32_MAlice319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred64_MAlice602 = new BitSet(new long[]{0x00007C0100000000L});
    public static final BitSet FOLLOW_set_in_synpred64_MAlice604 = new BitSet(new long[]{0x0080011000006000L});
    public static final BitSet FOLLOW_expression_in_synpred64_MAlice628 = new BitSet(new long[]{0x0000000000000002L});

}