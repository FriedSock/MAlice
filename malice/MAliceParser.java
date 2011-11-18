// $ANTLR 3.4 /home/jack/Desktop/MAlice.g 2011-11-18 14:17:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CONNECTOR", "END_OF_LINE", "ID", "INT", "PROCEDURE", "TYPE", "WS", "' became '", "'%'", "'&'", "'*'", "'+'", "'/'", "'^'", "'was a'", "'|'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int CHAR=4;
    public static final int CONNECTOR=5;
    public static final int END_OF_LINE=6;
    public static final int ID=7;
    public static final int INT=8;
    public static final int PROCEDURE=9;
    public static final int TYPE=10;
    public static final int WS=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "factor", "statement", "variable_declaration", "command", 
    "term", "expression", "variable_assignment", "prog"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false
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
    public String getGrammarFileName() { return "/home/jack/Desktop/MAlice.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jack/Desktop/MAlice.g:21:1: prog : ( statement )+ ;
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
            // /home/jack/Desktop/MAlice.g:21:5: ( ( statement )+ )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:21:9: ( statement )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,9);
            // /home/jack/Desktop/MAlice.g:21:9: ( statement )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jack/Desktop/MAlice.g:21:9: statement
            	    {
            	    dbg.location(21,9);
            	    pushFollow(FOLLOW_statement_in_prog51);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
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
    // /home/jack/Desktop/MAlice.g:23:1: statement : command ( CONNECTOR command )* END_OF_LINE ;
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
            // /home/jack/Desktop/MAlice.g:23:10: ( command ( CONNECTOR command )* END_OF_LINE )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:23:13: command ( CONNECTOR command )* END_OF_LINE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(23,13);
            pushFollow(FOLLOW_command_in_statement60);
            command2=command();

            state._fsp--;

            adaptor.addChild(root_0, command2.getTree());
            dbg.location(23,21);
            // /home/jack/Desktop/MAlice.g:23:21: ( CONNECTOR command )*
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

            	    // /home/jack/Desktop/MAlice.g:23:22: CONNECTOR command
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
    // /home/jack/Desktop/MAlice.g:25:1: command : ( variable_assignment | variable_declaration | ID PROCEDURE );
    public final MAliceParser.command_return command() throws RecognitionException {
        MAliceParser.command_return retval = new MAliceParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID8=null;
        Token PROCEDURE9=null;
        MAliceParser.variable_assignment_return variable_assignment6 =null;

        MAliceParser.variable_declaration_return variable_declaration7 =null;


        CommonTree ID8_tree=null;
        CommonTree PROCEDURE9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /home/jack/Desktop/MAlice.g:25:8: ( variable_assignment | variable_declaration | ID PROCEDURE )
            int alt3=3;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case PROCEDURE:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/jack/Desktop/MAlice.g:25:11: variable_assignment
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

                    // /home/jack/Desktop/MAlice.g:25:33: variable_declaration
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

                    // /home/jack/Desktop/MAlice.g:25:56: ID PROCEDURE
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
        dbg.location(25, 67);

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
    // /home/jack/Desktop/MAlice.g:27:1: variable_assignment : ID ' became ' expression ;
    public final MAliceParser.variable_assignment_return variable_assignment() throws RecognitionException {
        MAliceParser.variable_assignment_return retval = new MAliceParser.variable_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;
        Token string_literal11=null;
        MAliceParser.expression_return expression12 =null;


        CommonTree ID10_tree=null;
        CommonTree string_literal11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /home/jack/Desktop/MAlice.g:27:20: ( ID ' became ' expression )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:27:22: ID ' became ' expression
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,22);
            ID10=(Token)match(input,ID,FOLLOW_ID_in_variable_assignment94); 
            ID10_tree = 
            (CommonTree)adaptor.create(ID10)
            ;
            adaptor.addChild(root_0, ID10_tree);

            dbg.location(27,25);
            string_literal11=(Token)match(input,12,FOLLOW_12_in_variable_assignment96); 
            string_literal11_tree = 
            (CommonTree)adaptor.create(string_literal11)
            ;
            adaptor.addChild(root_0, string_literal11_tree);

            dbg.location(27,36);
            pushFollow(FOLLOW_expression_in_variable_assignment98);
            expression12=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression12.getTree());

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
        dbg.location(27, 45);

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
    // /home/jack/Desktop/MAlice.g:29:1: variable_declaration : ID 'was a' TYPE ;
    public final MAliceParser.variable_declaration_return variable_declaration() throws RecognitionException {
        MAliceParser.variable_declaration_return retval = new MAliceParser.variable_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID13=null;
        Token string_literal14=null;
        Token TYPE15=null;

        CommonTree ID13_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree TYPE15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /home/jack/Desktop/MAlice.g:29:21: ( ID 'was a' TYPE )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:29:23: ID 'was a' TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,23);
            ID13=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration105); 
            ID13_tree = 
            (CommonTree)adaptor.create(ID13)
            ;
            adaptor.addChild(root_0, ID13_tree);

            dbg.location(29,26);
            string_literal14=(Token)match(input,19,FOLLOW_19_in_variable_declaration107); 
            string_literal14_tree = 
            (CommonTree)adaptor.create(string_literal14)
            ;
            adaptor.addChild(root_0, string_literal14_tree);

            dbg.location(29,34);
            TYPE15=(Token)match(input,TYPE,FOLLOW_TYPE_in_variable_declaration109); 
            TYPE15_tree = 
            (CommonTree)adaptor.create(TYPE15)
            ;
            adaptor.addChild(root_0, TYPE15_tree);


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


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/jack/Desktop/MAlice.g:31:1: expression : ( term ( '+' term )* | CHAR );
    public final MAliceParser.expression_return expression() throws RecognitionException {
        MAliceParser.expression_return retval = new MAliceParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal17=null;
        Token CHAR19=null;
        MAliceParser.term_return term16 =null;

        MAliceParser.term_return term18 =null;


        CommonTree char_literal17_tree=null;
        CommonTree CHAR19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /home/jack/Desktop/MAlice.g:31:11: ( term ( '+' term )* | CHAR )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= ID && LA5_0 <= INT)||LA5_0==21) ) {
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

                    // /home/jack/Desktop/MAlice.g:31:14: term ( '+' term )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(31,14);
                    pushFollow(FOLLOW_term_in_expression117);
                    term16=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term16.getTree());
                    dbg.location(31,19);
                    // /home/jack/Desktop/MAlice.g:31:19: ( '+' term )*
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

                    	    // /home/jack/Desktop/MAlice.g:31:20: '+' term
                    	    {
                    	    dbg.location(31,20);
                    	    char_literal17=(Token)match(input,16,FOLLOW_16_in_expression120); 
                    	    char_literal17_tree = 
                    	    (CommonTree)adaptor.create(char_literal17)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal17_tree);

                    	    dbg.location(31,24);
                    	    pushFollow(FOLLOW_term_in_expression122);
                    	    term18=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, term18.getTree());

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

                    // /home/jack/Desktop/MAlice.g:31:33: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(31,33);
                    CHAR19=(Token)match(input,CHAR,FOLLOW_CHAR_in_expression128); 
                    CHAR19_tree = 
                    (CommonTree)adaptor.create(CHAR19)
                    ;
                    adaptor.addChild(root_0, CHAR19_tree);


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
        dbg.location(31, 36);

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
    // /home/jack/Desktop/MAlice.g:33:1: term : factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )* ;
    public final MAliceParser.term_return term() throws RecognitionException {
        MAliceParser.term_return retval = new MAliceParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set21=null;
        MAliceParser.factor_return factor20 =null;

        MAliceParser.factor_return factor22 =null;


        CommonTree set21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // /home/jack/Desktop/MAlice.g:33:5: ( factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )* )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:33:9: factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,9);
            pushFollow(FOLLOW_factor_in_term137);
            factor20=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor20.getTree());
            dbg.location(33,16);
            // /home/jack/Desktop/MAlice.g:33:16: ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 13 && LA6_0 <= 15)||(LA6_0 >= 17 && LA6_0 <= 18)||LA6_0==20) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jack/Desktop/MAlice.g:33:17: ( '*' | '/' | '%' | '^' | '&' | '|' ) factor
            	    {
            	    dbg.location(33,17);
            	    set21=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 13 && input.LA(1) <= 15)||(input.LA(1) >= 17 && input.LA(1) <= 18)||input.LA(1)==20 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set21)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(33,53);
            	    pushFollow(FOLLOW_factor_in_term164);
            	    factor22=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor22.getTree());

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
        dbg.location(33, 60);

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
    // /home/jack/Desktop/MAlice.g:35:1: factor : ( '~' )? ( ID | ( INT )+ ) ;
    public final MAliceParser.factor_return factor() throws RecognitionException {
        MAliceParser.factor_return retval = new MAliceParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal23=null;
        Token ID24=null;
        Token INT25=null;

        CommonTree char_literal23_tree=null;
        CommonTree ID24_tree=null;
        CommonTree INT25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /home/jack/Desktop/MAlice.g:35:7: ( ( '~' )? ( ID | ( INT )+ ) )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:35:11: ( '~' )? ( ID | ( INT )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(35,11);
            // /home/jack/Desktop/MAlice.g:35:11: ( '~' )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/jack/Desktop/MAlice.g:35:12: '~'
                    {
                    dbg.location(35,12);
                    char_literal23=(Token)match(input,21,FOLLOW_21_in_factor176); 
                    char_literal23_tree = 
                    (CommonTree)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(35,17);
            // /home/jack/Desktop/MAlice.g:35:17: ( ID | ( INT )+ )
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/jack/Desktop/MAlice.g:35:18: ID
                    {
                    dbg.location(35,18);
                    ID24=(Token)match(input,ID,FOLLOW_ID_in_factor180); 
                    ID24_tree = 
                    (CommonTree)adaptor.create(ID24)
                    ;
                    adaptor.addChild(root_0, ID24_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/jack/Desktop/MAlice.g:35:23: ( INT )+
                    {
                    dbg.location(35,23);
                    // /home/jack/Desktop/MAlice.g:35:23: ( INT )+
                    int cnt8=0;
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==INT) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/jack/Desktop/MAlice.g:35:24: INT
                    	    {
                    	    dbg.location(35,24);
                    	    INT25=(Token)match(input,INT,FOLLOW_INT_in_factor185); 
                    	    INT25_tree = 
                    	    (CommonTree)adaptor.create(INT25)
                    	    ;
                    	    adaptor.addChild(root_0, INT25_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt8++;
                    } while (true);
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


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
        dbg.location(35, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog51 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_command_in_statement60 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_CONNECTOR_in_statement63 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_command_in_statement65 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_END_OF_LINE_in_statement69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assignment_in_command77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_command81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command85 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PROCEDURE_in_command87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_assignment94 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_variable_assignment96 = new BitSet(new long[]{0x0000000000200190L});
    public static final BitSet FOLLOW_expression_in_variable_assignment98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_variable_declaration107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TYPE_in_variable_declaration109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression117 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_expression120 = new BitSet(new long[]{0x0000000000200180L});
    public static final BitSet FOLLOW_term_in_expression122 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_CHAR_in_expression128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term137 = new BitSet(new long[]{0x000000000016E002L});
    public static final BitSet FOLLOW_set_in_term140 = new BitSet(new long[]{0x0000000000200180L});
    public static final BitSet FOLLOW_factor_in_term164 = new BitSet(new long[]{0x000000000016E002L});
    public static final BitSet FOLLOW_21_in_factor176 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ID_in_factor180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor185 = new BitSet(new long[]{0x0000000000000102L});

}