package com.objmini;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample ObjMini code testing inheritance and dispatch [cite: 77, 81]
            String inputCode = 
                "class Animal { " +
                "  public int age; " +
                "  public void speak() { } " +
                "} " +
                "class Dog extends Animal { " +
                "  public void speak() { } " + // Overriding [cite: 81]
                "  public void bark() { } " +
                "}";

            // Phase 1: Lexing and Parsing [cite: 84]
            ObjMiniLexer lexer = new ObjMiniLexer(CharStreams.fromString(inputCode));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ObjMiniParser parser = new ObjMiniParser(tokens);
            ParseTree tree = parser.program();

            // Phase 2: Semantic Analysis & VTable Construction 
            System.out.println("--- Phase 2: Semantic Analysis & VTable ---");
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.visit(tree);
            analyzer.printClassReports();

            // Phase 3: Code Generation [cite: 88]
            System.out.println("\n--- Phase 3: Code Generation ---");
            CodeGenerator codegen = new CodeGenerator(analyzer.getClassTable());
            codegen.visit(tree);

        } catch (Exception e) {
            System.err.println("Compiler Error: " + e.getMessage());
        }
    }
}