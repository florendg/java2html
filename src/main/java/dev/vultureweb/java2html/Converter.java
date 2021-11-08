package dev.vultureweb.java2html;

import dev.vultureweb.java2html.parser.HelloBaseListener;
import dev.vultureweb.java2html.parser.HelloParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Converter extends HelloBaseListener {

   private final StringBuilder builder = new StringBuilder();

   @Override
   public void enterMethod(HelloParser.MethodContext ctx) {
      builder.append("<pre>\n");
   }

   @Override
   public void exitMethod(HelloParser.MethodContext ctx) {
      builder.append("\n</pre>\n");
   }

   @Override
   public void visitTerminal(TerminalNode node) {
      builder.append(node.toString());
   }

   @Override
   public String toString() {
      return builder.toString();
   }
}
