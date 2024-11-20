// Generated from /Users/locacao/Documents/code/fooli/src/main/java/br/unisinos/FOOLI.g4 by ANTLR 4.13.2
package br.unisinos.fooli.antlr;

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FOOLIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, IDENTIFIER=27, INTEGER_LITERAL=28, WS=29, LINE_COMMENT=30, 
		BLOCK_COMMENT=31;
	public static final int
		RULE_program = 0, RULE_mainFunction = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_classUsage = 4, RULE_fieldDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_methodExecution = 7, RULE_parameters = 8, RULE_parameter = 9, RULE_type = 10, 
		RULE_block = 11, RULE_statement = 12, RULE_ifStatement = 13, RULE_returnStatement = 14, 
		RULE_assignment = 15, RULE_expressionStatement = 16, RULE_whileStatement = 17, 
		RULE_expression = 18, RULE_logicalOrExpression = 19, RULE_logicalAndExpression = 20, 
		RULE_equalityExpression = 21, RULE_relationalExpression = 22, RULE_additiveExpression = 23, 
		RULE_multiplicativeExpression = 24, RULE_primary = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFunction", "classDeclaration", "classBody", "classUsage", 
			"fieldDeclaration", "methodDeclaration", "methodExecution", "parameters", 
			"parameter", "type", "block", "statement", "ifStatement", "returnStatement", 
			"assignment", "expressionStatement", "whileStatement", "expression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'class'", "'}'", "'.'", 
			"';'", "','", "'int'", "'bool'", "'if'", "'else'", "'return'", "'='", 
			"'while'", "'||'", "'&&'", "'=='", "'<'", "'>'", "'+'", "'*'", "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "INTEGER_LITERAL", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "FOOLI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, String> symbolTable = new HashMap<>();
	    List<String> tacList = new ArrayList<>();

	public FOOLIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FOOLIParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(52);
				classDeclaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			mainFunction();
			setState(59);
			match(EOF);
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
	public static class MainFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(T__1);
			setState(63);
			match(T__2);
			setState(64);
			match(T__3);
			setState(65);
			block();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(68);
			match(T__5);
			setState(69);
			((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(70);
			classBody();
			setState(71);
			match(T__6);
			 symbolTable.put((((ClassDeclarationContext)_localctx).IDENTIFIER!=null?((ClassDeclarationContext)_localctx).IDENTIFIER.getText():null), "class"); 
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
	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					fieldDeclaration();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					methodDeclaration();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(86);
				mainFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassUsageContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(FOOLIParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FOOLIParser.IDENTIFIER, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodExecutionContext methodExecution() {
			return getRuleContext(MethodExecutionContext.class,0);
		}
		public ClassUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterClassUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitClassUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitClassUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassUsageContext classUsage() throws RecognitionException {
		ClassUsageContext _localctx = new ClassUsageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classUsage);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((ClassUsageContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(90);
				match(T__7);
				setState(91);
				((ClassUsageContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(92);
				match(T__8);
				 tacList.add((((ClassUsageContext)_localctx).IDENTIFIER!=null?((ClassUsageContext)_localctx).IDENTIFIER.getText():null) + "." + ((ClassUsageContext)_localctx).IDENTIFIER(1).text + ";"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(T__7);
				setState(96);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(T__7);
				setState(99);
				methodExecution();
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token IDENTIFIER;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((FieldDeclarationContext)_localctx).type = type();
			setState(103);
			((FieldDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(104);
			match(T__8);
			 symbolTable.put((((FieldDeclarationContext)_localctx).IDENTIFIER!=null?((FieldDeclarationContext)_localctx).IDENTIFIER.getText():null), ((FieldDeclarationContext)_localctx).type.text); 
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token IDENTIFIER;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((MethodDeclarationContext)_localctx).type = type();
			setState(108);
			((MethodDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(109);
			match(T__2);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402659330L) != 0)) {
				{
				setState(110);
				parameters();
				}
			}

			setState(113);
			match(T__3);
			setState(114);
			block();
			 symbolTable.put((((MethodDeclarationContext)_localctx).IDENTIFIER!=null?((MethodDeclarationContext)_localctx).IDENTIFIER.getText():null), "method: " + ((MethodDeclarationContext)_localctx).type.text); 
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
	public static class MethodExecutionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public ParametersContext parameters;
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMethodExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMethodExecution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMethodExecution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExecutionContext methodExecution() throws RecognitionException {
		MethodExecutionContext _localctx = new MethodExecutionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((MethodExecutionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(118);
			match(T__2);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402659330L) != 0)) {
				{
				setState(119);
				((MethodExecutionContext)_localctx).parameters = parameters();
				}
			}

			setState(122);
			match(T__3);
			setState(123);
			match(T__8);
			 tacList.add("CALL " + (((MethodExecutionContext)_localctx).IDENTIFIER!=null?((MethodExecutionContext)_localctx).IDENTIFIER.getText():null) + " " + ((((MethodExecutionContext)_localctx).parameters!=null?_input.getText(((MethodExecutionContext)_localctx).parameters.start,((MethodExecutionContext)_localctx).parameters.stop):null) != null ? (((MethodExecutionContext)_localctx).parameters!=null?_input.getText(((MethodExecutionContext)_localctx).parameters.start,((MethodExecutionContext)_localctx).parameters.stop):null) : "")); 
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			parameter();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(127);
				match(T__9);
				setState(128);
				parameter();
				}
				}
				setState(133);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(FOOLIParser.INTEGER_LITERAL, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__10:
			case T__11:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(134);
					((ParameterContext)_localctx).type = type();
					}
					break;
				}
				setState(137);
				((ParameterContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 symbolTable.put((((ParameterContext)_localctx).IDENTIFIER!=null?((ParameterContext)_localctx).IDENTIFIER.getText():null), (((ParameterContext)_localctx).type!=null?_input.getText(((ParameterContext)_localctx).type.start,((ParameterContext)_localctx).type.stop):null) != null ? ((ParameterContext)_localctx).type.text : "int"); 
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(INTEGER_LITERAL);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134223874L) != 0)) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__4);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503494666L) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__6);
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public MethodExecutionContext methodExecution() {
			return getRuleContext(MethodExecutionContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassUsageContext classUsage() {
			return getRuleContext(ClassUsageContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				methodExecution();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				fieldDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				classUsage();
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__12);
			setState(164);
			match(T__2);
			setState(165);
			((IfStatementContext)_localctx).expression = expression();
			setState(166);
			match(T__3);
			setState(167);
			block();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(168);
				match(T__13);
				setState(169);
				block();
				}
			}

			 tacList.add("IF " + (((IfStatementContext)_localctx).expression!=null?_input.getText(((IfStatementContext)_localctx).expression.start,((IfStatementContext)_localctx).expression.stop):null) + " THEN ..."); 
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__14);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316488L) != 0)) {
				{
				setState(175);
				((ReturnStatementContext)_localctx).expression = expression();
				}
			}

			setState(178);
			match(T__8);
			 tacList.add("RETURN " + ((((ReturnStatementContext)_localctx).expression!=null?_input.getText(((ReturnStatementContext)_localctx).expression.start,((ReturnStatementContext)_localctx).expression.stop):null) != null ? (((ReturnStatementContext)_localctx).expression!=null?_input.getText(((ReturnStatementContext)_localctx).expression.start,((ReturnStatementContext)_localctx).expression.stop):null) : "void")); 
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
	public static class AssignmentContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((AssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(182);
			match(T__15);
			setState(183);
			((AssignmentContext)_localctx).expression = expression();
			setState(184);
			match(T__8);
			 tacList.add((((AssignmentContext)_localctx).IDENTIFIER!=null?((AssignmentContext)_localctx).IDENTIFIER.getText():null) + " = " + (((AssignmentContext)_localctx).expression!=null?_input.getText(((AssignmentContext)_localctx).expression.start,((AssignmentContext)_localctx).expression.stop):null) + ";"); 
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			expression();
			setState(188);
			match(T__8);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__16);
			setState(191);
			match(T__2);
			setState(192);
			((WhileStatementContext)_localctx).expression = expression();
			setState(193);
			match(T__3);
			setState(194);
			block();
			 tacList.add("WHILE " + (((WhileStatementContext)_localctx).expression!=null?_input.getText(((WhileStatementContext)_localctx).expression.start,((WhileStatementContext)_localctx).expression.stop):null) + " DO ..."); 
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public MethodExecutionContext methodExecution() {
			return getRuleContext(MethodExecutionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				logicalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				methodExecution();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(204);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(205);
					match(T__17);
					setState(206);
					logicalAndExpression(0);
					}
					} 
				}
				setState(211);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(215);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(216);
					match(T__18);
					setState(217);
					equalityExpression(0);
					}
					} 
				}
				setState(222);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(226);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(227);
					match(T__19);
					setState(228);
					relationalExpression(0);
					}
					} 
				}
				setState(233);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_relationalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(239);
					additiveExpression(0);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(248);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(249);
					match(T__22);
					setState(250);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(259);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(260);
					match(T__23);
					setState(261);
					primary();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FOOLIParser.INTEGER_LITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__2);
				setState(268);
				expression();
				setState(269);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(IDENTIFIER);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(INTEGER_LITERAL);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(T__25);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 20:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 21:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 22:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 23:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 24:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0116\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000"+
		"\f\u00009\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0005"+
		"\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003\u0003\u0003X\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007y\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0082\b\b\n\b\f\b\u0085\t"+
		"\b\u0001\t\u0003\t\u0088\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u008d\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0093\b\u000b\n\u000b"+
		"\f\u000b\u0096\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a2\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ab\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00c8\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d0\b\u0013\n"+
		"\u0013\f\u0013\u00d3\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00db\b\u0014\n\u0014\f\u0014"+
		"\u00de\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00e6\b\u0015\n\u0015\f\u0015\u00e9\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00f1\b\u0016\n\u0016\f\u0016\u00f4\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00fc\b\u0017"+
		"\n\u0017\f\u0017\u00ff\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0107\b\u0018\n\u0018\f\u0018"+
		"\u010a\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0114\b\u0019\u0001\u0019"+
		"\u0000\u0006&(*,.0\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0002\u0003\u0000"+
		"\u0001\u0001\u000b\f\u001b\u001b\u0001\u0000\u0015\u0016\u011b\u00007"+
		"\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004C\u0001\u0000"+
		"\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000"+
		"\nf\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000eu\u0001\u0000"+
		"\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000"+
		"\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000"+
		"\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000"+
		"\u0000 \u00bb\u0001\u0000\u0000\u0000\"\u00be\u0001\u0000\u0000\u0000"+
		"$\u00c7\u0001\u0000\u0000\u0000&\u00c9\u0001\u0000\u0000\u0000(\u00d4"+
		"\u0001\u0000\u0000\u0000*\u00df\u0001\u0000\u0000\u0000,\u00ea\u0001\u0000"+
		"\u0000\u0000.\u00f5\u0001\u0000\u0000\u00000\u0100\u0001\u0000\u0000\u0000"+
		"2\u0113\u0001\u0000\u0000\u000046\u0003\u0004\u0002\u000054\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":;\u0003\u0002\u0001\u0000;<\u0005\u0000\u0000\u0001<\u0001\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0001\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005"+
		"\u0003\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0003\u0016\u000b\u0000"+
		"B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005\u0006"+
		"\u0000\u0000EF\u0005\u001b\u0000\u0000FG\u0003\u0006\u0003\u0000GH\u0005"+
		"\u0007\u0000\u0000HI\u0006\u0002\uffff\uffff\u0000I\u0005\u0001\u0000"+
		"\u0000\u0000JL\u0003\n\u0005\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VX\u0003\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\u0007\u0001\u0000\u0000\u0000YZ\u0005\u001b\u0000\u0000"+
		"Z[\u0005\b\u0000\u0000[\\\u0005\u001b\u0000\u0000\\]\u0005\t\u0000\u0000"+
		"]e\u0006\u0004\uffff\uffff\u0000^_\u0005\u001b\u0000\u0000_`\u0005\b\u0000"+
		"\u0000`e\u0003\u001e\u000f\u0000ab\u0005\u001b\u0000\u0000bc\u0005\b\u0000"+
		"\u0000ce\u0003\u000e\u0007\u0000dY\u0001\u0000\u0000\u0000d^\u0001\u0000"+
		"\u0000\u0000da\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0003"+
		"\u0014\n\u0000gh\u0005\u001b\u0000\u0000hi\u0005\t\u0000\u0000ij\u0006"+
		"\u0005\uffff\uffff\u0000j\u000b\u0001\u0000\u0000\u0000kl\u0003\u0014"+
		"\n\u0000lm\u0005\u001b\u0000\u0000mo\u0005\u0003\u0000\u0000np\u0003\u0010"+
		"\b\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u0003\u0016\u000b\u0000st\u0006"+
		"\u0006\uffff\uffff\u0000t\r\u0001\u0000\u0000\u0000uv\u0005\u001b\u0000"+
		"\u0000vx\u0005\u0003\u0000\u0000wy\u0003\u0010\b\u0000xw\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0004"+
		"\u0000\u0000{|\u0005\t\u0000\u0000|}\u0006\u0007\uffff\uffff\u0000}\u000f"+
		"\u0001\u0000\u0000\u0000~\u0083\u0003\u0012\t\u0000\u007f\u0080\u0005"+
		"\n\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0011\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0014"+
		"\n\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001b\u0000"+
		"\u0000\u008a\u008d\u0006\t\uffff\uffff\u0000\u008b\u008d\u0005\u001c\u0000"+
		"\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0000\u0000"+
		"\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0094\u0005\u0005\u0000"+
		"\u0000\u0091\u0093\u0003\u0018\f\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0007\u0000\u0000"+
		"\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u00a2\u0003\u001a\r\u0000\u009a"+
		"\u00a2\u0003\u001c\u000e\u0000\u009b\u00a2\u0003\u001e\u000f\u0000\u009c"+
		"\u00a2\u0003 \u0010\u0000\u009d\u00a2\u0003\"\u0011\u0000\u009e\u00a2"+
		"\u0003\u000e\u0007\u0000\u009f\u00a2\u0003\n\u0005\u0000\u00a0\u00a2\u0003"+
		"\b\u0004\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000"+
		"\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000"+
		"\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\r\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6\u0003$\u0012\u0000"+
		"\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00aa\u0003\u0016\u000b\u0000"+
		"\u00a8\u00a9\u0005\u000e\u0000\u0000\u00a9\u00ab\u0003\u0016\u000b\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\r\uffff\uffff\u0000"+
		"\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u000f\u0000\u0000"+
		"\u00af\u00b1\u0003$\u0012\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\t\u0000\u0000\u00b3\u00b4\u0006\u000e\uffff\uffff\u0000\u00b4"+
		"\u001d\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u001b\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8\u00b9"+
		"\u0005\t\u0000\u0000\u00b9\u00ba\u0006\u000f\uffff\uffff\u0000\u00ba\u001f"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003$\u0012\u0000\u00bc\u00bd\u0005"+
		"\t\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0011"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1\u0003$\u0012"+
		"\u0000\u00c1\u00c2\u0005\u0004\u0000\u0000\u00c2\u00c3\u0003\u0016\u000b"+
		"\u0000\u00c3\u00c4\u0006\u0011\uffff\uffff\u0000\u00c4#\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0003&\u0013\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8%\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\u0013\uffff\uffff\u0000"+
		"\u00ca\u00cb\u0003(\u0014\u0000\u00cb\u00d1\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\n\u0002\u0000\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00d0"+
		"\u0003(\u0014\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0006\u0014\uffff\uffff\u0000\u00d5\u00d6\u0003"+
		"*\u0015\u0000\u00d6\u00dc\u0001\u0000\u0000\u0000\u00d7\u00d8\n\u0002"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0013\u0000\u0000\u00d9\u00db\u0003*\u0015"+
		"\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0006\u0015\uffff\uffff\u0000\u00e0\u00e1\u0003,\u0016\u0000"+
		"\u00e1\u00e7\u0001\u0000\u0000\u0000\u00e2\u00e3\n\u0002\u0000\u0000\u00e3"+
		"\u00e4\u0005\u0014\u0000\u0000\u00e4\u00e6\u0003,\u0016\u0000\u00e5\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8+\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0006"+
		"\u0016\uffff\uffff\u0000\u00eb\u00ec\u0003.\u0017\u0000\u00ec\u00f2\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\n\u0002\u0000\u0000\u00ee\u00ef\u0007\u0001"+
		"\u0000\u0000\u00ef\u00f1\u0003.\u0017\u0000\u00f0\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3-\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u0017\uffff\uffff"+
		"\u0000\u00f6\u00f7\u00030\u0018\u0000\u00f7\u00fd\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\n\u0002\u0000\u0000\u00f9\u00fa\u0005\u0017\u0000\u0000\u00fa"+
		"\u00fc\u00030\u0018\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe/\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0006\u0018\uffff\uffff\u0000\u0101\u0102"+
		"\u00032\u0019\u0000\u0102\u0108\u0001\u0000\u0000\u0000\u0103\u0104\n"+
		"\u0002\u0000\u0000\u0104\u0105\u0005\u0018\u0000\u0000\u0105\u0107\u0003"+
		"2\u0019\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u01091\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\u0003\u0000\u0000\u010c\u010d\u0003$\u0012\u0000"+
		"\u010d\u010e\u0005\u0004\u0000\u0000\u010e\u0114\u0001\u0000\u0000\u0000"+
		"\u010f\u0114\u0005\u001b\u0000\u0000\u0110\u0114\u0005\u001c\u0000\u0000"+
		"\u0111\u0114\u0005\u0019\u0000\u0000\u0112\u0114\u0005\u001a\u0000\u0000"+
		"\u0113\u010b\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000"+
		"\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u01143\u0001\u0000\u0000\u0000\u0016"+
		"7MSWdox\u0083\u0087\u008c\u0094\u00a1\u00aa\u00b0\u00c7\u00d1\u00dc\u00e7"+
		"\u00f2\u00fd\u0108\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}