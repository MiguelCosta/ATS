import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        lingi_tomLexer lex = new lingi_tomLexer(new ANTLRFileStream("C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\exemplos\\input1.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        lingi_tomParser g = new lingi_tomParser(tokens, 49100, null);
        try {
            g.programa();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}