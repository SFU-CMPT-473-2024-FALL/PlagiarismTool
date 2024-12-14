// Generated from srcANTLR/PlagiarismTool.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlagiarismToolParser}.
 */
public interface PlagiarismToolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlagiarismToolParser#diagrams}.
	 * @param ctx the parse tree
	 */
	void enterDiagrams(PlagiarismToolParser.DiagramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlagiarismToolParser#diagrams}.
	 * @param ctx the parse tree
	 */
	void exitDiagrams(PlagiarismToolParser.DiagramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlagiarismToolParser#diagram}.
	 * @param ctx the parse tree
	 */
	void enterDiagram(PlagiarismToolParser.DiagramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlagiarismToolParser#diagram}.
	 * @param ctx the parse tree
	 */
	void exitDiagram(PlagiarismToolParser.DiagramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlagiarismToolParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(PlagiarismToolParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlagiarismToolParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(PlagiarismToolParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlagiarismToolParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PlagiarismToolParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlagiarismToolParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PlagiarismToolParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlagiarismToolParser#textline}.
	 * @param ctx the parse tree
	 */
	void enterTextline(PlagiarismToolParser.TextlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlagiarismToolParser#textline}.
	 * @param ctx the parse tree
	 */
	void exitTextline(PlagiarismToolParser.TextlineContext ctx);
}