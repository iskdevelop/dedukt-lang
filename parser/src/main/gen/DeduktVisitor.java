// Generated from /home/kid-a/projects/dedukt-lang/parser/src/main/antlr/DeduktParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Dedukt}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeduktVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Dedukt#deduktSourceCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeduktSourceCode(Dedukt.DeduktSourceCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(Dedukt.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Dedukt.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#packageIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageIdentifier(Dedukt.PackageIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(Dedukt.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Dedukt.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Dedukt.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Dedukt.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(Dedukt.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Dedukt.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#chainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainExpression(Dedukt.ChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#chainOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainOperator(Dedukt.ChainOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(Dedukt.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#multipleIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleIdentifiers(Dedukt.MultipleIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Dedukt.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Dedukt.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(Dedukt.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Dedukt.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(Dedukt.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#defaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(Dedukt.DefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#caseStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatements(Dedukt.CaseStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#whenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatement(Dedukt.WhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#guardStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardStatement(Dedukt.GuardStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(Dedukt.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(Dedukt.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#loopBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(Dedukt.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(Dedukt.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(Dedukt.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(Dedukt.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(Dedukt.JumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Dedukt.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Dedukt.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Dedukt.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(Dedukt.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#variableOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOperation(Dedukt.VariableOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Dedukt.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#errorHandling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorHandling(Dedukt.ErrorHandlingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Dedukt.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Dedukt.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#debugOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugOperation(Dedukt.DebugOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Dedukt.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#debugStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugStatement(Dedukt.DebugStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Dedukt.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Dedukt.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#typeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOptions(Dedukt.TypeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Dedukt.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Dedukt.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Dedukt.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#dependentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentType(Dedukt.DependentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#parameterOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterOptions(Dedukt.ParameterOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#parameterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterOption(Dedukt.ParameterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#subtypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtypeOption(Dedukt.SubtypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#superTypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperTypeOption(Dedukt.SuperTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#subTyping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTyping(Dedukt.SubTypingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#applicability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicability(Dedukt.ApplicabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#contextDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextDeclaration(Dedukt.ContextDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#notationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotationDeclaration(Dedukt.NotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(Dedukt.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#functionTypeFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeFormat(Dedukt.FunctionTypeFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#operatorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDeclaration(Dedukt.OperatorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#structureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDeclaration(Dedukt.StructureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#theoryDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoryDeclaration(Dedukt.TheoryDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#axiomDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxiomDeclaration(Dedukt.AxiomDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#ruleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDeclaration(Dedukt.RuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(Dedukt.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#annotationContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationContext(Dedukt.AnnotationContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#headlessFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadlessFunction(Dedukt.HeadlessFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnable(Dedukt.ReturnableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#typeContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeContext(Dedukt.TypeContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#notationContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotationContext(Dedukt.NotationContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#operatorContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorContext(Dedukt.OperatorContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#structureContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureContext(Dedukt.StructureContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#theoryContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoryContext(Dedukt.TheoryContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#axiomContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxiomContext(Dedukt.AxiomContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#ruleContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleContext(Dedukt.RuleContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#commaSeparatedIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSeparatedIdentifiers(Dedukt.CommaSeparatedIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#commaSeparatedTypedIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSeparatedTypedIdentifiers(Dedukt.CommaSeparatedTypedIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Dedukt.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dedukt#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Dedukt.LiteralContext ctx);
}