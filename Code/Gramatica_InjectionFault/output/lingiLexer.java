// $ANTLR 3.4 /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g 2013-02-17 18:05:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingiLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ELSE=6;
    public static final int ESCREVER=7;
    public static final int ESC_SEQ=8;
    public static final int EXPONENT=9;
    public static final int FALSE=10;
    public static final int FLOAT=11;
    public static final int FOR=12;
    public static final int HEX_DIGIT=13;
    public static final int ID=14;
    public static final int IF=15;
    public static final int INT=16;
    public static final int LER=17;
    public static final int OCTAL_ESC=18;
    public static final int RETURN=19;
    public static final int STRING=20;
    public static final int TD_BOOL=21;
    public static final int TD_CHAR=22;
    public static final int TD_FLOAT=23;
    public static final int TD_INT=24;
    public static final int TD_STRING=25;
    public static final int TD_VOID=26;
    public static final int TRUE=27;
    public static final int UNICODE_ESC=28;
    public static final int WHILE=29;
    public static final int WS=30;

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
    public String getGrammarFileName() { return "/home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g"; }

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:2:7: ( '!' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:2:9: '!'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:3:7: ( '!=' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:3:9: '!='
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:4:7: ( '%' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:4:9: '%'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:5:7: ( '&&' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:5:9: '&&'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:6:7: ( '(' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:6:9: '('
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:7:7: ( ')' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:7:9: ')'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:8:7: ( '*' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:8:9: '*'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:9:7: ( '+' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:9:9: '+'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:10:7: ( ',' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:10:9: ','
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:11:7: ( '-' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:11:9: '-'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:12:7: ( '/' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:12:9: '/'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:13:7: ( ';' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:13:9: ';'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:14:7: ( '<' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:14:9: '<'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:15:7: ( '<=' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:15:9: '<='
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:7: ( '=' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:9: '='
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:17:7: ( '==' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:17:9: '=='
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:18:7: ( '>' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:18:9: '>'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:19:7: ( '>=' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:19:9: '>='
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:7: ( '{' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:9: '{'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:21:7: ( '||' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:21:9: '||'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:22:7: ( '}' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:22:9: '}'
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
    // $ANTLR end "T__51"

    // $ANTLR start "TD_INT"
    public final void mTD_INT() throws RecognitionException {
        try {
            int _type = TD_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:196:8: ( 'int' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:196:10: 'int'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:197:9: ( 'bool' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:197:11: 'bool'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:198:10: ( 'string' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:198:12: 'string'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:199:9: ( 'char' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:199:11: 'char'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:200:9: ( 'float' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:200:11: 'float'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:201:9: ( 'void' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:201:11: 'void'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:202:6: ( 'true' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:202:8: 'true'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:203:7: ( 'false' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:203:9: 'false'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:205:8: ( 'return' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:205:10: 'return'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:206:4: ( 'if' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:206:6: 'if'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:207:6: ( 'else' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:207:8: 'else'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:208:7: ( 'while' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:208:9: 'while'
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:209:5: ( 'for' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:209:7: 'for'
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

    // $ANTLR start "LER"
    public final void mLER() throws RecognitionException {
        try {
            int _type = LER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:210:5: ( 'ler' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:210:7: 'ler'
            {
            match("ler"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LER"

    // $ANTLR start "ESCREVER"
    public final void mESCREVER() throws RecognitionException {
        try {
            int _type = ESCREVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:211:9: ( 'escrever' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:211:11: 'escrever'
            {
            match("escrever"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCREVER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:213:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:213:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:213:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:216:5: ( ( '0' .. '9' )+ )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:216:7: ( '0' .. '9' )+
            {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:216:7: ( '0' .. '9' )+
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
            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:9: ( '0' .. '9' )+
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
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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


                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:220:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:221:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:221:13: ( '0' .. '9' )+
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
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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


                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:221:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:221:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:222:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:222:9: ( '0' .. '9' )+
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
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:226:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:226:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:226:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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


                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:226:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:226:28: '\\r'
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:227:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:227:14: ( options {greedy=false; } : . )*
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
                    	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:227:42: .
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:230:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:230:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:238:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:238:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:238:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:238:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:238:24: ~ ( '\\\\' | '\"' )
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:241:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:241:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:241:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:241:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:241:25: ~ ( '\\'' | '\\\\' )
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:246:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:246:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:246:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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


            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:246:33: ( '0' .. '9' )+
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
            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:249:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:253:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:253:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:254:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:255:9: OCTAL_ESC
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:260:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:260:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:261:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:262:9: '\\\\' ( '0' .. '7' )
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
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:267:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:267:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:8: ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | LER | ESCREVER | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=43;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:10: T__31
                {
                mT__31(); 


                }
                break;
            case 2 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:16: T__32
                {
                mT__32(); 


                }
                break;
            case 3 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:22: T__33
                {
                mT__33(); 


                }
                break;
            case 4 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:28: T__34
                {
                mT__34(); 


                }
                break;
            case 5 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:34: T__35
                {
                mT__35(); 


                }
                break;
            case 6 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:40: T__36
                {
                mT__36(); 


                }
                break;
            case 7 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:46: T__37
                {
                mT__37(); 


                }
                break;
            case 8 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:52: T__38
                {
                mT__38(); 


                }
                break;
            case 9 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:58: T__39
                {
                mT__39(); 


                }
                break;
            case 10 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:64: T__40
                {
                mT__40(); 


                }
                break;
            case 11 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:70: T__41
                {
                mT__41(); 


                }
                break;
            case 12 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:76: T__42
                {
                mT__42(); 


                }
                break;
            case 13 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:82: T__43
                {
                mT__43(); 


                }
                break;
            case 14 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:88: T__44
                {
                mT__44(); 


                }
                break;
            case 15 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:94: T__45
                {
                mT__45(); 


                }
                break;
            case 16 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:100: T__46
                {
                mT__46(); 


                }
                break;
            case 17 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:106: T__47
                {
                mT__47(); 


                }
                break;
            case 18 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:112: T__48
                {
                mT__48(); 


                }
                break;
            case 19 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:118: T__49
                {
                mT__49(); 


                }
                break;
            case 20 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:124: T__50
                {
                mT__50(); 


                }
                break;
            case 21 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:130: T__51
                {
                mT__51(); 


                }
                break;
            case 22 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:136: TD_INT
                {
                mTD_INT(); 


                }
                break;
            case 23 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:143: TD_BOOL
                {
                mTD_BOOL(); 


                }
                break;
            case 24 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:151: TD_STRING
                {
                mTD_STRING(); 


                }
                break;
            case 25 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:161: TD_CHAR
                {
                mTD_CHAR(); 


                }
                break;
            case 26 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:169: TD_FLOAT
                {
                mTD_FLOAT(); 


                }
                break;
            case 27 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:178: TD_VOID
                {
                mTD_VOID(); 


                }
                break;
            case 28 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:186: TRUE
                {
                mTRUE(); 


                }
                break;
            case 29 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:191: FALSE
                {
                mFALSE(); 


                }
                break;
            case 30 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:197: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:204: IF
                {
                mIF(); 


                }
                break;
            case 32 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:207: ELSE
                {
                mELSE(); 


                }
                break;
            case 33 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:212: WHILE
                {
                mWHILE(); 


                }
                break;
            case 34 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:218: FOR
                {
                mFOR(); 


                }
                break;
            case 35 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:222: LER
                {
                mLER(); 


                }
                break;
            case 36 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:226: ESCREVER
                {
                mESCREVER(); 


                }
                break;
            case 37 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:235: ID
                {
                mID(); 


                }
                break;
            case 38 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:238: INT
                {
                mINT(); 


                }
                break;
            case 39 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:242: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 40 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:248: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 41 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:256: WS
                {
                mWS(); 


                }
                break;
            case 42 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:259: STRING
                {
                mSTRING(); 


                }
                break;
            case 43 :
                // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:1:266: CHAR
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
            return "219:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\44\10\uffff\1\46\1\uffff\1\50\1\52\1\54\3\uffff\13\35"+
        "\1\uffff\1\74\16\uffff\1\35\1\76\15\35\1\uffff\1\114\1\uffff\5\35"+
        "\1\122\6\35\1\131\1\uffff\1\132\1\35\1\134\2\35\1\uffff\1\137\1"+
        "\140\1\35\1\142\2\35\2\uffff\1\35\1\uffff\1\146\1\147\2\uffff\1"+
        "\35\1\uffff\1\35\1\152\1\153\2\uffff\1\154\1\35\3\uffff\1\35\1\157"+
        "\1\uffff";
    static final String DFA20_eofS =
        "\160\uffff";
    static final String DFA20_minS =
        "\1\11\1\75\10\uffff\1\52\1\uffff\3\75\3\uffff\1\146\1\157\1\164"+
        "\1\150\1\141\1\157\1\162\1\145\1\154\1\150\1\145\1\uffff\1\56\16"+
        "\uffff\1\164\1\60\1\157\1\162\1\141\1\157\1\154\1\162\1\151\1\165"+
        "\1\164\1\163\1\143\1\151\1\162\1\uffff\1\60\1\uffff\1\154\1\151"+
        "\1\162\1\141\1\163\1\60\1\144\1\145\1\165\1\145\1\162\1\154\1\60"+
        "\1\uffff\1\60\1\156\1\60\1\164\1\145\1\uffff\2\60\1\162\1\60\2\145"+
        "\2\uffff\1\147\1\uffff\2\60\2\uffff\1\156\1\uffff\1\166\2\60\2\uffff"+
        "\1\60\1\145\3\uffff\1\162\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\75\10\uffff\1\57\1\uffff\3\75\3\uffff\1\156\1\157\1\164"+
        "\1\150\2\157\1\162\1\145\1\163\1\150\1\145\1\uffff\1\145\16\uffff"+
        "\1\164\1\172\1\157\1\162\1\141\1\157\1\154\1\162\1\151\1\165\1\164"+
        "\1\163\1\143\1\151\1\162\1\uffff\1\172\1\uffff\1\154\1\151\1\162"+
        "\1\141\1\163\1\172\1\144\1\145\1\165\1\145\1\162\1\154\1\172\1\uffff"+
        "\1\172\1\156\1\172\1\164\1\145\1\uffff\2\172\1\162\1\172\2\145\2"+
        "\uffff\1\147\1\uffff\2\172\2\uffff\1\156\1\uffff\1\166\2\172\2\uffff"+
        "\1\172\1\145\3\uffff\1\162\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\3\uffff"+
        "\1\23\1\24\1\25\13\uffff\1\45\1\uffff\1\47\1\51\1\52\1\53\1\2\1"+
        "\1\1\50\1\13\1\16\1\15\1\20\1\17\1\22\1\21\17\uffff\1\46\1\uffff"+
        "\1\37\15\uffff\1\26\5\uffff\1\42\6\uffff\1\43\1\27\1\uffff\1\31"+
        "\2\uffff\1\33\1\34\1\uffff\1\40\3\uffff\1\32\1\35\2\uffff\1\41\1"+
        "\30\1\36\2\uffff\1\44";
    static final String DFA20_specialS =
        "\160\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\1\1\41\2\uffff\1\2\1\3\1"+
            "\42\1\4\1\5\1\6\1\7\1\10\1\11\1\37\1\12\12\36\1\uffff\1\13\1"+
            "\14\1\15\1\16\2\uffff\32\35\4\uffff\1\35\1\uffff\1\35\1\23\1"+
            "\25\1\35\1\32\1\26\2\35\1\22\2\35\1\34\5\35\1\31\1\24\1\30\1"+
            "\35\1\27\1\33\3\35\1\17\1\20\1\21",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\4\uffff\1\45",
            "",
            "\1\47",
            "\1\51",
            "\1\53",
            "",
            "",
            "",
            "\1\56\7\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\63\12\uffff\1\62\2\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\6\uffff\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\37\1\uffff\12\36\13\uffff\1\37\37\uffff\1\37",
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
            "\1\75",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\133",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\135",
            "\1\136",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\141",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\150",
            "",
            "\1\151",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\155",
            "",
            "",
            "",
            "\1\156",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | LER | ESCREVER | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}