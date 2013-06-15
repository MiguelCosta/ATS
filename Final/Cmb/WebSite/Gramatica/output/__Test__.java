import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        CmbLexer lex = new CmbLexer(new ANTLRFileStream("/home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        CmbParser parser = new CmbParser(tokens);
        CmbParser.programa_return r = parser.programa();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        CmbTGMSP walker = new CmbTGMSP(nodes);
        try {
            walker.programa();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}