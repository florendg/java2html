package dev.vultureweb.java2html;

import dev.vultureweb.java2html.parser.HelloLexer;
import dev.vultureweb.java2html.parser.HelloParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Java2HtmlConverter {

   private static String demoMethod = """
         public void helloWorld() {
            
         }   
         """;

   public static void main(String[] args) {
      CharStream input = CharStreams.fromString(demoMethod);
      HelloLexer lexer = new HelloLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      HelloParser parser = new HelloParser(tokens);
      ParseTree pt = parser.method();
      System.out.println(pt.toStringTree(parser));
   }

}
