// Generated from src/main/antlr4/com/objmini/ObjMini.g4 by ANTLR 4.13.2
package com.objmini;

    package com.objmini;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjMiniParser}.
 */
public interface ObjMiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ObjMiniParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ObjMiniParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ObjMiniParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ObjMiniParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(ObjMiniParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(ObjMiniParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ObjMiniParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ObjMiniParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ObjMiniParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ObjMiniParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ObjMiniParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ObjMiniParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ObjMiniParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ObjMiniParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ObjMiniParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ObjMiniParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ObjMiniParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ObjMiniParser.ExpressionContext ctx);
}