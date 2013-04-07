import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        lingiLexer lex = new lingiLexer(new ANTLRFileStream("/home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        lingiParser g = new lingiParser(tokens, 49101, null);
        try {
            g.programa();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}