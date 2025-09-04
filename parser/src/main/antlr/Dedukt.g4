// =============================================================================
// DeduKt Language Grammar file
// =============================================================================
// The following file is the main grammar definition for DeduKt language.
// This is being used to create the parser and lexer.
grammar Dedukt;

// =============================================================================
// SOURCE CODE STRUCTURE
// =============================================================================

/**
 * Entry point for DeduKt source files
 * Structure: [header] [body] | empty file
 *
 * Examples:
 *   package com.example; fun main() { ... }
 *   // Empty file is valid
 */
deduktSourceCode
    : header? body?
    | EOF
    ;

// =============================================================================
// HEADER SECTION - Package and Import Declarations
// =============================================================================

/**
 * File header containing package declaration and optional imports
 * Must appear at the beginning of file before any implementations
 *
 * Structure: package declaration + optional imports
 * Example: package math.algebra; import std.collections.*; import io.files;
 */
header
    : packageDeclaration importList?
    ;

/**
 * Package declaration - required for all DeduKt files
 * Establishes namespace and enables module system integration
 * Supports hierarchical package structure with dot notation
 *
 * Syntax: package <identifier>.<identifier>...
 * Example: package mathematics.linear_algebra.vectors
 */
packageDeclaration
    : Package WS* packageIdentifier NL*
    ;

/**
 * Hierarchical package identifier using dot notation
 * Allows nested package structures for better organization
 *
 * Examples: std, math.algebra, com.example.utils
 */

packageIdentifier
    : packageIdentifierNode (Dot packageIdentifierNode)*
    ;
packageIdentifierNode
    : identifier
    | Where | Default |Continue | Break | This | Super |File | Field | Property | Get | Set
    | Reciever | Param | SetParam | Delegate | Package | Import | Type | Notation | Operator | Fun
    | Context | Structure | Axiom | Rule | Notation | Theory | Val | Var | Const | TypeAlias
    | Constructor | By | Companion | Init | This | TypeOf | If | Else | When | Finally | Case
    | Try | Catch | Gaurd | For | Do | While | Throw | Jump | As | Is | In | Out | Dynamic
    | Public | Private | Protected | Internal | Enum | Sealed | Annotation | Data
    | Inner | Tailrec | Inline | External | Suspend | Override | Abstract | Final | Open
    | Lateinit | Vararg | NoInline | Crossline | Reified | Assert | Read | Print | Debug
    | Write | Close
    ;

/**
 * Collection of import statements
 * Brings external symbols into current namespace
 * Supports both specific imports and wildcard imports
 */
importList
    : importStatement+
    ;

/**
 * Individual import statement
 * Can import specific package or use wildcard (*) for all symbols
 *
 * Syntax: import <package>[.*]
 * Examples:
 *   import std.collections
 *   import math.algebra.*
 */
importStatement
    : Import WS* packageIdentifier (Dot Star)? NL*
    ;

// =============================================================================
// BODY SECTION - Implementation Statements
// =============================================================================

/**
 * Main body containing all declarations and implementations
 * Consists of zero or more statements that define the program logic
 */
body
    : statement+
    ;

/**
 * Individual statement in DeduKt source code
 * Currently supports declarations only (applications/evaluations to be added)
 * Each statement defines a mathematical or computational construct
 */
statement
    : declaration
    | application
    ;
// =============================================================================
// APPLICATION RULES - Expressions, Statements and Control Flow
// =============================================================================

/**
* Application rule - top-level evaluable statements in DeduKt
* Represents any statement that DeduKt can theoretically evaluate
* Includes pure evaluations, transformable expressions, control flow,
* loops, variable assignments, and other executable constructs
*
* Syntax: <expression> | <statement> | <control_flow>
* Examples:
*   x + y * z
*   result = calculate{a, b}
*   if condition then action
*/
application
   : expression (SemiColon expression)*
   | conditional
   | loop
   | jump
   | variableOperation
   | errorHandling
   | ioOperation
//   | memoryOperation
   | debugOperation
   ;

/**
* Main expression rule - entry point for all expression parsing
* Delegates to chain expressions which have the highest precedence
* Forms the root of the expression hierarchy
*
* Syntax: <chainExpression>
*/
expression
   : chainExpression             // Highest precedence: chains
   ;

/**
* Chain expressions - left-associative operator chains
* Handles method chaining, property access, and function composition
* Primary expressions can be chained with dot operators or juxtaposed
*
* Syntax: <primary> [<chainOp> | <primary>]*
* Examples:
*   object.method{args}.property
*   func{x} transform{y}
*   data.filter{condition}.map{transform}
*/
chainExpression
   : primaryExpression (chainOperator | primaryExpression)*
   ;

/**
* Chain operators - operators for chaining expressions
* Supports method calls, headless functions, and property access
* All use dot notation for consistent syntax
*
* Syntax: .<identifier>{<args>} | .{<expressions>} | .<identifier>
* Examples:
*   .method{arg1, arg2}    // Method call
*   .{x -> x + 1}          // Headless function application
*   .property              // Property access
*/
chainOperator
   : Dot functionCall             // .identifier{args}
   | Dot headlessFunction         // .{expressions}
   | Dot identifier               // .property
   ;

/**
* Primary expressions - atomic expression units
* Base cases for the expression grammar hierarchy
* Includes literals, functions, calls, and parenthesized expressions
*
* Syntax: <identifiers> | {<expressions>} | <identifier>{<args>} | (<expression>)
* Examples:
*   variable constant        // Multiple identifiers
*   {x -> x * 2}            // Headless function
*   calculate{a, b, c}      // Function call
*   (x + y) * z             // Parenthesized expression
*/
primaryExpression
   : multipleIdentifiers           // Case 1: multiple identifiers
   | headlessFunction             // Case 2: headless function
   | functionCall                 // Case 3: function call
   | LParen expression RParen     // Case 4: compound expression (parentheses)
   ;

/**
* Multiple identifiers - sequence of adjacent literals/identifiers
* Supports juxtaposition for function application or data construction
* At least one literal must be present, followed by zero or more
*
* Syntax: <literal> [<literal>]*
* Examples:
*   Vector 3 4 5           // Constructor with arguments
*   map transform data     // Function application chain
*   x y z                  // Variable sequence
*/
multipleIdentifiers
   : literal literal*
   ;

/**
* Function call - identifier followed by argument list in curly braces
* Standard function invocation syntax with comma-separated arguments
* Arguments are optional - empty braces represent no-argument calls
*
* Syntax: <identifier>{[<arg1>, <arg2>, ...]}
* Examples:
*   calculate{x, y, z}     // Function with multiple arguments
*   getValue{}             // Function with no arguments
*   process{data.field}    // Function with complex argument
*/
functionCall
   : identifier LCurl argumentList? RCurl
   ;

/**
* Argument list - comma-separated sequence of expressions
* Used in function calls and other parameter-passing contexts
* Each argument is a full expression allowing complex nested structures
*
* Syntax: <expression> [, <expression>]*
* Examples:
*   x, y, z                // Simple variables
*   a + b, func{c}, d.prop // Mixed expression types
*/
argumentList
   : expression (Comma expression)*
   ;
// =============================================================================
// CONDITIONAL STATEMENTS - Branching Control Flow
// =============================================================================

/**
 * Conditional statement - all forms of branching control flow
 * Supports if/else chains, pattern matching, and multi-way branching
 *
 * Syntax: <ifStatement> | <caseStatement> | <whenStatement> | <guardStatement>
 */
conditional
    : ifStatement
    | caseStatement
    | whenStatement
    | guardStatement
    | ternaryExpression
    ;

/**
 * If statement - traditional conditional branching
 * Supports single condition with optional else clause and elif chains
 *
 * Syntax: if <condition> then <body> [elif <condition> then <body>]* [else <body>]
 * Examples:
 *   if x > 0 then positive
 *   if x > 0 then positive else negative
 *   if x > 0 then positive elif x < 0 then negative else zero
 */
ifStatement
    : If expression (Arrow expression | headlessFunction) (Else If expression (Arrow expression | headlessFunction))? (Else (Arrow expression | headlessFunction))?
    ;

/**
 * Case statement - pattern matching and multi-way branching
 * Supports pattern matching on values, types, and structure
 *
 * Syntax: case <expression> of <pattern> -> <body> [| <pattern> -> <body>]* [| _ -> <body>]
 * Examples:
 *   case value of 1 -> first | 2 -> second | _ -> other
 *   case shape of Circle{r} -> area{r} | Rectangle{w, h} -> w * h
 */
caseStatement
    : Case expression Arrow expression
    ;
defaultStatement
    : Default expression
    ;
caseStatements
    : caseStatement+ defaultStatement
    ;
/**
 * When statement - condition-based multi-branch selection
 * Similar to case but based on boolean conditions rather than pattern matching
 *
 * Syntax: when <condition> -> <body> [| <condition> -> <body>]* [| else -> <body>]
 * Examples:
 *   when x > 0 -> positive | x < 0 -> negative | else -> zero
 *   when hasPermission -> allow | isGuest -> restricted | else -> deny
 */
whenStatement
    : When expression ((Vert expression Arrow expression)+ Vert defaultStatement | LCurl caseStatements RCurl)
    ;

/**
 * Guard statement - condition-based early return/exit
 * Supports early termination based on conditions
 *
 * Syntax: guard <condition> else <action>
 * Examples:
 *   guard isValid else return error
 *   guard hasAccess else throw unauthorized
 */
guardStatement
    : Gaurd expression Else Return expression
    ;

/**
 * Ternary expression - inline conditional expression
 * Compact conditional for simple value selection
 *
 * Syntax: <condition> ? <trueValue> : <falseValue>
 * Examples:
 *   x > 0 ? positive : negative
 *   hasValue ? getValue{} : defaultValue
 */
ternaryExpression
    : expression QuestionMarK expression Colon expression
    ;
// =============================================================================
// LOOP STATEMENTS - Iterative Control Flow
// =============================================================================

/**
 * Loop statement - all forms of iterative execution
 * Supports counted loops, conditional loops, and iterator-based loops
 *
 * Syntax: <forLoop> | <whileLoop> | <doWhileLoop> | <foreachLoop>
 */
loop
    : forLoop
    | whileLoop
    | doWhileLoop
    ;
loopBody
    : (Arrow expression | headlessFunction)
    ;
/**
 * For loop - counted iteration with initialization, condition, and increment
 * Traditional C-style for loop with explicit control variables
 *
 * Syntax: for <init>; <condition>; <increment> do <body>
 * Examples:
 *   for i = 0; i < 10; i += 1 do process{i}
 *   for x = start; x <= end; x *= 2 do calculate{x}
 */
forLoop
    : For expression loopBody
    ;

/**
 * While loop - condition-based pre-test iteration
 * Executes body while condition remains true
 *
 * Syntax: while <condition> do <body>
 * Examples:
 *   while hasMore{} do processNext{}
 *   while x > 0 do x = x / 2
 */
whileLoop
    : While expression loopBody
    ;

/**
 * Do-while loop - condition-based post-test iteration
 * Executes body at least once, then continues while condition is true
 *
 * Syntax: do <body> while <condition>
 * Examples:
 *   do getUserInput{} while isInvalid{input}
 *   do processData{} while hasMoreData{}
 */
doWhileLoop
    : Do loopBody While expression
    ;



// =============================================================================
// JUMP STATEMENTS - Control Flow Interruption
// =============================================================================

/**
 * Jump statement - control flow interruption and redirection
 * Supports various forms of non-local control transfer
 *
 * Syntax: <breakStatement> | <continueStatement> | <returnStatement> | <gotoStatement>
 */
jump
    : breakStatement
    | continueStatement
    | returnStatement
    | gotoStatement
    ;

/**
 * Break statement - exit from current loop or block
 * Terminates the nearest enclosing loop or switch statement
 *
 * Syntax: break [<label>]
 * Examples:
 *   break                  // Break from current loop
 *   break@ outerLoop        // Break from labeled loop
 */
breakStatement
    : Break | BreakAt identifier
    ;

/**
 * Continue statement - skip to next iteration of loop
 * Jumps to the next iteration of the nearest enclosing loop
 *
 * Syntax: continue [<label>]
 * Examples:
 *   continue               // Continue current loop
 *   continue outerLoop     // Continue labeled loop
 */
continueStatement
    : Continue | ContinueAt identifier
    ;

/**
 * Return statement - exit from function with optional value
 * Returns control to caller with optional return value
 *
 * Syntax: return [<expression>]
 * Examples:
 *   return                 // Return void
 *   return result          // Return value
 *   return calculate{x, y} // Return expression result
 */
returnStatement
    : Return | ReturnAt identifier
    ;

/**
 * Goto statement - unconditional jump to labeled statement
 * Direct control transfer to a labeled location
 *
 * Syntax: goto <label>
 * Examples:
 *   goto cleanup
 *   goto errorHandler
 */
gotoStatement
    : Jump identifier
    ;

// =============================================================================
// VARIABLE OPERATIONS - Assignment and Modification
// =============================================================================

/**
 * Variable operation - all forms of variable assignment and modification
 * Supports simple assignment, compound operations, and increment/decrement
 *
 * Syntax: <assignment> | <compoundAssignment> | <incrementDecrement>
 */
variableOperation
    : assignment
    ;

/**
 * Assignment statement - simple variable value assignment
 * Basic assignment of expression result to variable
 *
 * Syntax: <identifier> = <expression>
 * Examples:
 *   x = 42
 *   result = calculate{a, b}
 *   name = getName{}
 */
assignment
    : (Val | Var | Const)? identifier subTyping Assigment expression
    ;


//// =============================================================================
//// FUNCTION INVOCATIONS - Function and Method Calls
//// =============================================================================
//
///**
// * Function invocation - all forms of callable execution
// * Supports function calls, method calls, and procedure calls
// *
// * Syntax: <functionCall> | <methodCall> | <procedureCall>
// */
//invocation
//    : functionCall          // Already defined above
//    | methodCall
//    | procedureCall
//    ;
//
///**
// * Method call - function call on an object or instance
// * Invokes a method with implicit self/this parameter
// *
// * Syntax: <object>.<method>{<args>}
// * Examples:
// *   object.calculate{x, y}
// *   list.append{item}
// *   string.substring{start, end}
// */
//methodCall
//    : // TODO: Implement method call grammar
//    ;
//
///**
// * Procedure call - function call without return value expectation
// * Used for side-effect operations or when return value is ignored
// *
// * Syntax: <identifier>{<args>}
// * Examples:
// *   print{"Hello World"}
// *   initialize{system}
// *   cleanup{resources}
// */
//procedureCall
//    : // TODO: Implement procedure call grammar (may be same as functionCall)
//    ;

// =============================================================================
// ERROR HANDLING APPLICATIONS - Exception Management
// =============================================================================

/**
 * Error handling application - exception throwing and handling constructs
 * Supports throwing exceptions and handling them with try/catch blocks
 *
 * Syntax: <throwStatement> | <tryStatement>
 */
errorHandling
    : throwStatement
    | tryStatement
    ;

/**
 * Throw statement - exception throwing construct
 * Raises an exception with optional error value or message
 *
 * Syntax: throw [<expression>]
 * Examples:
 *   throw                          // Re-throw current exception
 *   throw error{"Invalid input"}   // Throw with message
 *   throw customException{code}    // Throw custom exception
 */
throwStatement
    : Throw expression
    ;

/**
 * Try statement - exception handling construct
 * Executes code with exception handling and optional cleanup
 *
 * Syntax: try <block> [catch <handler>]* [finally <block>]
 * Examples:
 *   try risky{} catch e handle{e}
 *   try operation{} catch IOException e handleIO{e} catch Exception e handleGeneral{e}
 *   try resource{} finally cleanup{}
 */
tryStatement
    : Try loopBody (Catch loopBody)? (Finally loopBody)?
    ;

// =============================================================================
// I/O OPERATIONS - Input/Output Statements
// =============================================================================

/**
 * I/O operation - input and output statement constructs
 * Supports printing, reading, and file operations
 *
 * Syntax: <printStatement> | <inputStatement> | <fileOperation>
 */
ioOperation
    : printStatement
    | inputStatement
    | fileOperation
    ;

/**
 * Print statement - output data to console or stream
 * Displays values to standard output or specified output stream
 *
 * Syntax: print <expression> [to <stream>]
 * Examples:
 *   print "Hello World"
 *   print result
 *   print data to file
 */
printStatement
    : Print String
    ;

/**
 * Input statement - read data from console or stream
 * Reads values from standard input or specified input stream
 *
 * Syntax: read <identifier> [from <stream>]
 * Examples:
 *   read userInput
 *   read data from file
 *   read line from stdin
 */
inputStatement
    : Read String
    ;

/**
 * File operation - file system interaction statements
 * Supports file reading, writing, opening, and closing operations
 *
 * Syntax: <fileRead> | <fileWrite> | <fileOpen> | <fileClose>
 * Examples:
 *   open file{"data.txt"} as handle
 *   write content to file
 *   read content from file
 *   close fileHandle
 */
fileOperation
    : fileRead
    | fileWrite
    | fileOpen
    | fileClose
    ;

fileRead
    : File inputStatement
    ;

fileWrite
    : File Write String
    ;

fileOpen
    : File String identifier loopBody
    ;

fileClose
    : Close identifier
    ;

//// =============================================================================
//// MEMORY/RESOURCE OPERATIONS - Resource Management
//// =============================================================================
//
///**
// * Memory/resource operation - memory and resource management statements
// * Supports allocation, deallocation, and resource management constructs
// *
// * Syntax: <allocation> | <deallocation> | <resourceBlock>
// */
//memoryOperation
//    : allocation
//    | deallocation
//    | resourceBlock
//    ;
//
///**
// * Allocation operation - memory or resource allocation
// * Allocates memory or resources for use
// *
// * Syntax: allocate <type> [<size>] | new <type>{<args>}
// * Examples:
// *   allocate Array{100}
// *   new Object{parameters}
// *   allocate Buffer{size}
// */
//allocation
//    :
//    ;
//
///**
// * Deallocation operation - memory or resource cleanup
// * Frees allocated memory or releases resources
// *
// * Syntax: deallocate <identifier> | delete <identifier> | free <identifier>
// * Examples:
// *   deallocate buffer
// *   delete object
// *   free memory
// */
//deallocation
//    : // TODO: Implement deallocation grammar
//    ;
//
///**
// * Resource block - automatic resource management with cleanup
// * Ensures resources are properly released after use
// *
// * Syntax: with <resource> do <body> | using <resource> in <body>
// * Examples:
// *   with file{"data.txt"} do processFile{file}
// *   using connection{"database"} in executeQuery{connection, query}
// */
//resourceBlock
//    : // TODO: Implement resource management block grammar
//    ;

//// =============================================================================
//// SYNCHRONIZATION APPLICATIONS - Concurrency Control
//// =============================================================================
//
///**
// * Synchronization application - concurrency and parallelism control
// * Supports locking, async operations, and thread management
// *
// * Syntax: <lockOperation> | <asyncOperation> | <threadOperation>
// */
//synchronization
//    : lockOperation
//    | asyncOperation
//    | threadOperation
//    ;
//
///**
// * Lock operation - synchronization primitive operations
// * Manages locks for thread-safe access to shared resources
// *
// * Syntax: lock <resource> | unlock <resource> | synchronized <resource> do <body>
// * Examples:
// *   lock mutex
// *   unlock mutex
// *   synchronized sharedData do modify{sharedData}
// */
//lockOperation
//    : // TODO: Implement lock/unlock grammar
//    ;
//
///**
// * Async operation - asynchronous execution control
// * Supports async/await patterns for non-blocking operations
// *
// * Syntax: async <expression> | await <expression>
// * Examples:
// *   async fetchData{url}
// *   await networkCall{}
// *   async { processInBackground{} }
// */
//asyncOperation
//    : // TODO: Implement async/await grammar
//    ;
//
///**
// * Thread operation - thread lifecycle management
// * Supports thread creation, joining, and synchronization
// *
// * Syntax: spawn <function> | join <thread> | yield
// * Examples:
// *   spawn worker{data}
// *   join workerThread
// *   yield                  // Yield execution to other threads
// */
//threadOperation
//    : // TODO: Implement thread spawn/join grammar
//    ;

//// =============================================================================
//// EXPRESSION STATEMENTS - Standalone Expression Evaluation
//// =============================================================================
//
///**
// * Expression statement - standalone expression evaluation
// * Expressions evaluated for their side effects or ignored return values
// *
// * Syntax: <expression>; | <sideEffectExpression>;
// */
//expressionStatement
//    : standaloneExpression
//    | sideEffectExpression
//    ;
//
///**
// * Standalone expression - expression evaluated and result discarded
// * Used when expression is evaluated purely for side effects
// *
// * Syntax: <expression>
// * Examples:
// *   calculate{x, y}        // Result ignored
// *   object.method{}        // Called for side effects
// */
//standaloneExpression
//    : // TODO: Implement standalone expression grammar
//    ;
//
///**
// * Side effect expression - expression with intentional side effects
// * Expressions that modify state or perform I/O operations
// *
// * Syntax: <expression>
// * Examples:
// *   counter++              // Modifies counter
// *   print{message}         // I/O side effect
// *   list.append{item}      // Modifies list
// */
//sideEffectExpression
//    : // TODO: Implement side effect expression grammar
//    ;

// =============================================================================
// DEBUGGING/DEVELOPMENT OPERATIONS - Development Support
// =============================================================================

/**
 * Debug operation - debugging and development support statements
 * Supports assertions and debug output for development and testing
 *
 * Syntax: <assertStatement> | <debugStatement>
 */
debugOperation
    : assertStatement
    | debugStatement
    ;

/**
 * Assert statement - runtime assertion checking
 * Validates conditions during execution with optional error messages
 *
 * Syntax: assert <condition> [, <message>]
 * Examples:
 *   assert x > 0
 *   assert isValid{data}, "Data validation failed"
 *   assert length{list} > 0, "List cannot be empty"
 */
assertStatement
    : Assert expression
    ;

/**
 * Debug statement - development-time output and logging
 * Provides debug information during development and testing
 *
 * Syntax: debug <expression> | log <level> <message>
 * Examples:
 *   debug variable
 *   log info "Processing started"
 *   debug { "Current state:", state }
 */
debugStatement
    : Annotation Debug
    ;

// =============================================================================
// DECLARATION RULES - declaring types, notations, axioms and etc
// =============================================================================
/**
 * Declaration statement - defines new constructs in the language
 * DeduKt supports multiple types of mathematical and computational declarations
 */
declaration
    : typeDeclaration        // Define new types and type relationships
    | contextDeclaration     // Create evaluation scopes
    | notationDeclaration    // Introduce custom syntax
    | functionDeclaration    // Define computational functions
    | operatorDeclaration    // Define mathematical operators
    | structureDeclaration   // Define mathematical structures
    | theoryDeclaration      // Define mathematical theories
    | axiomDeclaration       // Define mathematical axioms
    | ruleDeclaration        // Define transformation rules
    | annotationDeclaration //  Define annotations
    | propertyDeclaration
    ;

// =============================================================================
// TYPE SYSTEM - Type Declarations and Relationships
// =============================================================================

/**
 * Type declaration - foundation of DeduKt's type system
 * Defines new types with optional constraints and context
 *
 * Syntax: type <name> [<options>] [-> <context>]
 * Examples:
 *   type Vector<T>
 *   type Matrix<T: Numeric> where T <: Real
 *   type Group<T> :: Associative -> { ... }
 */
typeDeclaration
    : Type identifier typeOptions? (Assigment typeContext)?
    ;

/**
 * Type options - modifiers and constraints for type declarations
 * At least one option must be present if typeOptions is used
 * Supports parametric types, constraints, subtyping, and applicability conditions
 */
typeOptions
    : parameters parameterOptions? subTyping? applicability?
    | parameterOptions subTyping? applicability?
    | subTyping applicability?
    | applicability
    ;

/**
 * Type parameters - generic/parametric type support
 * Enclosed in angle brackets, supports dependent types
 *
 * Examples: <T>, <T, U>, <T: Numeric, dim: Integer>
 */
parameters
    : LAngle typeParameters RAngle
    ;

/**
 * List of individual type parameters
 * Supports both simple and dependent (constrained) parameters
 */
typeParameters
    : typeParameter (Comma typeParameter)*
    ;

/**
 * Individual type parameter
 * Can be simple identifier or dependent type with constraints
 */
typeParameter
    : identifier          // Simple: T, U, ElementType
    | dependentType      // Constrained: T: Numeric, dim: Integer
    ;

/**
 * Dependent type - parameter with type constraint
 * Establishes relationship between parameter and its required type
 *
 * Syntax: <name>: <type>
 * Example: T: Numeric, dimension: Integer
 */
dependentType
    : identifier Colon identifier
    ;

/**
 * Parameter constraints - additional restrictions on type parameters
 * Introduced by 'where' keyword, supports subtype and supertype relationships
 */
parameterOptions
    : Where parameterOption+
    ;

/**
 * Individual parameter constraint
 * Defines subtype or supertype relationships for type parameters
 */
parameterOption
    : subtypeOption      // T <: Parent (T is subtype of Parent)
    | superTypeOption    // T >: Child (T is supertype of Child)
    // | conditionalOption  // Future: conditional type constraints
    ;

/**
 * Subtype constraint - parameter must be subtype of specified types
 *
 * Syntax: <param> <: <type1>, <type2>...
 * Example: T <: Numeric, Comparable
 */
subtypeOption
    : identifier SubType commaSeparatedIdentifiers
    ;

/**
 * Supertype constraint - parameter must be supertype of specified types
 *
 * Syntax: <param> >: <type1>, <type2>...
 * Example: T >: Integer, Real
 */
superTypeOption
    : identifier SuperType commaSeparatedIdentifiers
    ;

/**
 * Subtyping declaration - establishes inheritance relationships
 *
 * Syntax: : <parent_types>
 * Example: : Numeric, Comparable
 */
subTyping
    : Colon typeParameters
    ;

/**
 * Applicability conditions - when this type can be used
 * Double colon indicates usage constraints
 *
 * Syntax: :: <conditions>
 * Example: :: Associative, Commutative
 */
applicability
    : DoubleColon typeParameters
    ;

// =============================================================================
// CONTEXT SYSTEM - Scoped Evaluation and Definition
// =============================================================================

/**
 * Context declaration - creates evaluation and definition scopes
 * Contexts are fundamental for step-by-step calculations and chaining results
 * Optional identifier creates named context for later reference
 *
 * Syntax: [context <name>] { <statements> }
 * Examples:
 *   context proof { ... }
 *   { ... }  // Anonymous context
 */
contextDeclaration
    : Context identifier? headlessFunction
    ;

// =============================================================================
// NOTATION SYSTEM - Custom Syntax Definition
// =============================================================================

/**
 * Notation declaration - introduces custom syntax and writing preferences
 * Allows extending DeduKt's syntax for domain-specific mathematical notation
 *
 * Syntax: notation <name> :: <applicability> { <context> }
 * Example: notation matrix_multiply :: Matrix -> { ... }
 */
notationDeclaration
    : Notation identifier applicability Assigment notationContext
    ;

// =============================================================================
// FUNCTION SYSTEM - Computational Units
// =============================================================================

/**
 * Function declaration - defines computational units with input/output
 * Functions are first-class objects in DeduKt's functional programming model
 *
 * Syntax: fun <name> [<params>] (<input_types>) -> <output_types> [:: <applicability>] { <body> }
 * Example: fun add<T: Numeric>(x: T, T) -> T :: Number { ... }
 */
functionDeclaration
    : Fun identifier parameters? functionTypeFormat parameterOptions? applicability? Assigment headlessFunction
    ;

/**
 * Function type signature - defines input and output types
 * Supports multiple inputs and multiple outputs (tuple/multi-return)
 *
 * Syntax: (<inputs>) -> <outputs>
 * Examples:
 *   (Integer, Integer) -> Integer
 *   (Matrix<T>, Vector<T>) -> Vector<T>, Real
 *   (x: Number, y: T) -> R
 */
functionTypeFormat
    : LParen commaSeparatedTypedIdentifiers RParen Arrow (commaSeparatedTypedIdentifiers | commaSeparatedIdentifiers)*
    ;

// =============================================================================
// OPERATOR SYSTEM - Mathematical Operations
// =============================================================================

/**
 * Operator declaration - defines flexible mathematical operations
 * More flexible than functions, supports custom notation and can be embedded in structures/theories
 *
 * Syntax: operator <name> [<type_options>] { <definition> }
 * Example: operator + <T: Group> where T <: Associative { ... }
 */
operatorDeclaration
    : Operator identifier typeOptions? Assigment operatorContext
    ;

// =============================================================================
// STRUCTURE SYSTEM - Mathematical Models
// =============================================================================

/**
 * Structure declaration - defines mathematical structures
 * Containers for related notation, operators, functions, elements and properties
 * Foundation for algebraic and geometric modeling
 *
 * Syntax: structure <name> [<type_options>] { <members> }
 * Example: structure Group<T> where T :: Associative { ... }
 */
structureDeclaration
    : Structure identifier typeOptions? Assigment structureContext
    ;

// =============================================================================
// THEORY SYSTEM - Unified Mathematical Frameworks
// =============================================================================

/**
 * Theory declaration - defines unified mathematical frameworks
 * Combines multiple structures and their relationships
 * Provides high-level abstraction for complex mathematical systems
 *
 * Syntax: theory <name> [<type_options>] { <framework> }
 * Example: theory LinearAlgebra<Field> :: VectorSpace { ... }
 */
theoryDeclaration
    : Theory identifier typeOptions? Assigment theoryContext
    ;

// =============================================================================
// AXIOM SYSTEM - Mathematical Rules and Properties
// =============================================================================

/**
 * Axiom declaration - defines mathematical rules for specific object types
 * Axioms are foundational rules that cannot be proven within the system
 * Applied within structures to establish mathematical properties
 *
 * Syntax: axiom <name> [<type_options>] { <rule_definition> }
 * Example: axiom associativity<T: Group> :: Associative { ... }
 */
axiomDeclaration
    : Axiom identifier typeOptions? Assigment axiomContext
    ;

// =============================================================================
// RULE SYSTEM - Symbolic Transformations
// =============================================================================

/**
 * Rule declaration - defines symbolic transformation rules
 * More permissive than axioms, used for function development and symbolic manipulation
 * Can transform one statement/expression into another based on pattern matching
 *
 * Syntax: rule <name> { <transformation_logic> }
 * Example: rule distribute_multiplication { a * (b + c) -> a * b + a * c }
 */
ruleDeclaration
    : Rule identifier ruleContext
    ;


// =============================================================================
// Annotation SYSTEM - wrapping context in @
// =============================================================================
/**
 * Annotation declaration - defines metadata and directives for other declarations
 * Provides compile-time information, optimization hints, and behavioral modifiers
 * Can be applied to types, functions, structures, etc.
 *
 * Syntax: annotate <name> [<type_options>] { <annotation_definition> }
 * Examples:
 *   annotate @inline { inlining behavior }
 *   annotate @deprecated<T> where T :: Deprecated {  deprecation info }
 *   annotate @complexity :: O(n) { complexity analysis  }
 *   annotate @proof_required {  requires formal proof  }
 *   annotate @experimental {  experimental feature  }
 */
annotationDeclaration
    : At identifier typeOptions? (Assigment annotationContext)?
    ;

/**
 * Annotation-specific context - defines annotation behavior and metadata
 * Contains annotation processing rules and associated data
 */
annotationContext
    : LCurl statement* RCurl
    ;

// =============================================================================
// CONTEXT DEFINITIONS - Specialized Context Bodies
// =============================================================================

/**
 * Generic function body - basic statement container
 * Used for general-purpose scoping and evaluation
 */
headlessFunction
    : LCurl statement*  returnable? RCurl
    ;

/**
* Returnable is an statement that returns something. it can return another headless function, or a canonical expression
*/
// TODO: returnable should be implemented the correct way
returnable
    : Return
    ;

/**
 * Type-specific context - contains type-related definitions
 * May include type constraints, relationships, and properties
 */
typeContext
    : LCurl statement* RCurl
    ;

/**
 * Notation-specific context - defines custom syntax rules
 * Contains syntax transformation rules and precedence definitions
 */
notationContext
    : LCurl statement* RCurl
    ;


/**
 * Operator-specific context - defines operator behavior
 * Contains operator implementation, precedence, and associativity rules
 */
operatorContext
    : LCurl statement* RCurl
    ;

/**
 * Structure-specific context - contains structure members
 * Includes elements, operations, properties, and internal relationships
 */
structureContext
    : LCurl statement* RCurl
    ;

/**
 * Theory-specific context - contains theory framework
 * Includes multiple structures, their relationships, and unified properties
 */
theoryContext
    : LCurl statement* RCurl
    ;

/**
 * Axiom-specific context - contains axiom definition
 * Includes the fundamental rule and its applicability conditions
 */
axiomContext
    : LCurl statement* RCurl
    ;

/**
 * Rule-specific context - contains transformation rules
 * Includes pattern matching conditions and transformation logic
 */
ruleContext
    : LCurl statement* RCurl
    ;

// =============================================================================
// PROPERTY DECLARATION - giving properties to different objects
// =============================================================================
propertyDeclaration
    : Property identifier (Assigment headlessFunction)?
    ;


// =============================================================================
// UTILITY RULES - Common Patterns and Collections
// =============================================================================

/**
 * Comma-separated list of identifiers
 * Used for parameter lists, import lists, constraint lists, etc.
 *
 * Example: x, y, z
 */
commaSeparatedIdentifiers
    : identifier (Comma identifier)*
    ;

/**
 * Comma-separated list of typed identifiers (dependent types)
 * Used for function parameters, structured type definitions, etc.
 *
 * Example: x: Integer, y: Real, matrix: Matrix<T>
 */
commaSeparatedTypedIdentifiers
    : dependentType (Comma dependentType)*
    ;

/**
 * Unified identifier - supports all identifier types from lexer
 * Provides flexibility for naming conventions across different domains
 *
 * Types:
 *   - SIMPLE_ID: Traditional programming identifiers (foo, bar_baz)
 *   - COMPLEX_ID: Unicode identifiers with special characters (α, β₁, special-name)
 *   - QUOTED_ID: Quoted identifiers for reserved words (`class`, `type`)
 */
identifier
    : SIMPLE_ID
    | COMPLEX_ID
    | QUOTED_ID
    ;

literal
    : identifier
    | Number
    | DecimalNumber
    ;
// =============================================================================
// Lexical Grammar of DeduKt Language
// =============================================================================
// LINE ENDINGS AND SPECIAL CHARACTERS
// These rules handle different line ending conventions and special file markers


// Shebang line for executable scripts (e.g., #!/usr/bin/env kotlin)
ShebangLine
    : '#!'     // Match shebang followed by any characters until line end
    ;

// COMMENTS AND WHITESPACE
// Support for both single-line and multi-line comments with proper nesting

// Multi-line comments with support for nested comments
DelimitedComment
    : '/*' (DelimitedComment | .)*? '*/' -> channel(HIDDEN)     // Recursive rule allows nested /* */ comments
    ;

// Single-line comments extending to end of line
LineComment
    : '//' ~[\r\n]* -> channel(HIDDEN)    // Match // followed by any non-newline characters
    ;

// Horizontal whitespace (spaces, tabs, form feed)
WS
    : [ \t\u000C] -> channel(HIDDEN)       // Space, tab, form feed - excludes newlines
    ;

// Normalized newline handling - treats all line ending styles uniformly
NL
    : ('\n' | '\r\n' | '\r')  -> channel(HIDDEN)    // Matches LF (\n) or CRLF (\r\n) or CR alone
    ;

// RESERVED SYMBOLS AND PUNCTUATION
// Core punctuation and reserved symbols used throughout the language

Reserved
    : '...'         // Variadic/spread operator or placeholder
    ;
Dot
    : '.'           // Member access, decimal point
    ;
Comma
    : ','            // Parameter/argument separator
    ;

// Paired delimiters for grouping and scope
LParen
    : '('           // Left parenthesis - function calls, grouping
    ;
RParen
    : ')'           // Right parenthesis
    ;
LSquare
    : '['           // Left square bracket - array/list indexing, annotations
    ;
RSquare
    : ']'           // Right square bracket
    ;
LCurl
    : '{'           // Left curly brace - code blocks, object literals
    ;
RCurl
    : '}'           // Right curly brace
    ;

// Special symbols
Star
    : '*'           // Multiplication, import wildcard, pointer dereference
    ;
Sub
    : '_'           // Underscore - unused variables, number separators
    ;

// LOGICAL OPERATORS
// Boolean logic operators with both symbolic and word forms

Conj
    : '&&'          // Logical AND (short-circuiting)
    | 'and'         // Alternative word form for logical AND
    ;
Disj
    : '||'          // Logical OR (short-circuiting)
    | 'or'          // Alternative word form for logical OR
    ;
Vert
    : '|'
    ;

// NEGATION/EXCLUSION OPERATORS
// Different forms of negation based on whitespace context

Exclusion
    : '!'     // Negation followed by whitespace (logical NOT)
    ;


// COLONS AND SEMICOLONS
// Various colon and semicolon forms for different syntactic purposes
Colon
    : ':'           // Type annotations, labels, case separators
    ;
SemiColon
    : ';'           // Statement terminator
    ;
DoubleColon
    : '::'          // Applicability
    ;
DoubleSemiColon
    : ';;'          // Special statement separator
    ;

// ASSIGNMENT AND ARROWS
// Assignment operators and arrow notation for lambdas/functions

Assigment
    : '='           // Simple assignment
    ;
Arrow
    : '->'          // Lambda arrow, function types
    ;
DoubleArrow
    : '=>'          // Enhanced arrow (when expressions, case branches)
    ;


// RANGE AND SPECIAL SYMBOLS
Range
    : '..'          // Range operator (1..10)
    ;
Hash
    : '#'           // Hash symbol - possibly for annotations or special syntax
    ;

// AT SYMBOL VARIANTS
// Different @ symbol contexts for annotations and labels with whitespace sensitivity

At
    : '@'           // @ without surrounding whitespace
    ;

// QUESTION MARK VARIANTS
// Nullable types and optional operations with whitespace sensitivity

QuestionMarK
    : '?'    // ? followed by whitespace (ternary operator start)
    ;


// COMPARISON OPERATORS
// Relational and equality operators
// Angle brackets - comparison and generic type parameters
LAngle
    : '<'           // Less than, generic type parameter start
    ;
RAngle
    : '>'           // Greater than, generic type parameter end
    ;
LE
    : '<='          // Less than or equal
    ;
GE
    : '>='          // Greater than or equal
    ;

// Equality and inequality operators
ExclusionEquality
    : '!='          // Not equal (value)
    ;
ExclutionDoubleEquality
    : '!=='         // Not identical (reference)
    ;
DoubleEquality
    : '=='          // Equal (value comparison)
    ;
TripleEquality
    : '==='         // Identical (reference comparison)
    ;


// TYPE RELATIONSHIP OPERATORS
AsSafe
    : 'as?'         // Safe cast operator - returns null if cast fails
    ;
SubType
    : '<:'          // Subtype relationship
    ;
SuperType
    : ':>'          // Supertype relationship
    ;

// STRING DELIMITERS
SingleQuote
    : '\''          // Single quote - character literals
    ;
DoubleQuote
    : '"'           // Double quote - string literals
    ;


// CONTROL FLOW KEYWORDS
Where
    : 'where'       // Generic constraints, query conditions
    ;
Default
    : 'default'
    ;
// Labeled control flow - allows breaking/continuing/returning to specific labels
ReturnAt
    : 'return@' Identifier      // Return to labeled scope
    ;
ContinueAt
    : 'continue@' Identifier    // Continue to labeled loop
    ;
BreakAt
    : 'break@' Identifier       // Break from labeled loop
    ;
ThisAt
    : 'this@' Identifier        // Reference to specific receiver
    ;
SuperAt
    : 'super@' Identifier       // Reference to specific superclass
    ;


// ANNOTATION TARGET KEYWORDS
// These specify where annotations should be applied

File
    : 'file'        // File-level annotations
    ;
Field
    : 'field'       // Field annotations (for properties)
    ;
Property
    : 'property'    // Property annotations
    ;
Get
    : 'get'         // Getter annotations
    ;
Set
    : 'set'         // Setter annotations
    ;
Reciever
    : 'reciever'    // Receiver parameter annotations
    ;
Param
    : 'param'       // Parameter annotations
    ;
SetParam
    : 'setparam'    // Setter parameter annotations
    ;
Delegate
    : 'delegate'    // Delegate annotations
    ;

// TOP-LEVEL DECLARATION KEYWORDS
Package
    : 'package'     // Package declaration
    ;
Import
    : 'import'      // Import declaration
    ;
Type
    : 'type'        // Type declaration/alias
    ;
Operator
    : 'operator'    // Operator overloading
    ;
Fun
    : 'fun'         // Function declaration
    ;

// MATHEMATICAL/FORMAL SYSTEM KEYWORDS
// Keywords for mathematical or formal reasoning constructs

Context
    : 'context'     // Context parameters/receivers
    ;
Structure
    : 'structure'   // Mathematical structure definition
    ;
Axiom
    : 'axiom'       // Axiomatic definitions
    ;
Rule
    : 'rule'        // Inference or transformation rules
    ;
Notation
    : 'notation'    // Notation definitions
    ;
Theory
    : 'theory'      // Theory definitions
    ;


// VARIABLE AND TYPE DECLARATION KEYWORDS
Val
    : 'val'         // Immutable variable (value)
    ;
Var
    : 'var'         // Mutable variable
    ;
TypeAlias
    : 'typealias'   // Type alias declaration
    ;
Constructor
    : 'constructor' // Constructor declaration
    ;
By
    : 'by'          // Delegation keyword
    ;
Companion
    : 'companion'   // Companion object
    ;
Init
    : 'init'        // Initialization block
    ;

// REFERENCE KEYWORDS
This
    : 'this'        // Current instance reference
    ;
Super
    : 'super'       // Parent class reference
    ;
TypeOf
    : 'typeof'      // Type introspection
    ;

// CONTROL FLOW STATEMENTS
// Conditional statements
If
    : 'if'          // Conditional statement
    ;
Else
    : 'else'        // Alternative branch
    ;
When
    : 'when'        // Pattern matching/switch statement
    ;
Case
    : 'case'
    ;

// Exception handling
Try
    : 'try'         // Exception handling block
    ;
Catch
    : 'catch'       // Exception catch clause
    ;
Finally
    : 'finally'     // Final execution block
    ;
Gaurd
    : 'gaurd'
    ;
// Loop constructs
For
    : 'for'         // For loop
    ;
Do
    : 'do'          // Do-while loop
    ;
While
    : 'while'       // While loop
    ;

// Control flow statements
Throw
    : 'throw'       // Throw exception
    ;
Return
    : 'return'      // Return from function
    ;
Continue
    : 'continue'    // Continue loop iteration
    ;
Break
    : 'break'       // Break from loop
    ;
Jump
    : 'jump'
    ;
// TYPE CHECKING AND CASTING
As
    : 'as'          // Type cast
    ;
Is
    : 'is'          // Type check
    ;
In
    : 'in'          // Containment check, loop iteration
    ;
NotIs
    : '!is'         // Negated type check
    ;
NotIn
    : '!in'         // Negated containment check
    ;
Out
    : 'out'         // Covariant generic parameter
    ;
Dynamic
    : 'dynamic'     // Dynamic typing
    ;

// VISIBILITY MODIFIERS
Public
    : 'public'      // Public visibility
    ;
Private
    : 'private'     // Private visibility
    ;
Protected
    : 'protected'   // Protected visibility
    ;
Internal
    : 'internal'    // Module-internal visibility
    ;

// CLASS AND INHERITANCE MODIFIERS
Enum
    : 'enum'        // Enumeration class
    ;
Sealed
    : 'sealed'      // Sealed class (restricted inheritance)
    ;
Annotation
    : 'annotation'  // Annotation class
    ;
Data
    : 'data'        // Data class (automatic equals/hashCode/toString)
    ;
Inner
    : 'inner'       // Inner class (has reference to outer)
    ;


// FUNCTION MODIFIERS
Tailrec
    : 'tailrec'     // Tail-recursive function optimization
    ;
Inline
    : 'inline'      // Inline function (code substitution)
    ;
External
    : 'external'    // External implementation (native/JS)
    ;
Suspend
    : 'suspend'     // Suspending function (coroutines)
    ;
Override
    : 'override'    // Override parent member
    ;
Abstract
    : 'abstract'    // Abstract member (no implementation)
    ;
Final
    : 'final'       // Cannot be overridden
    ;
Open
    : 'open'        // Can be overridden
    ;

// PROPERTY MODIFIERS
Const
    : 'const'       // Compile-time constant
    ;
Lateinit
    : 'lateinit'    // Late initialization (non-null but initialized later)
    ;
Vararg
    : 'vararg'      // Variable number of arguments
    ;

// INLINE FUNCTION MODIFIERS
NoInline
    : 'noinline'    // Don't inline this parameter
    ;
Crossline
    : 'crossline'   // Allow non-local returns from inline lambda
    ;
Reified
    : 'reified'     // Reified type parameter (runtime type info preserved)
    ;


Assert
    : 'assert'
    ;
Read
    : 'read'
    ;
String
    : DoubleQuote ~["] DoubleQuote
    ;
Print
    : 'print'
    ;
Close
    : 'close'
    ;
Write
    : 'write'
    ;
Debug
    : 'debug'
    ;
// Quoted identifiers - anything between backticks
QUOTED_ID
    : '`' (~'`')* '`'
    ;

// Digits
Number
    : [0-9]+
    ;

DecimalNumber
    : Number Dot Number
    ;
// Simple identifiers - letters followed by letters/digits/underscores
SIMPLE_ID
    : [a-zA-Z] [a-zA-Z0-9_]*
    ;

// Complex identifiers - any Unicode except forbidden characters
COMPLEX_ID
    : ~[ \t\n\r,{}@.0-9:();"']+
    ;

// Unified identifier - matches any of the above three
Identifier
    : QUOTED_ID
    | SIMPLE_ID
    | COMPLEX_ID
    ;
