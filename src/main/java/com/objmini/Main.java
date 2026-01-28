
package com.objmini;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. A sample string of ObjMini code to test our parser
            String inputCode = 
                "class Animal { " +
                "  public int age; " +
                "  public void eat() { age = 5; } " +
                "} " +
                "class Dog extends Animal { " +
                "  public void bark() { } " +
                "}";

            // 2. Feed the code to the Lexer
            ObjMiniLexer lexer = new ObjMiniLexer(CharStreams.fromString(inputCode));
            
            // 3. Get the stream of tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // 4. Feed the tokens to the Parser
            ObjMiniParser parser = new ObjMiniParser(tokens);
            
            // 5. Start parsing at the 'program' rule
            ParseTree tree = parser.program();

            // 6. Print the LISP-style tree to the console to verify it works
            System.out.println("--- Parse Tree Success ---");
            System.out.println(tree.toStringTree(parser));
            
        } catch (Exception e) {
            System.err.println("Error while parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}