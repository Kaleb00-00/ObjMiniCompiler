// Generated from src/main/antlr4/com/objmini/ObjMini.g4 by ANTLR 4.13.2
package com.objmini;

    package com.objmini;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjMiniParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjMiniVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ObjMiniParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ObjMiniParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(ObjMiniParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ObjMiniParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ObjMiniParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ObjMiniParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(ObjMiniParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ObjMiniParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjMiniParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ObjMiniParser.ExpressionContext ctx);
}