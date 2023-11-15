// Generated from C:/Users/James/projects/G5035-Compilers-and-Computer-Architecture/week2Exercises/partb/week2/src/Characters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CharactersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CharactersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CharactersParser#charstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharstring(CharactersParser.CharstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UppercaseChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercaseChar(CharactersParser.UppercaseCharContext ctx);
}