// Generated from C:/Users/James/projects/G5035-Compilers-and-Computer-Architecture/week2Exercises/partb/week2/src/Characters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CharactersParser}.
 */
public interface CharactersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CharactersParser#charstring}.
	 * @param ctx the parse tree
	 */
	void enterCharstring(CharactersParser.CharstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CharactersParser#charstring}.
	 * @param ctx the parse tree
	 */
	void exitCharstring(CharactersParser.CharstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UppercaseChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 */
	void enterUppercaseChar(CharactersParser.UppercaseCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UppercaseChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 */
	void exitUppercaseChar(CharactersParser.UppercaseCharContext ctx);
}