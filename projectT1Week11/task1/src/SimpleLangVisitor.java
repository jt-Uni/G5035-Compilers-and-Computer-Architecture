// Generated from C:/Users/James/projects/G5035-Compilers-and-Computer-Architecture/projectT1Week11/task1/src/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleLangParser.ProgContext ctx, String[] args);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(SimpleLangParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(SimpleLangParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#typed_idfr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_idfr(SimpleLangParser.Typed_idfrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpleLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(SimpleLangParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(SimpleLangParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExpr(SimpleLangParser.SkipExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLitExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLitExpr(SimpleLangParser.BoolLitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SimpleLangParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewlineExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlineExpr(SimpleLangParser.NewlineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeExpr(SimpleLangParser.TimeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SimpleLangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExprb}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprb(SimpleLangParser.IntExprbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpaceExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceExpr(SimpleLangParser.SpaceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(SimpleLangParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(SimpleLangParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(SimpleLangParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpr(SimpleLangParser.NegateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExpr(SimpleLangParser.InvokeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExpr(SimpleLangParser.RepeatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(SimpleLangParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SimpleLangParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SimpleLangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(SimpleLangParser.BinopContext ctx);
}