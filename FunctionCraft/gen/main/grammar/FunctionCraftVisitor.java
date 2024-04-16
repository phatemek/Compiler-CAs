// Generated from /Users/phateme/University/T6/Compiler/Compiler-CAs/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#optional_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_args(FunctionCraftParser.Optional_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#optional_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_arg(FunctionCraftParser.Optional_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(FunctionCraftParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prim(FunctionCraftParser.Expr_primContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_line(FunctionCraftParser.Append_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#arithmatic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmatic_operator(FunctionCraftParser.Arithmatic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#value_from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_from_list(FunctionCraftParser.Value_from_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(FunctionCraftParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#fptr_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptr_val(FunctionCraftParser.Fptr_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primitive_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_function(FunctionCraftParser.Primitive_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_scope(FunctionCraftParser.If_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseif_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_scope(FunctionCraftParser.Elseif_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_scope(FunctionCraftParser.Else_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_scope(FunctionCraftParser.For_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(FunctionCraftParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_line(FunctionCraftParser.Return_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_call(FunctionCraftParser.Pattern_callContext ctx);
}