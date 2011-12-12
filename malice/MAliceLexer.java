// $ANTLR 3.4 /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g 2011-12-12 16:41:44

	package malice;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MAliceLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MAliceLexer() {} 
    public MAliceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MAliceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:6:7: ( '%' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:6:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:7:7: ( '&' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:7:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:8:7: ( '*' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:8:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:9:7: ( '+' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:9:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:10:7: ( '-' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:10:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:11:7: ( '/' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:11:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:12:7: ( '^' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:12:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:13:7: ( 'became' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:13:9: 'became'
            {
            match("became"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:14:7: ( 'had' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:14:9: 'had'
            {
            match("had"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:15:7: ( 'spoke' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:15:9: 'spoke'
            {
            match("spoke"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:16:7: ( 'was a' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:16:9: 'was a'
            {
            match("was a"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:7: ( '|' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:17:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:18:7: ( '~' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:18:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:10: ( 'drank' | 'ate' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='d') ) {
                alt1=1;
            }
            else if ( (LA1_0=='a') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:13: 'drank'
                    {
                    match("drank"); 



                    }
                    break;
                case 2 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:41:23: 'ate'
                    {
                    match("ate"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:5: ( 'number' | 'letter' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='n') ) {
                alt2=1;
            }
            else if ( (LA2_0=='l') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:9: 'number'
                    {
                    match("number"); 



                    }
                    break;
                case 2 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:43:20: 'letter'
                    {
                    match("letter"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "CONNECTOR"
    public final void mCONNECTOR() throws RecognitionException {
        try {
            int _type = CONNECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:10: ( ' and' ( ' ' )? | ' but' ( ' ' )? | ' then' ( ' ' )? | ',' ( ' ' )? )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==' ') ) {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    alt7=1;
                    }
                    break;
                case 'b':
                    {
                    alt7=2;
                    }
                    break;
                case 't':
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA7_0==',') ) {
                alt7=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:13: ' and' ( ' ' )?
                    {
                    match(" and"); 



                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:19: ( ' ' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==' ') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:20: ' '
                            {
                            match(' '); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:28: ' but' ( ' ' )?
                    {
                    match(" but"); 



                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:34: ( ' ' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==' ') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:35: ' '
                            {
                            match(' '); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:43: ' then' ( ' ' )?
                    {
                    match(" then"); 



                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:50: ( ' ' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==' ') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:51: ' '
                            {
                            match(' '); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:59: ',' ( ' ' )?
                    {
                    match(','); 

                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:62: ( ' ' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==' ') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:45:63: ' '
                            {
                            match(' '); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONNECTOR"

    // $ANTLR start "END_OF_LINE"
    public final void mEND_OF_LINE() throws RecognitionException {
        try {
            int _type = END_OF_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:12: ( '.' | ' too.' | CONNECTOR )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt8=1;
                }
                break;
            case ' ':
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='t') ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4=='o') ) {
                        alt8=2;
                    }
                    else if ( (LA8_4=='h') ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;

                    }
                }
                else if ( ((LA8_2 >= 'a' && LA8_2 <= 'b')) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }
                }
                break;
            case ',':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:15: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 2 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:21: ' too.'
                    {
                    match(" too."); 



                    }
                    break;
                case 3 :
                    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:47:31: CONNECTOR
                    {
                    mCONNECTOR(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END_OF_LINE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:4: ( ( '0' .. '9' )+ )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:8: ( '0' .. '9' )+
            {
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:49:8: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:5: ( '\\'' ( 'a' .. 'z' ) '\\'' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:51:9: '\\'' ( 'a' .. 'z' ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:53:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ARRAY_PIECE"
    public final void mARRAY_PIECE() throws RecognitionException {
        try {
            int _type = ARRAY_PIECE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:55:12: ( ID '\\'s' INT 'piece' )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:55:15: ID '\\'s' INT 'piece'
            {
            mID(); 


            match("'s"); 



            mINT(); 


            match("piece"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY_PIECE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:59:7: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | PROCEDURE | TYPE | CONNECTOR | END_OF_LINE | INT | CHAR | ID | ARRAY_PIECE | WS )
        int alt11=22;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:88: PROCEDURE
                {
                mPROCEDURE(); 


                }
                break;
            case 15 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:98: TYPE
                {
                mTYPE(); 


                }
                break;
            case 16 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:103: CONNECTOR
                {
                mCONNECTOR(); 


                }
                break;
            case 17 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:113: END_OF_LINE
                {
                mEND_OF_LINE(); 


                }
                break;
            case 18 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:125: INT
                {
                mINT(); 


                }
                break;
            case 19 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:129: CHAR
                {
                mCHAR(); 


                }
                break;
            case 20 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:134: ID
                {
                mID(); 


                }
                break;
            case 21 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:137: ARRAY_PIECE
                {
                mARRAY_PIECE(); 


                }
                break;
            case 22 :
                // /Users/reshnesh/Documents/Prog/IC-Java/MAlice/MAlice.g:1:149: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\10\uffff\4\33\2\uffff\4\33\1\30\1\50\3\uffff\1\33\1\uffff\2\33"+
        "\2\uffff\7\33\5\uffff\1\33\1\65\3\33\1\71\2\33\3\uffff\1\33\1\uffff"+
        "\1\33\1\uffff\1\33\1\uffff\2\33\2\50\1\uffff\1\33\1\110\1\71\2\33"+
        "\2\uffff\1\50\1\114\1\uffff\2\115\3\uffff";
    static final String DFA11_eofS =
        "\116\uffff";
    static final String DFA11_minS =
        "\1\11\7\uffff\4\47\2\uffff\4\47\1\141\1\40\3\uffff\1\47\1\uffff"+
        "\2\47\2\uffff\7\47\1\156\1\165\1\150\2\uffff\3\47\1\40\4\47\1\144"+
        "\1\164\1\145\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff\2\47\2\40\1"+
        "\156\5\47\2\uffff\1\40\1\47\1\uffff\2\47\3\uffff";
    static final String DFA11_maxS =
        "\1\176\7\uffff\4\172\2\uffff\4\172\1\164\1\40\3\uffff\1\172\1\uffff"+
        "\2\172\2\uffff\7\172\1\156\1\165\1\157\2\uffff\10\172\1\144\1\164"+
        "\1\145\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2\40\1\156"+
        "\5\172\2\uffff\1\40\1\172\1\uffff\2\172\3\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff\1\14\1\15\6\uffff\1"+
        "\21\1\22\1\23\1\uffff\1\26\2\uffff\1\24\1\25\12\uffff\2\20\14\uffff"+
        "\1\11\1\uffff\1\13\1\uffff\1\16\12\uffff\2\20\2\uffff\1\12\2\uffff"+
        "\1\20\1\10\1\17";
    static final String DFA11_specialS =
        "\116\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\22\4\uffff\1\1\1\2\1\26\2\uffff"+
            "\1\3\1\4\1\23\1\5\1\24\1\6\12\25\7\uffff\32\27\3\uffff\1\7\2"+
            "\uffff\1\17\1\10\1\27\1\16\3\27\1\11\3\27\1\21\1\27\1\20\4\27"+
            "\1\12\3\27\1\13\3\27\1\uffff\1\14\1\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\31\25\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\1\35\31\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\17\32\1\36\12\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\1\37\31\32",
            "",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\40\10\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\41\6\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\24\32\1\42\5\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\43\25\32",
            "\1\44\1\45\21\uffff\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\2\32\1\51\27\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\3\32\1\52\26\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\53\13\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\54\7\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\1\55\31\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\56\25\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\14\32\1\57\15\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\60\6\32",
            "\1\61",
            "\1\62",
            "\1\63\6\uffff\1\24",
            "",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\1\64\31\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\12\32\1\66\17\32",
            "\1\67\6\uffff\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\70\14\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\1\32\1\72\30\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\73\6\32",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\14\32\1\77\15\32",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\100\25\32",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\12\32\1\101\17\32",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\102\25\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\103\25\32",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\107\25\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\111\10\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\112\10\32",
            "",
            "",
            "\1\113",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\31\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | PROCEDURE | TYPE | CONNECTOR | END_OF_LINE | INT | CHAR | ID | ARRAY_PIECE | WS );";
        }
    }
 

}