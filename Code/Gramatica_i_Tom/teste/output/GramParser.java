// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g 2012-12-16 10:43:10
 package parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class GramParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SLCOMMENT", "WS", "'a'", "'b'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int SLCOMMENT=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "ruleset", "rule"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public GramParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public GramParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public GramParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return GramParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g"; }



    // $ANTLR start "ruleset"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:6:1: ruleset : rule ( rule )* EOF ;
    public final void ruleset() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ruleset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:6:9: ( rule ( rule )* EOF )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:6:11: rule ( rule )* EOF
            {
            dbg.location(6,11);
            pushFollow(FOLLOW_rule_in_ruleset26);
            rule();

            state._fsp--;

            dbg.location(6,16);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:6:16: ( rule )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 6 && LA1_0 <= 7)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:6:17: rule
            	    {
            	    dbg.location(6,17);
            	    pushFollow(FOLLOW_rule_in_ruleset29);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(6,24);
            match(input,EOF,FOLLOW_EOF_in_ruleset33); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(6, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ruleset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ruleset"



    // $ANTLR start "rule"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:8:1: rule : ( 'a' | 'b' );
    public final void rule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:8:6: ( 'a' | 'b' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\teste\\Gram.g:
            {
            dbg.location(8,6);
            if ( (input.LA(1) >= 6 && input.LA(1) <= 7) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_rule_in_ruleset26 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule_in_ruleset29 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOF_in_ruleset33 = new BitSet(new long[]{0x0000000000000002L});

}