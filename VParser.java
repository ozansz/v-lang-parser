// Generated from V.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRING_LIT=12, NATURAL_NUBER_LIT=13, NUMBER_LIT=14, 
		HEX_NUMBER_LIT=15, TERMINATOR=16, SEPERATOR=17, DOUBLEQUOTE=18, BACKSLASH=19, 
		SINGLE_DOT=20, ASSIGNOP=21, LBRACE=22, RBRACE=23, LPAREN=24, RPAREN=25, 
		INT=26, REAL=27, ASM=28, ENDASM=29, VAR=30, FUNC=31, ENDFUNC=32, RETURN=33, 
		TO=34, BY=35, AND=36, MOD=37, DIV=38, IF=39, THEN=40, ELSE=41, ENDIF=42, 
		ENDFOR=43, OR=44, DO=45, PRINT=46, READ=47, WHILE=48, ENDWHILE=49, FOR=50, 
		NOT=51, ID=52, ALPA_NUM=53, DIGIT=54, LETTER=55, LINE_COMMENT=56, WS=57;
	public static final int
		RULE_program = 0, RULE_func_list = 1, RULE_func_decl = 2, RULE_func_param_list = 3, 
		RULE_func_body = 4, RULE_decl_list = 5, RULE_decl = 6, RULE_variable_decl_list = 7, 
		RULE_variable_param_list = 8, RULE_variable_param = 9, RULE_variable_decl = 10, 
		RULE_variable_type_decl = 11, RULE_variable_type = 12, RULE_vector_extension = 13, 
		RULE_vector_extension_decl = 14, RULE_vector_extension_var = 15, RULE_vector_dimension = 16, 
		RULE_stmt_list = 17, RULE_stmt = 18, RULE_assignment_stmt = 19, RULE_variable = 20, 
		RULE_logical_expression = 21, RULE_expression = 22, RULE_term = 23, RULE_factor = 24, 
		RULE_expression_list = 25, RULE_print_stmt = 26, RULE_print_argument = 27, 
		RULE_read_stmt = 28, RULE_read_argument = 29, RULE_return_stmt = 30, RULE_for_stmt = 31, 
		RULE_if_stmt = 32, RULE_while_stmt = 33, RULE_function_call = 34, RULE_inline_assembly_stmt = 35, 
		RULE_assembly_directive = 36, RULE_assembly_instruction = 37, RULE_assembly_instruction_param = 38, 
		RULE_assembly_redirect = 39, RULE_riscv_register = 40, RULE_basic_type = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_list", "func_decl", "func_param_list", "func_body", 
			"decl_list", "decl", "variable_decl_list", "variable_param_list", "variable_param", 
			"variable_decl", "variable_type_decl", "variable_type", "vector_extension", 
			"vector_extension_decl", "vector_extension_var", "vector_dimension", 
			"stmt_list", "stmt", "assignment_stmt", "variable", "logical_expression", 
			"expression", "term", "factor", "expression_list", "print_stmt", "print_argument", 
			"read_stmt", "read_argument", "return_stmt", "for_stmt", "if_stmt", "while_stmt", 
			"function_call", "inline_assembly_stmt", "assembly_directive", "assembly_instruction", 
			"assembly_instruction_param", "assembly_redirect", "riscv_register", 
			"basic_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", 
			"'*'", "'/'", null, null, null, null, "';'", "','", "'\"'", "'\\'", "'.'", 
			"':='", "'['", "']'", "'('", "')'", "'int'", "'real'", "'_asm'", "'_endasm'", 
			"'var'", "'func'", "'endfunc'", "'return'", "'to'", "'by'", "'and'", 
			"'mod'", "'div'", "'if'", "'then'", "'else'", "'endif'", "'endfor'", 
			"'or'", "'do'", "'print'", "'read'", "'while'", "'endwhile'", "'for'", 
			"'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING_LIT", "NATURAL_NUBER_LIT", "NUMBER_LIT", "HEX_NUMBER_LIT", "TERMINATOR", 
			"SEPERATOR", "DOUBLEQUOTE", "BACKSLASH", "SINGLE_DOT", "ASSIGNOP", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "INT", "REAL", "ASM", "ENDASM", "VAR", 
			"FUNC", "ENDFUNC", "RETURN", "TO", "BY", "AND", "MOD", "DIV", "IF", "THEN", 
			"ELSE", "ENDIF", "ENDFOR", "OR", "DO", "PRINT", "READ", "WHILE", "ENDWHILE", 
			"FOR", "NOT", "ID", "ALPA_NUM", "DIGIT", "LETTER", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "V.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			decl_list();
			setState(85);
			func_list();
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

	public static class Func_listContext extends ParserRuleContext {
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public Func_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFunc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFunc_list(this);
		}
	}

	public final Func_listContext func_list() throws RecognitionException {
		Func_listContext _localctx = new Func_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				func_decl();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==REAL );
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

	public static class Func_declContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(VParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Func_param_listContext func_param_list() {
			return getRuleContext(Func_param_listContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode ENDFUNC() { return getToken(VParser.ENDFUNC, 0); }
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			basic_type();
			setState(93);
			match(FUNC);
			setState(94);
			match(ID);
			setState(95);
			func_param_list();
			setState(96);
			func_body();
			setState(97);
			match(ENDFUNC);
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

	public static class Func_param_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VParser.RPAREN, 0); }
		public List<Variable_param_listContext> variable_param_list() {
			return getRuleContexts(Variable_param_listContext.class);
		}
		public Variable_param_listContext variable_param_list(int i) {
			return getRuleContext(Variable_param_listContext.class,i);
		}
		public Func_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFunc_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFunc_param_list(this);
		}
	}

	public final Func_param_listContext func_param_list() throws RecognitionException {
		Func_param_listContext _localctx = new Func_param_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(100);
				variable_param_list();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(RPAREN);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			decl_list();
			setState(109);
			stmt_list();
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

	public static class Decl_listContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(VParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(VParser.TERMINATOR, i);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(111);
				decl();
				setState(112);
				match(TERMINATOR);
				}
				}
				setState(118);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VParser.VAR, 0); }
		public Variable_decl_listContext variable_decl_list() {
			return getRuleContext(Variable_decl_listContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VAR);
			setState(120);
			variable_decl_list();
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

	public static class Variable_decl_listContext extends ParserRuleContext {
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Variable_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_decl_list(this);
		}
	}

	public final Variable_decl_listContext variable_decl_list() throws RecognitionException {
		Variable_decl_listContext _localctx = new Variable_decl_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			variable_decl();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(123);
				match(SEPERATOR);
				setState(124);
				variable_decl();
				}
				}
				setState(129);
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

	public static class Variable_param_listContext extends ParserRuleContext {
		public List<Variable_paramContext> variable_param() {
			return getRuleContexts(Variable_paramContext.class);
		}
		public Variable_paramContext variable_param(int i) {
			return getRuleContext(Variable_paramContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Variable_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_param_list(this);
		}
	}

	public final Variable_param_listContext variable_param_list() throws RecognitionException {
		Variable_param_listContext _localctx = new Variable_param_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			variable_param();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(131);
				match(SEPERATOR);
				setState(132);
				variable_param();
				}
				}
				setState(137);
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

	public static class Variable_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Variable_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_param(this);
		}
	}

	public final Variable_paramContext variable_param() throws RecognitionException {
		Variable_paramContext _localctx = new Variable_paramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(T__0);
			setState(140);
			variable_type();
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

	public static class Variable_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Variable_type_declContext variable_type_decl() {
			return getRuleContext(Variable_type_declContext.class,0);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_decl(this);
		}
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(T__0);
			setState(144);
			variable_type_decl();
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

	public static class Variable_type_declContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Vector_extension_declContext vector_extension_decl() {
			return getRuleContext(Vector_extension_declContext.class,0);
		}
		public Variable_type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_type_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_type_decl(this);
		}
	}

	public final Variable_type_declContext variable_type_decl() throws RecognitionException {
		Variable_type_declContext _localctx = new Variable_type_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_type_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			basic_type();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(147);
				vector_extension_decl();
				}
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

	public static class Variable_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Vector_extensionContext vector_extension() {
			return getRuleContext(Vector_extensionContext.class,0);
		}
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable_type(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			basic_type();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(151);
				vector_extension();
				}
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

	public static class Vector_extensionContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(VParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(VParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(VParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(VParser.RBRACE, i);
		}
		public List<Vector_dimensionContext> vector_dimension() {
			return getRuleContexts(Vector_dimensionContext.class);
		}
		public Vector_dimensionContext vector_dimension(int i) {
			return getRuleContext(Vector_dimensionContext.class,i);
		}
		public Vector_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVector_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVector_extension(this);
		}
	}

	public final Vector_extensionContext vector_extension() throws RecognitionException {
		Vector_extensionContext _localctx = new Vector_extensionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vector_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				match(LBRACE);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_NUBER_LIT) {
					{
					setState(155);
					vector_dimension();
					}
				}

				setState(158);
				match(RBRACE);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACE );
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

	public static class Vector_extension_declContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(VParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(VParser.LBRACE, i);
		}
		public List<Vector_dimensionContext> vector_dimension() {
			return getRuleContexts(Vector_dimensionContext.class);
		}
		public Vector_dimensionContext vector_dimension(int i) {
			return getRuleContext(Vector_dimensionContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(VParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(VParser.RBRACE, i);
		}
		public Vector_extension_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_extension_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVector_extension_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVector_extension_decl(this);
		}
	}

	public final Vector_extension_declContext vector_extension_decl() throws RecognitionException {
		Vector_extension_declContext _localctx = new Vector_extension_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vector_extension_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				match(LBRACE);
				setState(164);
				vector_dimension();
				setState(165);
				match(RBRACE);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACE );
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

	public static class Vector_extension_varContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(VParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(VParser.LBRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(VParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(VParser.RBRACE, i);
		}
		public Vector_extension_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_extension_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVector_extension_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVector_extension_var(this);
		}
	}

	public final Vector_extension_varContext vector_extension_var() throws RecognitionException {
		Vector_extension_varContext _localctx = new Vector_extension_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vector_extension_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					match(LBRACE);
					setState(172);
					expression(0);
					setState(173);
					match(RBRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Vector_dimensionContext extends ParserRuleContext {
		public TerminalNode NATURAL_NUBER_LIT() { return getToken(VParser.NATURAL_NUBER_LIT, 0); }
		public Vector_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVector_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVector_dimension(this);
		}
	}

	public final Vector_dimensionContext vector_dimension() throws RecognitionException {
		Vector_dimensionContext _localctx = new Vector_dimensionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vector_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NATURAL_NUBER_LIT);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(VParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(VParser.TERMINATOR, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				stmt();
				setState(182);
				match(TERMINATOR);
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASM) | (1L << RETURN) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Inline_assembly_stmtContext inline_assembly_stmt() {
			return getRuleContext(Inline_assembly_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				return_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				print_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				read_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				while_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				inline_assembly_stmt();
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNOP() { return getToken(VParser.ASSIGNOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitAssignment_stmt(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			variable();
			setState(200);
			match(ASSIGNOP);
			setState(201);
			expression(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Vector_extension_varContext vector_extension_var() {
			return getRuleContext(Vector_extension_varContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(205);
				vector_extension_var();
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(VParser.AND, 0); }
		public TerminalNode OR() { return getToken(VParser.OR, 0); }
		public TerminalNode NOT() { return getToken(VParser.NOT, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitLogical_expression(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logical_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(209);
				expression(0);
				}
				break;
			case 2:
				{
				setState(210);
				expression(0);
				setState(211);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				expression(0);
				}
				break;
			case 3:
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				logical_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
					setState(218);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(219);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(220);
					logical_expression(3);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(231);
					term(0);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MOD() { return getToken(VParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(VParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(240);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(241);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << MOD) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(242);
					factor();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode NUMBER_LIT() { return getToken(VParser.NUMBER_LIT, 0); }
		public TerminalNode NATURAL_NUBER_LIT() { return getToken(VParser.NATURAL_NUBER_LIT, 0); }
		public TerminalNode LPAREN() { return getToken(VParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(NUMBER_LIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(NATURAL_NUBER_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(LPAREN);
				setState(253);
				expression(0);
				setState(254);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(T__8);
				setState(257);
				expression(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expression(0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(261);
				match(SEPERATOR);
				setState(262);
				expression(0);
				}
				}
				setState(267);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(VParser.PRINT, 0); }
		public List<Print_argumentContext> print_argument() {
			return getRuleContexts(Print_argumentContext.class);
		}
		public Print_argumentContext print_argument(int i) {
			return getRuleContext(Print_argumentContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(PRINT);
			setState(269);
			print_argument();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(270);
				match(SEPERATOR);
				setState(271);
				print_argument();
				}
				}
				setState(276);
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

	public static class Print_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(VParser.STRING_LIT, 0); }
		public Print_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterPrint_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitPrint_argument(this);
		}
	}

	public final Print_argumentContext print_argument() throws RecognitionException {
		Print_argumentContext _localctx = new Print_argumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print_argument);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case NATURAL_NUBER_LIT:
			case NUMBER_LIT:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				expression(0);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(STRING_LIT);
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

	public static class Read_stmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(VParser.READ, 0); }
		public List<Read_argumentContext> read_argument() {
			return getRuleContexts(Read_argumentContext.class);
		}
		public Read_argumentContext read_argument(int i) {
			return getRuleContext(Read_argumentContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_read_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(READ);
			setState(282);
			read_argument();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPERATOR) {
				{
				{
				setState(283);
				match(SEPERATOR);
				setState(284);
				read_argument();
				}
				}
				setState(289);
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

	public static class Read_argumentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Read_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterRead_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitRead_argument(this);
		}
	}

	public final Read_argumentContext read_argument() throws RecognitionException {
		Read_argumentContext _localctx = new Read_argumentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_read_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			variable();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(RETURN);
			setState(293);
			expression(0);
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNOP() { return getToken(VParser.ASSIGNOP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(VParser.TO, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(VParser.ENDFOR, 0); }
		public TerminalNode BY() { return getToken(VParser.BY, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(FOR);
			setState(296);
			variable();
			setState(297);
			match(ASSIGNOP);
			setState(298);
			expression(0);
			setState(299);
			match(TO);
			setState(300);
			expression(0);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(301);
				match(BY);
				setState(302);
				expression(0);
				}
			}

			setState(305);
			stmt_list();
			setState(306);
			match(ENDFOR);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VParser.THEN, 0); }
		public List<Stmt_listContext> stmt_list() {
			return getRuleContexts(Stmt_listContext.class);
		}
		public Stmt_listContext stmt_list(int i) {
			return getRuleContext(Stmt_listContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(VParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(VParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IF);
			setState(309);
			logical_expression(0);
			setState(310);
			match(THEN);
			setState(311);
			stmt_list();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(312);
				match(ELSE);
				setState(313);
				stmt_list();
				}
			}

			setState(316);
			match(ENDIF);
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VParser.WHILE, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(VParser.DO, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(VParser.ENDWHILE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			logical_expression(0);
			setState(320);
			match(DO);
			setState(321);
			stmt_list();
			setState(322);
			match(ENDWHILE);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(VParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(325);
			match(LPAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << NATURAL_NUBER_LIT) | (1L << NUMBER_LIT) | (1L << LPAREN) | (1L << ID))) != 0)) {
				{
				setState(326);
				expression_list();
				}
			}

			setState(329);
			match(RPAREN);
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

	public static class Inline_assembly_stmtContext extends ParserRuleContext {
		public TerminalNode ASM() { return getToken(VParser.ASM, 0); }
		public TerminalNode ENDASM() { return getToken(VParser.ENDASM, 0); }
		public List<Assembly_directiveContext> assembly_directive() {
			return getRuleContexts(Assembly_directiveContext.class);
		}
		public Assembly_directiveContext assembly_directive(int i) {
			return getRuleContext(Assembly_directiveContext.class,i);
		}
		public Inline_assembly_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_assembly_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterInline_assembly_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitInline_assembly_stmt(this);
		}
	}

	public final Inline_assembly_stmtContext inline_assembly_stmt() throws RecognitionException {
		Inline_assembly_stmtContext _localctx = new Inline_assembly_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inline_assembly_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ASM);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				assembly_directive();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(337);
			match(ENDASM);
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

	public static class Assembly_directiveContext extends ParserRuleContext {
		public Assembly_instructionContext assembly_instruction() {
			return getRuleContext(Assembly_instructionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(VParser.TERMINATOR, 0); }
		public List<Assembly_instruction_paramContext> assembly_instruction_param() {
			return getRuleContexts(Assembly_instruction_paramContext.class);
		}
		public Assembly_instruction_paramContext assembly_instruction_param(int i) {
			return getRuleContext(Assembly_instruction_paramContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(VParser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(VParser.SEPERATOR, i);
		}
		public Assembly_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterAssembly_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitAssembly_directive(this);
		}
	}

	public final Assembly_directiveContext assembly_directive() throws RecognitionException {
		Assembly_directiveContext _localctx = new Assembly_directiveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assembly_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			assembly_instruction();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NATURAL_NUBER_LIT) | (1L << HEX_NUMBER_LIT) | (1L << ID))) != 0)) {
				{
				setState(340);
				assembly_instruction_param();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPERATOR) {
					{
					{
					setState(341);
					match(SEPERATOR);
					setState(342);
					assembly_instruction_param();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			match(TERMINATOR);
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

	public static class Assembly_instructionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(VParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VParser.ID, i);
		}
		public List<TerminalNode> SINGLE_DOT() { return getTokens(VParser.SINGLE_DOT); }
		public TerminalNode SINGLE_DOT(int i) {
			return getToken(VParser.SINGLE_DOT, i);
		}
		public Assembly_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterAssembly_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitAssembly_instruction(this);
		}
	}

	public final Assembly_instructionContext assembly_instruction() throws RecognitionException {
		Assembly_instructionContext _localctx = new Assembly_instructionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assembly_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(ID);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_DOT) {
				{
				{
				setState(353);
				match(SINGLE_DOT);
				setState(354);
				match(ID);
				}
				}
				setState(359);
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

	public static class Assembly_instruction_paramContext extends ParserRuleContext {
		public TerminalNode NATURAL_NUBER_LIT() { return getToken(VParser.NATURAL_NUBER_LIT, 0); }
		public TerminalNode HEX_NUMBER_LIT() { return getToken(VParser.HEX_NUMBER_LIT, 0); }
		public Riscv_registerContext riscv_register() {
			return getRuleContext(Riscv_registerContext.class,0);
		}
		public Assembly_redirectContext assembly_redirect() {
			return getRuleContext(Assembly_redirectContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VParser.RPAREN, 0); }
		public Assembly_instruction_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly_instruction_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterAssembly_instruction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitAssembly_instruction_param(this);
		}
	}

	public final Assembly_instruction_paramContext assembly_instruction_param() throws RecognitionException {
		Assembly_instruction_paramContext _localctx = new Assembly_instruction_paramContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assembly_instruction_param);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(NATURAL_NUBER_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(HEX_NUMBER_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				riscv_register();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				assembly_redirect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(NATURAL_NUBER_LIT);
				setState(365);
				match(LPAREN);
				setState(366);
				riscv_register();
				setState(367);
				match(RPAREN);
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

	public static class Assembly_redirectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Assembly_redirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly_redirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterAssembly_redirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitAssembly_redirect(this);
		}
	}

	public final Assembly_redirectContext assembly_redirect() throws RecognitionException {
		Assembly_redirectContext _localctx = new Assembly_redirectContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assembly_redirect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__3);
			setState(372);
			match(ID);
			setState(373);
			match(T__5);
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

	public static class Riscv_registerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VParser.ID, 0); }
		public Riscv_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_riscv_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterRiscv_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitRiscv_register(this);
		}
	}

	public final Riscv_registerContext riscv_register() throws RecognitionException {
		Riscv_registerContext _localctx = new Riscv_registerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_riscv_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
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

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VParser.REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VListener ) ((VListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 23:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\6\3[\n\3\r\3\16\3\\\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7u\n\7\f\7"+
		"\16\7x\13\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t"+
		"\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\5\r\u0097\n\r\3\16\3\16\5\16\u009b\n\16\3\17\3\17"+
		"\5\17\u009f\n\17\3\17\6\17\u00a2\n\17\r\17\16\17\u00a3\3\20\3\20\3\20"+
		"\3\20\6\20\u00aa\n\20\r\20\16\20\u00ab\3\21\3\21\3\21\3\21\6\21\u00b2"+
		"\n\21\r\21\16\21\u00b3\3\22\3\22\3\23\3\23\3\23\6\23\u00bb\n\23\r\23\16"+
		"\23\u00bc\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c8\n\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00d1\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00db\n\27\3\27\3\27\3\27\7\27\u00e0\n\27\f"+
		"\27\16\27\u00e3\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00eb\n\30\f"+
		"\30\16\30\u00ee\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f6\n\31\f"+
		"\31\16\31\u00f9\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0105\n\32\3\33\3\33\3\33\7\33\u010a\n\33\f\33\16\33\u010d\13\33"+
		"\3\34\3\34\3\34\3\34\7\34\u0113\n\34\f\34\16\34\u0116\13\34\3\35\3\35"+
		"\5\35\u011a\n\35\3\36\3\36\3\36\3\36\7\36\u0120\n\36\f\36\16\36\u0123"+
		"\13\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0132\n!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u013d\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\5$\u014a\n$\3$\3$\3%\3%\6%\u0150\n%\r%\16%\u0151\3%\3%\3&\3&\3&\3"+
		"&\7&\u015a\n&\f&\16&\u015d\13&\5&\u015f\n&\3&\3&\3\'\3\'\3\'\7\'\u0166"+
		"\n\'\f\'\16\'\u0169\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0174\n(\3)\3)"+
		"\3)\3)\3*\3*\3+\3+\3+\2\5,.\60,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\7\3\2\4\t\5\2&&..\65\65\3\2\n\13"+
		"\4\2\f\r\'(\3\2\34\35\2\u0181\2V\3\2\2\2\4Z\3\2\2\2\6^\3\2\2\2\be\3\2"+
		"\2\2\nn\3\2\2\2\fv\3\2\2\2\16y\3\2\2\2\20|\3\2\2\2\22\u0084\3\2\2\2\24"+
		"\u008c\3\2\2\2\26\u0090\3\2\2\2\30\u0094\3\2\2\2\32\u0098\3\2\2\2\34\u00a1"+
		"\3\2\2\2\36\u00a9\3\2\2\2 \u00b1\3\2\2\2\"\u00b5\3\2\2\2$\u00ba\3\2\2"+
		"\2&\u00c7\3\2\2\2(\u00c9\3\2\2\2*\u00d0\3\2\2\2,\u00da\3\2\2\2.\u00e4"+
		"\3\2\2\2\60\u00ef\3\2\2\2\62\u0104\3\2\2\2\64\u0106\3\2\2\2\66\u010e\3"+
		"\2\2\28\u0119\3\2\2\2:\u011b\3\2\2\2<\u0124\3\2\2\2>\u0126\3\2\2\2@\u0129"+
		"\3\2\2\2B\u0136\3\2\2\2D\u0140\3\2\2\2F\u0146\3\2\2\2H\u014d\3\2\2\2J"+
		"\u0155\3\2\2\2L\u0162\3\2\2\2N\u0173\3\2\2\2P\u0175\3\2\2\2R\u0179\3\2"+
		"\2\2T\u017b\3\2\2\2VW\5\f\7\2WX\5\4\3\2X\3\3\2\2\2Y[\5\6\4\2ZY\3\2\2\2"+
		"[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2^_\5T+\2_`\7!\2\2`a\7\66\2"+
		"\2ab\5\b\5\2bc\5\n\6\2cd\7\"\2\2d\7\3\2\2\2ei\7\32\2\2fh\5\22\n\2gf\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\33\2\2m\t"+
		"\3\2\2\2no\5\f\7\2op\5$\23\2p\13\3\2\2\2qr\5\16\b\2rs\7\22\2\2su\3\2\2"+
		"\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xv\3\2\2\2yz\7 \2"+
		"\2z{\5\20\t\2{\17\3\2\2\2|\u0081\5\26\f\2}~\7\23\2\2~\u0080\5\26\f\2\177"+
		"}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\21\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\24\13\2\u0085\u0086\7\23"+
		"\2\2\u0086\u0088\5\24\13\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23\3\2\2\2\u008b\u0089\3\2\2"+
		"\2\u008c\u008d\7\66\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\32\16\2\u008f"+
		"\25\3\2\2\2\u0090\u0091\7\66\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\30"+
		"\r\2\u0093\27\3\2\2\2\u0094\u0096\5T+\2\u0095\u0097\5\36\20\2\u0096\u0095"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2\2\u0098\u009a\5T+\2\u0099"+
		"\u009b\5\34\17\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2"+
		"\2\2\u009c\u009e\7\30\2\2\u009d\u009f\5\"\22\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\31\2\2\u00a1\u009c\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7\31"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\7\30\2"+
		"\2\u00ae\u00af\5.\30\2\u00af\u00b0\7\31\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4!\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6#\3\2\2\2\u00b7\u00b8\5"+
		"&\24\2\u00b8\u00b9\7\22\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd%\3\2\2\2"+
		"\u00be\u00c8\5(\25\2\u00bf\u00c8\5> \2\u00c0\u00c8\5\66\34\2\u00c1\u00c8"+
		"\5:\36\2\u00c2\u00c8\5@!\2\u00c3\u00c8\5B\"\2\u00c4\u00c8\5D#\2\u00c5"+
		"\u00c8\5F$\2\u00c6\u00c8\5H%\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2"+
		"\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\'\3\2\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\5.\30"+
		"\2\u00cc)\3\2\2\2\u00cd\u00d1\7\66\2\2\u00ce\u00cf\7\66\2\2\u00cf\u00d1"+
		"\5 \21\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1+\3\2\2\2\u00d2"+
		"\u00d3\b\27\1\2\u00d3\u00db\5.\30\2\u00d4\u00d5\5.\30\2\u00d5\u00d6\t"+
		"\2\2\2\u00d6\u00d7\5.\30\2\u00d7\u00db\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9"+
		"\u00db\5,\27\3\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\f\4\2\2\u00dd\u00de\t\3\2\2\u00de"+
		"\u00e0\5,\27\5\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2-\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\b\30\1\2\u00e5\u00e6\5\60\31\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\3\2"+
		"\2\u00e8\u00e9\t\4\2\2\u00e9\u00eb\5\60\31\2\u00ea\u00e7\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed/\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ef\u00f0\b\31\1\2\u00f0\u00f1\5\62\32\2\u00f1"+
		"\u00f7\3\2\2\2\u00f2\u00f3\f\3\2\2\u00f3\u00f4\t\5\2\2\u00f4\u00f6\5\62"+
		"\32\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\61\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0105\5*\26"+
		"\2\u00fb\u0105\5F$\2\u00fc\u0105\7\20\2\2\u00fd\u0105\7\17\2\2\u00fe\u00ff"+
		"\7\32\2\2\u00ff\u0100\5.\30\2\u0100\u0101\7\33\2\2\u0101\u0105\3\2\2\2"+
		"\u0102\u0103\7\13\2\2\u0103\u0105\5.\30\2\u0104\u00fa\3\2\2\2\u0104\u00fb"+
		"\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\63\3\2\2\2\u0106\u010b\5.\30\2\u0107\u0108\7\23\2"+
		"\2\u0108\u010a\5.\30\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\65\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\60\2\2\u010f\u0114\58\35\2\u0110\u0111\7\23\2\2\u0111\u0113\5"+
		"8\35\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\67\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011a\5.\30"+
		"\2\u0118\u011a\7\16\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"9\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u0121\5<\37\2\u011d\u011e\7\23\2"+
		"\2\u011e\u0120\5<\37\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122;\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\5*\26\2\u0125=\3\2\2\2\u0126\u0127\7#\2\2\u0127\u0128\5.\30\2\u0128"+
		"?\3\2\2\2\u0129\u012a\7\64\2\2\u012a\u012b\5*\26\2\u012b\u012c\7\27\2"+
		"\2\u012c\u012d\5.\30\2\u012d\u012e\7$\2\2\u012e\u0131\5.\30\2\u012f\u0130"+
		"\7%\2\2\u0130\u0132\5.\30\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\5$\23\2\u0134\u0135\7-\2\2\u0135A\3\2\2\2\u0136"+
		"\u0137\7)\2\2\u0137\u0138\5,\27\2\u0138\u0139\7*\2\2\u0139\u013c\5$\23"+
		"\2\u013a\u013b\7+\2\2\u013b\u013d\5$\23\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7,\2\2\u013fC\3\2\2\2\u0140\u0141"+
		"\7\62\2\2\u0141\u0142\5,\27\2\u0142\u0143\7/\2\2\u0143\u0144\5$\23\2\u0144"+
		"\u0145\7\63\2\2\u0145E\3\2\2\2\u0146\u0147\7\66\2\2\u0147\u0149\7\32\2"+
		"\2\u0148\u014a\5\64\33\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7\33\2\2\u014cG\3\2\2\2\u014d\u014f\7\36\2"+
		"\2\u014e\u0150\5J&\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\37\2\2"+
		"\u0154I\3\2\2\2\u0155\u015e\5L\'\2\u0156\u015b\5N(\2\u0157\u0158\7\23"+
		"\2\2\u0158\u015a\5N(\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0156\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\22"+
		"\2\2\u0161K\3\2\2\2\u0162\u0167\7\66\2\2\u0163\u0164\7\26\2\2\u0164\u0166"+
		"\7\66\2\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168M\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0174\7"+
		"\17\2\2\u016b\u0174\7\21\2\2\u016c\u0174\5R*\2\u016d\u0174\5P)\2\u016e"+
		"\u016f\7\17\2\2\u016f\u0170\7\32\2\2\u0170\u0171\5R*\2\u0171\u0172\7\33"+
		"\2\2\u0172\u0174\3\2\2\2\u0173\u016a\3\2\2\2\u0173\u016b\3\2\2\2\u0173"+
		"\u016c\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0174O\3\2\2\2"+
		"\u0175\u0176\7\6\2\2\u0176\u0177\7\66\2\2\u0177\u0178\7\b\2\2\u0178Q\3"+
		"\2\2\2\u0179\u017a\7\66\2\2\u017aS\3\2\2\2\u017b\u017c\t\6\2\2\u017cU"+
		"\3\2\2\2!\\iv\u0081\u0089\u0096\u009a\u009e\u00a3\u00ab\u00b3\u00bc\u00c7"+
		"\u00d0\u00da\u00e1\u00ec\u00f7\u0104\u010b\u0114\u0119\u0121\u0131\u013c"+
		"\u0149\u0151\u015b\u015e\u0167\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}