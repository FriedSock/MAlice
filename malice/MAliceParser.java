// $ANTLR 3.4 /home/jack/Desktop/MAlice.g 2011-11-21 18:35:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CONNECTOR", "END_OF_LINE", "ID", "INT", "PROCEDURE", "TYPE", "WS", "'%'", "'&'", "'*'", "'+'", "'-'", "'/'", "'^'", "'became'", "'spoke'", "'was a'", "'|'", "'~'"
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
    public static final int T__22=22;
    public static final int T__23=23;
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
    "invalidRule", "command", "expression", "statement", "expression_spoke", 
    "factor", "term", "prog", "variable_declaration", "variable_assignment"
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
    // /home/jack/Desktop/MAlice.g:21:1: prog : ( statement )* ;
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
            // /home/jack/Desktop/MAlice.g:21:5: ( ( statement )* )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:21:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,8);
            // /home/jack/Desktop/MAlice.g:21:8: ( statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHAR||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==16||LA1_0==23) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jack/Desktop/MAlice.g:21:8: statement
            	    {
            	    dbg.location(21,8);
            	    pushFollow(FOLLOW_statement_in_prog50);
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
        dbg.location(21, 17);

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
            pushFollow(FOLLOW_command_in_statement59);
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
            	    CONNECTOR3=(Token)match(input,CONNECTOR,FOLLOW_CONNECTOR_in_statement62); 
            	    CONNECTOR3_tree = 
            	    (CommonTree)adaptor.create(CONNECTOR3)
            	    ;
            	    adaptor.addChild(root_0, CONNECTOR3_tree);

            	    dbg.location(23,32);
            	    pushFollow(FOLLOW_command_in_statement64);
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
            END_OF_LINE5=(Token)match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_statement68); 
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
    // /home/jack/Desktop/MAlice.g:25:1: command : ( variable_assignment | variable_declaration | ID PROCEDURE | expression_spoke );
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
            // /home/jack/Desktop/MAlice.g:25:8: ( variable_assignment | variable_declaration | ID PROCEDURE | expression_spoke )
            int alt3=4;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 21:
                    {
                    alt3=2;
                    }
                    break;
                case PROCEDURE:
                    {
                    alt3=3;
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 18:
                case 20:
                case 22:
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
            else if ( (LA3_0==CHAR||LA3_0==INT||LA3_0==16||LA3_0==23) ) {
                alt3=4;
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
                    pushFollow(FOLLOW_variable_assignment_in_command76);
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
                    pushFollow(FOLLOW_variable_declaration_in_command80);
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
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_command84); 
                    ID8_tree = 
                    (CommonTree)adaptor.create(ID8)
                    ;
                    adaptor.addChild(root_0, ID8_tree);

                    dbg.location(25,59);
                    PROCEDURE9=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_command86); 
                    PROCEDURE9_tree = 
                    (CommonTree)adaptor.create(PROCEDURE9)
                    ;
                    adaptor.addChild(root_0, PROCEDURE9_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/jack/Desktop/MAlice.g:25:71: expression_spoke
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,71);
                    pushFollow(FOLLOW_expression_spoke_in_command90);
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
    // /home/jack/Desktop/MAlice.g:27:1: variable_assignment : ID 'became' expression ;
    public final MAliceParser.variable_assignment_return variable_assignment() throws RecognitionException {
        MAliceParser.variable_assignment_return retval = new MAliceParser.variable_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID11=null;
        Token string_literal12=null;
        MAliceParser.expression_return expression13 =null;


        CommonTree ID11_tree=null;
        CommonTree string_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variable_assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /home/jack/Desktop/MAlice.g:27:20: ( ID 'became' expression )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:27:22: ID 'became' expression
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,22);
            ID11=(Token)match(input,ID,FOLLOW_ID_in_variable_assignment97); 
            ID11_tree = 
            (CommonTree)adaptor.create(ID11)
            ;
            adaptor.addChild(root_0, ID11_tree);

            dbg.location(27,25);
            string_literal12=(Token)match(input,19,FOLLOW_19_in_variable_assignment99); 
            string_literal12_tree = 
            (CommonTree)adaptor.create(string_literal12)
            ;
            adaptor.addChild(root_0, string_literal12_tree);

            dbg.location(27,34);
            pushFollow(FOLLOW_expression_in_variable_assignment101);
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
        dbg.location(27, 43);

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
            // /home/jack/Desktop/MAlice.g:29:21: ( ID 'was a' TYPE )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:29:23: ID 'was a' TYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,23);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration108); 
            ID14_tree = 
            (CommonTree)adaptor.create(ID14)
            ;
            adaptor.addChild(root_0, ID14_tree);

            dbg.location(29,26);
            string_literal15=(Token)match(input,21,FOLLOW_21_in_variable_declaration110); 
            string_literal15_tree = 
            (CommonTree)adaptor.create(string_literal15)
            ;
            adaptor.addChild(root_0, string_literal15_tree);

            dbg.location(29,34);
            TYPE16=(Token)match(input,TYPE,FOLLOW_TYPE_in_variable_declaration112); 
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

        Token char_literal18=null;
        Token CHAR20=null;
        MAliceParser.term_return term17 =null;

        MAliceParser.term_return term19 =null;


        CommonTree char_literal18_tree=null;
        CommonTree CHAR20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /home/jack/Desktop/MAlice.g:31:11: ( term ( '+' term )* | CHAR )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= ID && LA5_0 <= INT)||LA5_0==16||LA5_0==23) ) {
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
                    pushFollow(FOLLOW_term_in_expression120);
                    term17=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term17.getTree());
                    dbg.location(31,19);
                    // /home/jack/Desktop/MAlice.g:31:19: ( '+' term )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/jack/Desktop/MAlice.g:31:20: '+' term
                    	    {
                    	    dbg.location(31,20);
                    	    char_literal18=(Token)match(input,15,FOLLOW_15_in_expression123); 
                    	    char_literal18_tree = 
                    	    (CommonTree)adaptor.create(char_literal18)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal18_tree);

                    	    dbg.location(31,24);
                    	    pushFollow(FOLLOW_term_in_expression125);
                    	    term19=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, term19.getTree());

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
                    CHAR20=(Token)match(input,CHAR,FOLLOW_CHAR_in_expression131); 
                    CHAR20_tree = 
                    (CommonTree)adaptor.create(CHAR20)
                    ;
                    adaptor.addChild(root_0, CHAR20_tree);


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

        Token set22=null;
        MAliceParser.factor_return factor21 =null;

        MAliceParser.factor_return factor23 =null;


        CommonTree set22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // /home/jack/Desktop/MAlice.g:33:5: ( factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )* )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:33:8: factor ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(33,8);
            pushFollow(FOLLOW_factor_in_term139);
            factor21=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor21.getTree());
            dbg.location(33,15);
            // /home/jack/Desktop/MAlice.g:33:15: ( ( '*' | '/' | '%' | '^' | '&' | '|' ) factor )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 12 && LA6_0 <= 14)||(LA6_0 >= 17 && LA6_0 <= 18)||LA6_0==22) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jack/Desktop/MAlice.g:33:16: ( '*' | '/' | '%' | '^' | '&' | '|' ) factor
            	    {
            	    dbg.location(33,16);
            	    set22=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 12 && input.LA(1) <= 14)||(input.LA(1) >= 17 && input.LA(1) <= 18)||input.LA(1)==22 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set22)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(33,52);
            	    pushFollow(FOLLOW_factor_in_term166);
            	    factor23=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor23.getTree());

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
        dbg.location(33, 59);

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
    // /home/jack/Desktop/MAlice.g:35:1: factor : ( '~' | '-' )* ( ID | ( INT )+ ) ;
    public final MAliceParser.factor_return factor() throws RecognitionException {
        MAliceParser.factor_return retval = new MAliceParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set24=null;
        Token ID25=null;
        Token INT26=null;

        CommonTree set24_tree=null;
        CommonTree ID25_tree=null;
        CommonTree INT26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /home/jack/Desktop/MAlice.g:35:7: ( ( '~' | '-' )* ( ID | ( INT )+ ) )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:35:10: ( '~' | '-' )* ( ID | ( INT )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(35,10);
            // /home/jack/Desktop/MAlice.g:35:10: ( '~' | '-' )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==23) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/jack/Desktop/MAlice.g:
            	    {
            	    dbg.location(35,10);
            	    set24=(Token)input.LT(1);

            	    if ( input.LA(1)==16||input.LA(1)==23 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set24)
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

            dbg.location(35,21);
            // /home/jack/Desktop/MAlice.g:35:21: ( ID | ( INT )+ )
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

                    // /home/jack/Desktop/MAlice.g:35:22: ID
                    {
                    dbg.location(35,22);
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_factor184); 
                    ID25_tree = 
                    (CommonTree)adaptor.create(ID25)
                    ;
                    adaptor.addChild(root_0, ID25_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/jack/Desktop/MAlice.g:35:27: ( INT )+
                    {
                    dbg.location(35,27);
                    // /home/jack/Desktop/MAlice.g:35:27: ( INT )+
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

                    	    // /home/jack/Desktop/MAlice.g:35:28: INT
                    	    {
                    	    dbg.location(35,28);
                    	    INT26=(Token)match(input,INT,FOLLOW_INT_in_factor189); 
                    	    INT26_tree = 
                    	    (CommonTree)adaptor.create(INT26)
                    	    ;
                    	    adaptor.addChild(root_0, INT26_tree);


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
        dbg.location(35, 33);

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
    // /home/jack/Desktop/MAlice.g:37:1: expression_spoke : expression 'spoke' ;
    public final MAliceParser.expression_spoke_return expression_spoke() throws RecognitionException {
        MAliceParser.expression_spoke_return retval = new MAliceParser.expression_spoke_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal28=null;
        MAliceParser.expression_return expression27 =null;


        CommonTree string_literal28_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression_spoke");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // /home/jack/Desktop/MAlice.g:37:17: ( expression 'spoke' )
            dbg.enterAlt(1);

            // /home/jack/Desktop/MAlice.g:37:30: expression 'spoke'
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(37,30);
            pushFollow(FOLLOW_expression_in_expression_spoke210);
            expression27=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression27.getTree());
            dbg.location(37,41);
            string_literal28=(Token)match(input,20,FOLLOW_20_in_expression_spoke212); 
            string_literal28_tree = 
            (CommonTree)adaptor.create(string_literal28)
            ;
            adaptor.addChild(root_0, string_literal28_tree);


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
        dbg.location(37, 47);

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


 

    public static final BitSet FOLLOW_statement_in_prog50 = new BitSet(new long[]{0x0000000000810192L});
    public static final BitSet FOLLOW_command_in_statement59 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_CONNECTOR_in_statement62 = new BitSet(new long[]{0x0000000000810190L});
    public static final BitSet FOLLOW_command_in_statement64 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_END_OF_LINE_in_statement68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assignment_in_command76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_command80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command84 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PROCEDURE_in_command86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_spoke_in_command90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_assignment97 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_variable_assignment99 = new BitSet(new long[]{0x0000000000810190L});
    public static final BitSet FOLLOW_expression_in_variable_assignment101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_variable_declaration110 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TYPE_in_variable_declaration112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression120 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_expression123 = new BitSet(new long[]{0x0000000000810180L});
    public static final BitSet FOLLOW_term_in_expression125 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_CHAR_in_expression131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term139 = new BitSet(new long[]{0x0000000000467002L});
    public static final BitSet FOLLOW_set_in_term142 = new BitSet(new long[]{0x0000000000810180L});
    public static final BitSet FOLLOW_factor_in_term166 = new BitSet(new long[]{0x0000000000467002L});
    public static final BitSet FOLLOW_ID_in_factor184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor189 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_expression_in_expression_spoke210 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expression_spoke212 = new BitSet(new long[]{0x0000000000000002L});

}