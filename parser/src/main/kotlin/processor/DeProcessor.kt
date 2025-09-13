package com.iskportal.dedukt.lang.processor

import DeduktLexer
import DeduktParser
import org.antlr.v4.codegen.model.Loop
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


class DeProcessor {
    companion object {
        const val VERSION = "0.0.4"
        const val LICENSE = "Apache-2.0"

        fun getVersion() = VERSION
        fun getLicense() = LICENSE
    }

    fun process(input: String): SourceCode {
        // Generate the parser and lexer from the input.
        val inputStream = CharStreams.fromString(input)
        val lexer = DeduktLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DeduktParser(tokens)

        return parser.toSourceCode()
    }
}

interface SourceCode {
    val header: Header?
    val body: Body?
}

interface Header {
    val packageDeclaration: PackageDeclaration
    val importList: List<ImportStatement>?
}

interface PackageDeclaration {
    val packageIdentifier: List<PackageIdentifierNode>
}

interface PackageIdentifierNode {
    val name: String
}

interface ImportStatement {
    val packageIdentifier: List<PackageIdentifierNode>
    val star: Boolean
}

interface Body {
    val statements: List<Statement>
}

interface Statement
interface DeclarationStatement : Statement
interface ApplicationStatement : Statement

interface Expression : ApplicationStatement

interface JuxtapositionExpression : Expression {
    val expression: Expression
    val primaryExpression: PrimaryExpression
}

interface AtomExpression

enum class ChainType {
    FUNCTIONCALL,
    HEADLESSFUNCTION,
    IDENTIFIER
}

interface ChainOperator<T> : AtomExpression {
    val operand: AtomExpression
    val chainModel: T
}


interface PrimaryExpression : Expression
interface MultipleAtomExpression : PrimaryExpression {
    val identifiers: List<AtomExpression>
}

interface FunctionCall : PrimaryExpression {
    val identifier: Identifier
    val argumentList: List<Expression>
}

interface CompoundExpression : PrimaryExpression {
    val expression: Expression
}


enum class ConditionalType {
    IF,
    WHEN,
    GUARD,
    TERNARY
}

interface ConditionalStatement : ApplicationStatement
interface IfStatement : ConditionalStatement {
    val ifStatement: Pair<Expression, List<Statement>>
    val elseIfStatements: List<Pair<Expression, List<Statement>>>?
    val elseStatement: List<Statement>?
}

interface CaseStatement {
    val case: Expression
    val action: Expression
    val returnable: Boolean
}


interface WhenStatement : ConditionalStatement {
    val proposedExpression: Expression
    val cases: List<CaseStatement>
    val default: Expression
}

interface GuardStatement : ConditionalStatement {
    val expression: Expression
    val throwable: Expression
}

interface TernaryExpression: ConditionalStatement {
    val condition: Expression
    val trueStatement: Expression
    val falseStatement: Expression
}
interface LoopStatement : ApplicationStatement


/**
 * Parse source code and return the AST root
 */
fun parse(input: String): DeduktParser {
    val inputStream = CharStreams.fromString(input)
    val lexer = DeduktLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = DeduktParser(tokens)
    return parser
}

interface WhileLoop : LoopStatement {
    val condition: Expression
    val loopBody: LoopBody
}

interface DoWhileLoop : WhileLoop

enum class JumpStatementType {
    BREAK,
    CONTINUE,
    RETURN,
    GOTO
}

interface JumpStatement : ApplicationStatement {
    val type: JumpStatementType
    val expression: Expression?
}

enum class AssignmentType {
    VAR,
    VAL,
    CONST
}

interface VariableOperationStatement : ApplicationStatement
interface Assignment : VariableOperationStatement {
    val type: AssignmentType
        get() = AssignmentType.VAL
    val identifier: Identifier
    val subTyping: SubTyping
    val expression: Expression
}

interface LateAssignmentDef : VariableOperationStatement {
    val type: AssignmentType
        get() = AssignmentType.VAL
    val identifier: Identifier
    val subTyping: SubTyping
}

interface LateAssignment : VariableOperationStatement, PrimaryExpression {
    val identifier: Identifier
    val expression: Expression
}

interface ErrorHandlingStatement : ApplicationStatement
interface ThrowStatement : Expression, ErrorHandlingStatement
interface TryStatement : ErrorHandlingStatement {
    val tryStatement: LoopBody
    val cathStatement: LoopBody?
    val finallyStatement: LoopBody?
}

interface LoopBody {
    val statements: List<Statement>
}

interface DebugOperationStatement : ApplicationStatement

interface AssertStatement : DebugOperationStatement {
    val assertable: Expression
    val Expression: Expression
}

interface DebugStatement : Statement

interface TypeDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: TypeOption?
    val context: TypeContext?
}

interface TypeOption {
    val parameters: List<Parameter>
    val subTyping: SubTyping
    val applicability: Applicability
}

interface TypeParameter {
    val identifier: Identifier
    val dependency: Identifier?
}

interface Parameter {
    val parameter: TypeParameter
    val parameterOption: List<ParameterOption>
}

enum class ParameterOptionType {
    SUBTYPE,
    SUPERTYPE
}

interface ParameterOption {
    val listOfTypes: List<Identifier>
    val optionType: ParameterOptionType
}

interface SubTyping {
    val listOfTypes: List<TypeParameter>
}

interface Applicability {
    val listOfTypes: List<TypeParameter>
}

interface ContextDeclaration : DeclarationStatement {
    val identifier: Identifier
    val statements: List<Statement>
}

interface NotationDeclaration : DeclarationStatement {
    val identifier: Identifier
    val applicability: Applicability
    val context: NotationContext
}


interface FunctionDeclaration : DeclarationStatement {
    val identifier: Identifier
    val parameters: List<Parameter>
    val functionTypeFormat: FunctionType
}

interface FunctionType {
    val input: List<TypedIdentifier>
    val output: List<TypedIdentifier>
}

interface OperatorDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: List<TypeOption>
    val context: OperatorContext
}

interface StructureDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: List<TypeOption>
    val context: StructureContext
}

interface TheoryDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: List<TypeOption>
    val context: TheoryContext
}

interface AxiomDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: List<TypeOption>
    val context: AxiomContext
}

interface RuleDeclaration : DeclarationStatement {
    val identifier: Identifier
    val context: RuleContext
}

interface AnnotationDeclaration : DeclarationStatement {
    val identifier: Identifier
    val typeOptions: TypeOption
    val context: AnnotationContext
}

interface Context
interface AnnotationContext {
    val statements: List<Statement>
}

interface HeadlessFunction : PrimaryExpression {
    val statements: List<Statement>
    val Expression: Expression
}


// TODO place holders
interface TypeContext : Context
interface NotationContext : Context
interface AxiomContext : Context
interface OperatorContext : Context

interface StructureContext : Context
interface TheoryContext : Context
interface RuleContext : Context

typealias TypedIdentifier = Pair<Identifier, Identifier>

enum class IdentifierType {
    LATEX,
    SIMPLE,
    MATHEMATICAL
}

interface Identifier : AtomExpression {
    val text: String
    val identifierType: IdentifierType
}

enum class LiteralType {
    NUM,
    BOOL,
    STRING,
    IDENTIFIER
}

interface Literal : AtomExpression {
    val text: String
    val type: LiteralType
}

enum class DeclarationType {
    ANNOTATION,
    NOTATION,
    TYPE,
    FUNCTION,
    STRUCTURE,
    THEORY,
    CONTEXT,
    RULE,
    OPERATOR,
    AXIOM

}

fun DeduktParser.DeclarationContext.declarationType(): DeclarationType {
    if (!this.annotationDeclaration().isEmpty)
        return DeclarationType.ANNOTATION
    else if (!this.notationDeclaration().isEmpty)
        return DeclarationType.NOTATION
    else if (!this.typeDeclaration().isEmpty)
        return DeclarationType.TYPE
    else if (!this.functionDeclaration().isEmpty)
        return DeclarationType.FUNCTION
    else if (!this.structureDeclaration().isEmpty)
        return DeclarationType.STRUCTURE
    else if (!this.theoryDeclaration().isEmpty)
        return DeclarationType.THEORY
    else if (!this.contextDeclaration().isEmpty)
        return DeclarationType.CONTEXT
    else if (!this.ruleDeclaration().isEmpty)
        return DeclarationType.RULE
    else if (!this.operatorDeclaration().isEmpty)
        return DeclarationType.OPERATOR
    else if (!this.axiomDeclaration().isEmpty)
        return DeclarationType.AXIOM
    else
        throw Throwable("Declaration ${this.text} is not defined in Dedukt. Check the version of the language.")
}

enum class ApplicationType {
    EXPRESSION,
    CONDITIONAL,
    LOOP,
    JUMP,
    VARIABLEOPERATION,
    ERRORHANDLING,
    DEBUGOPERATION
}

fun DeduktParser.ApplicationContext.applicationType(): ApplicationType {
    if (!this.expression().isEmpty)
        return ApplicationType.EXPRESSION
    else if (!this.conditional().isEmpty)
        return ApplicationType.CONDITIONAL
    else if (!this.loop().isEmpty)
        return ApplicationType.LOOP
    else if (!this.jump().isEmpty)
        return ApplicationType.JUMP
    else if (!this.variableOperation().isEmpty)
        return ApplicationType.VARIABLEOPERATION
    else if (!this.errorHandling().isEmpty)
        return ApplicationType.ERRORHANDLING
    else if (!this.debugOperation().isEmpty)
        return ApplicationType.DEBUGOPERATION
    else
        throw Throwable("Application ${this.text} is not defined in Dedukt.")
}

fun DeduktParser.toSourceCode(): SourceCode {
    return object : SourceCode {
        override val header: Header?
            get() = this@toSourceCode.header().toHeader()
        override val body: Body?
            get() = this@toSourceCode.body().toBody()
    }
}

fun DeduktParser.HeaderContext.toHeader(): Header {
    return object : Header {
        override val packageDeclaration: PackageDeclaration
            get() = this@toHeader.packageDeclaration().toPackageDeclaration()
        override val importList: List<ImportStatement>?
            get() = this@toHeader.importList().toListOfImportStatement()
    }
}

fun DeduktParser.PackageDeclarationContext.toPackageDeclaration(): PackageDeclaration {
    return object : PackageDeclaration {
        override val packageIdentifier: List<PackageIdentifierNode>
            get() = this@toPackageDeclaration.packageIdentifier().packageIdentifierNode()
                .toListOfPackageIdentifierNode()
    }
}

fun List<DeduktParser.PackageIdentifierNodeContext>.toListOfPackageIdentifierNode(): List<PackageIdentifierNode> {
    return this.map {
        object : PackageIdentifierNode {
            override val name: String
                get() = it.text
        }
    }
}

fun DeduktParser.ImportListContext.toListOfImportStatement(): List<ImportStatement> {
    return this.importStatement().map {
        object : ImportStatement {
            override val packageIdentifier: List<PackageIdentifierNode>
                get() = it.packageIdentifier().packageIdentifierNode().toListOfPackageIdentifierNode()
            override val star: Boolean
                get() = !it.Star().text.isEmpty()

        }
    }
}

fun DeduktParser.BodyContext.toBody(): Body {
    return object : Body {
        override val statements: List<Statement>
            get() = this@toBody.statement().map { statement ->
                statement.toStatement()
            }
    }
}

fun DeduktParser.StatementContext.toStatement(): Statement {
    if (!this.application().isEmpty) {
        when (this.application().applicationType()) {
            ApplicationType.EXPRESSION -> return this.application().expression().toExpression()
            ApplicationType.CONDITIONAL -> return this.application().conditional().toConditional()
            ApplicationType.LOOP -> return this.application().loop().toLoop()
            ApplicationType.JUMP -> return this.application().jump().toJump()
            ApplicationType.VARIABLEOPERATION -> return this.application().variableOperation().toVariableOperation()
            ApplicationType.ERRORHANDLING -> return this.application().errorHandling().toErrorHandling()
            ApplicationType.DEBUGOPERATION -> return this.application().debugOperation().toDebugOperation()
        }
    } else if (!this.declaration().isEmpty) {
        when (this.declaration().declarationType()) {
            DeclarationType.ANNOTATION -> return this.declaration().annotationDeclaration().toAnnotationDeclaration()
            DeclarationType.AXIOM -> return this.declaration().axiomDeclaration().toAxiomDeclaration()
            DeclarationType.TYPE -> return this.declaration().typeDeclaration().toTypeDeclaration()
            DeclarationType.OPERATOR -> return this.declaration().operatorDeclaration().toOperatorDeclaration()
            DeclarationType.STRUCTURE -> return this.declaration().structureDeclaration().toStructureDeclaration()
            DeclarationType.THEORY -> return this.declaration().theoryDeclaration().toTheoryDeclaration()
            DeclarationType.CONTEXT -> return this.declaration().contextDeclaration().toContextDeclaration()
            DeclarationType.RULE -> return this.declaration().ruleDeclaration().toRuleDeclaration()
            DeclarationType.NOTATION -> return this.declaration().notationDeclaration().toNotationDeclaration()
            DeclarationType.FUNCTION -> return this.declaration().functionDeclaration().toFunctionDeclaration()
        }
    } else {
        throw Throwable("parser error at ${this.text}")
    }
}


enum class ExpressionType {
    JUXTAPOSITION,
    BASECASE
}

fun DeduktParser.ExpressionContext.expressionType(): ExpressionType {
    if (!this.expression().isEmpty)
        return ExpressionType.JUXTAPOSITION
    else if (!this.primaryExpression().isEmpty)
        return ExpressionType.BASECASE
    else
        throw Throwable("expression at ${this.text} is incorrect.")
}

fun DeduktParser.ExpressionContext.toExpression(): Expression {
    when (this.expressionType()) {
        ExpressionType.JUXTAPOSITION -> return this.toJuxtapositionExpression()
        ExpressionType.BASECASE -> return this.primaryExpression().toBaseCaseExpression()
    }
}

fun DeduktParser.ExpressionContext.toJuxtapositionExpression(): JuxtapositionExpression {
    return object : JuxtapositionExpression {
        override val expression: Expression
            get() = this@toJuxtapositionExpression.expression().toExpression()
        override val primaryExpression: PrimaryExpression
            get() = this@toJuxtapositionExpression.primaryExpression().toBaseCaseExpression()
    }
}

enum class PrimaryExpressionType {
    MULTIPLEIDENTIFIERS,
    HEADLESSFUNCTION,
    FUNCTIONCALL,
    COMPOUND,
    LATEASSIGNMENT
}

fun DeduktParser.PrimaryExpressionContext.primaryExpressionType(): PrimaryExpressionType {
    if (!this.multipleIdentifiers().isEmpty)
        return PrimaryExpressionType.MULTIPLEIDENTIFIERS
    else if (!this.headlessFunction().isEmpty)
        return PrimaryExpressionType.HEADLESSFUNCTION
    else if (!this.functionCall().isEmpty)
        return PrimaryExpressionType.FUNCTIONCALL
    else if (!this.expression().isEmpty)
        return PrimaryExpressionType.COMPOUND
    else if (!this.lateAssignment().isEmpty)
        return PrimaryExpressionType.LATEASSIGNMENT
    else
        throw Throwable("primary expression at ${this.text} is incorrect.")
}

fun DeduktParser.PrimaryExpressionContext.toBaseCaseExpression(): PrimaryExpression {
    when (this.primaryExpressionType()) {
        PrimaryExpressionType.MULTIPLEIDENTIFIERS -> return this.multipleIdentifiers().toAtomExpressionList()
        PrimaryExpressionType.HEADLESSFUNCTION -> return this.headlessFunction().toHeadlessFunction()
        PrimaryExpressionType.FUNCTIONCALL -> return this.functionCall().toFunctionCall()
        PrimaryExpressionType.LATEASSIGNMENT -> return this.lateAssignment().toLateAssignment()
        PrimaryExpressionType.COMPOUND -> return object : CompoundExpression {
            override val expression: Expression
                get() = this@toBaseCaseExpression.expression().toExpression()
        }
    }
}

fun DeduktParser.LateAssignmentContext.toLateAssignment(): LateAssignment {
    return object : LateAssignment {
        override val identifier: Identifier
            get() = this@toLateAssignment.identifier().toIdentifier()
        override val expression: Expression
            get() = this@toLateAssignment.expression().toExpression()
    }
}

fun DeduktParser.HeadlessFunctionContext.toHeadlessFunction(): HeadlessFunction {
    return object : HeadlessFunction {
        override val statements: List<Statement>
            get() = this@toHeadlessFunction.statement().map { it.toStatement() }
        override val Expression: Expression
            get() = this@toHeadlessFunction.returnable().expression().toExpression()

    }
}

fun DeduktParser.FunctionCallContext.toFunctionCall(): FunctionCall {
    return object : FunctionCall {
        override val identifier: Identifier
            get() = this@toFunctionCall.identifier().toIdentifier()
        override val argumentList: List<Expression>
            get() = this@toFunctionCall.argumentList().expression().map { it.toExpression() }
    }
}

enum class AtomExpressionType {
    IDENTIFIER,
    CHAINOPERATOR,
    LITERAL
}

fun DeduktParser.AtomExpressionContext.atomExpressionType(): AtomExpressionType {
    if (!this.identifier().isEmpty)
        return AtomExpressionType.IDENTIFIER
    else if (!this.literal().isEmpty)
        return AtomExpressionType.LITERAL
    else if (!this.chainOperator().isEmpty)
        return AtomExpressionType.CHAINOPERATOR
    else
        throw Throwable("atom expression at ${this.text} is incorrect.")
}

fun DeduktParser.MultipleIdentifiersContext.toAtomExpressionList(): MultipleAtomExpression {
    return object : MultipleAtomExpression {
        override val identifiers: List<AtomExpression>
            get() = this@toAtomExpressionList.atomExpression().map {
                it.toAtomExpression()
            }
    }
}

fun DeduktParser.AtomExpressionContext.toAtomExpression(): AtomExpression {
    return when (this.atomExpressionType()) {
        AtomExpressionType.IDENTIFIER -> this.identifier().toIdentifier()
        AtomExpressionType.LITERAL -> this.literal().toLiteral()
        AtomExpressionType.CHAINOPERATOR -> this.chainOperator().toChainOperator()
    }
}

fun DeduktParser.ChainOperatorContext.toChainOperator(): ChainOperator<*> {
    when (this.chainOperatorType()) {
        // TODO : Identifier case should be written with distinction of the operand and chainModel in mind
        ChainType.IDENTIFIER -> return object : ChainOperator<Identifier> {
            override val operand: AtomExpression
                get() = this@toChainOperator.identifier().first().toIdentifier()
            override val chainModel: Identifier
                get() = this@toChainOperator.identifier().last().toIdentifier()
        }

        ChainType.FUNCTIONCALL -> return object : ChainOperator<FunctionCall> {
            override val operand: AtomExpression
                get() = this@toChainOperator.identifier().first().toIdentifier()
            override val chainModel: FunctionCall
                get() = this@toChainOperator.functionCall().toFunctionCall()
        }

        ChainType.HEADLESSFUNCTION -> return object : ChainOperator<HeadlessFunction> {
            override val operand: AtomExpression
                get() = this@toChainOperator.identifier().first().toIdentifier()
            override val chainModel: HeadlessFunction
                get() = this@toChainOperator.headlessFunction().toHeadlessFunction()
        }
    }
}

fun DeduktParser.ChainOperatorContext.chainOperatorType(): ChainType {
    if (!this.functionCall().isEmpty)
        return ChainType.FUNCTIONCALL
    else if (!this.headlessFunction().isEmpty)
        return ChainType.HEADLESSFUNCTION
    // TODO : Identifier is both the operand and the operator name in the parser!
    else
        return ChainType.IDENTIFIER
}

fun DeduktParser.IdentifierContext.identifierType(): IdentifierType {
    if (!this.SimpleIdentifier().text.isEmpty())
        return IdentifierType.SIMPLE
    else if (!this.LatexStyleIdentifier().text.isEmpty())
        return IdentifierType.LATEX
    else if (!this.MathematicalUnicodeFamily().text.isEmpty())
        return IdentifierType.MATHEMATICAL
    else
        throw Throwable("Identifier expression at ${this.text} is incorrect.")
}

fun DeduktParser.IdentifierContext.toIdentifier(): Identifier {
    val identifierType = this.identifierType()
    return object : Identifier {
        override val text: String
            get() = this@toIdentifier.text
        override val identifierType: IdentifierType
            get() = identifierType
    }
}

fun DeduktParser.LiteralContext.literalType(): LiteralType {
    if (!this.identifier().isEmpty)
        return LiteralType.IDENTIFIER
    else if (!this.boolean_().isEmpty())
        return LiteralType.BOOL
    else if (!this.Number().text.isEmpty())
        return LiteralType.NUM
    else if (!this.StringLiteral().text.isEmpty())
        return LiteralType.STRING
    else
        throw Throwable("Literal expression at ${this.text} is incorrect.")
}

fun DeduktParser.LiteralContext.toLiteral(): Literal {
    val literalType = this.literalType()
    return object : Literal {
        override val text: String
            get() = this@toLiteral.text
        override val type: LiteralType
            get() = literalType

    }
}

fun DeduktParser.ConditionalContext.conditionalType(): ConditionalType {
    if (!this.ifStatement().isEmpty)
        return ConditionalType.IF
    else if (!this.whenStatement().isEmpty)
        return ConditionalType.WHEN
    else if (!this.guardStatement().isEmpty)
        return ConditionalType.GUARD
    else if (!this.ternaryExpression().isEmpty)
        return ConditionalType.TERNARY
    else throw Throwable("conditional expression at ${this.text} is incorrect.")
}

fun DeduktParser.ConditionalContext.toConditional(): ConditionalStatement {
    when (this.conditionalType()) {
        ConditionalType.IF -> return object : IfStatement {
            override val ifStatement: Pair<Expression, List<Statement>>
                get() = this@toConditional.ifStatement().mainConditional().expression()
                    .toExpression() to this@toConditional.ifStatement().mainConditional().statement()
                    .map { it.toStatement() }

            override val elseIfStatements: List<Pair<Expression, List<Statement>>>?
                get() = this@toConditional.ifStatement().elseIfConditionals().map {
                    it.expression().toExpression() to it.statement().map { it.toStatement() }
                }
            override val elseStatement: List<Statement>?
                get() = this@toConditional.ifStatement().elseStatement().statement().map { it.toStatement() }

        }
        ConditionalType.WHEN -> return object : WhenStatement {
            override val proposedExpression: Expression
                get() = this@toConditional.whenStatement().proposedExpression().expression().toExpression()
            override val cases: List<CaseStatement>
                get() = this@toConditional.whenStatement().caseStatements().caseStatement().map {
                    object : CaseStatement {
                        override val case: Expression
                            get() = it.expression().first().toExpression()
                        override val action: Expression
                            get() = it.expression().last().toExpression()
                        override val returnable: Boolean
                            get() = !it.returnable().isEmpty
                    } }
            override val default: Expression
                get() = this@toConditional.whenStatement().caseStatements().defaultStatement().expression().toExpression()
        }

        ConditionalType.GUARD -> return object : GuardStatement {
            override val expression: Expression
                get() = this@toConditional.guardStatement().expression().first().toExpression()
            override val throwable: Expression
                get() = this@toConditional.guardStatement().expression().last().toExpression()
        }
        ConditionalType.TERNARY -> return object : TernaryExpression {
            override val condition: Expression
                get() = this@toConditional.ternaryExpression().expression()[0].toExpression()
            override val trueStatement: Expression
                get() = this@toConditional.ternaryExpression().expression()[1].toExpression()
            override val falseStatement: Expression
                get() = this@toConditional.ternaryExpression().expression()[2].toExpression()

        }
    }
}
interface ForLoop : LoopStatement {
    val condition: Expression
    val loopBody : LoopBody
}
enum class LoopType {
    FOR,
    WHILE,
    DOWHILE
}
fun DeduktParser.LoopContext.loopType() : LoopType {
    if (!this.forLoop().isEmpty)
        return LoopType.FOR
    else if (!this.whileLoop().isEmpty)
        return LoopType.WHILE
    else
        return LoopType.DOWHILE
}
fun DeduktParser.LoopContext.toLoop(): LoopStatement {
    return when (this.loopType()) {
        LoopType.FOR -> object: ForLoop {
            override val condition: Expression
                get() = this@toLoop.forLoop().expression().toExpression()
            override val loopBody: LoopBody
                get() = this@toLoop.forLoop().loopBody().toLoopBody()
        }
        LoopType.WHILE -> object: WhileLoop {
            override val condition: Expression
                get() = this@toLoop.whileLoop().expression().toExpression()
            override val loopBody: LoopBody
                get() = this@toLoop.whileLoop().loopBody().toLoopBody()
        }
        LoopType.DOWHILE -> object: DoWhileLoop {
            override val condition: Expression
                get() = this@toLoop.whileLoop().expression().toExpression()
            override val loopBody: LoopBody
                get() = this@toLoop.whileLoop().loopBody().toLoopBody()
        }
    }
}

fun DeduktParser.LoopBodyContext.toLoopBody(): LoopBody {
    return object : LoopBody {
        override val statements: List<Statement>
            get() = this@toLoopBody.statement().map { it.toStatement() }
    }
}

fun DeduktParser.JumpContext.jumpType(): JumpStatementType {
    if (!this.breakStatement().isEmpty)
        return JumpStatementType.BREAK
    else if (!this.continueStatement().isEmpty)
        return JumpStatementType.CONTINUE
    else if (!this.returnStatement().isEmpty)
        return JumpStatementType.RETURN
    else if (!this.gotoStatement().isEmpty)
        return JumpStatementType.GOTO
    else
        throw Throwable("${this.text} is not a jump statement ")
}
fun DeduktParser.JumpContext.toJump(): JumpStatement {
    val jumpType = this.jumpType()
     return when (jumpType) {
         JumpStatementType.BREAK -> object : JumpStatement {
             override val type: JumpStatementType
                 get() = jumpType
             override val expression: Expression?
                 get() = null
         }
         JumpStatementType.CONTINUE -> object : JumpStatement {
             override val type: JumpStatementType
                 get() = jumpType
             override val expression: Expression?
                 get() = null
         }
         // TODO for now.
         JumpStatementType.GOTO -> object : JumpStatement {
             override val type: JumpStatementType
                 get() = jumpType
             override val expression: Expression?
                 get() = null
         }
         JumpStatementType.RETURN -> object : JumpStatement {
             override val type: JumpStatementType
                 get() = jumpType
             override val expression: Expression
                 get() = this@toJump.breakStatement().expression().toExpression()
         }
     }

}
fun DeduktParser.VariableOperationContext.toVariableOperation(): VariableOperationStatement {
    if (!this.assignment().isEmpty)
        return object : Assignment {
            override val identifier: Identifier
                get() = this@toVariableOperation.assignment().identifier().toIdentifier()
            override val subTyping: SubTyping
                get() = this@toVariableOperation.assignment().subTyping().toSubTyping()
            override val expression: Expression
                get() = this@toVariableOperation.assignment().expression().toExpression()
        }
    else if (!this.lateAssignmentDef().isEmpty)
        return object : LateAssignmentDef {
            override val identifier: Identifier
                get() = this@toVariableOperation.lateAssignmentDef().identifier().toIdentifier()
            override val subTyping: SubTyping
                get() = this@toVariableOperation.lateAssignmentDef().subTyping().toSubTyping()
        }
    else if (!this.lateAssignment().isEmpty)
        return object : LateAssignment {
            override val identifier: Identifier
                get() = this@toVariableOperation.lateAssignment().identifier().toIdentifier()
            override val expression: Expression
                get() = this@toVariableOperation.lateAssignment().expression().toExpression()

        }
}
fun DeduktParser.ErrorHandlingContext.toErrorHandling(): ErrorHandlingStatement {
    if (!this.throwStatement().isEmpty)
        return throwStatement().expression().toExpression() as ThrowStatement
    else if (!this.tryStatement().isEmpty)
        return object : TryStatement {
            override val tryStatement: LoopBody
                get() = this@toErrorHandling.tryStatement().loopBody().first().toLoopBody()
            override val cathStatement: LoopBody?
                get() = this@toErrorHandling.tryStatement().loopBody()[1].toLoopBody()
            override val finallyStatement: LoopBody?
                get() = this@toErrorHandling.tryStatement().loopBody()[2].toLoopBody()
        }
    else throw Throwable("error handling statement ${this.text} is not correct.")
}
fun DeduktParser.DebugOperationContext.toDebugOperation(): DebugOperationStatement {
    return object : DebugOperationStatement {}
}

fun DeduktParser.AnnotationDeclarationContext.toAnnotationDeclaration(): AnnotationDeclaration {
    return object : AnnotationDeclaration {
        override val identifier: Identifier
            get() = this@toAnnotationDeclaration.identifier().toIdentifier()
        override val typeOptions: List<TypeOption>
            get() = this@toAnnotationDeclaration.typeOptions().
        override val context: AnnotationContext
            get() = TODO("Not yet implemented")

    }
}
fun DeduktParser.AxiomDeclarationContext.toAxiomDeclaration(): AxiomDeclaration {}
fun DeduktParser.TypeDeclarationContext.toTypeDeclaration(): TypeDeclaration {}
fun DeduktParser.OperatorDeclarationContext.toOperatorDeclaration(): OperatorDeclaration {}
fun DeduktParser.StructureDeclarationContext.toStructureDeclaration(): StructureDeclaration {}
fun DeduktParser.TheoryDeclarationContext.toTheoryDeclaration(): TheoryDeclaration {}
fun DeduktParser.ContextDeclarationContext.toContextDeclaration(): ContextDeclaration {}
fun DeduktParser.RuleDeclarationContext.toRuleDeclaration(): RuleDeclaration {}
fun DeduktParser.NotationDeclarationContext.toNotationDeclaration(): NotationDeclaration {}
fun DeduktParser.FunctionDeclarationContext.toFunctionDeclaration(): FunctionDeclaration {}
