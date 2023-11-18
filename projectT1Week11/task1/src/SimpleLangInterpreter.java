import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;

// todo - change back the config with no args after completed it
public class SimpleLangInterpreter extends AbstractParseTreeVisitor<Integer> implements SimpleLangVisitor<Integer> {


    private final Map<String, SimpleLangParser.DecContext> gloFunction = new HashMap<>();
    Stack <SimpleLangParser.DecContext> decStack = new Stack<>();
    private SimpleLangParser.DecContext currDec = null;

    // use Object, so we can store bool and int
    private final Map<String, Map<String, Integer>> functionVars = new HashMap<>();
    private Map<String, Integer> localVars = null;

    // pass in command line arguments
    public Integer visitProgram(SimpleLangParser.ProgContext ctx, String[] args){

        // pass the args into main args
        Map<String, Integer> initVarss = new HashMap<>();
        functionVars.put("main", initVarss);
        localVars = functionVars.get("main");
        // put cli args into hashmap first
        for (int i = 0; i < ctx.dec().size(); i++) {
            // so when we call function, we can use it
            gloFunction.put(ctx.dec(i).Idfr().getText(), ctx.dec(i));
            if (ctx.dec(i).Idfr().getText().equals("main")){
                currDec = ctx.dec(i);

                for (int j = 0; j < args.length; j++) {
                    if (args[j].equals("true")) {
                        // todo - true := 1, false := 0
                        // cuz we have already done the type checking part
                        localVars.put(ctx.dec(i).vardec().Idfr(j).getText(), 1);
                    } else if (args[j].equals("false")) {
                        localVars.put(ctx.dec(i).vardec().Idfr(j).getText(), 0);
                    } else {
                        localVars.put(ctx.dec(i).vardec().Idfr(j).getText(), Integer.parseInt(args[j]));
                    }
                }
            }
        }

        functionVars.put("main", localVars);
        localVars = functionVars.get(currDec.Idfr().getText());

        // just init a localvars for each function, so that it's not null
        for (int i = 0; i < ctx.dec().size(); i++) {
            if (!ctx.dec(i).Idfr().getText().equals("main")){
                Map<String, Integer> initVars = new HashMap<>();
                functionVars.put(ctx.dec(i).Idfr().getText(), initVars);
            }
        }
        int result = 0;
        for (int i = 0; i < ctx.dec().size(); i++) {
            if (ctx.dec(i).Idfr().getText().equals("main")) {
                result = visit(ctx.dec(i).body());
            }
        }

        return result;
    }

    @Override
    public Integer visitProg(SimpleLangParser.ProgContext ctx) {
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
    public Integer visitBody(SimpleLangParser.BodyContext ctx) {
        localVars = functionVars.get(currDec.Idfr().getText());
        for (int i = 0; i < ctx.Idfr().size(); ++i) {

            localVars.put(ctx.Idfr().get(i).getText(), visit(ctx.expr().get(i)));
        }

        functionVars.put(currDec.Idfr().getText(), localVars);
        return visit(ctx.ene());
    }

    @Override
    public Integer visitBlock(SimpleLangParser.BlockContext ctx) {
        return visit(ctx.ene());
    }

    @Override
    public Integer visitEne(SimpleLangParser.EneContext ctx) {
        Integer returnValue = null;
        // todo - when boolLit is under block, it doesn't return

        for (int i = 0; i < ctx.expr().size(); i++) {
//            if (i==ctx.expr().size()-1 & (ctx.expr(i).getText().equals("true") || ctx.expr(i).getText().equals("false"))){
//                if (ctx.expr(i).getText().equals("true")){
//                    return 1;
//                } else{
//                    return 0;
//                }
//            }
            // when visit(ctx.expr()) it doesn't go to visitBool or visitInt todo
            returnValue = visit(ctx.expr(i));
        }
        // change it back to "main" let's say

        return returnValue;
    }

    @Override
    public Integer visitBoolExpr(SimpleLangParser.BoolExprContext ctx) {
        if (ctx.BoolLit().getText().equals("false")){
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public Integer visitIdExpr(SimpleLangParser.IdExprContext ctx) {
        localVars = functionVars.get(currDec.Idfr().getText());
        return localVars.get(ctx.Idfr().getText());
    }

    @Override
    public Integer visitIntExpr(SimpleLangParser.IntExprContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Integer visitAssignExpr(SimpleLangParser.AssignExprContext ctx) {
        localVars = functionVars.get(currDec.Idfr().getText());
        localVars.replace(ctx.Idfr().getText(), visit(ctx.expr()));
        functionVars.put(currDec.Idfr().getText(), localVars);
        return null;
    }

    @Override
    public Integer visitBinOpExpr(SimpleLangParser.BinOpExprContext ctx) {
        Integer lhs = visit(ctx.expr(0));
        Integer rhs = visit(ctx.expr(1));

        String ctxOp = ctx.op.getText();

        switch (ctxOp) {
            case "+":
                return (lhs + rhs);
            case "-":
                return (lhs - rhs);
            case "*":
                return (lhs * rhs);
            case "/":
                return (lhs / rhs);
            case "==":
                return ((lhs.equals(rhs)) ? 1 : 0);
            case "<":
                return ((lhs < rhs) ? 1 : 0);
            case ">":
                return ((lhs > rhs) ? 1 : 0);
            case "<=":
                return ((lhs <= rhs) ? 1 : 0);
            case ">=":
                return ((lhs >= rhs) ? 1 : 0);
            case "^":
                if ((lhs  == 1  & rhs == 1) || (lhs  == 0  & rhs == 0)){
                    return 0;
                } else {
                    return 1;
                }
            case "&":
                if (lhs  == 1  & rhs == 1){
                    return 1;
                } else {
                    return 0;
                }
            case "|":
                if (lhs  == 0  & rhs == 0){
                    return 0;
                } else {
                    return 1;
                }
            default:
                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
        }
    }

    @Override
    public Integer visitCallFunExpr(SimpleLangParser.CallFunExprContext ctx) {
        // function to be called

        List<Integer> argsValueList = new ArrayList<>();
        for (int i = 0; i < ctx.args().expr().size(); i++) {
            // pass the args like in main to the call function
            if (ctx.args().expr(i).getText().equals("true")){
                argsValueList.add(1);
            } else if (ctx.args().expr(i).getText().equals("false")){
                argsValueList.add(0);
            } else {
                // we still need to get var from main var-list
                argsValueList.add(visit(ctx.args().expr(i)));
            }// get the args in order
        }

//        if ((prevDec == null) || (!prevDec.equals(currDec))){
//            prevDec = currDec;
//        }
        // let's say push main
        decStack.push(currDec);

        currDec = gloFunction.get(ctx.Idfr().getText());
        localVars = functionVars.get(currDec.Idfr().getText());

        // put args into function's vardec
        for (int i = 0; i < currDec.vardec().Idfr().size(); i++) {
            localVars.put(currDec.vardec().Idfr(i).getText(), argsValueList.get(i));
        }

        // visit the body to init other variable
        for (int i = 0; i < currDec.body().Idfr().size(); i++) {
            localVars.put(currDec.body().Idfr(i).getText(), visit(currDec.body().expr(i)));
        }

        functionVars.put(currDec.Idfr().getText(), localVars);
        int returnValue = -1;
        if (currDec.Type().getText().equals("unit")){
            visit(currDec.body().ene());
        } else {
            returnValue = visit(currDec.body().ene());
        }
//        int returnValue = visit(currDec.body().ene());
        currDec = decStack.pop();
        return returnValue;
    }

    @Override
    public Integer visitBlockExpr(SimpleLangParser.BlockExprContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Integer visitIfExpr(SimpleLangParser.IfExprContext ctx) {
        // 1 * 1 == 1 == true
        if (visit(ctx.expr()) == 1){
            return visit(ctx.block(0));
        } else {
            return visit(ctx.block(1));
        }
    }

    @Override
    public Integer visitWhileExpr(SimpleLangParser.WhileExprContext ctx) {
        // 0 here means false
        while(visit(ctx.expr()) > 0){
            visit(ctx.block());
        }
        return null;
    }

    @Override
    public Integer visitForExpr(SimpleLangParser.ForExprContext ctx) {
        do {
            visit(ctx.block());
        } while (visit(ctx.expr()) > 0);
        return null;
    }

    @Override
    public Integer visitPrintExpr(SimpleLangParser.PrintExprContext ctx) {
        System.out.print(visit(ctx.expr()));
        return null;
    }

    @Override
    public Integer visitSpaceExpr(SimpleLangParser.SpaceExprContext ctx) {
        if (ctx.expr().getText().equals("newline")) {
            System.out.print(" ");
        }
        return null;
    }

    @Override
    public Integer visitNewlineExpr(SimpleLangParser.NewlineExprContext ctx) {
        if (ctx.expr().getText().equals("newline")) {
            System.out.println();
        }
        return null;
    }

    @Override
    public Integer visitSkipExpr(SimpleLangParser.SkipExprContext ctx) {
        return null;
    }

    @Override
    public Integer visitArgs(SimpleLangParser.ArgsContext ctx) {
        return null;
    }
}