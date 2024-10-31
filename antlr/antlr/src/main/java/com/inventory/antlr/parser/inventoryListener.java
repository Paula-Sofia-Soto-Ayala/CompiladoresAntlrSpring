// Generated from inventory.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inventoryParser}.
 */
public interface inventoryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inventoryParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(inventoryParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link inventoryParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(inventoryParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link inventoryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(inventoryParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inventoryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(inventoryParser.StatementContext ctx);
}