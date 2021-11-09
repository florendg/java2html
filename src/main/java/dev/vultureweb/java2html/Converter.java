package dev.vultureweb.java2html;

import dev.vultureweb.java2html.parser.HelloBaseListener;
import dev.vultureweb.java2html.parser.HelloParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Converter extends HelloBaseListener {

   private final StringBuilder builder = new StringBuilder();

   @Override
   public void enterClassifier(HelloParser.ClassifierContext ctx) {
      builder.append("<span class=\"classifier\">");
   }

   @Override
   public void exitClassifier(HelloParser.ClassifierContext ctx) {
      builder.append("</span>\n");
   }

   @Override
   public void enterReturnType(HelloParser.ReturnTypeContext ctx) {
      builder.append("<span class=\"return-type\">");
   }

   @Override
   public void exitReturnType(HelloParser.ReturnTypeContext ctx) {
      builder.append("</span>\n");
   }

   @Override
   public void enterMethodName(HelloParser.MethodNameContext ctx) {
      builder.append("<span class=\"method-name\">");
   }

   @Override
   public void exitMethodName(HelloParser.MethodNameContext ctx) {
      builder.append("</span>\n");
   }

   @Override
   public void enterArg(HelloParser.ArgContext ctx) {
      builder.append("<div class=\"argument\">\n");
   }

   @Override
   public void exitArg(HelloParser.ArgContext ctx) {
      builder.append("</div>\n");
   }

   @Override
   public void enterMethod(HelloParser.MethodContext ctx) {
      builder.append("<pre>\n");
   }



   @Override
   public void exitMethod(HelloParser.MethodContext ctx) {
      builder.append("\n</pre>\n");
   }

   @Override
   public void enterStringLiteral(HelloParser.StringLiteralContext ctx) {
      builder.append("<span class=\"string-literal\">");
   }

   @Override
   public void exitStringLiteral(HelloParser.StringLiteralContext ctx) {
      builder.append("</span>\n");
   }

   @Override
   public void enterType(HelloParser.TypeContext ctx) {
      builder.append("<span class=\"type\">");
   }

   @Override
   public void exitType(HelloParser.TypeContext ctx) {
      builder.append("</span>\n");
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
