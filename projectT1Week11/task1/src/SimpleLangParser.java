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
		LessEq=9, Greater=10, GreaterEq=11, Divide=12, And=13, Or=14, Power=15, 
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
			"Less", "LessEq", "Greater", "GreaterEq", "Divide", "And", "Or", "Power", 
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
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProg(this, new String[]{});
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
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(SimpleLangParser.RBrace, 0); }
		public List<Typed_idfrContext> typed_idfr() {
			return getRuleContexts(Typed_idfrContext.class);
		}
		public Typed_idfrContext typed_idfr(int i) {
			return getRuleContext(Typed_idfrContext.class,i);
		}
		public List<TerminalNode> Assign() { return getTokens(SimpleLangParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(SimpleLangParser.Assign, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) {
				{
				{
				setState(51);
				typed_idfr();
				setState(52);
				match(Assign);
				setState(53);
				exp(0);
				setState(54);
				match(Semicolon);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			ene();
			setState(62);
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
			setState(64);
			match(LBrace);
			setState(65);
			ene();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(66);
				match(Semicolon);
				setState(67);
				ene();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
		public List<TerminalNode> Semicolon() { return getTokens(SimpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SimpleLangParser.Semicolon, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			exp(0);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(Semicolon);
					setState(77);
					exp(0);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class TimeExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TimeExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTimeExpr(this);
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
	public static class IntExprbContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(SimpleLangParser.IntLit, 0); }
		public IntExprbContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIntExprb(this);
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
	public static class NegateExprContext extends ExpContext {
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NegateExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitNegateExpr(this);
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
	public static class ParenExprContext extends ExpContext {
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public ParenExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(Idfr);
				setState(85);
				match(Assign);
				setState(86);
				exp(17);
				}
				break;
			case 2:
				{
				_localctx = new BinOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LParen);
				setState(88);
				exp(0);
				setState(89);
				binop();
				setState(90);
				exp(0);
				setState(91);
				match(RParen);
				}
				break;
			case 3:
				{
				_localctx = new InvokeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(Idfr);
				setState(94);
				match(LParen);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(95);
					args();
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(96);
						match(Comma);
						setState(97);
						args();
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(105);
				match(RParen);
				}
				break;
			case 4:
				{
				_localctx = new BlockExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				block();
				}
				break;
			case 5:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(If);
				setState(108);
				exp(0);
				setState(109);
				match(Then);
				setState(110);
				block();
				setState(111);
				match(Else);
				setState(112);
				block();
				}
				break;
			case 6:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(While);
				setState(115);
				exp(0);
				setState(116);
				match(Do);
				setState(117);
				block();
				}
				break;
			case 7:
				{
				_localctx = new RepeatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(Repeat);
				setState(120);
				block();
				setState(121);
				match(Until);
				setState(122);
				exp(11);
				}
				break;
			case 8:
				{
				_localctx = new PrintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(Print);
				setState(125);
				exp(10);
				}
				break;
			case 9:
				{
				_localctx = new SpaceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(Space);
				}
				break;
			case 10:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(Idfr);
				}
				break;
			case 11:
				{
				_localctx = new IntExprbContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(IntLit);
				}
				break;
			case 12:
				{
				_localctx = new BoolLitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(BoolLit);
				}
				break;
			case 13:
				{
				_localctx = new NewlineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(NewLine);
				}
				break;
			case 14:
				{
				_localctx = new SkipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(Skip);
				}
				break;
			case 15:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LParen);
				setState(133);
				exp(0);
				setState(134);
				match(RParen);
				}
				break;
			case 16:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(Minus);
				setState(137);
				exp(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TimeExprContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141);
					binop();
					setState(142);
					exp(2);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120694505490L) != 0)) {
				{
				setState(149);
				exp(0);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(Comma);
						setState(151);
						exp(0);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode Power() { return getToken(SimpleLangParser.Power, 0); }
		public TerminalNode Times() { return getToken(SimpleLangParser.Times, 0); }
		public TerminalNode Divide() { return getToken(SimpleLangParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode Eq() { return getToken(SimpleLangParser.Eq, 0); }
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public TerminalNode LessEq() { return getToken(SimpleLangParser.LessEq, 0); }
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public TerminalNode GreaterEq() { return getToken(SimpleLangParser.GreaterEq, 0); }
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524160L) != 0)) ) {
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
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u00059\b\u0005\n\u0005\f\u0005<\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006E\b\u0006\n\u0006\f\u0006H\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007O\b\u0007\n\u0007\f\u0007"+
		"R\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bc\b"+
		"\b\n\b\f\bf\t\b\u0003\bh\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0091\b\b"+
		"\n\b\f\b\u0094\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u0099\b\t\n\t\f\t\u009c"+
		"\t\t\u0003\t\u009e\b\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001"+
		"\u0000\u001f!\u0001\u0000\u0007\u0012\u00b0\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000"+
		"\u0006-\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001\u0000"+
		"\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000"+
		"\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000"+
		"\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001"+
		"\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000"+
		"\u001e \u0005\u0001\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\n\u0005\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%*\u0003\u0006\u0003\u0000&\'\u0005\u0002\u0000\u0000\')\u0003"+
		"\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0003\b\u0004\u0000./\u0005$"+
		"\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0007\u0000\u0000\u0000"+
		"1\t\u0001\u0000\u0000\u00002:\u0005\u0004\u0000\u000034\u0003\u0006\u0003"+
		"\u000045\u0005\u0013\u0000\u000056\u0003\u0010\b\u000067\u0005\u0005\u0000"+
		"\u000079\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0003\u000e\u0007\u0000"+
		">?\u0005\u0006\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\u0004"+
		"\u0000\u0000AF\u0003\u000e\u0007\u0000BC\u0005\u0005\u0000\u0000CE\u0003"+
		"\u000e\u0007\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0006\u0000\u0000J\r\u0001\u0000"+
		"\u0000\u0000KP\u0003\u0010\b\u0000LM\u0005\u0005\u0000\u0000MO\u0003\u0010"+
		"\b\u0000NL\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000ST\u0006\b\uffff\uffff\u0000TU\u0005$\u0000"+
		"\u0000UV\u0005\u0013\u0000\u0000V\u008b\u0003\u0010\b\u0011WX\u0005\u0001"+
		"\u0000\u0000XY\u0003\u0010\b\u0000YZ\u0003\u0014\n\u0000Z[\u0003\u0010"+
		"\b\u0000[\\\u0005\u0003\u0000\u0000\\\u008b\u0001\u0000\u0000\u0000]^"+
		"\u0005$\u0000\u0000^g\u0005\u0001\u0000\u0000_d\u0003\u0012\t\u0000`a"+
		"\u0005\u0002\u0000\u0000ac\u0003\u0012\t\u0000b`\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000g_\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u008b"+
		"\u0005\u0003\u0000\u0000j\u008b\u0003\f\u0006\u0000kl\u0005\u0018\u0000"+
		"\u0000lm\u0003\u0010\b\u0000mn\u0005\u0019\u0000\u0000no\u0003\f\u0006"+
		"\u0000op\u0005\u001a\u0000\u0000pq\u0003\f\u0006\u0000q\u008b\u0001\u0000"+
		"\u0000\u0000rs\u0005\u001b\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u001d"+
		"\u0000\u0000uv\u0003\f\u0006\u0000v\u008b\u0001\u0000\u0000\u0000wx\u0005"+
		"\u001c\u0000\u0000xy\u0003\f\u0006\u0000yz\u0005\u001e\u0000\u0000z{\u0003"+
		"\u0010\b\u000b{\u008b\u0001\u0000\u0000\u0000|}\u0005\u0014\u0000\u0000"+
		"}\u008b\u0003\u0010\b\n~\u008b\u0005\u0015\u0000\u0000\u007f\u008b\u0005"+
		"$\u0000\u0000\u0080\u008b\u0005#\u0000\u0000\u0081\u008b\u0005\"\u0000"+
		"\u0000\u0082\u008b\u0005\u0016\u0000\u0000\u0083\u008b\u0005\u0017\u0000"+
		"\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086\u0003\u0010\b\u0000"+
		"\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u008b\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0012\u0000\u0000\u0089\u008b\u0003\u0010\b\u0002\u008a"+
		"S\u0001\u0000\u0000\u0000\u008aW\u0001\u0000\u0000\u0000\u008a]\u0001"+
		"\u0000\u0000\u0000\u008aj\u0001\u0000\u0000\u0000\u008ak\u0001\u0000\u0000"+
		"\u0000\u008ar\u0001\u0000\u0000\u0000\u008aw\u0001\u0000\u0000\u0000\u008a"+
		"|\u0001\u0000\u0000\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u007f\u0001"+
		"\u0000\u0000\u0000\u008a\u0080\u0001\u0000\u0000\u0000\u008a\u0081\u0001"+
		"\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0083\u0001"+
		"\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d\n\u0001"+
		"\u0000\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f\u0003\u0010\b"+
		"\u0002\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u009a\u0003\u0010\b\u0000"+
		"\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0099\u0003\u0010\b\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u0095\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u0013\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0"+
		"\u0015\u0001\u0000\u0000\u0000\f\u0019 *:FPdg\u008a\u0092\u009a\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}