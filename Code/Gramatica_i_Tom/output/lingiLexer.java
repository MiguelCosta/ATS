// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g 2012-12-17 22:26:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingiLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
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
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ELSE=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FALSE=9;
    public static final int FLOAT=10;
    public static final int FOR=11;
    public static final int HEX_DIGIT=12;
    public static final int ID=13;
    public static final int IF=14;
    public static final int INT=15;
    public static final int OCTAL_ESC=16;
    public static final int RETURN=17;
    public static final int STRING=18;
    public static final int TD_BOOL=19;
    public static final int TD_CHAR=20;
    public static final int TD_FLOAT=21;
    public static final int TD_INT=22;
    public static final int TD_STRING=23;
    public static final int TD_VOID=24;
    public static final int TRUE=25;
    public static final int UNICODE_ESC=26;
    public static final int WHILE=27;
    public static final int WS=28;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public lingiLexer() {} 
    public lingiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public lingiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:2:7: ( '!' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:3:7: ( '!=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:3:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:7: ( '%' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:9: '%'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:5:7: ( '&&' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:5:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:6:7: ( '(' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:7: ( ')' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:8:7: ( '*' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:8:9: '*'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:9:7: ( '+' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:9:9: '+'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:10:7: ( ',' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:7: ( '-' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:9: '-'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:12:7: ( '/' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:12:9: '/'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:13:7: ( ';' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:14:7: ( '<' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:7: ( '<=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:16:7: ( '=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:17:7: ( '==' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:17:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:18:7: ( '>' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:7: ( '>=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:20:7: ( '{' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:21:7: ( '||' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:21:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:22:7: ( '}' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "TD_INT"
    public final void mTD_INT() throws RecognitionException {
        try {
            int _type = TD_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:172:8: ( 'int' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:172:10: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_INT"

    // $ANTLR start "TD_BOOL"
    public final void mTD_BOOL() throws RecognitionException {
        try {
            int _type = TD_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:173:9: ( 'bool' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:173:11: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_BOOL"

    // $ANTLR start "TD_STRING"
    public final void mTD_STRING() throws RecognitionException {
        try {
            int _type = TD_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:174:10: ( 'string' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:174:12: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_STRING"

    // $ANTLR start "TD_CHAR"
    public final void mTD_CHAR() throws RecognitionException {
        try {
            int _type = TD_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:175:9: ( 'char' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:175:11: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_CHAR"

    // $ANTLR start "TD_FLOAT"
    public final void mTD_FLOAT() throws RecognitionException {
        try {
            int _type = TD_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:176:9: ( 'float' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:176:11: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_FLOAT"

    // $ANTLR start "TD_VOID"
    public final void mTD_VOID() throws RecognitionException {
        try {
            int _type = TD_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:177:9: ( 'void' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:177:11: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_VOID"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:178:6: ( 'true' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:178:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:179:7: ( 'false' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:179:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:181:8: ( 'return' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:181:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:182:4: ( 'if' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:182:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:183:6: ( 'else' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:183:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:184:7: ( 'while' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:184:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:185:5: ( 'for' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:185:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:187:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:187:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:187:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop1;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:190:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:190:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:190:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
                    	    break loop4;
                        }
                    } while (true);


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:194:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:195:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:195:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:195:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:195:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:196:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:196:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    mEXPONENT(); 


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
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:200:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:200:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:200:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:200:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:200:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:201:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:201:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:201:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

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
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:204:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:204:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:212:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:212:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:212:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:212:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:212:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop14;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:215:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:215:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:215:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:215:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:215:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

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

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:220:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:220:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:220:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:220:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:223:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:227:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:227:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:228:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:229:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:234:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:234:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:235:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:236:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:241:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:241:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=41;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:10: T__29
                {
                mT__29(); 


                }
                break;
            case 2 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:16: T__30
                {
                mT__30(); 


                }
                break;
            case 3 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:22: T__31
                {
                mT__31(); 


                }
                break;
            case 4 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:28: T__32
                {
                mT__32(); 


                }
                break;
            case 5 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:34: T__33
                {
                mT__33(); 


                }
                break;
            case 6 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:40: T__34
                {
                mT__34(); 


                }
                break;
            case 7 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:46: T__35
                {
                mT__35(); 


                }
                break;
            case 8 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:52: T__36
                {
                mT__36(); 


                }
                break;
            case 9 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:58: T__37
                {
                mT__37(); 


                }
                break;
            case 10 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:64: T__38
                {
                mT__38(); 


                }
                break;
            case 11 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:70: T__39
                {
                mT__39(); 


                }
                break;
            case 12 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:76: T__40
                {
                mT__40(); 


                }
                break;
            case 13 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:82: T__41
                {
                mT__41(); 


                }
                break;
            case 14 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:88: T__42
                {
                mT__42(); 


                }
                break;
            case 15 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:94: T__43
                {
                mT__43(); 


                }
                break;
            case 16 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:100: T__44
                {
                mT__44(); 


                }
                break;
            case 17 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:106: T__45
                {
                mT__45(); 


                }
                break;
            case 18 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:112: T__46
                {
                mT__46(); 


                }
                break;
            case 19 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:118: T__47
                {
                mT__47(); 


                }
                break;
            case 20 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:124: T__48
                {
                mT__48(); 


                }
                break;
            case 21 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:130: T__49
                {
                mT__49(); 


                }
                break;
            case 22 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:136: TD_INT
                {
                mTD_INT(); 


                }
                break;
            case 23 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:143: TD_BOOL
                {
                mTD_BOOL(); 


                }
                break;
            case 24 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:151: TD_STRING
                {
                mTD_STRING(); 


                }
                break;
            case 25 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:161: TD_CHAR
                {
                mTD_CHAR(); 


                }
                break;
            case 26 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:169: TD_FLOAT
                {
                mTD_FLOAT(); 


                }
                break;
            case 27 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:178: TD_VOID
                {
                mTD_VOID(); 


                }
                break;
            case 28 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:186: TRUE
                {
                mTRUE(); 


                }
                break;
            case 29 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:191: FALSE
                {
                mFALSE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:197: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:204: IF
                {
                mIF(); 


                }
                break;
            case 32 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:207: ELSE
                {
                mELSE(); 


                }
                break;
            case 33 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:212: WHILE
                {
                mWHILE(); 


                }
                break;
            case 34 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:218: FOR
                {
                mFOR(); 


                }
                break;
            case 35 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:222: ID
                {
                mID(); 


                }
                break;
            case 36 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:225: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:229: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 38 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:235: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 39 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:243: WS
                {
                mWS(); 


                }
                break;
            case 40 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:246: STRING
                {
                mSTRING(); 


                }
                break;
            case 41 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - An�lise e Concep��o de Software\\ATS - An�lise e Transforma��o de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:1:253: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "193:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\43\10\uffff\1\45\1\uffff\1\47\1\51\1\53\3\uffff\12\34"+
        "\1\uffff\1\71\16\uffff\1\34\1\73\13\34\1\uffff\1\107\1\uffff\5\34"+
        "\1\115\5\34\1\uffff\1\123\1\34\1\125\2\34\1\uffff\1\130\1\131\1"+
        "\34\1\133\1\34\1\uffff\1\34\1\uffff\1\136\1\137\2\uffff\1\34\1\uffff"+
        "\1\141\1\142\2\uffff\1\143\3\uffff";
    static final String DFA20_eofS =
        "\144\uffff";
    static final String DFA20_minS =
        "\1\11\1\75\10\uffff\1\52\1\uffff\3\75\3\uffff\1\146\1\157\1\164"+
        "\1\150\1\141\1\157\1\162\1\145\1\154\1\150\1\uffff\1\56\16\uffff"+
        "\1\164\1\60\1\157\1\162\1\141\1\157\1\154\1\162\1\151\1\165\1\164"+
        "\1\163\1\151\1\uffff\1\60\1\uffff\1\154\1\151\1\162\1\141\1\163"+
        "\1\60\1\144\1\145\1\165\1\145\1\154\1\uffff\1\60\1\156\1\60\1\164"+
        "\1\145\1\uffff\2\60\1\162\1\60\1\145\1\uffff\1\147\1\uffff\2\60"+
        "\2\uffff\1\156\1\uffff\2\60\2\uffff\1\60\3\uffff";
    static final String DFA20_maxS =
        "\1\175\1\75\10\uffff\1\57\1\uffff\3\75\3\uffff\1\156\1\157\1\164"+
        "\1\150\2\157\1\162\1\145\1\154\1\150\1\uffff\1\145\16\uffff\1\164"+
        "\1\172\1\157\1\162\1\141\1\157\1\154\1\162\1\151\1\165\1\164\1\163"+
        "\1\151\1\uffff\1\172\1\uffff\1\154\1\151\1\162\1\141\1\163\1\172"+
        "\1\144\1\145\1\165\1\145\1\154\1\uffff\1\172\1\156\1\172\1\164\1"+
        "\145\1\uffff\2\172\1\162\1\172\1\145\1\uffff\1\147\1\uffff\2\172"+
        "\2\uffff\1\156\1\uffff\2\172\2\uffff\1\172\3\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\3\uffff"+
        "\1\23\1\24\1\25\12\uffff\1\43\1\uffff\1\45\1\47\1\50\1\51\1\2\1"+
        "\1\1\46\1\13\1\16\1\15\1\20\1\17\1\22\1\21\15\uffff\1\44\1\uffff"+
        "\1\37\13\uffff\1\26\5\uffff\1\42\5\uffff\1\27\1\uffff\1\31\2\uffff"+
        "\1\33\1\34\1\uffff\1\40\2\uffff\1\32\1\35\1\uffff\1\41\1\30\1\36";
    static final String DFA20_specialS =
        "\144\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\1\1\40\2\uffff\1\2\1\3\1"+
            "\41\1\4\1\5\1\6\1\7\1\10\1\11\1\36\1\12\12\35\1\uffff\1\13\1"+
            "\14\1\15\1\16\2\uffff\32\34\4\uffff\1\34\1\uffff\1\34\1\23\1"+
            "\25\1\34\1\32\1\26\2\34\1\22\10\34\1\31\1\24\1\30\1\34\1\27"+
            "\1\33\3\34\1\17\1\20\1\21",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\4\uffff\1\44",
            "",
            "\1\46",
            "\1\50",
            "\1\52",
            "",
            "",
            "",
            "\1\55\7\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\12\uffff\1\61\2\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\36\1\uffff\12\35\13\uffff\1\36\37\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\124",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\126",
            "\1\127",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\132",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\134",
            "",
            "\1\135",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\140",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}