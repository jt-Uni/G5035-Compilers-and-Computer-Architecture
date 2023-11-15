import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class SimpleLangInterpreter extends AbstractParseTreeVisitor<Integer> implements SimpleLangVisitor<Integer> {

    private final Map<String, SimpleLangParser.DecContext> global_funcs = new HashMap<>();
    private final Stack<Map<String, Integer>> frames = new Stack<>();

    @Override
    public Integer visitProg(SimpleLangParser.ProgContext ctx, String[] args) {
        return null;
    }

    @Override
    public Integer visitDec(SimpleLangParser.DecContext ctx) {
        return null;
    }

    @Override
    public Integer visitVardec(SimpleLangParser.VardecContext ctx) {
        return null;
    }

    @Override
    public Integer visitTyped_idfr(SimpleLangParser.Typed_idfrContext ctx) {
        return null;
    }

    @Override
    public Integer visitType(SimpleLangParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Integer visitBody(SimpleLangParser.BodyContext ctx) {
        return null;
    }

    @Override
    public Integer visitBlock(SimpleLangParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Integer visitEne(SimpleLangParser.EneContext ctx) {
        return null;
    }

    @Override
    public Integer visitWhileExpr(SimpleLangParser.WhileExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitSkipExpr(SimpleLangParser.SkipExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitBoolLitExpr(SimpleLangParser.BoolLitExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitIfExpr(SimpleLangParser.IfExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitNewlineExpr(SimpleLangParser.NewlineExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitTimeExpr(SimpleLangParser.TimeExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitIdExpr(SimpleLangParser.IdExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitIntExprb(SimpleLangParser.IntExprbContext ctx) {
        return null;
    }

    @Override
    public Integer visitSpaceExpr(SimpleLangParser.SpaceExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitPrintExpr(SimpleLangParser.PrintExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitBlockExpr(SimpleLangParser.BlockExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitAssignExpr(SimpleLangParser.AssignExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitNegateExpr(SimpleLangParser.NegateExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitInvokeExpr(SimpleLangParser.InvokeExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitRepeatExpr(SimpleLangParser.RepeatExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitBinOpExpr(SimpleLangParser.BinOpExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitParenExpr(SimpleLangParser.ParenExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitArgs(SimpleLangParser.ArgsContext ctx) {
        return null;
    }

    @Override
    public Integer visitBinop(SimpleLangParser.BinopContext ctx) {
        return null;
    }

    public Integer visitProgram(SimpleLangParser.ProgContext tree, String[] args) {
        return null;
    }
}
