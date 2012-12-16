// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g 2012-12-16 10:43:10
 package parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GramLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int SLCOMMENT=4;
    public static final int WS=5;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GramLexer() {} 
    public GramLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GramLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:4:6: ( 'a' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:4:8: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:5:6: ( 'b' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:5:8: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:10:4: ( ( ' ' | '\\t' | '\\n' )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:10:6: ( ' ' | '\\t' | '\\n' )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:10:6: ( ' ' | '\\t' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)==' ' ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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

    // $ANTLR start "SLCOMMENT"
    public final void mSLCOMMENT() throws RecognitionException {
        try {
            int _type = SLCOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:18: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:
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
            	    break loop2;
                }
            } while (true);


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:34: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\r') ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:35: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:40: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:44: ( '\\n' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\n') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:11:45: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "SLCOMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:1:8: ( T__6 | T__7 | WS | SLCOMMENT )
        int alt5=4;
        switch ( input.LA(1) ) {
        case 'a':
            {
            alt5=1;
            }
            break;
        case 'b':
            {
            alt5=2;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt5=3;
            }
            break;
        case '/':
            {
            alt5=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:1:10: T__6
                {
                mT__6(); 


                }
                break;
            case 2 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:1:15: T__7
                {
                mT__7(); 


                }
                break;
            case 3 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:1:20: WS
                {
                mWS(); 


                }
                break;
            case 4 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:1:23: SLCOMMENT
                {
                mSLCOMMENT(); 


                }
                break;

        }

    }


 

}