// $ANTLR 3.4 /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g 2011-12-12 16:39:04

	package malice;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MAliceParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_PIECE", "CHAR", "CONNECTOR", "END_OF_LINE", "ID", "INT", "PROCEDURE", "TYPE", "WS", "'%'", "'&'", "'*'", "'+'", "'-'", "'/'", "'^'", "'became'", "'had'", "'spoke'", "'was a'", "'|'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int ARRAY_PIECE=4;
    public static final int CHAR=5;
    public static final int CONNECTOR=6;
    public static final int END_OF_LINE=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int PROCEDURE=10;
    public static final int TYPE=11;
    public static final int WS=12;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog", "expression_spoke", "command", "statement", "array_declaration", 
    "factor", "term", "expression", "variable_assignment", "variable_declaration"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false
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


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:1: prog : ( statement )* ;
    public final MAliceParser.prog_return prog() throws RecognitionException {
        MAliceParser.prog_return retval = new MAliceParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MAliceParser.statement_return statement1 =null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:5: ( ( statement )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:9: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,9);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:9: ( statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ARRAY_PIECE && LA1_0 <= CHAR)||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==17||LA1_0==25) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:21:9: statement
            	    {
            	    dbg.location(21,9);
            	    pushFollow(FOLLOW_statement_in_prog51);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:23:1: statement : command ( CONNECTOR command )* END_OF_LINE ;
    public final MAliceParser.statement_return statement() throws RecognitionException {
        MAliceParser.statement_return retval = new MAliceParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONNECTOR3=null;
        Token END_OF_LINE5=null;
        MAliceParser.command_return command2 =null;

        MAliceParser.command_return command4 =null;


        CommonTree CONNECTOR3_tree=null;
        CommonTree END_OF_LINE5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:23:10: ( command ( CONNECTOR command )* END_OF_LINE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:23:13: command ( CONNECTOR command )* END_OF_LINE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(23,13);
            pushFollow(FOLLOW_command_in_statement60);
            command2=command();

            state._fsp--;

            adaptor.addChild(root_0, command2.getTree());
            dbg.location(23,21);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:23:21: ( CONNECTOR command )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONNECTOR) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:23:22: CONNECTOR command
            	    {
            	    dbg.location(23,22);
            	    CONNECTOR3=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_statement63); 
            	    CONNECTOR3_tree = 
            	    (CommonTree)adaptor.create(CONNECTOR3)
            	    ;
            	    adaptor.addChild(root_0, CONNECTOR3_tree);

            	    dbg.location(23,32);
            	    pushFollow(FOLLOW_command_in_statement65);
            	    command4=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(23,42);
            END_OF_LINE5=(Token)match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_statement69); 
            END_OF_LINE5_tree = 
            (CommonTree)adaptor.create(END_OF_LINE5)
            ;
            adaptor.addChild(root_0, END_OF_LINE5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 52);

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
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:1: command : ( variable_assignment | variable_declaration | ID PROCEDURE | expression_spoke );
    public final MAliceParser.command_return command() throws RecognitionException {
        MAliceParser.command_return retval = new MAliceParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID8=null;
        Token PROCEDURE9=null;
        MAliceParser.variable_assignment_return variable_assignment6 =null;

        MAliceParser.variable_declaration_return variable_declaration7 =null;

        MAliceParser.expression_spoke_return expression_spoke10 =null;


        CommonTree ID8_tree=null;
        CommonTree PROCEDURE9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:8: ( variable_assignment | variable_declaration | ID PROCEDURE | expression_spoke )
            int alt3=4;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case PROCEDURE:
                    {
                    alt3=3;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                case 19:
                case 22:
                case 24:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case ARRAY_PIECE:
                {
                alt3=1;
                }
                break;
            case CHAR:
            case INT:
            case 17:
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:11: variable_assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,11);
                    pushFollow(FOLLOW_variable_assignment_in_command77);
                    variable_assignment6=variable_assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_assignment6.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:33: variable_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,33);
                    pushFollow(FOLLOW_variable_declaration_in_command81);
                    variable_declaration7=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration7.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:56: ID PROCEDURE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,56);
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_command85); 
                    ID8_tree = 
                    (CommonTree)adaptor.create(ID8)
                    ;
                    adaptor.addChild(root_0, ID8_tree);

                    dbg.location(25,59);
                    PROCEDURE9=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_command87); 
                    PROCEDURE9_tree = 
                    (CommonTree)adaptor.create(PROCEDURE9)
                    ;
                    adaptor.addChild(root_0, PROCEDURE9_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:25:71: expression_spoke
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,71);
                    pushFollow(FOLLOW_expression_spoke_in_command91);
                    expression_spoke10=expression_spoke();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_spoke10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 86);

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
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:1: variable_assignment : ( ID | ARRAY_PIECE ) 'became' expression ;
    public final MAliceParser.variable_assignment_return variable_assignment() throws RecognitionException {
        MAliceParser.variable_assignment_return retval = new MAliceParser.variable_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set11=null;
        Token string_literal12=null;
        MAliceParser.expression_return expression13 =null;


        CommonTree set11_tree=null;
        CommonTree string_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:20: ( ( ID | ARRAY_PIECE ) 'became' expression )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:27:22: ( ID | ARRAY_PIECE ) 'became' expression
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,22);
            set11=(Token)input.LT(1);

            if ( input.LA(1)==ARRAY_PIECE||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set11)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(27,41);
            string_literal12=(Token)match(input,20,FOLLOW_20_in_variable_assignment106); 
            string_literal12_tree = 
            (CommonTree)adaptor.create(string_literal12)
            ;
            adaptor.addChild(root_0, string_literal12_tree);

            dbg.location(27,50);
            pushFollow(FOLLOW_expression_in_variable_assignment108);
            expression13=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression13.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 59);

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
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:1: variable_declaration : ID 'was a' TYPE ;
    public final MAliceParser.variable_declaration_return variable_declaration() throws RecognitionException {
        MAliceParser.variable_declaration_return retval = new MAliceParser.variable_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID14=null;
        Token string_literal15=null;
        Token TYPE16=null;

        CommonTree ID14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree TYPE16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:21: ( ID 'was a' TYPE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:29:23: ID 'was a' TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,23);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration115); 
            ID14_tree = 
            (CommonTree)adaptor.create(ID14)
            ;
            adaptor.addChild(root_0, ID14_tree);

            dbg.location(29,26);
            string_literal15=(Token)match(input,23,FOLLOW_23_in_variable_declaration117); 
            string_literal15_tree = 
            (CommonTree)adaptor.create(string_literal15)
            ;
            adaptor.addChild(root_0, string_literal15_tree);

            dbg.location(29,34);
            TYPE16=(Token)match(input,TYPE,FOLLOW_TYPE_in_variable_declaration119); 
            TYPE16_tree = 
            (CommonTree)adaptor.create(TYPE16)
            ;
            adaptor.addChild(root_0, TYPE16_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(29, 37);

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
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:1: array_declaration : ID 'had' INT TYPE ;
    public final MAliceParser.array_declaration_return array_declaration() throws RecognitionException {
        MAliceParser.array_declaration_return retval = new MAliceParser.array_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID17=null;
        Token string_literal18=null;
        Token INT19=null;
        Token TYPE20=null;

        CommonTree ID17_tree=null;
        CommonTree string_literal18_tree=null;
        CommonTree INT19_tree=null;
        CommonTree TYPE20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "array_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:18: ( ID 'had' INT TYPE )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:31:20: ID 'had' INT TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(31,20);
            ID17=(Token)match(input,ID,FOLLOW_ID_in_array_declaration126); 
            ID17_tree = 
            (CommonTree)adaptor.create(ID17)
            ;
            adaptor.addChild(root_0, ID17_tree);

            dbg.location(31,23);
            string_literal18=(Token)match(input,21,FOLLOW_21_in_array_declaration128); 
            string_literal18_tree = 
            (CommonTree)adaptor.create(string_literal18)
            ;
            adaptor.addChild(root_0, string_literal18_tree);

            dbg.location(31,29);
            INT19=(Token)match(input,INT,FOLLOW_INT_in_array_declaration130); 
            INT19_tree = 
            (CommonTree)adaptor.create(INT19)
            ;
            adaptor.addChild(root_0, INT19_tree);

            dbg.location(31,33);
            TYPE20=(Token)match(input,TYPE,FOLLOW_TYPE_in_array_declaration132); 
            TYPE20_tree = 
            (CommonTree)adaptor.create(TYPE20)
            ;
            adaptor.addChild(root_0, TYPE20_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "array_declaration"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:1: expression : ( term ( '+' term )* | CHAR );
    public final MAliceParser.expression_return expression() throws RecognitionException {
        MAliceParser.expression_return retval = new MAliceParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal22=null;
        Token CHAR24=null;
        MAliceParser.term_return term21 =null;

        MAliceParser.term_return term23 =null;


        CommonTree char_literal22_tree=null;
        CommonTree CHAR24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:11: ( term ( '+' term )* | CHAR )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= ID && LA5_0 <= INT)||LA5_0==17||LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==CHAR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:14: term ( '+' term )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(33,14);
                    pushFollow(FOLLOW_term_in_expression140);
                    term21=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term21.getTree());
                    dbg.location(33,19);
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:19: ( '+' term )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:20: '+' term
                    	    {
                    	    dbg.location(33,20);
                    	    char_literal22=(Token)match(input,16,FOLLOW_16_in_expression143); 
                    	    char_literal22_tree = 
                    	    (CommonTree)adaptor.create(char_literal22)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal22_tree);

                    	    dbg.location(33,24);
                    	    pushFollow(FOLLOW_term_in_expression145);
                    	    term23=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, term23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(4);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:33:33: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(33,33);
                    CHAR24=(Token)match(input,CHAR,FOLLOW_CHAR_in_expression151); 
                    CHAR24_tree = 
                    (CommonTree)adaptor.create(CHAR24)
                    ;
                    adaptor.addChild(root_0, CHAR24_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:1: term : factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )* ;
    public final MAliceParser.term_return term() throws RecognitionException {
        MAliceParser.term_return retval = new MAliceParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set26=null;
        MAliceParser.factor_return factor25 =null;

        MAliceParser.factor_return factor27 =null;


        CommonTree set26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:5: ( factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )* )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:9: factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(35,9);
            pushFollow(FOLLOW_factor_in_term160);
            factor25=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor25.getTree());
            dbg.location(35,16);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:16: ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 13 && LA6_0 <= 15)||(LA6_0 >= 18 && LA6_0 <= 19)||LA6_0==24) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:35:17: ( '*' | '/' | '%' | '^' | '&' | '|' ) factor
            	    {
            	    dbg.location(35,17);
            	    set26=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 13 && input.LA(1) <= 15)||(input.LA(1) >= 18 && input.LA(1) <= 19)||input.LA(1)==24 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set26)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(35,53);
            	    pushFollow(FOLLOW_factor_in_term187);
            	    factor27=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor27.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:1: factor : ( '~' | '-' )* ( ID | INT ) ;
    public final MAliceParser.factor_return factor() throws RecognitionException {
        MAliceParser.factor_return retval = new MAliceParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set28=null;
        Token set29=null;

        CommonTree set28_tree=null;
        CommonTree set29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:7: ( ( '~' | '-' )* ( ID | INT ) )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:11: ( '~' | '-' )* ( ID | INT )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(37,11);
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:37:11: ( '~' | '-' )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==25) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:
            	    {
            	    dbg.location(37,11);
            	    set28=(Token)input.LT(1);

            	    if ( input.LA(1)==17||input.LA(1)==25 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set28)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(37,22);
            set29=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set29)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"


    public static class expression_spoke_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_spoke"
    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:39:1: expression_spoke : expression 'spoke' ;
    public final MAliceParser.expression_spoke_return expression_spoke() throws RecognitionException {
        MAliceParser.expression_spoke_return retval = new MAliceParser.expression_spoke_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal31=null;
        MAliceParser.expression_return expression30 =null;


        CommonTree string_literal31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression_spoke");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:39:17: ( expression 'spoke' )
            dbg.enterAlt(1);

            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:39:25: expression 'spoke'
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(39,25);
            pushFollow(FOLLOW_expression_in_expression_spoke224);
            expression30=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression30.getTree());
            dbg.location(39,36);
            string_literal31=(Token)match(input,22,FOLLOW_22_in_expression_spoke226); 
            string_literal31_tree = 
            (CommonTree)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_spoke");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression_spoke"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog51 = new BitSet(new long[]{0x0000000002020332L});
    public static final BitSet FOLLOW_command_in_statement60 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_CONNECTOR_in_statement63 = new BitSet(new long[]{0x0000000002020330L});
    public static final BitSet FOLLOW_command_in_statement65 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_END_OF_LINE_in_statement69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assignment_in_command77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_command81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command85 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PROCEDURE_in_command87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_spoke_in_command91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable_assignment98 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_variable_assignment106 = new BitSet(new long[]{0x0000000002020320L});
    public static final BitSet FOLLOW_expression_in_variable_assignment108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_variable_declaration117 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_in_variable_declaration119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_declaration126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_array_declaration128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_array_declaration130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_in_array_declaration132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression140 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_expression143 = new BitSet(new long[]{0x0000000002020300L});
    public static final BitSet FOLLOW_term_in_expression145 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_CHAR_in_expression151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term160 = new BitSet(new long[]{0x00000000010CE002L});
    public static final BitSet FOLLOW_set_in_term163 = new BitSet(new long[]{0x0000000002020300L});
    public static final BitSet FOLLOW_factor_in_term187 = new BitSet(new long[]{0x00000000010CE002L});
    public static final BitSet FOLLOW_set_in_factor205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_spoke224 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_expression_spoke226 = new BitSet(new long[]{0x0000000000000002L});

}