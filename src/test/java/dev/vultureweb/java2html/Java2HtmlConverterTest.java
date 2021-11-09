package dev.vultureweb.java2html;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Java2HtmlConverterTest {

   @Test
   void assertThaHelloWorldIsProperlyParsed() {
      var helloWorld = """
            public void helloWorld(String name) {
               System.out.println("Hello World");
            }
            """;
      var expected = """
            <pre>
            publicvoidhelloWorld(<span class="type">String</span>
            name){System.out.println(<span class="string-literal">"HelloWorld"</span>
            );}
            </pre>
            """;
      var result = new Java2HtmlConverter().convert(helloWorld);
      assertEquals(expected, result, "Proper HTML snippet should be generated");
   }

}