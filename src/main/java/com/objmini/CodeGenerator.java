package com.objmini;

import java.util.Map;

public class CodeGenerator extends ObjMiniBaseVisitor<Void> {
    
    private Map<String, SemanticAnalyzer.ClassInfo> classTable;

    public CodeGenerator(Map<String, SemanticAnalyzer.ClassInfo> classTable) {
        this.classTable = classTable;
    }

    @Override
    public Void visitClassDeclaration(ObjMiniParser.ClassDeclarationContext ctx) {
        String className = ctx.ID(0).getText();
        System.out.println("; --- Object Memory Layout for " + className + " ---"); // [cite: 87]
        System.out.println("; Offset 0: [vptr] -> points to " + className + "_VTable"); 
        System.out.println("; Offset 4: [Fields Area]");
        return visitChildren(ctx);
    }

    @Override
    public Void visitExpression(ObjMiniParser.ExpressionContext ctx) {
        // Handle 'this' keyword [cite: 82, 146]
        if (ctx.getText().equals("this")) {
            System.out.println("  LOAD eax, [ebp + 8] ; Load 'this' pointer from stack");
        }

        // Handle Method Dispatch (e.g., obj.method()) [cite: 81, 88, 145]
        if (ctx.getText().contains(".")) {
            System.out.println("  ; Performing Dynamic Dispatch via VTable...");
            System.out.println("  CALL vtable_lookup_and_jump");
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitMethodDeclaration(ObjMiniParser.MethodDeclarationContext ctx) {
        String methodName = ctx.ID().getText();
        System.out.println(methodName + "_entry:");
        System.out.println("  PUSH ebp");
        visitChildren(ctx);
        System.out.println("  POP ebp");
        System.out.println("  RET");
        return null;
    }
}