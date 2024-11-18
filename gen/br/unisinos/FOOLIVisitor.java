// Generated from /Users/locacao/Documents/code/fooli/src/main/java/br/unisinos/FOOLI.g4 by ANTLR 4.13.2
package br.unisinos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FOOLIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FOOLIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(FOOLIParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(FOOLIParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#classUsage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassUsage(FOOLIParser.ClassUsageContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(FOOLIParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#methodExecution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExecution(FOOLIParser.MethodExecutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FOOLIParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FOOLIParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FOOLIParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(FOOLIParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FOOLIParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(FOOLIParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(FOOLIParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(FOOLIParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(FOOLIParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(FOOLIParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FOOLIParser.PrimaryContext ctx);
}