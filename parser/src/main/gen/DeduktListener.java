// Generated from /home/kid-a/projects/dedukt-lang/parser/src/main/antlr/DeduktParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Dedukt}.
 */
public interface DeduktListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Dedukt#deduktSourceCode}.
	 * @param ctx the parse tree
	 */
	void enterDeduktSourceCode(Dedukt.DeduktSourceCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#deduktSourceCode}.
	 * @param ctx the parse tree
	 */
	void exitDeduktSourceCode(Dedukt.DeduktSourceCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(Dedukt.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(Dedukt.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Dedukt.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Dedukt.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#packageIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageIdentifier(Dedukt.PackageIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#packageIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageIdentifier(Dedukt.PackageIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(Dedukt.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(Dedukt.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Dedukt.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Dedukt.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Dedukt.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Dedukt.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Dedukt.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Dedukt.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(Dedukt.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(Dedukt.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Dedukt.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Dedukt.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#chainExpression}.
	 * @param ctx the parse tree
	 */
	void enterChainExpression(Dedukt.ChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#chainExpression}.
	 * @param ctx the parse tree
	 */
	void exitChainExpression(Dedukt.ChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#chainOperator}.
	 * @param ctx the parse tree
	 */
	void enterChainOperator(Dedukt.ChainOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#chainOperator}.
	 * @param ctx the parse tree
	 */
	void exitChainOperator(Dedukt.ChainOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Dedukt.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Dedukt.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#multipleIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterMultipleIdentifiers(Dedukt.MultipleIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#multipleIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitMultipleIdentifiers(Dedukt.MultipleIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Dedukt.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Dedukt.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Dedukt.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Dedukt.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(Dedukt.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(Dedukt.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Dedukt.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Dedukt.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(Dedukt.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(Dedukt.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(Dedukt.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(Dedukt.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#caseStatements}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatements(Dedukt.CaseStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#caseStatements}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatements(Dedukt.CaseStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#whenStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStatement(Dedukt.WhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#whenStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStatement(Dedukt.WhenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#guardStatement}.
	 * @param ctx the parse tree
	 */
	void enterGuardStatement(Dedukt.GuardStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#guardStatement}.
	 * @param ctx the parse tree
	 */
	void exitGuardStatement(Dedukt.GuardStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(Dedukt.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(Dedukt.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(Dedukt.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(Dedukt.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(Dedukt.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(Dedukt.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(Dedukt.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(Dedukt.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Dedukt.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Dedukt.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(Dedukt.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(Dedukt.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(Dedukt.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(Dedukt.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Dedukt.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Dedukt.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Dedukt.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Dedukt.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Dedukt.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Dedukt.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(Dedukt.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(Dedukt.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#variableOperation}.
	 * @param ctx the parse tree
	 */
	void enterVariableOperation(Dedukt.VariableOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#variableOperation}.
	 * @param ctx the parse tree
	 */
	void exitVariableOperation(Dedukt.VariableOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Dedukt.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Dedukt.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#errorHandling}.
	 * @param ctx the parse tree
	 */
	void enterErrorHandling(Dedukt.ErrorHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#errorHandling}.
	 * @param ctx the parse tree
	 */
	void exitErrorHandling(Dedukt.ErrorHandlingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(Dedukt.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(Dedukt.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(Dedukt.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(Dedukt.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#debugOperation}.
	 * @param ctx the parse tree
	 */
	void enterDebugOperation(Dedukt.DebugOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#debugOperation}.
	 * @param ctx the parse tree
	 */
	void exitDebugOperation(Dedukt.DebugOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(Dedukt.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(Dedukt.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#debugStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebugStatement(Dedukt.DebugStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#debugStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebugStatement(Dedukt.DebugStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Dedukt.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Dedukt.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Dedukt.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Dedukt.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#typeOptions}.
	 * @param ctx the parse tree
	 */
	void enterTypeOptions(Dedukt.TypeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#typeOptions}.
	 * @param ctx the parse tree
	 */
	void exitTypeOptions(Dedukt.TypeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Dedukt.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Dedukt.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Dedukt.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Dedukt.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Dedukt.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Dedukt.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#dependentType}.
	 * @param ctx the parse tree
	 */
	void enterDependentType(Dedukt.DependentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#dependentType}.
	 * @param ctx the parse tree
	 */
	void exitDependentType(Dedukt.DependentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#parameterOptions}.
	 * @param ctx the parse tree
	 */
	void enterParameterOptions(Dedukt.ParameterOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#parameterOptions}.
	 * @param ctx the parse tree
	 */
	void exitParameterOptions(Dedukt.ParameterOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#parameterOption}.
	 * @param ctx the parse tree
	 */
	void enterParameterOption(Dedukt.ParameterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#parameterOption}.
	 * @param ctx the parse tree
	 */
	void exitParameterOption(Dedukt.ParameterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#subtypeOption}.
	 * @param ctx the parse tree
	 */
	void enterSubtypeOption(Dedukt.SubtypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#subtypeOption}.
	 * @param ctx the parse tree
	 */
	void exitSubtypeOption(Dedukt.SubtypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#superTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterSuperTypeOption(Dedukt.SuperTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#superTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitSuperTypeOption(Dedukt.SuperTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#subTyping}.
	 * @param ctx the parse tree
	 */
	void enterSubTyping(Dedukt.SubTypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#subTyping}.
	 * @param ctx the parse tree
	 */
	void exitSubTyping(Dedukt.SubTypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#applicability}.
	 * @param ctx the parse tree
	 */
	void enterApplicability(Dedukt.ApplicabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#applicability}.
	 * @param ctx the parse tree
	 */
	void exitApplicability(Dedukt.ApplicabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#contextDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterContextDeclaration(Dedukt.ContextDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#contextDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitContextDeclaration(Dedukt.ContextDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#notationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNotationDeclaration(Dedukt.NotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#notationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNotationDeclaration(Dedukt.NotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Dedukt.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Dedukt.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#functionTypeFormat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeFormat(Dedukt.FunctionTypeFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#functionTypeFormat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeFormat(Dedukt.FunctionTypeFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDeclaration(Dedukt.OperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDeclaration(Dedukt.OperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#structureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructureDeclaration(Dedukt.StructureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#structureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructureDeclaration(Dedukt.StructureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#theoryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTheoryDeclaration(Dedukt.TheoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#theoryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTheoryDeclaration(Dedukt.TheoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#axiomDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAxiomDeclaration(Dedukt.AxiomDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#axiomDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAxiomDeclaration(Dedukt.AxiomDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration(Dedukt.RuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration(Dedukt.RuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(Dedukt.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(Dedukt.AnnotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#annotationContext}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationContext(Dedukt.AnnotationContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#annotationContext}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationContext(Dedukt.AnnotationContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#headlessFunction}.
	 * @param ctx the parse tree
	 */
	void enterHeadlessFunction(Dedukt.HeadlessFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#headlessFunction}.
	 * @param ctx the parse tree
	 */
	void exitHeadlessFunction(Dedukt.HeadlessFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#returnable}.
	 * @param ctx the parse tree
	 */
	void enterReturnable(Dedukt.ReturnableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#returnable}.
	 * @param ctx the parse tree
	 */
	void exitReturnable(Dedukt.ReturnableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#typeContext}.
	 * @param ctx the parse tree
	 */
	void enterTypeContext(Dedukt.TypeContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#typeContext}.
	 * @param ctx the parse tree
	 */
	void exitTypeContext(Dedukt.TypeContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#notationContext}.
	 * @param ctx the parse tree
	 */
	void enterNotationContext(Dedukt.NotationContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#notationContext}.
	 * @param ctx the parse tree
	 */
	void exitNotationContext(Dedukt.NotationContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#operatorContext}.
	 * @param ctx the parse tree
	 */
	void enterOperatorContext(Dedukt.OperatorContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#operatorContext}.
	 * @param ctx the parse tree
	 */
	void exitOperatorContext(Dedukt.OperatorContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#structureContext}.
	 * @param ctx the parse tree
	 */
	void enterStructureContext(Dedukt.StructureContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#structureContext}.
	 * @param ctx the parse tree
	 */
	void exitStructureContext(Dedukt.StructureContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#theoryContext}.
	 * @param ctx the parse tree
	 */
	void enterTheoryContext(Dedukt.TheoryContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#theoryContext}.
	 * @param ctx the parse tree
	 */
	void exitTheoryContext(Dedukt.TheoryContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#axiomContext}.
	 * @param ctx the parse tree
	 */
	void enterAxiomContext(Dedukt.AxiomContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#axiomContext}.
	 * @param ctx the parse tree
	 */
	void exitAxiomContext(Dedukt.AxiomContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#ruleContext}.
	 * @param ctx the parse tree
	 */
	void enterRuleContext(Dedukt.RuleContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#ruleContext}.
	 * @param ctx the parse tree
	 */
	void exitRuleContext(Dedukt.RuleContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#commaSeparatedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparatedIdentifiers(Dedukt.CommaSeparatedIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#commaSeparatedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparatedIdentifiers(Dedukt.CommaSeparatedIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#commaSeparatedTypedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparatedTypedIdentifiers(Dedukt.CommaSeparatedTypedIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#commaSeparatedTypedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparatedTypedIdentifiers(Dedukt.CommaSeparatedTypedIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Dedukt.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Dedukt.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dedukt#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Dedukt.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dedukt#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Dedukt.LiteralContext ctx);
}