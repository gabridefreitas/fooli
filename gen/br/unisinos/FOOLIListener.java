// Generated from /Users/locacao/Documents/code/fooli/src/main/java/br/unisinos/FOOLI.g4 by ANTLR 4.13.2
package br.unisinos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FOOLIParser}.
 */
public interface FOOLIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(FOOLIParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(FOOLIParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(FOOLIParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(FOOLIParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#classUsage}.
	 * @param ctx the parse tree
	 */
	void enterClassUsage(FOOLIParser.ClassUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#classUsage}.
	 * @param ctx the parse tree
	 */
	void exitClassUsage(FOOLIParser.ClassUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(FOOLIParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(FOOLIParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#methodExecution}.
	 * @param ctx the parse tree
	 */
	void enterMethodExecution(FOOLIParser.MethodExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#methodExecution}.
	 * @param ctx the parse tree
	 */
	void exitMethodExecution(FOOLIParser.MethodExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FOOLIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FOOLIParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FOOLIParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FOOLIParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FOOLIParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FOOLIParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(FOOLIParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(FOOLIParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(FOOLIParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(FOOLIParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(FOOLIParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(FOOLIParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(FOOLIParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(FOOLIParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(FOOLIParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(FOOLIParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FOOLIParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FOOLIParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(FOOLIParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(FOOLIParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FOOLIParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FOOLIParser.PrimaryContext ctx);
}