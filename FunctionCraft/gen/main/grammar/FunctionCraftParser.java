// Generated from /Users/phateme/University/T6/Compiler/Compiler-CAs/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT_VAL=1, BOOL_VAL=2, DEF=3, IF=4, ELSE=5, ELSEIF=6, END=7, TRUE=8, 
		FALSE=9, METHOD=10, PATTERN=11, MATCH=12, NEXT=13, BREAK=14, LOOP=15, 
		DO=16, FOR=17, IN=18, RETURN=19, PUSH=20, PUTS=21, CHOP=22, CHOMP=23, 
		MAIN=24, LEN=25, UNDERSCORE=26, LBRACE=27, RBRACE=28, COMMA=29, COLON=30, 
		SEMICOLON=31, ARROW=32, QUOT=33, DOT=34, DDOT=35, INDLINE=36, LPAR=37, 
		RPAR=38, LBRACK=39, RBRACK=40, DEC=41, INC=42, MULT=43, DIV=44, PLUS=45, 
		MINUS=46, LEQ=47, GEQ=48, LES=49, GRT=50, EQL=51, NEQL=52, AND=53, OR=54, 
		NOT=55, APPEND=56, ASSIGN=57, PLUSEQ=58, MINUSEQ=59, MULTEQ=60, DIVEQ=61, 
		REMEQ=62, IDENTIFIER=63, INT_VAL=64, STRING_VAL=65, LETTER=66, DIGIT=67, 
		SLCOMMENT=68, MLCOMMENT=69, WS=70;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_main = 2, RULE_function_args = 3, 
		RULE_optional_args = 4, RULE_init = 5, RULE_expression = 6, RULE_append_line = 7, 
		RULE_expr_prim = 8, RULE_arithmatic_operator = 9, RULE_value_from_list = 10, 
		RULE_value = 11, RULE_list_val = 12, RULE_logical_expression = 13, RULE_fptr_val = 14, 
		RULE_primitive_function = 15, RULE_function_call = 16, RULE_function_body = 17, 
		RULE_if_scope = 18, RULE_elseif_scope = 19, RULE_else_scope = 20, RULE_loop_body = 21, 
		RULE_for_scope = 22, RULE_for_range = 23, RULE_next = 24, RULE_break = 25, 
		RULE_return_line = 26, RULE_pattern = 27, RULE_pattern_call = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "main", "function_args", "optional_args", "init", 
			"expression", "append_line", "expr_prim", "arithmatic_operator", "value_from_list", 
			"value", "list_val", "logical_expression", "fptr_val", "primitive_function", 
			"function_call", "function_body", "if_scope", "elseif_scope", "else_scope", 
			"loop_body", "for_scope", "for_range", "next", "break", "return_line", 
			"pattern", "pattern_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'def'", "'if'", "'else'", "'elseif'", "'end'", "'true'", 
			"'false'", "'method'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", 
			"'do'", "'for'", "'in'", "'return'", "'push'", "'puts'", "'chop'", "'chomp'", 
			"'main'", "'len'", "'_'", "'{'", "'}'", "','", "':'", "';'", "'->'", 
			"'\"'", "'.'", "'..'", null, "'('", "')'", "'['", "']'", "'--'", "'++'", 
			"'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", 
			"'&&'", "'||'", "'!'", "'<<'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT_VAL", "BOOL_VAL", "DEF", "IF", "ELSE", "ELSEIF", "END", 
			"TRUE", "FALSE", "METHOD", "PATTERN", "MATCH", "NEXT", "BREAK", "LOOP", 
			"DO", "FOR", "IN", "RETURN", "PUSH", "PUTS", "CHOP", "CHOMP", "MAIN", 
			"LEN", "UNDERSCORE", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", 
			"ARROW", "QUOT", "DOT", "DDOT", "INDLINE", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "DEC", "INC", "MULT", "DIV", "PLUS", "MINUS", "LEQ", "GEQ", 
			"LES", "GRT", "EQL", "NEQL", "AND", "OR", "NOT", "APPEND", "ASSIGN", 
			"PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", "REMEQ", "IDENTIFIER", "INT_VAL", 
			"STRING_VAL", "LETTER", "DIGIT", "SLCOMMENT", "MLCOMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(60);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(58);
						function();
						}
						break;
					case PATTERN:
						{
						setState(59);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			 System.out.println("MAIN"); 
			setState(66);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DEF);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(LPAR);
			setState(71);
			function_args();
			setState(72);
			match(RPAR);
			setState(73);
			function_body();
			setState(74);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DEF);
			setState(77);
			match(MAIN);
			setState(78);
			match(LPAR);
			setState(79);
			match(RPAR);
			setState(80);
			function_body();
			setState(81);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_argsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public Optional_argsContext optional_args() {
			return getRuleContext(Optional_argsContext.class,0);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_args);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(COMMA);
				setState(85);
				function_args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				optional_args();
				setState(87);
				match(COMMA);
				setState(88);
				function_args();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				optional_args();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_argsContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Optional_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOptional_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOptional_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOptional_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_argsContext optional_args() throws RecognitionException {
		Optional_argsContext _localctx = new Optional_argsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optional_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LBRACK);
			setState(95);
			init();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				init();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			value();
			setState(106);
			match(ASSIGN);
			setState(107);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr_primContext expr_prim() {
			return getRuleContext(Expr_primContext.class,0);
		}
		public Append_lineContext append_line() {
			return getRuleContext(Append_lineContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(109);
				append_line();
				}
				break;
			case 2:
				{
				setState(110);
				match(LPAR);
				setState(111);
				expression();
				setState(112);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(114);
				value();
				setState(115);
				match(INC);
				}
				break;
			case 4:
				{
				setState(117);
				value();
				setState(118);
				match(DEC);
				}
				break;
			case 5:
				{
				setState(120);
				match(NOT);
				setState(121);
				expression();
				}
				break;
			case 6:
				{
				setState(122);
				match(MINUS);
				setState(123);
				expression();
				}
				break;
			case 7:
				{
				setState(124);
				logical_expression();
				}
				break;
			case 8:
				{
				setState(125);
				value();
				}
				break;
			}
			setState(128);
			expr_prim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Append_lineContext extends ParserRuleContext {
		public List<TerminalNode> APPEND() { return getTokens(FunctionCraftParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(FunctionCraftParser.APPEND, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<List_valContext> list_val() {
			return getRuleContexts(List_valContext.class);
		}
		public List_valContext list_val(int i) {
			return getRuleContext(List_valContext.class,i);
		}
		public List<TerminalNode> STRING_VAL() { return getTokens(FunctionCraftParser.STRING_VAL); }
		public TerminalNode STRING_VAL(int i) {
			return getToken(FunctionCraftParser.STRING_VAL, i);
		}
		public List<Value_from_listContext> value_from_list() {
			return getRuleContexts(Value_from_listContext.class);
		}
		public Value_from_listContext value_from_list(int i) {
			return getRuleContext(Value_from_listContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Append_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_lineContext append_line() throws RecognitionException {
		Append_lineContext _localctx = new Append_lineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_append_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(130);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(131);
				list_val();
				}
				break;
			case 3:
				{
				setState(132);
				match(STRING_VAL);
				}
				break;
			case 4:
				{
				setState(133);
				value_from_list();
				}
				break;
			}
			setState(136);
			match(APPEND);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(137);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(138);
						list_val();
						}
						break;
					case 3:
						{
						setState(139);
						match(STRING_VAL);
						}
						break;
					case 4:
						{
						setState(140);
						expression();
						}
						break;
					case 5:
						{
						setState(141);
						value_from_list();
						}
						break;
					}
					setState(144);
					match(APPEND);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(150);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(151);
				list_val();
				}
				break;
			case 3:
				{
				setState(152);
				match(STRING_VAL);
				}
				break;
			case 4:
				{
				setState(153);
				expression();
				}
				break;
			case 5:
				{
				setState(154);
				value_from_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_primContext extends ParserRuleContext {
		public Arithmatic_operatorContext arithmatic_operator() {
			return getRuleContext(Arithmatic_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_primContext expr_prim() {
			return getRuleContext(Expr_primContext.class,0);
		}
		public Expr_primContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_prim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_prim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_prim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primContext expr_prim() throws RecognitionException {
		Expr_primContext _localctx = new Expr_primContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_prim);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157);
				arithmatic_operator();
				setState(158);
				expression();
				setState(159);
				expr_prim();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmatic_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public Arithmatic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArithmatic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArithmatic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArithmatic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmatic_operatorContext arithmatic_operator() throws RecognitionException {
		Arithmatic_operatorContext _localctx = new Arithmatic_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmatic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_from_listContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(FunctionCraftParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FunctionCraftParser.LBRACK, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FunctionCraftParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FunctionCraftParser.RBRACK, i);
		}
		public Value_from_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_from_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValue_from_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValue_from_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValue_from_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_from_listContext value_from_list() throws RecognitionException {
		Value_from_listContext _localctx = new Value_from_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value_from_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(166);
				match(RPAR);
				setState(167);
				expression();
				setState(168);
				match(LPAR);
				}
				break;
			case 2:
				{
				setState(170);
				list_val();
				}
				break;
			case 3:
				{
				setState(171);
				function_call();
				}
				break;
			case 4:
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			}
			{
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(LBRACK);
				setState(176);
				value();
				setState(177);
				match(RBRACK);
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value_from_listContext value_from_list() {
			return getRuleContext(Value_from_listContext.class,0);
		}
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode BOOL_VAL() { return getToken(FunctionCraftParser.BOOL_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public Fptr_valContext fptr_val() {
			return getRuleContext(Fptr_valContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Pattern_callContext pattern_call() {
			return getRuleContext(Pattern_callContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				value_from_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(INT_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(FLOAT_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(BOOL_VAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(STRING_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				list_val();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				fptr_val();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				pattern_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(192);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_valContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valContext list_val() throws RecognitionException {
		List_valContext _localctx = new List_valContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_val);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LBRACK);
				{
				setState(196);
				expression();
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(197);
					match(COMMA);
					setState(198);
					expression();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(LBRACK);
				setState(207);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQL() { return getToken(FunctionCraftParser.NEQL, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode GRT() { return getToken(FunctionCraftParser.GRT, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logical_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LPAR);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(211);
				expression();
				}
				break;
			case 2:
				{
				setState(212);
				match(NOT);
				setState(213);
				match(LPAR);
				setState(214);
				expression();
				setState(215);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(217);
				expression();
				setState(218);
				match(EQL);
				setState(219);
				expression();
				}
				break;
			case 4:
				{
				setState(221);
				expression();
				setState(222);
				match(NEQL);
				setState(223);
				expression();
				}
				break;
			case 5:
				{
				setState(225);
				expression();
				setState(226);
				match(LEQ);
				setState(227);
				expression();
				}
				break;
			case 6:
				{
				setState(229);
				expression();
				setState(230);
				match(GEQ);
				setState(231);
				expression();
				}
				break;
			case 7:
				{
				setState(233);
				expression();
				setState(234);
				match(LES);
				setState(235);
				expression();
				}
				break;
			case 8:
				{
				setState(237);
				expression();
				setState(238);
				match(GRT);
				setState(239);
				expression();
				}
				break;
			case 9:
				{
				setState(241);
				match(LPAR);
				setState(242);
				logical_expression();
				setState(243);
				match(RPAR);
				setState(244);
				match(OR);
				setState(245);
				match(LPAR);
				setState(246);
				logical_expression();
				setState(247);
				match(RPAR);
				}
				break;
			case 10:
				{
				setState(249);
				match(LPAR);
				setState(250);
				logical_expression();
				setState(251);
				match(RPAR);
				setState(252);
				match(AND);
				setState(253);
				match(LPAR);
				setState(254);
				logical_expression();
				setState(255);
				match(RPAR);
				}
				break;
			}
			setState(259);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fptr_valContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public Fptr_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFptr_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFptr_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFptr_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_valContext fptr_val() throws RecognitionException {
		Fptr_valContext _localctx = new Fptr_valContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fptr_val);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(METHOD);
				setState(262);
				match(LPAR);
				setState(263);
				match(COLON);
				setState(264);
				match(IDENTIFIER);
				setState(265);
				match(RPAR);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(ARROW);
				setState(267);
				match(LPAR);
				setState(268);
				function_args();
				setState(269);
				match(RPAR);
				setState(270);
				match(LBRACE);
				setState(271);
				function_body();
				setState(272);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_functionContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public Primitive_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimitive_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimitive_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimitive_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_functionContext primitive_function() throws RecognitionException {
		Primitive_functionContext _localctx = new Primitive_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitive_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 49283072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Primitive_functionContext primitive_function() {
			return getRuleContext(Primitive_functionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Fptr_valContext fptr_val() {
			return getRuleContext(Fptr_valContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
			case PUTS:
			case CHOP:
			case CHOMP:
			case LEN:
				{
				setState(278);
				primitive_function();
				}
				break;
			case IDENTIFIER:
				{
				setState(279);
				match(IDENTIFIER);
				}
				break;
			case METHOD:
			case ARROW:
				{
				setState(280);
				fptr_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(LPAR);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(284);
				expression();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					expression();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(294);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<If_scopeContext> if_scope() {
			return getRuleContexts(If_scopeContext.class);
		}
		public If_scopeContext if_scope(int i) {
			return getRuleContext(If_scopeContext.class,i);
		}
		public List<For_scopeContext> for_scope() {
			return getRuleContexts(For_scopeContext.class);
		}
		public For_scopeContext for_scope(int i) {
			return getRuleContext(For_scopeContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Pattern_callContext> pattern_call() {
			return getRuleContexts(Pattern_callContext.class);
		}
		public Pattern_callContext pattern_call(int i) {
			return getRuleContext(Pattern_callContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Return_lineContext> return_line() {
			return getRuleContexts(Return_lineContext.class);
		}
		public Return_lineContext return_line(int i) {
			return getRuleContext(Return_lineContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9187271904674020330L) != 0) || _la==INT_VAL || _la==STRING_VAL) {
				{
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(296);
					init();
					setState(297);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(299);
					if_scope();
					}
					break;
				case 3:
					{
					setState(300);
					for_scope();
					}
					break;
				case 4:
					{
					setState(301);
					function_call();
					setState(302);
					match(SEMICOLON);
					}
					break;
				case 5:
					{
					setState(304);
					pattern_call();
					setState(305);
					match(SEMICOLON);
					}
					break;
				case 6:
					{
					setState(307);
					expression();
					setState(308);
					match(SEMICOLON);
					}
					break;
				case 7:
					{
					setState(310);
					return_line();
					}
					break;
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_scopeContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Elseif_scopeContext> elseif_scope() {
			return getRuleContexts(Elseif_scopeContext.class);
		}
		public Elseif_scopeContext elseif_scope(int i) {
			return getRuleContext(Elseif_scopeContext.class,i);
		}
		public Else_scopeContext else_scope() {
			return getRuleContext(Else_scopeContext.class,0);
		}
		public If_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_scopeContext if_scope() throws RecognitionException {
		If_scopeContext _localctx = new If_scopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(IF);
			setState(317);
			logical_expression();
			setState(318);
			function_body();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(319);
				elseif_scope();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(325);
				else_scope();
				}
			}

			setState(328);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_scopeContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Elseif_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseif_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseif_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseif_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_scopeContext elseif_scope() throws RecognitionException {
		Elseif_scopeContext _localctx = new Elseif_scopeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseif_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ELSEIF);
			setState(331);
			logical_expression();
			setState(332);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_scopeContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Else_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_scopeContext else_scope() throws RecognitionException {
		Else_scopeContext _localctx = new Else_scopeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ELSE);
			setState(335);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_bodyContext extends ParserRuleContext {
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<If_scopeContext> if_scope() {
			return getRuleContexts(If_scopeContext.class);
		}
		public If_scopeContext if_scope(int i) {
			return getRuleContext(If_scopeContext.class,i);
		}
		public List<For_scopeContext> for_scope() {
			return getRuleContexts(For_scopeContext.class);
		}
		public For_scopeContext for_scope(int i) {
			return getRuleContext(For_scopeContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Pattern_callContext> pattern_call() {
			return getRuleContexts(Pattern_callContext.class);
		}
		public Pattern_callContext pattern_call(int i) {
			return getRuleContext(Pattern_callContext.class,i);
		}
		public List<Return_lineContext> return_line() {
			return getRuleContexts(Return_lineContext.class);
		}
		public Return_lineContext return_line(int i) {
			return getRuleContext(Return_lineContext.class,i);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(337);
						init();
						setState(338);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(340);
						if_scope();
						}
						break;
					case 3:
						{
						setState(341);
						for_scope();
						}
						break;
					case 4:
						{
						setState(342);
						function_call();
						setState(343);
						match(SEMICOLON);
						}
						break;
					case 5:
						{
						setState(345);
						pattern_call();
						setState(346);
						match(SEMICOLON);
						}
						break;
					case 6:
						{
						setState(348);
						return_line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(351); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_scopeContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Loop_bodyContext> loop_body() {
			return getRuleContexts(Loop_bodyContext.class);
		}
		public Loop_bodyContext loop_body(int i) {
			return getRuleContext(Loop_bodyContext.class,i);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public List<BreakContext> break_() {
			return getRuleContexts(BreakContext.class);
		}
		public BreakContext break_(int i) {
			return getRuleContext(BreakContext.class,i);
		}
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public For_rangeContext for_range() {
			return getRuleContext(For_rangeContext.class,0);
		}
		public For_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_scopeContext for_scope() throws RecognitionException {
		For_scopeContext _localctx = new For_scopeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_scope);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(LOOP);
				setState(354);
				match(DO);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223371207876090858L) != 0) || _la==INT_VAL || _la==STRING_VAL) {
					{
					setState(358);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FLOAT_VAL:
					case BOOL_VAL:
					case IF:
					case METHOD:
					case LOOP:
					case FOR:
					case RETURN:
					case PUSH:
					case PUTS:
					case CHOP:
					case CHOMP:
					case LEN:
					case ARROW:
					case RPAR:
					case LBRACK:
					case IDENTIFIER:
					case INT_VAL:
					case STRING_VAL:
						{
						setState(355);
						loop_body();
						}
						break;
					case NEXT:
						{
						setState(356);
						next();
						}
						break;
					case BREAK:
						{
						setState(357);
						break_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(END);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(FOR);
				setState(365);
				match(IDENTIFIER);
				setState(366);
				match(IN);
				setState(367);
				for_range();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223371207876090858L) != 0) || _la==INT_VAL || _la==STRING_VAL) {
					{
					setState(371);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FLOAT_VAL:
					case BOOL_VAL:
					case IF:
					case METHOD:
					case LOOP:
					case FOR:
					case RETURN:
					case PUSH:
					case PUTS:
					case CHOP:
					case CHOMP:
					case LEN:
					case ARROW:
					case RPAR:
					case LBRACK:
					case IDENTIFIER:
					case INT_VAL:
					case STRING_VAL:
						{
						setState(368);
						loop_body();
						}
						break;
					case NEXT:
						{
						setState(369);
						next();
						}
						break;
					case BREAK:
						{
						setState(370);
						break_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_rangeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode DDOT() { return getToken(FunctionCraftParser.DDOT, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_range);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				list_val();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(LPAR);
				setState(383);
				value();
				setState(384);
				match(DDOT);
				setState(385);
				value();
				setState(386);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NextContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_next);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(NEXT);
				setState(391);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(NEXT);
				setState(393);
				match(IF);
				setState(394);
				logical_expression();
				setState(395);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_break);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(BREAK);
				setState(400);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(BREAK);
				setState(402);
				match(IF);
				setState(403);
				logical_expression();
				setState(404);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_lineContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_lineContext return_line() throws RecognitionException {
		Return_lineContext _localctx = new Return_lineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(RETURN);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(409);
				init();
				}
				break;
			case 2:
				{
				setState(410);
				expression();
				}
				break;
			}
			setState(413);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> INDLINE() { return getTokens(FunctionCraftParser.INDLINE); }
		public TerminalNode INDLINE(int i) {
			return getToken(FunctionCraftParser.INDLINE, i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(PATTERN);
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(LPAR);
			setState(418);
			function_args();
			setState(419);
			match(RPAR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDLINE) {
				{
				{
				setState(420);
				match(INDLINE);
				setState(421);
				logical_expression();
				setState(422);
				match(ASSIGN);
				setState(423);
				expression();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Pattern_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_callContext pattern_call() throws RecognitionException {
		Pattern_callContext _localctx = new Pattern_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pattern_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(IDENTIFIER);
			setState(433);
			match(DOT);
			setState(434);
			match(MATCH);
			setState(435);
			match(LPAR);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(436);
				expression();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(437);
					match(COMMA);
					setState(438);
					expression();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(446);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u01c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b\u0000"+
		"\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"]\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"c\b\u0004\n\u0004\f\u0004f\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008f\b\u0007\u0001\u0007\u0005\u0007\u0092\b\u0007\n\u0007"+
		"\f\u0007\u0095\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009c\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00a3\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00b4\b\n\u000b\n\f\n\u00b5\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00c2\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00c8\b\f\n\f\f\f\u00cb\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00d1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0102\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0113\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u011a\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0120\b\u0010\n\u0010\f\u0010\u0123\t\u0010\u0003"+
		"\u0010\u0125\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0138\b\u0011\n\u0011\f\u0011\u013b\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0141\b\u0012\n\u0012"+
		"\f\u0012\u0144\t\u0012\u0001\u0012\u0003\u0012\u0147\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u015e\b\u0015\u000b\u0015\f\u0015"+
		"\u015f\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0167\b\u0016\n\u0016\f\u0016\u016a\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0174\b\u0016\n\u0016\f\u0016\u0177\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u017b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0185"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u018e\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0197"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u019c\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u01aa\b\u001b\n\u001b\f\u001b\u01ad\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01b8\b\u001c\n\u001c\f\u001c\u01bb\t\u001c"+
		"\u0003\u001c\u01bd\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000"+
		"\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\u0002\u0001\u0000+.\u0002\u0000"+
		"\u0014\u0017\u0019\u0019\u01f8\u0000>\u0001\u0000\u0000\u0000\u0002D\u0001"+
		"\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000"+
		"\u0000\u0000\b^\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\f~"+
		"\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u00a2"+
		"\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00ad"+
		"\u0001\u0000\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018\u00d0"+
		"\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000\u0000\u001c\u0112"+
		"\u0001\u0000\u0000\u0000\u001e\u0114\u0001\u0000\u0000\u0000 \u0119\u0001"+
		"\u0000\u0000\u0000\"\u0139\u0001\u0000\u0000\u0000$\u013c\u0001\u0000"+
		"\u0000\u0000&\u014a\u0001\u0000\u0000\u0000(\u014e\u0001\u0000\u0000\u0000"+
		"*\u015d\u0001\u0000\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u0184"+
		"\u0001\u0000\u0000\u00000\u018d\u0001\u0000\u0000\u00002\u0196\u0001\u0000"+
		"\u0000\u00004\u0198\u0001\u0000\u0000\u00006\u019f\u0001\u0000\u0000\u0000"+
		"8\u01b0\u0001\u0000\u0000\u0000:=\u0003\u0002\u0001\u0000;=\u00036\u001b"+
		"\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0006\u0000\uffff\uffff"+
		"\u0000BC\u0003\u0004\u0002\u0000C\u0001\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0003\u0000\u0000EF\u0005?\u0000\u0000FG\u0005%\u0000\u0000GH\u0003\u0006"+
		"\u0003\u0000HI\u0005&\u0000\u0000IJ\u0003\"\u0011\u0000JK\u0005\u0007"+
		"\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000"+
		"MN\u0005\u0018\u0000\u0000NO\u0005%\u0000\u0000OP\u0005&\u0000\u0000P"+
		"Q\u0003\"\u0011\u0000QR\u0005\u0007\u0000\u0000R\u0005\u0001\u0000\u0000"+
		"\u0000ST\u0005?\u0000\u0000TU\u0005\u001d\u0000\u0000U]\u0003\u0006\u0003"+
		"\u0000VW\u0003\b\u0004\u0000WX\u0005\u001d\u0000\u0000XY\u0003\u0006\u0003"+
		"\u0000Y]\u0001\u0000\u0000\u0000Z]\u0005?\u0000\u0000[]\u0003\b\u0004"+
		"\u0000\\S\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000"+
		"\u0000^_\u0005\'\u0000\u0000_d\u0003\n\u0005\u0000`a\u0005\u001d\u0000"+
		"\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005(\u0000\u0000h\t\u0001\u0000"+
		"\u0000\u0000ij\u0003\u0016\u000b\u0000jk\u00059\u0000\u0000kl\u0003\f"+
		"\u0006\u0000l\u000b\u0001\u0000\u0000\u0000m\u007f\u0003\u000e\u0007\u0000"+
		"no\u0005%\u0000\u0000op\u0003\f\u0006\u0000pq\u0005&\u0000\u0000q\u007f"+
		"\u0001\u0000\u0000\u0000rs\u0003\u0016\u000b\u0000st\u0005*\u0000\u0000"+
		"t\u007f\u0001\u0000\u0000\u0000uv\u0003\u0016\u000b\u0000vw\u0005)\u0000"+
		"\u0000w\u007f\u0001\u0000\u0000\u0000xy\u00057\u0000\u0000y\u007f\u0003"+
		"\f\u0006\u0000z{\u0005.\u0000\u0000{\u007f\u0003\f\u0006\u0000|\u007f"+
		"\u0003\u001a\r\u0000}\u007f\u0003\u0016\u000b\u0000~m\u0001\u0000\u0000"+
		"\u0000~n\u0001\u0000\u0000\u0000~r\u0001\u0000\u0000\u0000~u\u0001\u0000"+
		"\u0000\u0000~x\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\r\u0001\u0000\u0000\u0000"+
		"\u0082\u0087\u0005?\u0000\u0000\u0083\u0087\u0003\u0018\f\u0000\u0084"+
		"\u0087\u0005A\u0000\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0093\u00058\u0000\u0000\u0089\u008f\u0005"+
		"?\u0000\u0000\u008a\u008f\u0003\u0018\f\u0000\u008b\u008f\u0005A\u0000"+
		"\u0000\u008c\u008f\u0003\f\u0006\u0000\u008d\u008f\u0003\u0014\n\u0000"+
		"\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000"+
		"\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u00058\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u009b\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u009c\u0005?\u0000\u0000\u0097\u009c"+
		"\u0003\u0018\f\u0000\u0098\u009c\u0005A\u0000\u0000\u0099\u009c\u0003"+
		"\f\u0006\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b\u0096\u0001\u0000"+
		"\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u0012"+
		"\t\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a0\u0003\u0010\b\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0000\u0000\u0000"+
		"\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7"+
		"\u00a8\u0003\f\u0006\u0000\u00a8\u00a9\u0005%\u0000\u0000\u00a9\u00ae"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003\u0018\f\u0000\u00ab\u00ae\u0003"+
		" \u0010\u0000\u00ac\u00ae\u0005?\u0000\u0000\u00ad\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b3\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\'\u0000\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000"+
		"\u00b1\u00b2\u0005(\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3"+
		"\u00af\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u0015\u0001\u0000\u0000\u0000\u00b7\u00c2\u0003\u0014\n\u0000\u00b8\u00c2"+
		"\u0005@\u0000\u0000\u00b9\u00c2\u0005\u0001\u0000\u0000\u00ba\u00c2\u0005"+
		"\u0002\u0000\u0000\u00bb\u00c2\u0005A\u0000\u0000\u00bc\u00c2\u0003\u0018"+
		"\f\u0000\u00bd\u00c2\u0003\u001c\u000e\u0000\u00be\u00c2\u0003 \u0010"+
		"\u0000\u00bf\u00c2\u00038\u001c\u0000\u00c0\u00c2\u0005?\u0000\u0000\u00c1"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u0017\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\'\u0000\u0000\u00c4\u00c9"+
		"\u0003\f\u0006\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000\u00c6\u00c8\u0003"+
		"\f\u0006\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005(\u0000\u0000\u00cd\u00d1\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\'\u0000\u0000\u00cf\u00d1\u0005(\u0000\u0000"+
		"\u00d0\u00c3\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u0101\u0005%\u0000\u0000\u00d3"+
		"\u0102\u0003\f\u0006\u0000\u00d4\u00d5\u00057\u0000\u0000\u00d5\u00d6"+
		"\u0005%\u0000\u0000\u00d6\u00d7\u0003\f\u0006\u0000\u00d7\u00d8\u0005"+
		"&\u0000\u0000\u00d8\u0102\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\f"+
		"\u0006\u0000\u00da\u00db\u00053\u0000\u0000\u00db\u00dc\u0003\f\u0006"+
		"\u0000\u00dc\u0102\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\f\u0006\u0000"+
		"\u00de\u00df\u00054\u0000\u0000\u00df\u00e0\u0003\f\u0006\u0000\u00e0"+
		"\u0102\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\f\u0006\u0000\u00e2\u00e3"+
		"\u0005/\u0000\u0000\u00e3\u00e4\u0003\f\u0006\u0000\u00e4\u0102\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0003\f\u0006\u0000\u00e6\u00e7\u00050"+
		"\u0000\u0000\u00e7\u00e8\u0003\f\u0006\u0000\u00e8\u0102\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0003\f\u0006\u0000\u00ea\u00eb\u00051\u0000\u0000"+
		"\u00eb\u00ec\u0003\f\u0006\u0000\u00ec\u0102\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0003\f\u0006\u0000\u00ee\u00ef\u00052\u0000\u0000\u00ef\u00f0"+
		"\u0003\f\u0006\u0000\u00f0\u0102\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"%\u0000\u0000\u00f2\u00f3\u0003\u001a\r\u0000\u00f3\u00f4\u0005&\u0000"+
		"\u0000\u00f4\u00f5\u00056\u0000\u0000\u00f5\u00f6\u0005%\u0000\u0000\u00f6"+
		"\u00f7\u0003\u001a\r\u0000\u00f7\u00f8\u0005&\u0000\u0000\u00f8\u0102"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005%\u0000\u0000\u00fa\u00fb\u0003"+
		"\u001a\r\u0000\u00fb\u00fc\u0005&\u0000\u0000\u00fc\u00fd\u00055\u0000"+
		"\u0000\u00fd\u00fe\u0005%\u0000\u0000\u00fe\u00ff\u0003\u001a\r\u0000"+
		"\u00ff\u0100\u0005&\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101"+
		"\u00d3\u0001\u0000\u0000\u0000\u0101\u00d4\u0001\u0000\u0000\u0000\u0101"+
		"\u00d9\u0001\u0000\u0000\u0000\u0101\u00dd\u0001\u0000\u0000\u0000\u0101"+
		"\u00e1\u0001\u0000\u0000\u0000\u0101\u00e5\u0001\u0000\u0000\u0000\u0101"+
		"\u00e9\u0001\u0000\u0000\u0000\u0101\u00ed\u0001\u0000\u0000\u0000\u0101"+
		"\u00f1\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005&\u0000\u0000\u0104\u001b"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u0107\u0005"+
		"%\u0000\u0000\u0107\u0108\u0005\u001e\u0000\u0000\u0108\u0109\u0005?\u0000"+
		"\u0000\u0109\u0113\u0005&\u0000\u0000\u010a\u010b\u0005 \u0000\u0000\u010b"+
		"\u010c\u0005%\u0000\u0000\u010c\u010d\u0003\u0006\u0003\u0000\u010d\u010e"+
		"\u0005&\u0000\u0000\u010e\u010f\u0005\u001b\u0000\u0000\u010f\u0110\u0003"+
		"\"\u0011\u0000\u0110\u0111\u0005\u001c\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0105\u0001\u0000\u0000\u0000\u0112\u010a\u0001\u0000"+
		"\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0001"+
		"\u0000\u0000\u0115\u001f\u0001\u0000\u0000\u0000\u0116\u011a\u0003\u001e"+
		"\u000f\u0000\u0117\u011a\u0005?\u0000\u0000\u0118\u011a\u0003\u001c\u000e"+
		"\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u0124\u0005%\u0000\u0000\u011c\u0121\u0003\f\u0006\u0000"+
		"\u011d\u011e\u0005\u001d\u0000\u0000\u011e\u0120\u0003\f\u0006\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124"+
		"\u011c\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005&\u0000\u0000\u0127!\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0003\n\u0005\u0000\u0129\u012a\u0005\u001f"+
		"\u0000\u0000\u012a\u0138\u0001\u0000\u0000\u0000\u012b\u0138\u0003$\u0012"+
		"\u0000\u012c\u0138\u0003,\u0016\u0000\u012d\u012e\u0003 \u0010\u0000\u012e"+
		"\u012f\u0005\u001f\u0000\u0000\u012f\u0138\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u00038\u001c\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u0138"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0003\f\u0006\u0000\u0134\u0135\u0005"+
		"\u001f\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0138\u0003"+
		"4\u001a\u0000\u0137\u0128\u0001\u0000\u0000\u0000\u0137\u012b\u0001\u0000"+
		"\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012d\u0001\u0000"+
		"\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000"+
		"\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a#\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005\u0004\u0000\u0000\u013d\u013e\u0003\u001a\r\u0000"+
		"\u013e\u0142\u0003\"\u0011\u0000\u013f\u0141\u0003&\u0013\u0000\u0140"+
		"\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0003(\u0014\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0007\u0000\u0000\u0149%\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"\u0006\u0000\u0000\u014b\u014c\u0003\u001a\r\u0000\u014c\u014d\u0003\""+
		"\u0011\u0000\u014d\'\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0005\u0000"+
		"\u0000\u014f\u0150\u0003\"\u0011\u0000\u0150)\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0003\n\u0005\u0000\u0152\u0153\u0005\u001f\u0000\u0000\u0153"+
		"\u015e\u0001\u0000\u0000\u0000\u0154\u015e\u0003$\u0012\u0000\u0155\u015e"+
		"\u0003,\u0016\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158\u0005\u001f"+
		"\u0000\u0000\u0158\u015e\u0001\u0000\u0000\u0000\u0159\u015a\u00038\u001c"+
		"\u0000\u015a\u015b\u0005\u001f\u0000\u0000\u015b\u015e\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u00034\u001a\u0000\u015d\u0151\u0001\u0000\u0000\u0000"+
		"\u015d\u0154\u0001\u0000\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000"+
		"\u015d\u0156\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160+\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u000f\u0000\u0000\u0162"+
		"\u0168\u0005\u0010\u0000\u0000\u0163\u0167\u0003*\u0015\u0000\u0164\u0167"+
		"\u00030\u0018\u0000\u0165\u0167\u00032\u0019\u0000\u0166\u0163\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000"+
		"\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u017b\u0005\u0007"+
		"\u0000\u0000\u016c\u016d\u0005\u0011\u0000\u0000\u016d\u016e\u0005?\u0000"+
		"\u0000\u016e\u016f\u0005\u0012\u0000\u0000\u016f\u0175\u0003.\u0017\u0000"+
		"\u0170\u0174\u0003*\u0015\u0000\u0171\u0174\u00030\u0018\u0000\u0172\u0174"+
		"\u00032\u0019\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0005\u0007\u0000\u0000\u0179\u017b\u0001"+
		"\u0000\u0000\u0000\u017a\u0161\u0001\u0000\u0000\u0000\u017a\u016c\u0001"+
		"\u0000\u0000\u0000\u017b-\u0001\u0000\u0000\u0000\u017c\u0185\u0005?\u0000"+
		"\u0000\u017d\u0185\u0003\u0018\f\u0000\u017e\u017f\u0005%\u0000\u0000"+
		"\u017f\u0180\u0003\u0016\u000b\u0000\u0180\u0181\u0005#\u0000\u0000\u0181"+
		"\u0182\u0003\u0016\u000b\u0000\u0182\u0183\u0005&\u0000\u0000\u0183\u0185"+
		"\u0001\u0000\u0000\u0000\u0184\u017c\u0001\u0000\u0000\u0000\u0184\u017d"+
		"\u0001\u0000\u0000\u0000\u0184\u017e\u0001\u0000\u0000\u0000\u0185/\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0005\r\u0000\u0000\u0187\u018e\u0005\u001f"+
		"\u0000\u0000\u0188\u0189\u0005\r\u0000\u0000\u0189\u018a\u0005\u0004\u0000"+
		"\u0000\u018a\u018b\u0003\u001a\r\u0000\u018b\u018c\u0005\u001f\u0000\u0000"+
		"\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0186\u0001\u0000\u0000\u0000"+
		"\u018d\u0188\u0001\u0000\u0000\u0000\u018e1\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0005\u000e\u0000\u0000\u0190\u0197\u0005\u001f\u0000\u0000\u0191"+
		"\u0192\u0005\u000e\u0000\u0000\u0192\u0193\u0005\u0004\u0000\u0000\u0193"+
		"\u0194\u0003\u001a\r\u0000\u0194\u0195\u0005\u001f\u0000\u0000\u0195\u0197"+
		"\u0001\u0000\u0000\u0000\u0196\u018f\u0001\u0000\u0000\u0000\u0196\u0191"+
		"\u0001\u0000\u0000\u0000\u01973\u0001\u0000\u0000\u0000\u0198\u019b\u0005"+
		"\u0013\u0000\u0000\u0199\u019c\u0003\n\u0005\u0000\u019a\u019c\u0003\f"+
		"\u0006\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u001f"+
		"\u0000\u0000\u019e5\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u000b\u0000"+
		"\u0000\u01a0\u01a1\u0005?\u0000\u0000\u01a1\u01a2\u0005%\u0000\u0000\u01a2"+
		"\u01a3\u0003\u0006\u0003\u0000\u01a3\u01ab\u0005&\u0000\u0000\u01a4\u01a5"+
		"\u0005$\u0000\u0000\u01a5\u01a6\u0003\u001a\r\u0000\u01a6\u01a7\u0005"+
		"9\u0000\u0000\u01a7\u01a8\u0003\f\u0006\u0000\u01a8\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005\u001f\u0000\u0000\u01af7\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005?\u0000\u0000\u01b1\u01b2\u0005\"\u0000\u0000"+
		"\u01b2\u01b3\u0005\f\u0000\u0000\u01b3\u01bc\u0005%\u0000\u0000\u01b4"+
		"\u01b9\u0003\f\u0006\u0000\u01b5\u01b6\u0005\u001d\u0000\u0000\u01b6\u01b8"+
		"\u0003\f\u0006\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"&\u0000\u0000\u01bf9\u0001\u0000\u0000\u0000&<>\\d~\u0086\u008e\u0093"+
		"\u009b\u00a2\u00ad\u00b5\u00c1\u00c9\u00d0\u0101\u0112\u0119\u0121\u0124"+
		"\u0137\u0139\u0142\u0146\u015d\u015f\u0166\u0168\u0173\u0175\u017a\u0184"+
		"\u018d\u0196\u019b\u01ab\u01b9\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}