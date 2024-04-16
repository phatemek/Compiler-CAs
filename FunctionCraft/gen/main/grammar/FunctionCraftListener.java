// Generated from /Users/phateme/University/T6/Compiler/Compiler-CAs/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#optional_args}.
	 * @param ctx the parse tree
	 */
	void enterOptional_args(FunctionCraftParser.Optional_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#optional_args}.
	 * @param ctx the parse tree
	 */
	void exitOptional_args(FunctionCraftParser.Optional_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#optional_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptional_arg(FunctionCraftParser.Optional_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#optional_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptional_arg(FunctionCraftParser.Optional_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(FunctionCraftParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(FunctionCraftParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_prim}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prim(FunctionCraftParser.Expr_primContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_prim}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prim(FunctionCraftParser.Expr_primContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append_line}.
	 * @param ctx the parse tree
	 */
	void enterAppend_line(FunctionCraftParser.Append_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append_line}.
	 * @param ctx the parse tree
	 */
	void exitAppend_line(FunctionCraftParser.Append_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#arithmatic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmatic_operator(FunctionCraftParser.Arithmatic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arithmatic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmatic_operator(FunctionCraftParser.Arithmatic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#value_from_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_from_list(FunctionCraftParser.Value_from_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#value_from_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_from_list(FunctionCraftParser.Value_from_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void enterList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void exitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(FunctionCraftParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(FunctionCraftParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#fptr_val}.
	 * @param ctx the parse tree
	 */
	void enterFptr_val(FunctionCraftParser.Fptr_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#fptr_val}.
	 * @param ctx the parse tree
	 */
	void exitFptr_val(FunctionCraftParser.Fptr_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primitive_function}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_function(FunctionCraftParser.Primitive_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primitive_function}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_function(FunctionCraftParser.Primitive_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_scope}.
	 * @param ctx the parse tree
	 */
	void enterIf_scope(FunctionCraftParser.If_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_scope}.
	 * @param ctx the parse tree
	 */
	void exitIf_scope(FunctionCraftParser.If_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseif_scope}.
	 * @param ctx the parse tree
	 */
	void enterElseif_scope(FunctionCraftParser.Elseif_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseif_scope}.
	 * @param ctx the parse tree
	 */
	void exitElseif_scope(FunctionCraftParser.Elseif_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else_scope}.
	 * @param ctx the parse tree
	 */
	void enterElse_scope(FunctionCraftParser.Else_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else_scope}.
	 * @param ctx the parse tree
	 */
	void exitElse_scope(FunctionCraftParser.Else_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_scope}.
	 * @param ctx the parse tree
	 */
	void enterFor_scope(FunctionCraftParser.For_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_scope}.
	 * @param ctx the parse tree
	 */
	void exitFor_scope(FunctionCraftParser.For_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(FunctionCraftParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(FunctionCraftParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_line}.
	 * @param ctx the parse tree
	 */
	void enterReturn_line(FunctionCraftParser.Return_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_line}.
	 * @param ctx the parse tree
	 */
	void exitReturn_line(FunctionCraftParser.Return_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 */
	void enterPattern_call(FunctionCraftParser.Pattern_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 */
	void exitPattern_call(FunctionCraftParser.Pattern_callContext ctx);
}