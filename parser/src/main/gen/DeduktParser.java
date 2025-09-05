// Generated from /home/kid-a/projects/dedukt-lang/parser/src/main/antlr/DeduktParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DeduktParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Hidden=1, LF=2, CR=3, NL=4, SpaceOrTab=5, LineComment=6, MultiLineComment=7, 
		Package=8, Import=9, Type=10, Where=11, If=12, Else=13, Case=14, Default=15, 
		When=16, Gaurd=17, For=18, While=19, Do=20, Break=21, BreakAt=22, Continue=23, 
		ContinueAt=24, Return=25, ReturnAt=26, Jump=27, Val=28, Var=29, Const=30, 
		Throw=31, Catch=32, Finally=33, Try=34, Assert=35, Debug=36, Context=37, 
		Notation=38, Axiom=39, Fun=40, Operator=41, Structure=42, Theory=43, Rule=44, 
		Abstract=45, LatexStyleIdentifier=46, MathematicalUnicodeFamily=47, IdentifierOrSoftKeyword=48, 
		Vert=49, At=50, Annotation=51, LParen=52, RParen=53, LBrace=54, RBrace=55, 
		LBracket=56, RBracket=57, LAngle=58, RAngle=59, SemiColon=60, Colon=61, 
		Dot=62, Star=63, Comma=64, SubType=65, SuperType=66, DoubleColon=67, Arrow=68, 
		QuestionMark=69, Assignment=70, Number=71, StringLiteral=72, Assigment=73, 
		DecimalNumber=74;
	public static final int
		RULE_deduktSourceCode = 0, RULE_header = 1, RULE_packageDeclaration = 2, 
		RULE_packageIdentifier = 3, RULE_importList = 4, RULE_importStatement = 5, 
		RULE_body = 6, RULE_statement = 7, RULE_application = 8, RULE_expression = 9, 
		RULE_chainExpression = 10, RULE_chainOperator = 11, RULE_primaryExpression = 12, 
		RULE_multipleIdentifiers = 13, RULE_functionCall = 14, RULE_argumentList = 15, 
		RULE_conditional = 16, RULE_ifStatement = 17, RULE_caseStatement = 18, 
		RULE_defaultStatement = 19, RULE_caseStatements = 20, RULE_whenStatement = 21, 
		RULE_guardStatement = 22, RULE_ternaryExpression = 23, RULE_loop = 24, 
		RULE_loopBody = 25, RULE_forLoop = 26, RULE_whileLoop = 27, RULE_doWhileLoop = 28, 
		RULE_jump = 29, RULE_breakStatement = 30, RULE_continueStatement = 31, 
		RULE_returnStatement = 32, RULE_gotoStatement = 33, RULE_variableOperation = 34, 
		RULE_assignment = 35, RULE_errorHandling = 36, RULE_throwStatement = 37, 
		RULE_tryStatement = 38, RULE_debugOperation = 39, RULE_assertStatement = 40, 
		RULE_debugStatement = 41, RULE_declaration = 42, RULE_typeDeclaration = 43, 
		RULE_typeOptions = 44, RULE_parameters = 45, RULE_typeParameters = 46, 
		RULE_typeParameter = 47, RULE_dependentType = 48, RULE_parameterOptions = 49, 
		RULE_parameterOption = 50, RULE_subtypeOption = 51, RULE_superTypeOption = 52, 
		RULE_subTyping = 53, RULE_applicability = 54, RULE_contextDeclaration = 55, 
		RULE_notationDeclaration = 56, RULE_functionDeclaration = 57, RULE_functionTypeFormat = 58, 
		RULE_operatorDeclaration = 59, RULE_structureDeclaration = 60, RULE_theoryDeclaration = 61, 
		RULE_axiomDeclaration = 62, RULE_ruleDeclaration = 63, RULE_annotationDeclaration = 64, 
		RULE_annotationContext = 65, RULE_headlessFunction = 66, RULE_returnable = 67, 
		RULE_typeContext = 68, RULE_notationContext = 69, RULE_operatorContext = 70, 
		RULE_structureContext = 71, RULE_theoryContext = 72, RULE_axiomContext = 73, 
		RULE_ruleContext = 74, RULE_commaSeparatedIdentifiers = 75, RULE_commaSeparatedTypedIdentifiers = 76, 
		RULE_identifier = 77, RULE_literal = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"deduktSourceCode", "header", "packageDeclaration", "packageIdentifier", 
			"importList", "importStatement", "body", "statement", "application", 
			"expression", "chainExpression", "chainOperator", "primaryExpression", 
			"multipleIdentifiers", "functionCall", "argumentList", "conditional", 
			"ifStatement", "caseStatement", "defaultStatement", "caseStatements", 
			"whenStatement", "guardStatement", "ternaryExpression", "loop", "loopBody", 
			"forLoop", "whileLoop", "doWhileLoop", "jump", "breakStatement", "continueStatement", 
			"returnStatement", "gotoStatement", "variableOperation", "assignment", 
			"errorHandling", "throwStatement", "tryStatement", "debugOperation", 
			"assertStatement", "debugStatement", "declaration", "typeDeclaration", 
			"typeOptions", "parameters", "typeParameters", "typeParameter", "dependentType", 
			"parameterOptions", "parameterOption", "subtypeOption", "superTypeOption", 
			"subTyping", "applicability", "contextDeclaration", "notationDeclaration", 
			"functionDeclaration", "functionTypeFormat", "operatorDeclaration", "structureDeclaration", 
			"theoryDeclaration", "axiomDeclaration", "ruleDeclaration", "annotationDeclaration", 
			"annotationContext", "headlessFunction", "returnable", "typeContext", 
			"notationContext", "operatorContext", "structureContext", "theoryContext", 
			"axiomContext", "ruleContext", "commaSeparatedIdentifiers", "commaSeparatedTypedIdentifiers", 
			"identifier", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'package'", "'import'", 
			"'type'", "'where'", "'if'", "'else'", "'case'", "'default'", "'when'", 
			"'guard'", "'for'", "'while'", "'do'", "'break'", "'break@'", "'continue'", 
			"'continue@'", "'return'", "'return@'", "'jump'", "'val'", "'var'", "'const'", 
			"'throw'", "'catch'", "'finally'", "'try'", "'assert'", "'debug'", "'context'", 
			"'notation'", "'axiom'", "'fun'", "'operator'", "'structure'", "'theory'", 
			"'rule'", "'abstract'", null, null, null, "'|'", "'@'", null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "';'", "':'", "'.'", 
			"'*'", "','", "'<:'", "':>'", "'::'", "'->'", "'?'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Hidden", "LF", "CR", "NL", "SpaceOrTab", "LineComment", "MultiLineComment", 
			"Package", "Import", "Type", "Where", "If", "Else", "Case", "Default", 
			"When", "Gaurd", "For", "While", "Do", "Break", "BreakAt", "Continue", 
			"ContinueAt", "Return", "ReturnAt", "Jump", "Val", "Var", "Const", "Throw", 
			"Catch", "Finally", "Try", "Assert", "Debug", "Context", "Notation", 
			"Axiom", "Fun", "Operator", "Structure", "Theory", "Rule", "Abstract", 
			"LatexStyleIdentifier", "MathematicalUnicodeFamily", "IdentifierOrSoftKeyword", 
			"Vert", "At", "Annotation", "LParen", "RParen", "LBrace", "RBrace", "LBracket", 
			"RBracket", "LAngle", "RAngle", "SemiColon", "Colon", "Dot", "Star", 
			"Comma", "SubType", "SuperType", "DoubleColon", "Arrow", "QuestionMark", 
			"Assignment", "Number", "StringLiteral", "Assigment", "DecimalNumber"
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
	public String getGrammarFileName() { return "DeduktParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeduktParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeduktSourceCodeContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DeduktParser.EOF, 0); }
		public DeduktSourceCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deduktSourceCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDeduktSourceCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDeduktSourceCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDeduktSourceCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeduktSourceCodeContext deduktSourceCode() throws RecognitionException {
		DeduktSourceCodeContext _localctx = new DeduktSourceCodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_deduktSourceCode);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Package) {
					{
					setState(158);
					header();
					}
				}

				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
					{
					setState(161);
					body();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(EOF);
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
	public static class HeaderContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			packageDeclaration();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Import) {
				{
				setState(168);
				importList();
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
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(DeduktParser.Package, 0); }
		public PackageIdentifierContext packageIdentifier() {
			return getRuleContext(PackageIdentifierContext.class,0);
		}
		public List<TerminalNode> SpaceOrTab() { return getTokens(DeduktParser.SpaceOrTab); }
		public TerminalNode SpaceOrTab(int i) {
			return getToken(DeduktParser.SpaceOrTab, i);
		}
		public List<TerminalNode> NL() { return getTokens(DeduktParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DeduktParser.NL, i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Package);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SpaceOrTab) {
				{
				{
				setState(172);
				match(SpaceOrTab);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			packageIdentifier();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(179);
				match(NL);
				}
				}
				setState(184);
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
	public static class PackageIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IdentifierOrSoftKeyword() { return getTokens(DeduktParser.IdentifierOrSoftKeyword); }
		public TerminalNode IdentifierOrSoftKeyword(int i) {
			return getToken(DeduktParser.IdentifierOrSoftKeyword, i);
		}
		public List<TerminalNode> Dot() { return getTokens(DeduktParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DeduktParser.Dot, i);
		}
		public PackageIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterPackageIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitPackageIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitPackageIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageIdentifierContext packageIdentifier() throws RecognitionException {
		PackageIdentifierContext _localctx = new PackageIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IdentifierOrSoftKeyword);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(Dot);
					setState(187);
					match(IdentifierOrSoftKeyword);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				importStatement();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Import );
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(DeduktParser.Import, 0); }
		public PackageIdentifierContext packageIdentifier() {
			return getRuleContext(PackageIdentifierContext.class,0);
		}
		public List<TerminalNode> SpaceOrTab() { return getTokens(DeduktParser.SpaceOrTab); }
		public TerminalNode SpaceOrTab(int i) {
			return getToken(DeduktParser.SpaceOrTab, i);
		}
		public TerminalNode Dot() { return getToken(DeduktParser.Dot, 0); }
		public TerminalNode Star() { return getToken(DeduktParser.Star, 0); }
		public List<TerminalNode> NL() { return getTokens(DeduktParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DeduktParser.NL, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Import);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SpaceOrTab) {
				{
				{
				setState(199);
				match(SpaceOrTab);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			packageIdentifier();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(206);
				match(Dot);
				setState(207);
				match(Star);
				}
			}

			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(210);
				match(NL);
				}
				}
				setState(215);
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
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				statement();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber );
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
			case Context:
			case Notation:
			case Axiom:
			case Fun:
			case Operator:
			case Structure:
			case Theory:
			case Rule:
			case At:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				declaration();
				}
				break;
			case If:
			case Case:
			case When:
			case Gaurd:
			case For:
			case While:
			case Do:
			case Break:
			case BreakAt:
			case Continue:
			case ContinueAt:
			case Return:
			case ReturnAt:
			case Jump:
			case Val:
			case Var:
			case Const:
			case Throw:
			case Try:
			case Assert:
			case LatexStyleIdentifier:
			case IdentifierOrSoftKeyword:
			case Annotation:
			case LParen:
			case LBrace:
			case Number:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				application();
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
	public static class ApplicationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(DeduktParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(DeduktParser.SemiColon, i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public VariableOperationContext variableOperation() {
			return getRuleContext(VariableOperationContext.class,0);
		}
		public ErrorHandlingContext errorHandling() {
			return getRuleContext(ErrorHandlingContext.class,0);
		}
		public DebugOperationContext debugOperation() {
			return getRuleContext(DebugOperationContext.class,0);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_application);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				expression();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SemiColon) {
					{
					{
					setState(226);
					match(SemiColon);
					setState(227);
					expression();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				jump();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				variableOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				errorHandling();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				debugOperation();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			chainExpression();
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
	public static class ChainExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<ChainOperatorContext> chainOperator() {
			return getRuleContexts(ChainOperatorContext.class);
		}
		public ChainOperatorContext chainOperator(int i) {
			return getRuleContext(ChainOperatorContext.class,i);
		}
		public ChainExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainExpressionContext chainExpression() throws RecognitionException {
		ChainExpressionContext _localctx = new ChainExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chainExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			primaryExpression();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(246);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Dot:
						{
						setState(244);
						chainOperator();
						}
						break;
					case LatexStyleIdentifier:
					case IdentifierOrSoftKeyword:
					case LParen:
					case LBrace:
					case Number:
					case DecimalNumber:
						{
						setState(245);
						primaryExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(250);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainOperatorContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(DeduktParser.Dot, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public HeadlessFunctionContext headlessFunction() {
			return getRuleContext(HeadlessFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ChainOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterChainOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitChainOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitChainOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainOperatorContext chainOperator() throws RecognitionException {
		ChainOperatorContext _localctx = new ChainOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chainOperator);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(Dot);
				setState(252);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(Dot);
				setState(254);
				headlessFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(Dot);
				setState(256);
				identifier();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public MultipleIdentifiersContext multipleIdentifiers() {
			return getRuleContext(MultipleIdentifiersContext.class,0);
		}
		public HeadlessFunctionContext headlessFunction() {
			return getRuleContext(HeadlessFunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LParen() { return getToken(DeduktParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(DeduktParser.RParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primaryExpression);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				multipleIdentifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				headlessFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(LParen);
				setState(263);
				expression();
				setState(264);
				match(RParen);
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
	public static class MultipleIdentifiersContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public MultipleIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterMultipleIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitMultipleIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitMultipleIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleIdentifiersContext multipleIdentifiers() throws RecognitionException {
		MultipleIdentifiersContext _localctx = new MultipleIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleIdentifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			literal();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					literal();
					}
					} 
				}
				setState(274);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			identifier();
			setState(276);
			match(LBrace);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 301990213L) != 0)) {
				{
				setState(277);
				argumentList();
				}
			}

			setState(280);
			match(RBrace);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DeduktParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DeduktParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(283);
				match(Comma);
				setState(284);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public GuardStatementContext guardStatement() {
			return getRuleContext(GuardStatementContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				ifStatement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				caseStatement();
				}
				break;
			case When:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				whenStatement();
				}
				break;
			case Gaurd:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				guardStatement();
				}
				break;
			case LatexStyleIdentifier:
			case IdentifierOrSoftKeyword:
			case LParen:
			case LBrace:
			case Number:
			case DecimalNumber:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				ternaryExpression();
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> If() { return getTokens(DeduktParser.If); }
		public TerminalNode If(int i) {
			return getToken(DeduktParser.If, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Arrow() { return getTokens(DeduktParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(DeduktParser.Arrow, i);
		}
		public List<HeadlessFunctionContext> headlessFunction() {
			return getRuleContexts(HeadlessFunctionContext.class);
		}
		public HeadlessFunctionContext headlessFunction(int i) {
			return getRuleContext(HeadlessFunctionContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(DeduktParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(DeduktParser.Else, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(If);
			setState(298);
			expression();
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Arrow:
				{
				setState(299);
				match(Arrow);
				setState(300);
				expression();
				}
				break;
			case LBrace:
				{
				setState(301);
				headlessFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(304);
				match(Else);
				setState(305);
				match(If);
				setState(306);
				expression();
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Arrow:
					{
					setState(307);
					match(Arrow);
					setState(308);
					expression();
					}
					break;
				case LBrace:
					{
					setState(309);
					headlessFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(314);
				match(Else);
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Arrow:
					{
					setState(315);
					match(Arrow);
					setState(316);
					expression();
					}
					break;
				case LBrace:
					{
					setState(317);
					headlessFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(DeduktParser.Case, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Arrow() { return getToken(DeduktParser.Arrow, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Case);
			setState(323);
			expression();
			setState(324);
			match(Arrow);
			setState(325);
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
	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(DeduktParser.Default, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(Default);
			setState(328);
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
	public static class CaseStatementsContext extends ParserRuleContext {
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public CaseStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterCaseStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitCaseStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitCaseStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementsContext caseStatements() throws RecognitionException {
		CaseStatementsContext _localctx = new CaseStatementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_caseStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				caseStatement();
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			setState(335);
			defaultStatement();
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
	public static class WhenStatementContext extends ParserRuleContext {
		public TerminalNode When() { return getToken(DeduktParser.When, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Vert() { return getTokens(DeduktParser.Vert); }
		public TerminalNode Vert(int i) {
			return getToken(DeduktParser.Vert, i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public CaseStatementsContext caseStatements() {
			return getRuleContext(CaseStatementsContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<TerminalNode> Arrow() { return getTokens(DeduktParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(DeduktParser.Arrow, i);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitWhenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whenStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(When);
			setState(338);
			expression();
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Vert:
				{
				setState(344); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(339);
						match(Vert);
						setState(340);
						expression();
						setState(341);
						match(Arrow);
						setState(342);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(346); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(348);
				match(Vert);
				setState(349);
				defaultStatement();
				}
				break;
			case LBrace:
				{
				setState(351);
				match(LBrace);
				setState(352);
				caseStatements();
				setState(353);
				match(RBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class GuardStatementContext extends ParserRuleContext {
		public TerminalNode Gaurd() { return getToken(DeduktParser.Gaurd, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Else() { return getToken(DeduktParser.Else, 0); }
		public TerminalNode Return() { return getToken(DeduktParser.Return, 0); }
		public GuardStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterGuardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitGuardStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitGuardStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardStatementContext guardStatement() throws RecognitionException {
		GuardStatementContext _localctx = new GuardStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_guardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Gaurd);
			setState(358);
			expression();
			setState(359);
			match(Else);
			setState(360);
			match(Return);
			setState(361);
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
	public static class TernaryExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(DeduktParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(DeduktParser.Colon, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			expression();
			setState(364);
			match(QuestionMark);
			setState(365);
			expression();
			setState(366);
			match(Colon);
			setState(367);
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
	public static class LoopContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				forLoop();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				whileLoop();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				doWhileLoop();
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
	public static class LoopBodyContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(DeduktParser.Arrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeadlessFunctionContext headlessFunction() {
			return getRuleContext(HeadlessFunctionContext.class,0);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Arrow:
				{
				setState(374);
				match(Arrow);
				setState(375);
				expression();
				}
				break;
			case LBrace:
				{
				setState(376);
				headlessFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(DeduktParser.For, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(For);
			setState(380);
			expression();
			setState(381);
			loopBody();
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(DeduktParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(While);
			setState(384);
			expression();
			setState(385);
			loopBody();
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
	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(DeduktParser.Do, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode While() { return getToken(DeduktParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(Do);
			setState(388);
			loopBody();
			setState(389);
			match(While);
			setState(390);
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
	public static class JumpContext extends ParserRuleContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jump);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case BreakAt:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				breakStatement();
				}
				break;
			case Continue:
			case ContinueAt:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				continueStatement();
				}
				break;
			case Return:
			case ReturnAt:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				returnStatement();
				}
				break;
			case Jump:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				gotoStatement();
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(DeduktParser.Break, 0); }
		public TerminalNode BreakAt() { return getToken(DeduktParser.BreakAt, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(Break);
				}
				break;
			case BreakAt:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(BreakAt);
				setState(400);
				identifier();
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(DeduktParser.Continue, 0); }
		public TerminalNode ContinueAt() { return getToken(DeduktParser.ContinueAt, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStatement);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(Continue);
				}
				break;
			case ContinueAt:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(ContinueAt);
				setState(405);
				identifier();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(DeduktParser.Return, 0); }
		public TerminalNode ReturnAt() { return getToken(DeduktParser.ReturnAt, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_returnStatement);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(Return);
				}
				break;
			case ReturnAt:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(ReturnAt);
				setState(410);
				identifier();
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
	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Jump() { return getToken(DeduktParser.Jump, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(Jump);
			setState(414);
			identifier();
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
	public static class VariableOperationContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterVariableOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitVariableOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitVariableOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperationContext variableOperation() throws RecognitionException {
		VariableOperationContext _localctx = new VariableOperationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			assignment();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SubTypingContext subTyping() {
			return getRuleContext(SubTypingContext.class,0);
		}
		public TerminalNode Assignment() { return getToken(DeduktParser.Assignment, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Val() { return getToken(DeduktParser.Val, 0); }
		public TerminalNode Var() { return getToken(DeduktParser.Var, 0); }
		public TerminalNode Const() { return getToken(DeduktParser.Const, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) {
				{
				setState(418);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(421);
			identifier();
			setState(422);
			subTyping();
			setState(423);
			match(Assignment);
			setState(424);
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
	public static class ErrorHandlingContext extends ParserRuleContext {
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ErrorHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorHandling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterErrorHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitErrorHandling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitErrorHandling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorHandlingContext errorHandling() throws RecognitionException {
		ErrorHandlingContext _localctx = new ErrorHandlingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_errorHandling);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				throwStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				tryStatement();
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(DeduktParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Throw);
			setState(431);
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
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(DeduktParser.Try, 0); }
		public List<LoopBodyContext> loopBody() {
			return getRuleContexts(LoopBodyContext.class);
		}
		public LoopBodyContext loopBody(int i) {
			return getRuleContext(LoopBodyContext.class,i);
		}
		public TerminalNode Catch() { return getToken(DeduktParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(DeduktParser.Finally, 0); }
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Try);
			setState(434);
			loopBody();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Catch) {
				{
				setState(435);
				match(Catch);
				setState(436);
				loopBody();
				}
			}

			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Finally) {
				{
				setState(439);
				match(Finally);
				setState(440);
				loopBody();
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
	public static class DebugOperationContext extends ParserRuleContext {
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public DebugStatementContext debugStatement() {
			return getRuleContext(DebugStatementContext.class,0);
		}
		public DebugOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDebugOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDebugOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDebugOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugOperationContext debugOperation() throws RecognitionException {
		DebugOperationContext _localctx = new DebugOperationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_debugOperation);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assert:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				assertStatement();
				}
				break;
			case Annotation:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				debugStatement();
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
	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode Assert() { return getToken(DeduktParser.Assert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(Assert);
			setState(448);
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
	public static class DebugStatementContext extends ParserRuleContext {
		public TerminalNode Annotation() { return getToken(DeduktParser.Annotation, 0); }
		public TerminalNode Debug() { return getToken(DeduktParser.Debug, 0); }
		public DebugStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDebugStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDebugStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDebugStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugStatementContext debugStatement() throws RecognitionException {
		DebugStatementContext _localctx = new DebugStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_debugStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Annotation);
			setState(451);
			match(Debug);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ContextDeclarationContext contextDeclaration() {
			return getRuleContext(ContextDeclarationContext.class,0);
		}
		public NotationDeclarationContext notationDeclaration() {
			return getRuleContext(NotationDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public OperatorDeclarationContext operatorDeclaration() {
			return getRuleContext(OperatorDeclarationContext.class,0);
		}
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public TheoryDeclarationContext theoryDeclaration() {
			return getRuleContext(TheoryDeclarationContext.class,0);
		}
		public AxiomDeclarationContext axiomDeclaration() {
			return getRuleContext(AxiomDeclarationContext.class,0);
		}
		public RuleDeclarationContext ruleDeclaration() {
			return getRuleContext(RuleDeclarationContext.class,0);
		}
		public AnnotationDeclarationContext annotationDeclaration() {
			return getRuleContext(AnnotationDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declaration);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				typeDeclaration();
				}
				break;
			case Context:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				contextDeclaration();
				}
				break;
			case Notation:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				notationDeclaration();
				}
				break;
			case Fun:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				functionDeclaration();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				operatorDeclaration();
				}
				break;
			case Structure:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				structureDeclaration();
				}
				break;
			case Theory:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
				theoryDeclaration();
				}
				break;
			case Axiom:
				enterOuterAlt(_localctx, 8);
				{
				setState(460);
				axiomDeclaration();
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 9);
				{
				setState(461);
				ruleDeclaration();
				}
				break;
			case At:
				enterOuterAlt(_localctx, 10);
				{
				setState(462);
				annotationDeclaration();
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
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(DeduktParser.Type, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public TypeContextContext typeContext() {
			return getRuleContext(TypeContextContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Type);
			setState(466);
			identifier();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(467);
				typeOptions();
				}
			}

			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assigment) {
				{
				setState(470);
				match(Assigment);
				setState(471);
				typeContext();
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
	public static class TypeOptionsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParameterOptionsContext parameterOptions() {
			return getRuleContext(ParameterOptionsContext.class,0);
		}
		public SubTypingContext subTyping() {
			return getRuleContext(SubTypingContext.class,0);
		}
		public ApplicabilityContext applicability() {
			return getRuleContext(ApplicabilityContext.class,0);
		}
		public TypeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTypeOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTypeOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTypeOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOptionsContext typeOptions() throws RecognitionException {
		TypeOptionsContext _localctx = new TypeOptionsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeOptions);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAngle:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				parameters();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Where) {
					{
					setState(475);
					parameterOptions();
					}
				}

				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(478);
					subTyping();
					}
				}

				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(481);
					applicability();
					}
				}

				}
				break;
			case Where:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				parameterOptions();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(485);
					subTyping();
					}
				}

				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(488);
					applicability();
					}
				}

				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				subTyping();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(492);
					applicability();
					}
				}

				}
				break;
			case DoubleColon:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				applicability();
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LAngle() { return getToken(DeduktParser.LAngle, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode RAngle() { return getToken(DeduktParser.RAngle, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(LAngle);
			setState(499);
			typeParameters();
			setState(500);
			match(RAngle);
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
	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DeduktParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DeduktParser.Comma, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			typeParameter();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(503);
				match(Comma);
				setState(504);
				typeParameter();
				}
				}
				setState(509);
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
	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DependentTypeContext dependentType() {
			return getRuleContext(DependentTypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeParameter);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				dependentType();
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
	public static class DependentTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode Colon() { return getToken(DeduktParser.Colon, 0); }
		public DependentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterDependentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitDependentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitDependentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependentTypeContext dependentType() throws RecognitionException {
		DependentTypeContext _localctx = new DependentTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dependentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			identifier();
			setState(515);
			match(Colon);
			setState(516);
			identifier();
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
	public static class ParameterOptionsContext extends ParserRuleContext {
		public TerminalNode Where() { return getToken(DeduktParser.Where, 0); }
		public List<ParameterOptionContext> parameterOption() {
			return getRuleContexts(ParameterOptionContext.class);
		}
		public ParameterOptionContext parameterOption(int i) {
			return getRuleContext(ParameterOptionContext.class,i);
		}
		public ParameterOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterParameterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitParameterOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitParameterOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterOptionsContext parameterOptions() throws RecognitionException {
		ParameterOptionsContext _localctx = new ParameterOptionsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parameterOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(Where);
			setState(520); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(519);
					parameterOption();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(522); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
	public static class ParameterOptionContext extends ParserRuleContext {
		public SubtypeOptionContext subtypeOption() {
			return getRuleContext(SubtypeOptionContext.class,0);
		}
		public SuperTypeOptionContext superTypeOption() {
			return getRuleContext(SuperTypeOptionContext.class,0);
		}
		public ParameterOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterParameterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitParameterOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitParameterOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterOptionContext parameterOption() throws RecognitionException {
		ParameterOptionContext _localctx = new ParameterOptionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterOption);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				subtypeOption();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				superTypeOption();
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
	public static class SubtypeOptionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SubType() { return getToken(DeduktParser.SubType, 0); }
		public CommaSeparatedIdentifiersContext commaSeparatedIdentifiers() {
			return getRuleContext(CommaSeparatedIdentifiersContext.class,0);
		}
		public SubtypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterSubtypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitSubtypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitSubtypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtypeOptionContext subtypeOption() throws RecognitionException {
		SubtypeOptionContext _localctx = new SubtypeOptionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subtypeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			identifier();
			setState(529);
			match(SubType);
			setState(530);
			commaSeparatedIdentifiers();
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
	public static class SuperTypeOptionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SuperType() { return getToken(DeduktParser.SuperType, 0); }
		public CommaSeparatedIdentifiersContext commaSeparatedIdentifiers() {
			return getRuleContext(CommaSeparatedIdentifiersContext.class,0);
		}
		public SuperTypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superTypeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterSuperTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitSuperTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitSuperTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperTypeOptionContext superTypeOption() throws RecognitionException {
		SuperTypeOptionContext _localctx = new SuperTypeOptionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_superTypeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			identifier();
			setState(533);
			match(SuperType);
			setState(534);
			commaSeparatedIdentifiers();
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
	public static class SubTypingContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(DeduktParser.Colon, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SubTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterSubTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitSubTyping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitSubTyping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubTypingContext subTyping() throws RecognitionException {
		SubTypingContext _localctx = new SubTypingContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subTyping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(Colon);
			setState(537);
			typeParameters();
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
	public static class ApplicabilityContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(DeduktParser.DoubleColon, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ApplicabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applicability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterApplicability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitApplicability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitApplicability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicabilityContext applicability() throws RecognitionException {
		ApplicabilityContext _localctx = new ApplicabilityContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_applicability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(DoubleColon);
			setState(540);
			typeParameters();
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
	public static class ContextDeclarationContext extends ParserRuleContext {
		public TerminalNode Context() { return getToken(DeduktParser.Context, 0); }
		public HeadlessFunctionContext headlessFunction() {
			return getRuleContext(HeadlessFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContextDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterContextDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitContextDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitContextDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextDeclarationContext contextDeclaration() throws RecognitionException {
		ContextDeclarationContext _localctx = new ContextDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_contextDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Context);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LatexStyleIdentifier || _la==IdentifierOrSoftKeyword) {
				{
				setState(543);
				identifier();
				}
			}

			setState(546);
			headlessFunction();
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
	public static class NotationDeclarationContext extends ParserRuleContext {
		public TerminalNode Notation() { return getToken(DeduktParser.Notation, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ApplicabilityContext applicability() {
			return getRuleContext(ApplicabilityContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public NotationContextContext notationContext() {
			return getRuleContext(NotationContextContext.class,0);
		}
		public NotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterNotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitNotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitNotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotationDeclarationContext notationDeclaration() throws RecognitionException {
		NotationDeclarationContext _localctx = new NotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_notationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(Notation);
			setState(549);
			identifier();
			setState(550);
			applicability();
			setState(551);
			match(Assigment);
			setState(552);
			notationContext();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Fun() { return getToken(DeduktParser.Fun, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionTypeFormatContext functionTypeFormat() {
			return getRuleContext(FunctionTypeFormatContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public HeadlessFunctionContext headlessFunction() {
			return getRuleContext(HeadlessFunctionContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParameterOptionsContext parameterOptions() {
			return getRuleContext(ParameterOptionsContext.class,0);
		}
		public ApplicabilityContext applicability() {
			return getRuleContext(ApplicabilityContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(Fun);
			setState(555);
			identifier();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LAngle) {
				{
				setState(556);
				parameters();
				}
			}

			setState(559);
			functionTypeFormat();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(560);
				parameterOptions();
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(563);
				applicability();
				}
			}

			setState(566);
			match(Assigment);
			setState(567);
			headlessFunction();
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
	public static class FunctionTypeFormatContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(DeduktParser.LParen, 0); }
		public List<CommaSeparatedTypedIdentifiersContext> commaSeparatedTypedIdentifiers() {
			return getRuleContexts(CommaSeparatedTypedIdentifiersContext.class);
		}
		public CommaSeparatedTypedIdentifiersContext commaSeparatedTypedIdentifiers(int i) {
			return getRuleContext(CommaSeparatedTypedIdentifiersContext.class,i);
		}
		public TerminalNode RParen() { return getToken(DeduktParser.RParen, 0); }
		public TerminalNode Arrow() { return getToken(DeduktParser.Arrow, 0); }
		public List<CommaSeparatedIdentifiersContext> commaSeparatedIdentifiers() {
			return getRuleContexts(CommaSeparatedIdentifiersContext.class);
		}
		public CommaSeparatedIdentifiersContext commaSeparatedIdentifiers(int i) {
			return getRuleContext(CommaSeparatedIdentifiersContext.class,i);
		}
		public FunctionTypeFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterFunctionTypeFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitFunctionTypeFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitFunctionTypeFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeFormatContext functionTypeFormat() throws RecognitionException {
		FunctionTypeFormatContext _localctx = new FunctionTypeFormatContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_functionTypeFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LParen);
			setState(570);
			commaSeparatedTypedIdentifiers();
			setState(571);
			match(RParen);
			setState(572);
			match(Arrow);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LatexStyleIdentifier || _la==IdentifierOrSoftKeyword) {
				{
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(573);
					commaSeparatedTypedIdentifiers();
					}
					break;
				case 2:
					{
					setState(574);
					commaSeparatedIdentifiers();
					}
					break;
				}
				}
				setState(579);
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
	public static class OperatorDeclarationContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(DeduktParser.Operator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public OperatorContextContext operatorContext() {
			return getRuleContext(OperatorContextContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public OperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitOperatorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitOperatorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorDeclarationContext operatorDeclaration() throws RecognitionException {
		OperatorDeclarationContext _localctx = new OperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_operatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Operator);
			setState(581);
			identifier();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(582);
				typeOptions();
				}
			}

			setState(585);
			match(Assigment);
			setState(586);
			operatorContext();
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
	public static class StructureDeclarationContext extends ParserRuleContext {
		public TerminalNode Structure() { return getToken(DeduktParser.Structure, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public StructureContextContext structureContext() {
			return getRuleContext(StructureContextContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public StructureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterStructureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitStructureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitStructureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(Structure);
			setState(589);
			identifier();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(590);
				typeOptions();
				}
			}

			setState(593);
			match(Assigment);
			setState(594);
			structureContext();
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
	public static class TheoryDeclarationContext extends ParserRuleContext {
		public TerminalNode Theory() { return getToken(DeduktParser.Theory, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public TheoryContextContext theoryContext() {
			return getRuleContext(TheoryContextContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public TheoryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTheoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTheoryDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTheoryDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoryDeclarationContext theoryDeclaration() throws RecognitionException {
		TheoryDeclarationContext _localctx = new TheoryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_theoryDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(Theory);
			setState(597);
			identifier();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(598);
				typeOptions();
				}
			}

			setState(601);
			match(Assigment);
			setState(602);
			theoryContext();
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
	public static class AxiomDeclarationContext extends ParserRuleContext {
		public TerminalNode Axiom() { return getToken(DeduktParser.Axiom, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public AxiomContextContext axiomContext() {
			return getRuleContext(AxiomContextContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public AxiomDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiomDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAxiomDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAxiomDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAxiomDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomDeclarationContext axiomDeclaration() throws RecognitionException {
		AxiomDeclarationContext _localctx = new AxiomDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_axiomDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(Axiom);
			setState(605);
			identifier();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(606);
				typeOptions();
				}
			}

			setState(609);
			match(Assigment);
			setState(610);
			axiomContext();
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
	public static class RuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Rule() { return getToken(DeduktParser.Rule, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RuleContextContext ruleContext() {
			return getRuleContext(RuleContextContext.class,0);
		}
		public RuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitRuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitRuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleDeclarationContext ruleDeclaration() throws RecognitionException {
		RuleDeclarationContext _localctx = new RuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(Rule);
			setState(613);
			identifier();
			setState(614);
			ruleContext();
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
	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(DeduktParser.At, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeOptionsContext typeOptions() {
			return getRuleContext(TypeOptionsContext.class,0);
		}
		public TerminalNode Assigment() { return getToken(DeduktParser.Assigment, 0); }
		public AnnotationContextContext annotationContext() {
			return getRuleContext(AnnotationContextContext.class,0);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAnnotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(At);
			setState(617);
			identifier();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 73324231433125889L) != 0)) {
				{
				setState(618);
				typeOptions();
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assigment) {
				{
				setState(621);
				match(Assigment);
				setState(622);
				annotationContext();
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
	public static class AnnotationContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AnnotationContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAnnotationContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAnnotationContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAnnotationContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContextContext annotationContext() throws RecognitionException {
		AnnotationContextContext _localctx = new AnnotationContextContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(LBrace);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(626);
				statement();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			match(RBrace);
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
	public static class HeadlessFunctionContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public HeadlessFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headlessFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterHeadlessFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitHeadlessFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitHeadlessFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadlessFunctionContext headlessFunction() throws RecognitionException {
		HeadlessFunctionContext _localctx = new HeadlessFunctionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_headlessFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LBrace);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					statement();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(641);
				returnable();
				}
			}

			setState(644);
			match(RBrace);
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
	public static class ReturnableContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(DeduktParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterReturnable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitReturnable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitReturnable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnableContext returnable() throws RecognitionException {
		ReturnableContext _localctx = new ReturnableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_returnable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(Return);
			setState(647);
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
	public static class TypeContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TypeContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTypeContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTypeContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTypeContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContextContext typeContext() throws RecognitionException {
		TypeContextContext _localctx = new TypeContextContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(LBrace);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(650);
				statement();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(RBrace);
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
	public static class NotationContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NotationContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notationContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterNotationContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitNotationContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitNotationContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotationContextContext notationContext() throws RecognitionException {
		NotationContextContext _localctx = new NotationContextContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_notationContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(LBrace);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(659);
				statement();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(RBrace);
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
	public static class OperatorContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OperatorContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterOperatorContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitOperatorContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitOperatorContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContextContext operatorContext() throws RecognitionException {
		OperatorContextContext _localctx = new OperatorContextContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_operatorContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(LBrace);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(668);
				statement();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			match(RBrace);
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
	public static class StructureContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StructureContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterStructureContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitStructureContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitStructureContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContextContext structureContext() throws RecognitionException {
		StructureContextContext _localctx = new StructureContextContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_structureContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(LBrace);
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(677);
				statement();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			match(RBrace);
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
	public static class TheoryContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TheoryContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoryContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterTheoryContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitTheoryContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitTheoryContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoryContextContext theoryContext() throws RecognitionException {
		TheoryContextContext _localctx = new TheoryContextContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_theoryContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LBrace);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(686);
				statement();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
			match(RBrace);
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
	public static class AxiomContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AxiomContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiomContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterAxiomContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitAxiomContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitAxiomContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomContextContext axiomContext() throws RecognitionException {
		AxiomContextContext _localctx = new AxiomContextContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_axiomContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(LBrace);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(695);
				statement();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(RBrace);
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
	public static class RuleContextContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(DeduktParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(DeduktParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RuleContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterRuleContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitRuleContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitRuleContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContextContext ruleContext() throws RecognitionException {
		RuleContextContext _localctx = new RuleContextContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ruleContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(LBrace);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26282644345934848L) != 0) || _la==Number || _la==DecimalNumber) {
				{
				{
				setState(704);
				statement();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			match(RBrace);
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
	public static class CommaSeparatedIdentifiersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DeduktParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DeduktParser.Comma, i);
		}
		public CommaSeparatedIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSeparatedIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterCommaSeparatedIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitCommaSeparatedIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitCommaSeparatedIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaSeparatedIdentifiersContext commaSeparatedIdentifiers() throws RecognitionException {
		CommaSeparatedIdentifiersContext _localctx = new CommaSeparatedIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_commaSeparatedIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			identifier();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(713);
				match(Comma);
				setState(714);
				identifier();
				}
				}
				setState(719);
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
	public static class CommaSeparatedTypedIdentifiersContext extends ParserRuleContext {
		public List<DependentTypeContext> dependentType() {
			return getRuleContexts(DependentTypeContext.class);
		}
		public DependentTypeContext dependentType(int i) {
			return getRuleContext(DependentTypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DeduktParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DeduktParser.Comma, i);
		}
		public CommaSeparatedTypedIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSeparatedTypedIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterCommaSeparatedTypedIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitCommaSeparatedTypedIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitCommaSeparatedTypedIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaSeparatedTypedIdentifiersContext commaSeparatedTypedIdentifiers() throws RecognitionException {
		CommaSeparatedTypedIdentifiersContext _localctx = new CommaSeparatedTypedIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_commaSeparatedTypedIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			dependentType();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(721);
				match(Comma);
				setState(722);
				dependentType();
				}
				}
				setState(727);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierOrSoftKeyword() { return getToken(DeduktParser.IdentifierOrSoftKeyword, 0); }
		public TerminalNode LatexStyleIdentifier() { return getToken(DeduktParser.LatexStyleIdentifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==LatexStyleIdentifier || _la==IdentifierOrSoftKeyword) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Number() { return getToken(DeduktParser.Number, 0); }
		public TerminalNode DecimalNumber() { return getToken(DeduktParser.DecimalNumber, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeduktListener ) ((DeduktListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeduktVisitor ) return ((DeduktVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_literal);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LatexStyleIdentifier:
			case IdentifierOrSoftKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				identifier();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(Number);
				}
				break;
			case DecimalNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(DecimalNumber);
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

	public static final String _serializedATN =
		"\u0004\u0001J\u02e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000\u0003\u0000"+
		"\u00a0\b\u0000\u0001\u0000\u0003\u0000\u00a3\b\u0000\u0001\u0000\u0003"+
		"\u0000\u00a6\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u00aa\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00ae\b\u0002\n\u0002\f\u0002\u00b1"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00b5\b\u0002\n\u0002\f\u0002"+
		"\u00b8\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00bd\b"+
		"\u0003\n\u0003\f\u0003\u00c0\t\u0003\u0001\u0004\u0004\u0004\u00c3\b\u0004"+
		"\u000b\u0004\f\u0004\u00c4\u0001\u0005\u0001\u0005\u0005\u0005\u00c9\b"+
		"\u0005\n\u0005\f\u0005\u00cc\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00d1\b\u0005\u0001\u0005\u0005\u0005\u00d4\b\u0005\n\u0005"+
		"\f\u0005\u00d7\t\u0005\u0001\u0006\u0004\u0006\u00da\b\u0006\u000b\u0006"+
		"\f\u0006\u00db\u0001\u0007\u0001\u0007\u0003\u0007\u00e0\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00e5\b\b\n\b\f\b\u00e8\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f0\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00f7\b\n\n\n\f\n\u00fa\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0102"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u010b\b\f\u0001\r\u0001\r\u0005\r\u010f\b\r\n\r\f\r\u0112\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0117\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u011e\b\u000f\n"+
		"\u000f\f\u000f\u0121\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0128\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012f\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0137"+
		"\b\u0011\u0003\u0011\u0139\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u013f\b\u0011\u0003\u0011\u0141\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u014c\b\u0014\u000b\u0014\f"+
		"\u0014\u014d\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0159\b\u0015"+
		"\u000b\u0015\f\u0015\u015a\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0164\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0175\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u017a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u018d\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0192\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0197\b\u001f\u0001 \u0001 \u0001 \u0003 \u019c\b \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0003#\u01a4\b#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0003$\u01ad\b$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01b6\b&\u0001&\u0001&\u0003&\u01ba\b&\u0001"+
		"\'\u0001\'\u0003\'\u01be\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01d0\b*\u0001+\u0001+\u0001+\u0003+\u01d5\b+\u0001+\u0001+\u0003"+
		"+\u01d9\b+\u0001,\u0001,\u0003,\u01dd\b,\u0001,\u0003,\u01e0\b,\u0001"+
		",\u0003,\u01e3\b,\u0001,\u0001,\u0003,\u01e7\b,\u0001,\u0003,\u01ea\b"+
		",\u0001,\u0001,\u0003,\u01ee\b,\u0001,\u0003,\u01f1\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0005.\u01fa\b.\n.\f.\u01fd\t.\u0001/\u0001"+
		"/\u0003/\u0201\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00041\u0209"+
		"\b1\u000b1\f1\u020a\u00012\u00012\u00032\u020f\b2\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00017\u00017\u00037\u0221\b7\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00039\u022e\b9\u00019\u0001"+
		"9\u00039\u0232\b9\u00019\u00039\u0235\b9\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0005:\u0240\b:\n:\f:\u0243\t:\u0001;\u0001"+
		";\u0001;\u0003;\u0248\b;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0003"+
		"<\u0250\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0003=\u0258\b=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0003>\u0260\b>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u026c\b@\u0001"+
		"@\u0001@\u0003@\u0270\b@\u0001A\u0001A\u0005A\u0274\bA\nA\fA\u0277\tA"+
		"\u0001A\u0001A\u0001B\u0001B\u0005B\u027d\bB\nB\fB\u0280\tB\u0001B\u0003"+
		"B\u0283\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0005D\u028c"+
		"\bD\nD\fD\u028f\tD\u0001D\u0001D\u0001E\u0001E\u0005E\u0295\bE\nE\fE\u0298"+
		"\tE\u0001E\u0001E\u0001F\u0001F\u0005F\u029e\bF\nF\fF\u02a1\tF\u0001F"+
		"\u0001F\u0001G\u0001G\u0005G\u02a7\bG\nG\fG\u02aa\tG\u0001G\u0001G\u0001"+
		"H\u0001H\u0005H\u02b0\bH\nH\fH\u02b3\tH\u0001H\u0001H\u0001I\u0001I\u0005"+
		"I\u02b9\bI\nI\fI\u02bc\tI\u0001I\u0001I\u0001J\u0001J\u0005J\u02c2\bJ"+
		"\nJ\fJ\u02c5\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u02cc\bK\nK"+
		"\fK\u02cf\tK\u0001L\u0001L\u0001L\u0005L\u02d4\bL\nL\fL\u02d7\tL\u0001"+
		"M\u0001M\u0001N\u0001N\u0001N\u0003N\u02de\bN\u0001N\u0000\u0000O\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u0000\u0002\u0001\u0000\u001c\u001e\u0002\u0000..00\u02fa\u0000\u00a5"+
		"\u0001\u0000\u0000\u0000\u0002\u00a7\u0001\u0000\u0000\u0000\u0004\u00ab"+
		"\u0001\u0000\u0000\u0000\u0006\u00b9\u0001\u0000\u0000\u0000\b\u00c2\u0001"+
		"\u0000\u0000\u0000\n\u00c6\u0001\u0000\u0000\u0000\f\u00d9\u0001\u0000"+
		"\u0000\u0000\u000e\u00df\u0001\u0000\u0000\u0000\u0010\u00ef\u0001\u0000"+
		"\u0000\u0000\u0012\u00f1\u0001\u0000\u0000\u0000\u0014\u00f3\u0001\u0000"+
		"\u0000\u0000\u0016\u0101\u0001\u0000\u0000\u0000\u0018\u010a\u0001\u0000"+
		"\u0000\u0000\u001a\u010c\u0001\u0000\u0000\u0000\u001c\u0113\u0001\u0000"+
		"\u0000\u0000\u001e\u011a\u0001\u0000\u0000\u0000 \u0127\u0001\u0000\u0000"+
		"\u0000\"\u0129\u0001\u0000\u0000\u0000$\u0142\u0001\u0000\u0000\u0000"+
		"&\u0147\u0001\u0000\u0000\u0000(\u014b\u0001\u0000\u0000\u0000*\u0151"+
		"\u0001\u0000\u0000\u0000,\u0165\u0001\u0000\u0000\u0000.\u016b\u0001\u0000"+
		"\u0000\u00000\u0174\u0001\u0000\u0000\u00002\u0179\u0001\u0000\u0000\u0000"+
		"4\u017b\u0001\u0000\u0000\u00006\u017f\u0001\u0000\u0000\u00008\u0183"+
		"\u0001\u0000\u0000\u0000:\u018c\u0001\u0000\u0000\u0000<\u0191\u0001\u0000"+
		"\u0000\u0000>\u0196\u0001\u0000\u0000\u0000@\u019b\u0001\u0000\u0000\u0000"+
		"B\u019d\u0001\u0000\u0000\u0000D\u01a0\u0001\u0000\u0000\u0000F\u01a3"+
		"\u0001\u0000\u0000\u0000H\u01ac\u0001\u0000\u0000\u0000J\u01ae\u0001\u0000"+
		"\u0000\u0000L\u01b1\u0001\u0000\u0000\u0000N\u01bd\u0001\u0000\u0000\u0000"+
		"P\u01bf\u0001\u0000\u0000\u0000R\u01c2\u0001\u0000\u0000\u0000T\u01cf"+
		"\u0001\u0000\u0000\u0000V\u01d1\u0001\u0000\u0000\u0000X\u01f0\u0001\u0000"+
		"\u0000\u0000Z\u01f2\u0001\u0000\u0000\u0000\\\u01f6\u0001\u0000\u0000"+
		"\u0000^\u0200\u0001\u0000\u0000\u0000`\u0202\u0001\u0000\u0000\u0000b"+
		"\u0206\u0001\u0000\u0000\u0000d\u020e\u0001\u0000\u0000\u0000f\u0210\u0001"+
		"\u0000\u0000\u0000h\u0214\u0001\u0000\u0000\u0000j\u0218\u0001\u0000\u0000"+
		"\u0000l\u021b\u0001\u0000\u0000\u0000n\u021e\u0001\u0000\u0000\u0000p"+
		"\u0224\u0001\u0000\u0000\u0000r\u022a\u0001\u0000\u0000\u0000t\u0239\u0001"+
		"\u0000\u0000\u0000v\u0244\u0001\u0000\u0000\u0000x\u024c\u0001\u0000\u0000"+
		"\u0000z\u0254\u0001\u0000\u0000\u0000|\u025c\u0001\u0000\u0000\u0000~"+
		"\u0264\u0001\u0000\u0000\u0000\u0080\u0268\u0001\u0000\u0000\u0000\u0082"+
		"\u0271\u0001\u0000\u0000\u0000\u0084\u027a\u0001\u0000\u0000\u0000\u0086"+
		"\u0286\u0001\u0000\u0000\u0000\u0088\u0289\u0001\u0000\u0000\u0000\u008a"+
		"\u0292\u0001\u0000\u0000\u0000\u008c\u029b\u0001\u0000\u0000\u0000\u008e"+
		"\u02a4\u0001\u0000\u0000\u0000\u0090\u02ad\u0001\u0000\u0000\u0000\u0092"+
		"\u02b6\u0001\u0000\u0000\u0000\u0094\u02bf\u0001\u0000\u0000\u0000\u0096"+
		"\u02c8\u0001\u0000\u0000\u0000\u0098\u02d0\u0001\u0000\u0000\u0000\u009a"+
		"\u02d8\u0001\u0000\u0000\u0000\u009c\u02dd\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0003\f\u0006\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0005\u0000\u0000\u0001\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u0001\u0001\u0000\u0000\u0000\u00a7\u00a9"+
		"\u0003\u0004\u0002\u0000\u00a8\u00aa\u0003\b\u0004\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0003\u0001"+
		"\u0000\u0000\u0000\u00ab\u00af\u0005\b\u0000\u0000\u00ac\u00ae\u0005\u0005"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b6\u0003\u0006\u0003\u0000\u00b3\u00b5\u0005\u0004"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u0005\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00be\u00050\u0000\u0000\u00ba\u00bb\u0005>\u0000\u0000"+
		"\u00bb\u00bd\u00050\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u0007\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003\n\u0005\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\t\u0001"+
		"\u0000\u0000\u0000\u00c6\u00ca\u0005\t\u0000\u0000\u00c7\u00c9\u0005\u0005"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0003\u0006\u0003\u0000\u00ce\u00cf\u0005>\u0000"+
		"\u0000\u00cf\u00d1\u0005?\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d4\u0005\u0004\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u000b\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0003\u000e\u0007\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\r\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003T*\u0000\u00de\u00e0"+
		"\u0003\u0010\b\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u000f\u0001\u0000\u0000\u0000\u00e1\u00e6\u0003"+
		"\u0012\t\u0000\u00e2\u00e3\u0005<\u0000\u0000\u00e3\u00e5\u0003\u0012"+
		"\t\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00f0\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00f0\u0003 \u0010\u0000\u00ea\u00f0\u00030\u0018\u0000\u00eb"+
		"\u00f0\u0003:\u001d\u0000\u00ec\u00f0\u0003D\"\u0000\u00ed\u00f0\u0003"+
		"H$\u0000\u00ee\u00f0\u0003N\'\u0000\u00ef\u00e1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u0011\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u0014\n\u0000\u00f2"+
		"\u0013\u0001\u0000\u0000\u0000\u00f3\u00f8\u0003\u0018\f\u0000\u00f4\u00f7"+
		"\u0003\u0016\u000b\u0000\u00f5\u00f7\u0003\u0018\f\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u0015\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005>\u0000\u0000\u00fc\u0102\u0003\u001c"+
		"\u000e\u0000\u00fd\u00fe\u0005>\u0000\u0000\u00fe\u0102\u0003\u0084B\u0000"+
		"\u00ff\u0100\u0005>\u0000\u0000\u0100\u0102\u0003\u009aM\u0000\u0101\u00fb"+
		"\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0017\u0001\u0000\u0000\u0000\u0103\u010b"+
		"\u0003\u001a\r\u0000\u0104\u010b\u0003\u0084B\u0000\u0105\u010b\u0003"+
		"\u001c\u000e\u0000\u0106\u0107\u00054\u0000\u0000\u0107\u0108\u0003\u0012"+
		"\t\u0000\u0108\u0109\u00055\u0000\u0000\u0109\u010b\u0001\u0000\u0000"+
		"\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000"+
		"\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010b\u0019\u0001\u0000\u0000\u0000\u010c\u0110\u0003\u009cN\u0000"+
		"\u010d\u010f\u0003\u009cN\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u001b\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u009aM\u0000\u0114\u0116"+
		"\u00056\u0000\u0000\u0115\u0117\u0003\u001e\u000f\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u00057\u0000\u0000\u0119\u001d\u0001\u0000"+
		"\u0000\u0000\u011a\u011f\u0003\u0012\t\u0000\u011b\u011c\u0005@\u0000"+
		"\u0000\u011c\u011e\u0003\u0012\t\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0128\u0003\"\u0011\u0000\u0123"+
		"\u0128\u0003$\u0012\u0000\u0124\u0128\u0003*\u0015\u0000\u0125\u0128\u0003"+
		",\u0016\u0000\u0126\u0128\u0003.\u0017\u0000\u0127\u0122\u0001\u0000\u0000"+
		"\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0128!\u0001\u0000\u0000\u0000\u0129\u012a\u0005\f\u0000\u0000"+
		"\u012a\u012e\u0003\u0012\t\u0000\u012b\u012c\u0005D\u0000\u0000\u012c"+
		"\u012f\u0003\u0012\t\u0000\u012d\u012f\u0003\u0084B\u0000\u012e\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0138"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0005\r\u0000\u0000\u0131\u0132\u0005"+
		"\f\u0000\u0000\u0132\u0136\u0003\u0012\t\u0000\u0133\u0134\u0005D\u0000"+
		"\u0000\u0134\u0137\u0003\u0012\t\u0000\u0135\u0137\u0003\u0084B\u0000"+
		"\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u0140\u0001\u0000\u0000\u0000"+
		"\u013a\u013e\u0005\r\u0000\u0000\u013b\u013c\u0005D\u0000\u0000\u013c"+
		"\u013f\u0003\u0012\t\u0000\u013d\u013f\u0003\u0084B\u0000\u013e\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141#\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"\u000e\u0000\u0000\u0143\u0144\u0003\u0012\t\u0000\u0144\u0145\u0005D"+
		"\u0000\u0000\u0145\u0146\u0003\u0012\t\u0000\u0146%\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u000f\u0000\u0000\u0148\u0149\u0003\u0012\t\u0000"+
		"\u0149\'\u0001\u0000\u0000\u0000\u014a\u014c\u0003$\u0012\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0003&\u0013\u0000\u0150)\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005\u0010\u0000\u0000\u0152\u0163\u0003"+
		"\u0012\t\u0000\u0153\u0154\u00051\u0000\u0000\u0154\u0155\u0003\u0012"+
		"\t\u0000\u0155\u0156\u0005D\u0000\u0000\u0156\u0157\u0003\u0012\t\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0153\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u00051\u0000\u0000\u015d\u015e\u0003&\u0013\u0000\u015e\u0164"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u00056\u0000\u0000\u0160\u0161\u0003"+
		"(\u0014\u0000\u0161\u0162\u00057\u0000\u0000\u0162\u0164\u0001\u0000\u0000"+
		"\u0000\u0163\u0158\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000"+
		"\u0000\u0164+\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0011\u0000\u0000"+
		"\u0166\u0167\u0003\u0012\t\u0000\u0167\u0168\u0005\r\u0000\u0000\u0168"+
		"\u0169\u0005\u0019\u0000\u0000\u0169\u016a\u0003\u0012\t\u0000\u016a-"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0003\u0012\t\u0000\u016c\u016d\u0005"+
		"E\u0000\u0000\u016d\u016e\u0003\u0012\t\u0000\u016e\u016f\u0005=\u0000"+
		"\u0000\u016f\u0170\u0003\u0012\t\u0000\u0170/\u0001\u0000\u0000\u0000"+
		"\u0171\u0175\u00034\u001a\u0000\u0172\u0175\u00036\u001b\u0000\u0173\u0175"+
		"\u00038\u001c\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u01751\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005D\u0000\u0000\u0177\u017a\u0003\u0012\t"+
		"\u0000\u0178\u017a\u0003\u0084B\u0000\u0179\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u017a3\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005\u0012\u0000\u0000\u017c\u017d\u0003\u0012\t\u0000\u017d\u017e"+
		"\u00032\u0019\u0000\u017e5\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u0013"+
		"\u0000\u0000\u0180\u0181\u0003\u0012\t\u0000\u0181\u0182\u00032\u0019"+
		"\u0000\u01827\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0014\u0000\u0000"+
		"\u0184\u0185\u00032\u0019\u0000\u0185\u0186\u0005\u0013\u0000\u0000\u0186"+
		"\u0187\u0003\u0012\t\u0000\u01879\u0001\u0000\u0000\u0000\u0188\u018d"+
		"\u0003<\u001e\u0000\u0189\u018d\u0003>\u001f\u0000\u018a\u018d\u0003@"+
		" \u0000\u018b\u018d\u0003B!\u0000\u018c\u0188\u0001\u0000\u0000\u0000"+
		"\u018c\u0189\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018d;\u0001\u0000\u0000\u0000\u018e"+
		"\u0192\u0005\u0015\u0000\u0000\u018f\u0190\u0005\u0016\u0000\u0000\u0190"+
		"\u0192\u0003\u009aM\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0192=\u0001\u0000\u0000\u0000\u0193\u0197\u0005"+
		"\u0017\u0000\u0000\u0194\u0195\u0005\u0018\u0000\u0000\u0195\u0197\u0003"+
		"\u009aM\u0000\u0196\u0193\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197?\u0001\u0000\u0000\u0000\u0198\u019c\u0005\u0019\u0000"+
		"\u0000\u0199\u019a\u0005\u001a\u0000\u0000\u019a\u019c\u0003\u009aM\u0000"+
		"\u019b\u0198\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019cA\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u001b\u0000\u0000\u019e"+
		"\u019f\u0003\u009aM\u0000\u019fC\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003"+
		"F#\u0000\u01a1E\u0001\u0000\u0000\u0000\u01a2\u01a4\u0007\u0000\u0000"+
		"\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003\u009aM\u0000"+
		"\u01a6\u01a7\u0003j5\u0000\u01a7\u01a8\u0005F\u0000\u0000\u01a8\u01a9"+
		"\u0003\u0012\t\u0000\u01a9G\u0001\u0000\u0000\u0000\u01aa\u01ad\u0003"+
		"J%\u0000\u01ab\u01ad\u0003L&\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01adI\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0005\u001f\u0000\u0000\u01af\u01b0\u0003\u0012\t\u0000\u01b0K"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\"\u0000\u0000\u01b2\u01b5\u0003"+
		"2\u0019\u0000\u01b3\u01b4\u0005 \u0000\u0000\u01b4\u01b6\u00032\u0019"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005!\u0000\u0000"+
		"\u01b8\u01ba\u00032\u0019\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01baM\u0001\u0000\u0000\u0000\u01bb\u01be"+
		"\u0003P(\u0000\u01bc\u01be\u0003R)\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01beO\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005#\u0000\u0000\u01c0\u01c1\u0003\u0012\t\u0000\u01c1"+
		"Q\u0001\u0000\u0000\u0000\u01c2\u01c3\u00053\u0000\u0000\u01c3\u01c4\u0005"+
		"$\u0000\u0000\u01c4S\u0001\u0000\u0000\u0000\u01c5\u01d0\u0003V+\u0000"+
		"\u01c6\u01d0\u0003n7\u0000\u01c7\u01d0\u0003p8\u0000\u01c8\u01d0\u0003"+
		"r9\u0000\u01c9\u01d0\u0003v;\u0000\u01ca\u01d0\u0003x<\u0000\u01cb\u01d0"+
		"\u0003z=\u0000\u01cc\u01d0\u0003|>\u0000\u01cd\u01d0\u0003~?\u0000\u01ce"+
		"\u01d0\u0003\u0080@\u0000\u01cf\u01c5\u0001\u0000\u0000\u0000\u01cf\u01c6"+
		"\u0001\u0000\u0000\u0000\u01cf\u01c7\u0001\u0000\u0000\u0000\u01cf\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cf\u01c9\u0001\u0000\u0000\u0000\u01cf\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0U\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005"+
		"\n\u0000\u0000\u01d2\u01d4\u0003\u009aM\u0000\u01d3\u01d5\u0003X,\u0000"+
		"\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005I\u0000\u0000\u01d7"+
		"\u01d9\u0003\u0088D\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9W\u0001\u0000\u0000\u0000\u01da\u01dc\u0003"+
		"Z-\u0000\u01db\u01dd\u0003b1\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0003j5\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01e3"+
		"\u0003l6\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01f1\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003b1\u0000"+
		"\u01e5\u01e7\u0003j5\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01ea"+
		"\u0003l6\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01f1\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003j5\u0000"+
		"\u01ec\u01ee\u0003l6\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01f1"+
		"\u0003l6\u0000\u01f0\u01da\u0001\u0000\u0000\u0000\u01f0\u01e4\u0001\u0000"+
		"\u0000\u0000\u01f0\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1Y\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005:\u0000\u0000"+
		"\u01f3\u01f4\u0003\\.\u0000\u01f4\u01f5\u0005;\u0000\u0000\u01f5[\u0001"+
		"\u0000\u0000\u0000\u01f6\u01fb\u0003^/\u0000\u01f7\u01f8\u0005@\u0000"+
		"\u0000\u01f8\u01fa\u0003^/\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc]\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fe\u0201\u0003\u009aM\u0000\u01ff\u0201\u0003"+
		"`0\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201_\u0001\u0000\u0000\u0000\u0202\u0203\u0003\u009aM\u0000\u0203"+
		"\u0204\u0005=\u0000\u0000\u0204\u0205\u0003\u009aM\u0000\u0205a\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0005\u000b\u0000\u0000\u0207\u0209\u0003"+
		"d2\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020bc\u0001\u0000\u0000\u0000\u020c\u020f\u0003f3\u0000\u020d"+
		"\u020f\u0003h4\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020d\u0001"+
		"\u0000\u0000\u0000\u020fe\u0001\u0000\u0000\u0000\u0210\u0211\u0003\u009a"+
		"M\u0000\u0211\u0212\u0005A\u0000\u0000\u0212\u0213\u0003\u0096K\u0000"+
		"\u0213g\u0001\u0000\u0000\u0000\u0214\u0215\u0003\u009aM\u0000\u0215\u0216"+
		"\u0005B\u0000\u0000\u0216\u0217\u0003\u0096K\u0000\u0217i\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0005=\u0000\u0000\u0219\u021a\u0003\\.\u0000"+
		"\u021ak\u0001\u0000\u0000\u0000\u021b\u021c\u0005C\u0000\u0000\u021c\u021d"+
		"\u0003\\.\u0000\u021dm\u0001\u0000\u0000\u0000\u021e\u0220\u0005%\u0000"+
		"\u0000\u021f\u0221\u0003\u009aM\u0000\u0220\u021f\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0003\u0084B\u0000\u0223o\u0001\u0000\u0000\u0000\u0224\u0225"+
		"\u0005&\u0000\u0000\u0225\u0226\u0003\u009aM\u0000\u0226\u0227\u0003l"+
		"6\u0000\u0227\u0228\u0005I\u0000\u0000\u0228\u0229\u0003\u008aE\u0000"+
		"\u0229q\u0001\u0000\u0000\u0000\u022a\u022b\u0005(\u0000\u0000\u022b\u022d"+
		"\u0003\u009aM\u0000\u022c\u022e\u0003Z-\u0000\u022d\u022c\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f\u0231\u0003t:\u0000\u0230\u0232\u0003b1\u0000\u0231"+
		"\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0234\u0001\u0000\u0000\u0000\u0233\u0235\u0003l6\u0000\u0234\u0233\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0005I\u0000\u0000\u0237\u0238\u0003\u0084"+
		"B\u0000\u0238s\u0001\u0000\u0000\u0000\u0239\u023a\u00054\u0000\u0000"+
		"\u023a\u023b\u0003\u0098L\u0000\u023b\u023c\u00055\u0000\u0000\u023c\u0241"+
		"\u0005D\u0000\u0000\u023d\u0240\u0003\u0098L\u0000\u023e\u0240\u0003\u0096"+
		"K\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242u\u0001\u0000\u0000\u0000"+
		"\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0245\u0005)\u0000\u0000\u0245"+
		"\u0247\u0003\u009aM\u0000\u0246\u0248\u0003X,\u0000\u0247\u0246\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0005I\u0000\u0000\u024a\u024b\u0003\u008c"+
		"F\u0000\u024bw\u0001\u0000\u0000\u0000\u024c\u024d\u0005*\u0000\u0000"+
		"\u024d\u024f\u0003\u009aM\u0000\u024e\u0250\u0003X,\u0000\u024f\u024e"+
		"\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0001\u0000\u0000\u0000\u0251\u0252\u0005I\u0000\u0000\u0252\u0253\u0003"+
		"\u008eG\u0000\u0253y\u0001\u0000\u0000\u0000\u0254\u0255\u0005+\u0000"+
		"\u0000\u0255\u0257\u0003\u009aM\u0000\u0256\u0258\u0003X,\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0005I\u0000\u0000\u025a\u025b"+
		"\u0003\u0090H\u0000\u025b{\u0001\u0000\u0000\u0000\u025c\u025d\u0005\'"+
		"\u0000\u0000\u025d\u025f\u0003\u009aM\u0000\u025e\u0260\u0003X,\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0005I\u0000\u0000\u0262"+
		"\u0263\u0003\u0092I\u0000\u0263}\u0001\u0000\u0000\u0000\u0264\u0265\u0005"+
		",\u0000\u0000\u0265\u0266\u0003\u009aM\u0000\u0266\u0267\u0003\u0094J"+
		"\u0000\u0267\u007f\u0001\u0000\u0000\u0000\u0268\u0269\u00052\u0000\u0000"+
		"\u0269\u026b\u0003\u009aM\u0000\u026a\u026c\u0003X,\u0000\u026b\u026a"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026f"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0005I\u0000\u0000\u026e\u0270\u0003"+
		"\u0082A\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000"+
		"\u0000\u0000\u0270\u0081\u0001\u0000\u0000\u0000\u0271\u0275\u00056\u0000"+
		"\u0000\u0272\u0274\u0003\u000e\u0007\u0000\u0273\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0001\u0000\u0000"+
		"\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u0279\u00057\u0000\u0000"+
		"\u0279\u0083\u0001\u0000\u0000\u0000\u027a\u027e\u00056\u0000\u0000\u027b"+
		"\u027d\u0003\u000e\u0007\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d"+
		"\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280"+
		"\u027e\u0001\u0000\u0000\u0000\u0281\u0283\u0003\u0086C\u0000\u0282\u0281"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284"+
		"\u0001\u0000\u0000\u0000\u0284\u0285\u00057\u0000\u0000\u0285\u0085\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0005\u0019\u0000\u0000\u0287\u0288\u0003"+
		"\u0012\t\u0000\u0288\u0087\u0001\u0000\u0000\u0000\u0289\u028d\u00056"+
		"\u0000\u0000\u028a\u028c\u0003\u000e\u0007\u0000\u028b\u028a\u0001\u0000"+
		"\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0291\u00057\u0000"+
		"\u0000\u0291\u0089\u0001\u0000\u0000\u0000\u0292\u0296\u00056\u0000\u0000"+
		"\u0293\u0295\u0003\u000e\u0007\u0000\u0294\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0299\u0001\u0000\u0000\u0000"+
		"\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029a\u00057\u0000\u0000\u029a"+
		"\u008b\u0001\u0000\u0000\u0000\u029b\u029f\u00056\u0000\u0000\u029c\u029e"+
		"\u0003\u000e\u0007\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029e\u02a1"+
		"\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u00057\u0000\u0000\u02a3\u008d\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a8\u00056\u0000\u0000\u02a5\u02a7\u0003\u000e"+
		"\u0007\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u00057\u0000\u0000\u02ac\u008f\u0001\u0000\u0000"+
		"\u0000\u02ad\u02b1\u00056\u0000\u0000\u02ae\u02b0\u0003\u000e\u0007\u0000"+
		"\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u00057\u0000\u0000\u02b5\u0091\u0001\u0000\u0000\u0000\u02b6"+
		"\u02ba\u00056\u0000\u0000\u02b7\u02b9\u0003\u000e\u0007\u0000\u02b8\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02be"+
		"\u00057\u0000\u0000\u02be\u0093\u0001\u0000\u0000\u0000\u02bf\u02c3\u0005"+
		"6\u0000\u0000\u02c0\u02c2\u0003\u000e\u0007\u0000\u02c1\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c7\u00057\u0000"+
		"\u0000\u02c7\u0095\u0001\u0000\u0000\u0000\u02c8\u02cd\u0003\u009aM\u0000"+
		"\u02c9\u02ca\u0005@\u0000\u0000\u02ca\u02cc\u0003\u009aM\u0000\u02cb\u02c9"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u0097"+
		"\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d5"+
		"\u0003`0\u0000\u02d1\u02d2\u0005@\u0000\u0000\u02d2\u02d4\u0003`0\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d6\u0099\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0007\u0001\u0000\u0000\u02d9\u009b\u0001\u0000\u0000\u0000"+
		"\u02da\u02de\u0003\u009aM\u0000\u02db\u02de\u0005G\u0000\u0000\u02dc\u02de"+
		"\u0005J\u0000\u0000\u02dd\u02da\u0001\u0000\u0000\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02de\u009d\u0001"+
		"\u0000\u0000\u0000Q\u009f\u00a2\u00a5\u00a9\u00af\u00b6\u00be\u00c4\u00ca"+
		"\u00d0\u00d5\u00db\u00df\u00e6\u00ef\u00f6\u00f8\u0101\u010a\u0110\u0116"+
		"\u011f\u0127\u012e\u0136\u0138\u013e\u0140\u014d\u015a\u0163\u0174\u0179"+
		"\u018c\u0191\u0196\u019b\u01a3\u01ac\u01b5\u01b9\u01bd\u01cf\u01d4\u01d8"+
		"\u01dc\u01df\u01e2\u01e6\u01e9\u01ed\u01f0\u01fb\u0200\u020a\u020e\u0220"+
		"\u022d\u0231\u0234\u023f\u0241\u0247\u024f\u0257\u025f\u026b\u026f\u0275"+
		"\u027e\u0282\u028d\u0296\u029f\u02a8\u02b1\u02ba\u02c3\u02cd\u02d5\u02dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}