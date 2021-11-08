package dev.vultureweb.java2html;

import dev.vultureweb.java2html.parser.HelloLexer;
import dev.vultureweb.java2html.parser.HelloParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Java2HtmlConverter {

   public String convert(final String javaMethod ) {
      Converter converter = new Converter();
      CharStream input = CharStreams.fromString(javaMethod);
      HelloLexer lexer = new HelloLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      HelloParser parser = new HelloParser(tokens);
      ParseTree pt = parser.method();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(converter,pt);
      return converter.toString();
   }

}
