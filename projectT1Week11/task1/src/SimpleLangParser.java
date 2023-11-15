// Generated from C:/Users/James/projects/G5035-Compilers-and-Computer-Architecture/projectT1Week11/task1/src/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LParen=1, Comma=2, RParen=3, LBrace=4, Semicolon=5, RBrace=6, Eq=7, Less=8, 
		LessEq=9, Greater=10, GreaterEq=11, Slash=12, And=13, Or=14, Power=15, 
		Plus=16, Times=17, Minus=18, Assign=19, Print=20, Space=21, NewLine=22, 
		Skip=23, If=24, Then=25, Else=26, While=27, Repeat=28, Do=29, Until=30, 
		IntType=31, BoolType=32, UnitType=33, BoolLit=34, IntLit=35, Idfr=36, 
		WS=37;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_typed_idfr = 3, RULE_type = 4, 
		RULE_body = 5, RULE_block = 6, RULE_ene = 7, RULE_exp = 8, RULE_args = 9, 
		RULE_binop = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "typed_idfr", "type", "body", "block", "ene", 
			"exp", "args", "binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "';'", "'}'", "'=='", "'<'", "'<='", 
			"'>'", "'>='", "'/'", "'&'", "'|'", "'^'", "'+'", "'*'", "'-'", "':='", 
			"'print'", "'space'", "'newline'", "'skip'", "'if'", "'then'", "'else'", 
			"'while'", "'repeat'", "'do'", "'until'", "'int'", "'bool'", "'unit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "Eq", 
			"Less", "LessEq", "Greater", "GreaterEq", "Slash", "And", "Or", "Power", 
			"Plus", "Times", "Minus", "Assign", "Print", "Space", "NewLine", "Skip", 
			"If", "Then", "Else", "While", "Repeat", "Do", "Until", "IntType", "BoolType", 
			"UnitType", "BoolLit", "IntLit", "Idfr", "WS"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				dec();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0) );
			setState(27);
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
	public static class DecContext extends ParserRuleContext {
		public Typed_idfrContext typed_idfr() {
			return getRuleContext(Typed_idfrContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			typed_idfr();
			setState(30);
			match(LParen);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) {
				{
				setState(31);
				vardec();
				}
			}

			setState(34);
			match(RParen);
			setState(35);
			body();
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
	public static class VardecContext extends ParserRuleContext {
		public List<Typed_idfrContext> typed_idfr() {
			return getRuleContexts(Typed_idfrContext.class);
		}
		public Typed_idfrContext typed_idfr(int i) {
			return getRuleContext(Typed_idfrContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			typed_idfr();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(38);
				match(Comma);
				setState(39);
				typed_idfr();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Typed_idfrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public Typed_idfrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_idfr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTyped_idfr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_idfrContext typed_idfr() throws RecognitionException {
		Typed_idfrContext _localctx = new Typed_idfrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typed_idfr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			type();
			setState(46);
			match(Idfr);
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
		public TerminalNode IntType() { return getToken(SimpleLangParser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(SimpleLangParser.BoolType, 0); }
		public TerminalNode UnitType() { return getToken(SimpleLangParser.UnitType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SimpleLangParser.LBrace, 0); }
		public List<EneContext> ene() {
			return getRuleContexts(EneContext.class);
		}
		public EneContext ene(int i) {
			return getRuleContext(EneContext.class,i);
		}
		public TerminalNode RBrace() { return getToken(SimpleLangParser.RBrace, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(SimpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SimpleLangParser.Semicolon, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LBrace);
			setState(51);
			ene();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(52);
				match(Semicolon);
				setState(53);
				ene();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SimpleLangParser.LBrace, 0); }
		public List<EneContext> ene() {
			return getRuleContexts(EneContext.class);
		}
		public EneContext ene(int i) {
			return getRuleContext(EneContext.class,i);
		}
		public TerminalNode RBrace() { return getToken(SimpleLangParser.RBrace, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(SimpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SimpleLangParser.Semicolon, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LBrace);
			setState(62);
			ene();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(63);
				match(Semicolon);
				setState(64);
				ene();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
	public static class EneContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(SimpleLangParser.Semicolon, 0); }
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ene);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			exp();
			{
			setState(73);
			match(Semicolon);
			setState(74);
			exp();
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileExprContext extends ExpContext {
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipExprContext extends ExpContext {
		public TerminalNode Skip() { return getToken(SimpleLangParser.Skip, 0); }
		public SkipExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSkipExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitExprContext extends ExpContext {
		public TerminalNode BoolLit() { return getToken(SimpleLangParser.BoolLit, 0); }
		public BoolLitExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBoolLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends ExpContext {
		public TerminalNode If() { return getToken(SimpleLangParser.If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Then() { return getToken(SimpleLangParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(SimpleLangParser.Else, 0); }
		public IfExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineExprContext extends ExpContext {
		public TerminalNode NewLine() { return getToken(SimpleLangParser.NewLine, 0); }
		public NewlineExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitNewlineExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public IdExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpaceExprContext extends ExpContext {
		public TerminalNode Space() { return getToken(SimpleLangParser.Space, 0); }
		public SpaceExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSpaceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ExpContext {
		public TerminalNode Print() { return getToken(SimpleLangParser.Print, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockExprContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InvokeExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInvokeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatExprContext extends ExpContext {
		public TerminalNode Repeat() { return getToken(SimpleLangParser.Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Until() { return getToken(SimpleLangParser.Until, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitRepeatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpExprContext extends ExpContext {
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public BinOpExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(SimpleLangParser.IntLit, 0); }
		public IntExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Idfr);
				setState(77);
				match(Assign);
				setState(78);
				exp();
				}
				break;
			case 2:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LParen);
				setState(80);
				exp();
				setState(81);
				binop();
				setState(82);
				exp();
				setState(83);
				match(RParen);
				}
				break;
			case 3:
				_localctx = new InvokeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Idfr);
				setState(86);
				match(LParen);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(87);
					args();
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(88);
						match(Comma);
						setState(89);
						args();
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(97);
				match(RParen);
				}
				break;
			case 4:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				block();
				}
				break;
			case 5:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(If);
				setState(100);
				exp();
				setState(101);
				match(Then);
				setState(102);
				block();
				setState(103);
				match(Else);
				setState(104);
				block();
				}
				break;
			case 6:
				_localctx = new WhileExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(While);
				setState(107);
				exp();
				setState(108);
				match(Do);
				setState(109);
				block();
				}
				break;
			case 7:
				_localctx = new RepeatExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(Repeat);
				setState(112);
				block();
				setState(113);
				match(Until);
				setState(114);
				exp();
				}
				break;
			case 8:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				match(Print);
				setState(117);
				exp();
				}
				break;
			case 9:
				_localctx = new SpaceExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				match(Space);
				}
				break;
			case 10:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				match(Idfr);
				}
				break;
			case 11:
				_localctx = new IntExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				match(IntLit);
				}
				break;
			case 12:
				_localctx = new BoolLitExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				match(BoolLit);
				}
				break;
			case 13:
				_localctx = new NewlineExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				match(NewLine);
				}
				break;
			case 14:
				_localctx = new SkipExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(123);
				match(Skip);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120694243346L) != 0)) {
				{
				setState(126);
				exp();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(127);
						match(Comma);
						setState(128);
						exp();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	 
		public BinopContext() { }
		public void copyFrom(BinopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBinopContext extends BinopContext {
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public AndBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAndBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimesBinopContext extends BinopContext {
		public TerminalNode Times() { return getToken(SimpleLangParser.Times, 0); }
		public TimesBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTimesBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterBinopContext extends BinopContext {
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public GreaterBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitGreaterBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashBinopContext extends BinopContext {
		public TerminalNode Slash() { return getToken(SimpleLangParser.Slash, 0); }
		public SlashBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSlashBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusBinopContext extends BinopContext {
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public PlusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPlusBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBinopContext extends BinopContext {
		public TerminalNode Eq() { return getToken(SimpleLangParser.Eq, 0); }
		public EqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEqBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqBinopContext extends BinopContext {
		public TerminalNode GreaterEq() { return getToken(SimpleLangParser.GreaterEq, 0); }
		public GreaterEqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitGreaterEqBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessBinopContext extends BinopContext {
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public LessBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitLessBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqBinopContext extends BinopContext {
		public TerminalNode LessEq() { return getToken(SimpleLangParser.LessEq, 0); }
		public LessEqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitLessEqBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusBinopContext extends BinopContext {
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public MinusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMinusBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrBinopContext extends BinopContext {
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public OrBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitOrBinop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerBinopContext extends BinopContext {
		public TerminalNode Power() { return getToken(SimpleLangParser.Power, 0); }
		public PowerBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPowerBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binop);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Eq:
				_localctx = new EqBinopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Eq);
				}
				break;
			case Less:
				_localctx = new LessBinopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(Less);
				}
				break;
			case LessEq:
				_localctx = new LessEqBinopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(LessEq);
				}
				break;
			case Greater:
				_localctx = new GreaterBinopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(Greater);
				}
				break;
			case GreaterEq:
				_localctx = new GreaterEqBinopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(GreaterEq);
				}
				break;
			case Plus:
				_localctx = new PlusBinopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusBinopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(Minus);
				}
				break;
			case Times:
				_localctx = new TimesBinopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(Times);
				}
				break;
			case Slash:
				_localctx = new SlashBinopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				match(Slash);
				}
				break;
			case And:
				_localctx = new AndBinopContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				match(And);
				}
				break;
			case Or:
				_localctx = new OrBinopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				match(Or);
				}
				break;
			case Power:
				_localctx = new PowerBinopContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				match(Power);
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
		"\u0004\u0001%\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"7\b\u0005\n\u0005\f\u0005:\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006"+
		"E\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b[\b\b\n\b\f"+
		"\b^\t\b\u0003\b`\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b}\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0082"+
		"\b\t\n\t\f\t\u0085\t\t\u0003\t\u0087\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0095\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u001f!\u00ac\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000"+
		"\n2\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000\u000eH\u0001\u0000"+
		"\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000"+
		"\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000"+
		"\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0006\u0003"+
		"\u0000\u001e \u0005\u0001\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 "+
		"\u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\n\u0005\u0000$\u0003\u0001"+
		"\u0000\u0000\u0000%*\u0003\u0006\u0003\u0000&\'\u0005\u0002\u0000\u0000"+
		"\')\u0003\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0003\b\u0004\u0000./\u0005"+
		"$\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0007\u0000\u0000\u0000"+
		"1\t\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u000038\u0003\u000e\u0007"+
		"\u000045\u0005\u0005\u0000\u000057\u0003\u000e\u0007\u000064\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";<\u0005\u0006\u0000\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0005\u0004"+
		"\u0000\u0000>C\u0003\u000e\u0007\u0000?@\u0005\u0005\u0000\u0000@B\u0003"+
		"\u000e\u0007\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0006\u0000\u0000G\r\u0001\u0000"+
		"\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0005\u0005\u0000\u0000JK\u0003\u0010"+
		"\b\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0005$\u0000\u0000MN\u0005\u0013"+
		"\u0000\u0000N}\u0003\u0010\b\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0010"+
		"\b\u0000QR\u0003\u0014\n\u0000RS\u0003\u0010\b\u0000ST\u0005\u0003\u0000"+
		"\u0000T}\u0001\u0000\u0000\u0000UV\u0005$\u0000\u0000V_\u0005\u0001\u0000"+
		"\u0000W\\\u0003\u0012\t\u0000XY\u0005\u0002\u0000\u0000Y[\u0003\u0012"+
		"\t\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a}\u0005\u0003\u0000\u0000b}\u0003\f\u0006"+
		"\u0000cd\u0005\u0018\u0000\u0000de\u0003\u0010\b\u0000ef\u0005\u0019\u0000"+
		"\u0000fg\u0003\f\u0006\u0000gh\u0005\u001a\u0000\u0000hi\u0003\f\u0006"+
		"\u0000i}\u0001\u0000\u0000\u0000jk\u0005\u001b\u0000\u0000kl\u0003\u0010"+
		"\b\u0000lm\u0005\u001d\u0000\u0000mn\u0003\f\u0006\u0000n}\u0001\u0000"+
		"\u0000\u0000op\u0005\u001c\u0000\u0000pq\u0003\f\u0006\u0000qr\u0005\u001e"+
		"\u0000\u0000rs\u0003\u0010\b\u0000s}\u0001\u0000\u0000\u0000tu\u0005\u0014"+
		"\u0000\u0000u}\u0003\u0010\b\u0000v}\u0005\u0015\u0000\u0000w}\u0005$"+
		"\u0000\u0000x}\u0005#\u0000\u0000y}\u0005\"\u0000\u0000z}\u0005\u0016"+
		"\u0000\u0000{}\u0005\u0017\u0000\u0000|L\u0001\u0000\u0000\u0000|O\u0001"+
		"\u0000\u0000\u0000|U\u0001\u0000\u0000\u0000|b\u0001\u0000\u0000\u0000"+
		"|c\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000\u0000|o\u0001\u0000\u0000"+
		"\u0000|t\u0001\u0000\u0000\u0000|v\u0001\u0000\u0000\u0000|w\u0001\u0000"+
		"\u0000\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0011\u0001\u0000\u0000"+
		"\u0000~\u0083\u0003\u0010\b\u0000\u007f\u0080\u0005\u0002\u0000\u0000"+
		"\u0080\u0082\u0003\u0010\b\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086~\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u0095"+
		"\u0005\u0007\u0000\u0000\u0089\u0095\u0005\b\u0000\u0000\u008a\u0095\u0005"+
		"\t\u0000\u0000\u008b\u0095\u0005\n\u0000\u0000\u008c\u0095\u0005\u000b"+
		"\u0000\u0000\u008d\u0095\u0005\u0010\u0000\u0000\u008e\u0095\u0005\u0012"+
		"\u0000\u0000\u008f\u0095\u0005\u0011\u0000\u0000\u0090\u0095\u0005\f\u0000"+
		"\u0000\u0091\u0095\u0005\r\u0000\u0000\u0092\u0095\u0005\u000e\u0000\u0000"+
		"\u0093\u0095\u0005\u000f\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000"+
		"\u0094\u0089\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000\u0000\u0000"+
		"\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000"+
		"\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000"+
		"\u000b\u0019 *8C\\_|\u0083\u0086\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}