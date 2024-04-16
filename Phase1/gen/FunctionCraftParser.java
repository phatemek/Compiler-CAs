// Generated from /Users/phateme/University/T6/Compiler/Compiler-CAs/Phase1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
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
		DO=16, FOR=17, IN=18, RETURN=19, INT=20, FLOAT=21, STRING=22, BOOL=23, 
		LIST=24, FPTR=25, PUSH=26, PUTS=27, CHOP=28, CHOMP=29, MAIN=30, LEN=31, 
		UNDERSCORE=32, LBRACE=33, RBRACE=34, COMMA=35, COLON=36, SEMICOLON=37, 
		ARROW=38, QUOT=39, DOT=40, DDOT=41, INDLINE=42, LPAR=43, RPAR=44, LBRACK=45, 
		RBRACK=46, DEC=47, INC=48, MULT=49, DIV=50, PLUS=51, MINUS=52, LEQ=53, 
		GEQ=54, LES=55, GRT=56, EQL=57, NEQL=58, AND=59, OR=60, NOT=61, APPEND=62, 
		ASSIGN=63, PLUSEQ=64, MINUSEQ=65, MULTEQ=66, DIVEQ=67, REMEQ=68, IDENTIFIER=69, 
		INT_VAL=70, STRING_VAL=71, LETTER=72, DIGIT=73, SLCOMMENT=74, MLCOMMENT=75, 
		WS=76;
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
			"'do'", "'for'", "'in'", "'return'", "'int'", "'float'", "'string'", 
			"'bool'", "'list'", "'fptr'", "'push'", "'puts'", "'chop'", "'chomp'", 
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
			"DO", "FOR", "IN", "RETURN", "INT", "FLOAT", "STRING", "BOOL", "LIST", 
			"FPTR", "PUSH", "PUTS", "CHOP", "CHOMP", "MAIN", "LEN", "UNDERSCORE", 
			"LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "ARROW", "QUOT", "DOT", 
			"DDOT", "INDLINE", "LPAR", "RPAR", "LBRACK", "RBRACK", "DEC", "INC", 
			"MULT", "DIV", "PLUS", "MINUS", "LEQ", "GEQ", "LES", "GRT", "EQL", "NEQL", 
			"AND", "OR", "NOT", "APPEND", "ASSIGN", "PLUSEQ", "MINUSEQ", "MULTEQ", 
			"DIVEQ", "REMEQ", "IDENTIFIER", "INT_VAL", "STRING_VAL", "LETTER", "DIGIT", 
			"SLCOMMENT", "MLCOMMENT", "WS"
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
			setState(65);
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
			setState(67);
			match(DEF);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(LPAR);
			setState(70);
			function_args();
			setState(71);
			match(RPAR);
			setState(72);
			function_body();
			setState(73);
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
			setState(75);
			match(DEF);
			setState(76);
			match(MAIN);
			setState(77);
			match(LPAR);
			setState(78);
			match(RPAR);
			setState(79);
			function_body();
			setState(80);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(IDENTIFIER);
				setState(83);
				match(COMMA);
				setState(84);
				function_args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				optional_args();
				setState(86);
				match(COMMA);
				setState(87);
				function_args();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
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
			setState(93);
			match(LBRACK);
			setState(94);
			init();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				init();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
			setState(104);
			value();
			setState(105);
			match(ASSIGN);
			setState(106);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(108);
				append_line();
				}
				break;
			case 2:
				{
				setState(109);
				match(LPAR);
				setState(110);
				expression();
				setState(111);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(113);
				value();
				setState(114);
				match(INC);
				}
				break;
			case 4:
				{
				setState(116);
				value();
				setState(117);
				match(DEC);
				}
				break;
			case 5:
				{
				setState(119);
				match(NOT);
				setState(120);
				expression();
				}
				break;
			case 6:
				{
				setState(121);
				match(MINUS);
				setState(122);
				expression();
				}
				break;
			case 7:
				{
				setState(123);
				logical_expression();
				}
				break;
			case 8:
				{
				setState(124);
				value();
				}
				break;
			}
			setState(127);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(129);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				{
				setState(130);
				list_val();
				}
				break;
			case STRING_VAL:
				{
				setState(131);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			match(APPEND);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(135);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(136);
						list_val();
						}
						break;
					case 3:
						{
						setState(137);
						match(STRING_VAL);
						}
						break;
					case 4:
						{
						setState(138);
						expression();
						}
						break;
					}
					setState(141);
					match(APPEND);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(147);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(148);
				list_val();
				}
				break;
			case 3:
				{
				setState(149);
				match(STRING_VAL);
				}
				break;
			case 4:
				{
				setState(150);
				expression();
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(153);
				arithmatic_operator();
				setState(154);
				expression();
				setState(155);
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
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) ) {
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(162);
				match(RPAR);
				setState(163);
				expression();
				setState(164);
				match(LPAR);
				}
				break;
			case 2:
				{
				setState(166);
				list_val();
				}
				break;
			case 3:
				{
				setState(167);
				function_call();
				}
				break;
			case 4:
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
			}
			{
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				match(LBRACK);
				setState(172);
				value();
				setState(173);
				match(RBRACK);
				}
				}
				setState(177); 
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				value_from_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(INT_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(FLOAT_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(BOOL_VAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(STRING_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				list_val();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				fptr_val();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				pattern_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(LBRACK);
				{
				setState(192);
				expression();
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					expression();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(LBRACK);
				setState(203);
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
			setState(206);
			match(LPAR);
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
				expression();
				}
				break;
			case 2:
				{
				setState(208);
				match(NOT);
				setState(209);
				expression();
				}
				break;
			case 3:
				{
				setState(210);
				expression();
				setState(211);
				match(EQL);
				setState(212);
				expression();
				}
				break;
			case 4:
				{
				setState(214);
				expression();
				setState(215);
				match(NEQL);
				setState(216);
				expression();
				}
				break;
			case 5:
				{
				setState(218);
				match(LPAR);
				setState(219);
				logical_expression();
				setState(220);
				match(RPAR);
				setState(221);
				match(OR);
				setState(222);
				match(LPAR);
				setState(223);
				logical_expression();
				setState(224);
				match(RPAR);
				}
				break;
			case 6:
				{
				setState(226);
				match(LPAR);
				setState(227);
				logical_expression();
				setState(228);
				match(RPAR);
				setState(229);
				match(AND);
				setState(230);
				match(LPAR);
				setState(231);
				logical_expression();
				setState(232);
				match(RPAR);
				}
				break;
			}
			setState(236);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(METHOD);
				setState(239);
				match(LPAR);
				setState(240);
				match(COLON);
				setState(241);
				match(IDENTIFIER);
				setState(242);
				match(RPAR);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(ARROW);
				setState(244);
				match(LPAR);
				setState(245);
				function_args();
				setState(246);
				match(RPAR);
				setState(247);
				function_body();
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
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3154116608L) != 0)) ) {
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
			case PUTS:
			case CHOP:
			case CHOMP:
			case LEN:
				{
				setState(253);
				primitive_function();
				}
				break;
			case IDENTIFIER:
				{
				setState(254);
				match(IDENTIFIER);
				}
				break;
			case METHOD:
			case ARROW:
				{
				setState(255);
				fptr_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			match(LPAR);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(259);
				expression();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(261);
					expression();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(269);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(271);
						init();
						setState(272);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(274);
						if_scope();
						}
						break;
					case 3:
						{
						setState(275);
						for_scope();
						}
						break;
					case 4:
						{
						setState(276);
						function_call();
						setState(277);
						match(SEMICOLON);
						}
						break;
					case 5:
						{
						setState(279);
						pattern_call();
						setState(280);
						match(SEMICOLON);
						}
						break;
					case 6:
						{
						setState(282);
						expression();
						setState(283);
						match(SEMICOLON);
						}
						break;
					case 7:
						{
						setState(285);
						return_line();
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(291);
			match(IF);
			setState(292);
			logical_expression();
			setState(293);
			function_body();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(294);
				elseif_scope();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(300);
				else_scope();
				}
			}

			setState(303);
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
			setState(305);
			match(ELSEIF);
			setState(306);
			logical_expression();
			setState(307);
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
			setState(309);
			match(ELSE);
			setState(310);
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
			setState(324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(312);
						init();
						setState(313);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(315);
						if_scope();
						}
						break;
					case 3:
						{
						setState(316);
						for_scope();
						}
						break;
					case 4:
						{
						setState(317);
						function_call();
						setState(318);
						match(SEMICOLON);
						}
						break;
					case 5:
						{
						setState(320);
						pattern_call();
						setState(321);
						match(SEMICOLON);
						}
						break;
					case 6:
						{
						setState(323);
						return_line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(LOOP);
				setState(329);
				match(DO);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53054590870550L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) {
					{
					setState(333);
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
						setState(330);
						loop_body();
						}
						break;
					case NEXT:
						{
						setState(331);
						next();
						}
						break;
					case BREAK:
						{
						setState(332);
						break_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(END);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(FOR);
				setState(340);
				match(IDENTIFIER);
				setState(341);
				match(IN);
				setState(342);
				for_range();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53054590870550L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) {
					{
					setState(346);
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
						setState(343);
						loop_body();
						}
						break;
					case NEXT:
						{
						setState(344);
						next();
						}
						break;
					case BREAK:
						{
						setState(345);
						break_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
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
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				list_val();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(LPAR);
				setState(358);
				value();
				setState(359);
				match(DDOT);
				setState(360);
				value();
				setState(361);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(NEXT);
				setState(366);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(NEXT);
				setState(368);
				match(IF);
				setState(369);
				logical_expression();
				setState(370);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(BREAK);
				setState(375);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(BREAK);
				setState(377);
				match(IF);
				setState(378);
				logical_expression();
				setState(379);
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
			setState(383);
			match(RETURN);
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(384);
				init();
				}
				break;
			case 2:
				{
				setState(385);
				expression();
				}
				break;
			}
			setState(388);
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
			setState(390);
			match(PATTERN);
			setState(391);
			match(IDENTIFIER);
			setState(392);
			match(LPAR);
			setState(393);
			function_args();
			setState(394);
			match(RPAR);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDLINE) {
				{
				{
				setState(395);
				match(INDLINE);
				setState(396);
				logical_expression();
				setState(397);
				match(ASSIGN);
				setState(398);
				expression();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
			setState(407);
			match(IDENTIFIER);
			setState(408);
			match(DOT);
			setState(409);
			match(MATCH);
			setState(410);
			match(LPAR);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(411);
				expression();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(412);
					match(COMMA);
					setState(413);
					expression();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(421);
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
		"\u0004\u0001L\u01a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b\u0000"+
		"\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\\\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004"+
		"\n\u0004\f\u0004e\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0085\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\u0007"+
		"\u0005\u0007\u008f\b\u0007\n\u0007\f\u0007\u0092\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0098\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u009f\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00aa\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u00b0\b\n\u000b\n\f\n\u00b1\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00be\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00c4\b\f\n\f\f\f\u00c7\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00cd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00fa\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0101\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0107\b\u0010\n\u0010\f\u0010\u010a\t\u0010\u0003\u0010\u010c"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u011f\b\u0011\n\u0011\f\u0011\u0122\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0128\b\u0012\n\u0012\f\u0012\u012b"+
		"\t\u0012\u0001\u0012\u0003\u0012\u012e\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u0145\b\u0015\u000b\u0015\f\u0015\u0146\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u014e"+
		"\b\u0016\n\u0016\f\u0016\u0151\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u015b\b\u0016\n\u0016\f\u0016\u015e\t\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0162\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016c\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0175\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017e\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0183\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0191"+
		"\b\u001b\n\u001b\f\u001b\u0194\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u019f\b\u001c\n\u001c\f\u001c\u01a2\t\u001c\u0003\u001c\u01a4"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468\u0000\u0002\u0001\u000014\u0002\u0000\u001a\u001d\u001f"+
		"\u001f\u01d8\u0000>\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000"+
		"\u0004K\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\b]\u0001"+
		"\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000"+
		"\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000"+
		"\u0012\u00a0\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000\u0000"+
		"\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00cc\u0001\u0000\u0000\u0000"+
		"\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000\u0000\u0000"+
		"\u001e\u00fb\u0001\u0000\u0000\u0000 \u0100\u0001\u0000\u0000\u0000\""+
		"\u0120\u0001\u0000\u0000\u0000$\u0123\u0001\u0000\u0000\u0000&\u0131\u0001"+
		"\u0000\u0000\u0000(\u0135\u0001\u0000\u0000\u0000*\u0144\u0001\u0000\u0000"+
		"\u0000,\u0161\u0001\u0000\u0000\u0000.\u016b\u0001\u0000\u0000\u00000"+
		"\u0174\u0001\u0000\u0000\u00002\u017d\u0001\u0000\u0000\u00004\u017f\u0001"+
		"\u0000\u0000\u00006\u0186\u0001\u0000\u0000\u00008\u0197\u0001\u0000\u0000"+
		"\u0000:=\u0003\u0002\u0001\u0000;=\u00036\u001b\u0000<:\u0001\u0000\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AB\u0003\u0004\u0002\u0000B\u0001\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0003\u0000\u0000DE\u0005E\u0000\u0000EF\u0005+\u0000\u0000"+
		"FG\u0003\u0006\u0003\u0000GH\u0005,\u0000\u0000HI\u0003\"\u0011\u0000"+
		"IJ\u0005\u0007\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\u0003"+
		"\u0000\u0000LM\u0005\u001e\u0000\u0000MN\u0005+\u0000\u0000NO\u0005,\u0000"+
		"\u0000OP\u0003\"\u0011\u0000PQ\u0005\u0007\u0000\u0000Q\u0005\u0001\u0000"+
		"\u0000\u0000RS\u0005E\u0000\u0000ST\u0005#\u0000\u0000T\\\u0003\u0006"+
		"\u0003\u0000UV\u0003\b\u0004\u0000VW\u0005#\u0000\u0000WX\u0003\u0006"+
		"\u0003\u0000X\\\u0001\u0000\u0000\u0000Y\\\u0005E\u0000\u0000Z\\\u0003"+
		"\b\u0004\u0000[R\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000"+
		"\u0000]^\u0005-\u0000\u0000^c\u0003\n\u0005\u0000_`\u0005#\u0000\u0000"+
		"`b\u0003\n\u0005\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0005.\u0000\u0000g\t\u0001\u0000\u0000"+
		"\u0000hi\u0003\u0016\u000b\u0000ij\u0005?\u0000\u0000jk\u0003\f\u0006"+
		"\u0000k\u000b\u0001\u0000\u0000\u0000l~\u0003\u000e\u0007\u0000mn\u0005"+
		"+\u0000\u0000no\u0003\f\u0006\u0000op\u0005,\u0000\u0000p~\u0001\u0000"+
		"\u0000\u0000qr\u0003\u0016\u000b\u0000rs\u00050\u0000\u0000s~\u0001\u0000"+
		"\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0005/\u0000\u0000v~\u0001\u0000"+
		"\u0000\u0000wx\u0005=\u0000\u0000x~\u0003\f\u0006\u0000yz\u00054\u0000"+
		"\u0000z~\u0003\f\u0006\u0000{~\u0003\u001a\r\u0000|~\u0003\u0016\u000b"+
		"\u0000}l\u0001\u0000\u0000\u0000}m\u0001\u0000\u0000\u0000}q\u0001\u0000"+
		"\u0000\u0000}t\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}y\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080"+
		"\r\u0001\u0000\u0000\u0000\u0081\u0085\u0005E\u0000\u0000\u0082\u0085"+
		"\u0003\u0018\f\u0000\u0083\u0085\u0005G\u0000\u0000\u0084\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0090\u0005"+
		">\u0000\u0000\u0087\u008c\u0005E\u0000\u0000\u0088\u008c\u0003\u0018\f"+
		"\u0000\u0089\u008c\u0005G\u0000\u0000\u008a\u008c\u0003\f\u0006\u0000"+
		"\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0005>\u0000\u0000\u008e"+
		"\u008b\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0097\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0098\u0005E\u0000\u0000\u0094\u0098\u0003\u0018\f\u0000\u0095\u0098"+
		"\u0005G\u0000\u0000\u0096\u0098\u0003\f\u0006\u0000\u0097\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u000f\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b\u0003\f"+
		"\u0006\u0000\u009b\u009c\u0003\u0010\b\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005,\u0000\u0000\u00a3\u00a4\u0003\f\u0006\u0000"+
		"\u00a4\u00a5\u0005+\u0000\u0000\u00a5\u00aa\u0001\u0000\u0000\u0000\u00a6"+
		"\u00aa\u0003\u0018\f\u0000\u00a7\u00aa\u0003 \u0010\u0000\u00a8\u00aa"+
		"\u0005E\u0000\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00af\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"-\u0000\u0000\u00ac\u00ad\u0003\u0016\u000b\u0000\u00ad\u00ae\u0005.\u0000"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0015\u0001\u0000\u0000"+
		"\u0000\u00b3\u00be\u0003\u0014\n\u0000\u00b4\u00be\u0005F\u0000\u0000"+
		"\u00b5\u00be\u0005\u0001\u0000\u0000\u00b6\u00be\u0005\u0002\u0000\u0000"+
		"\u00b7\u00be\u0005G\u0000\u0000\u00b8\u00be\u0003\u0018\f\u0000\u00b9"+
		"\u00be\u0003\u001c\u000e\u0000\u00ba\u00be\u0003 \u0010\u0000\u00bb\u00be"+
		"\u00038\u001c\u0000\u00bc\u00be\u0005E\u0000\u0000\u00bd\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0\u00c5\u0003\f\u0006"+
		"\u0000\u00c1\u00c2\u0005#\u0000\u0000\u00c2\u00c4\u0003\f\u0006\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005.\u0000\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005-\u0000\u0000\u00cb\u00cd\u0005.\u0000\u0000\u00cc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u0019\u0001"+
		"\u0000\u0000\u0000\u00ce\u00ea\u0005+\u0000\u0000\u00cf\u00eb\u0003\f"+
		"\u0006\u0000\u00d0\u00d1\u0005=\u0000\u0000\u00d1\u00eb\u0003\f\u0006"+
		"\u0000\u00d2\u00d3\u0003\f\u0006\u0000\u00d3\u00d4\u00059\u0000\u0000"+
		"\u00d4\u00d5\u0003\f\u0006\u0000\u00d5\u00eb\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0003\f\u0006\u0000\u00d7\u00d8\u0005:\u0000\u0000\u00d8\u00d9"+
		"\u0003\f\u0006\u0000\u00d9\u00eb\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"+\u0000\u0000\u00db\u00dc\u0003\u001a\r\u0000\u00dc\u00dd\u0005,\u0000"+
		"\u0000\u00dd\u00de\u0005<\u0000\u0000\u00de\u00df\u0005+\u0000\u0000\u00df"+
		"\u00e0\u0003\u001a\r\u0000\u00e0\u00e1\u0005,\u0000\u0000\u00e1\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e4\u0003"+
		"\u001a\r\u0000\u00e4\u00e5\u0005,\u0000\u0000\u00e5\u00e6\u0005;\u0000"+
		"\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00e8\u0003\u001a\r\u0000"+
		"\u00e8\u00e9\u0005,\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ea\u00d0\u0001\u0000\u0000\u0000\u00ea"+
		"\u00d2\u0001\u0000\u0000\u0000\u00ea\u00d6\u0001\u0000\u0000\u0000\u00ea"+
		"\u00da\u0001\u0000\u0000\u0000\u00ea\u00e2\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005,\u0000\u0000\u00ed\u001b"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f0\u0005"+
		"+\u0000\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u00f2\u0005E\u0000"+
		"\u0000\u00f2\u00fa\u0005,\u0000\u0000\u00f3\u00f4\u0005&\u0000\u0000\u00f4"+
		"\u00f5\u0005+\u0000\u0000\u00f5\u00f6\u0003\u0006\u0003\u0000\u00f6\u00f7"+
		"\u0005,\u0000\u0000\u00f7\u00f8\u0003\"\u0011\u0000\u00f8\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001"+
		"\u0000\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007"+
		"\u0001\u0000\u0000\u00fc\u001f\u0001\u0000\u0000\u0000\u00fd\u0101\u0003"+
		"\u001e\u000f\u0000\u00fe\u0101\u0005E\u0000\u0000\u00ff\u0101\u0003\u001c"+
		"\u000e\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u010b\u0005+\u0000\u0000\u0103\u0108\u0003\f\u0006"+
		"\u0000\u0104\u0105\u0005#\u0000\u0000\u0105\u0107\u0003\f\u0006\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005,\u0000\u0000\u010e"+
		"!\u0001\u0000\u0000\u0000\u010f\u0110\u0003\n\u0005\u0000\u0110\u0111"+
		"\u0005%\u0000\u0000\u0111\u011f\u0001\u0000\u0000\u0000\u0112\u011f\u0003"+
		"$\u0012\u0000\u0113\u011f\u0003,\u0016\u0000\u0114\u0115\u0003 \u0010"+
		"\u0000\u0115\u0116\u0005%\u0000\u0000\u0116\u011f\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u00038\u001c\u0000\u0118\u0119\u0005%\u0000\u0000\u0119\u011f"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0003\f\u0006\u0000\u011b\u011c\u0005"+
		"%\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011f\u00034\u001a"+
		"\u0000\u011e\u010f\u0001\u0000\u0000\u0000\u011e\u0112\u0001\u0000\u0000"+
		"\u0000\u011e\u0113\u0001\u0000\u0000\u0000\u011e\u0114\u0001\u0000\u0000"+
		"\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121#\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\u0004\u0000\u0000\u0124\u0125\u0003\u001a\r\u0000\u0125"+
		"\u0129\u0003\"\u0011\u0000\u0126\u0128\u0003&\u0013\u0000\u0127\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012e"+
		"\u0003(\u0014\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0007\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0006"+
		"\u0000\u0000\u0132\u0133\u0003\u001a\r\u0000\u0133\u0134\u0003\"\u0011"+
		"\u0000\u0134\'\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0005\u0000\u0000"+
		"\u0136\u0137\u0003\"\u0011\u0000\u0137)\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0003\n\u0005\u0000\u0139\u013a\u0005%\u0000\u0000\u013a\u0145"+
		"\u0001\u0000\u0000\u0000\u013b\u0145\u0003$\u0012\u0000\u013c\u0145\u0003"+
		",\u0016\u0000\u013d\u013e\u0003 \u0010\u0000\u013e\u013f\u0005%\u0000"+
		"\u0000\u013f\u0145\u0001\u0000\u0000\u0000\u0140\u0141\u00038\u001c\u0000"+
		"\u0141\u0142\u0005%\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143"+
		"\u0145\u00034\u001a\u0000\u0144\u0138\u0001\u0000\u0000\u0000\u0144\u013b"+
		"\u0001\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000\u0000\u0144\u013d"+
		"\u0001\u0000\u0000\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147+\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\u000f\u0000\u0000\u0149\u014f\u0005"+
		"\u0010\u0000\u0000\u014a\u014e\u0003*\u0015\u0000\u014b\u014e\u00030\u0018"+
		"\u0000\u014c\u014e\u00032\u0019\u0000\u014d\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0162\u0005\u0007\u0000\u0000"+
		"\u0153\u0154\u0005\u0011\u0000\u0000\u0154\u0155\u0005E\u0000\u0000\u0155"+
		"\u0156\u0005\u0012\u0000\u0000\u0156\u015c\u0003.\u0017\u0000\u0157\u015b"+
		"\u0003*\u0015\u0000\u0158\u015b\u00030\u0018\u0000\u0159\u015b\u00032"+
		"\u0019\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\u0007\u0000\u0000\u0160\u0162\u0001\u0000"+
		"\u0000\u0000\u0161\u0148\u0001\u0000\u0000\u0000\u0161\u0153\u0001\u0000"+
		"\u0000\u0000\u0162-\u0001\u0000\u0000\u0000\u0163\u016c\u0005E\u0000\u0000"+
		"\u0164\u016c\u0003\u0018\f\u0000\u0165\u0166\u0005+\u0000\u0000\u0166"+
		"\u0167\u0003\u0016\u000b\u0000\u0167\u0168\u0005)\u0000\u0000\u0168\u0169"+
		"\u0003\u0016\u000b\u0000\u0169\u016a\u0005,\u0000\u0000\u016a\u016c\u0001"+
		"\u0000\u0000\u0000\u016b\u0163\u0001\u0000\u0000\u0000\u016b\u0164\u0001"+
		"\u0000\u0000\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016c/\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0005\r\u0000\u0000\u016e\u0175\u0005%\u0000"+
		"\u0000\u016f\u0170\u0005\r\u0000\u0000\u0170\u0171\u0005\u0004\u0000\u0000"+
		"\u0171\u0172\u0003\u001a\r\u0000\u0172\u0173\u0005%\u0000\u0000\u0173"+
		"\u0175\u0001\u0000\u0000\u0000\u0174\u016d\u0001\u0000\u0000\u0000\u0174"+
		"\u016f\u0001\u0000\u0000\u0000\u01751\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005\u000e\u0000\u0000\u0177\u017e\u0005%\u0000\u0000\u0178\u0179\u0005"+
		"\u000e\u0000\u0000\u0179\u017a\u0005\u0004\u0000\u0000\u017a\u017b\u0003"+
		"\u001a\r\u0000\u017b\u017c\u0005%\u0000\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u0176\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000"+
		"\u0000\u0000\u017e3\u0001\u0000\u0000\u0000\u017f\u0182\u0005\u0013\u0000"+
		"\u0000\u0180\u0183\u0003\n\u0005\u0000\u0181\u0183\u0003\f\u0006\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0005%\u0000\u0000\u0185"+
		"5\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u000b\u0000\u0000\u0187\u0188"+
		"\u0005E\u0000\u0000\u0188\u0189\u0005+\u0000\u0000\u0189\u018a\u0003\u0006"+
		"\u0003\u0000\u018a\u0192\u0005,\u0000\u0000\u018b\u018c\u0005*\u0000\u0000"+
		"\u018c\u018d\u0003\u001a\r\u0000\u018d\u018e\u0005?\u0000\u0000\u018e"+
		"\u018f\u0003\f\u0006\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018b"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0005%\u0000\u0000\u01967\u0001\u0000\u0000\u0000\u0197\u0198\u0005E"+
		"\u0000\u0000\u0198\u0199\u0005(\u0000\u0000\u0199\u019a\u0005\f\u0000"+
		"\u0000\u019a\u01a3\u0005+\u0000\u0000\u019b\u01a0\u0003\f\u0006\u0000"+
		"\u019c\u019d\u0005#\u0000\u0000\u019d\u019f\u0003\f\u0006\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3"+
		"\u019b\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005,\u0000\u0000\u01a69\u0001"+
		"\u0000\u0000\u0000&<>[c}\u0084\u008b\u0090\u0097\u009e\u00a9\u00b1\u00bd"+
		"\u00c5\u00cc\u00ea\u00f9\u0100\u0108\u010b\u011e\u0120\u0129\u012d\u0144"+
		"\u0146\u014d\u014f\u015a\u015c\u0161\u016b\u0174\u017d\u0182\u0192\u01a0"+
		"\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}