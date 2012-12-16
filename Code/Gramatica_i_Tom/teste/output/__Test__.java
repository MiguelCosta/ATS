package parser;
 
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import parser.rule.RuleAdaptor;
 
public class Main {
  public static void main(String[] args) {
    try {
      GramLexer lexer = new GramLexer(new ANTLRInputStream(System.in));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      GramParser parser = new GramParser(tokens);
      // Parse the input expression
      Tree b = (Tree) parser.ruleset().getTree();
      System.out.println("Result = " + RuleAdaptor.getTerm(b)); // name of the Gom module + Adaptor
    } catch (Exception e) {
      System.err.println("exception: " + e);
      return;
    }
  }
}