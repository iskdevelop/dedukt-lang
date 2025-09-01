lexer grammar LexicalGrammar;

// =============================================================================
// LINE ENDINGS AND SPECIAL CHARACTERS
// =============================================================================
// These rules handle different line ending conventions and special file markers

LF
    : [\n]          // Unix-style line feed
    ;
CR
    : [\r]          // Carriage return (used in Mac OS 9 and older)
    ;

// Shebang line for executable scripts (e.g., #!/usr/bin/env kotlin)
ShebangLine
    : '#!' ~[\r\n]*?    // Match shebang followed by any characters until line end
    ;

// =============================================================================
// COMMENTS AND WHITESPACE
// =============================================================================
// Support for both single-line and multi-line comments with proper nesting

// Multi-line comments with support for nested comments
DelimitedComment
    : '/*' (DelimitedComment | .)*? '*/'    // Recursive rule allows nested /* */ comments
    ;

// Single-line comments extending to end of line
LineComment
    : '//' ~[\r\n]*?    // Match // followed by any non-newline characters
    ;

// Horizontal whitespace (spaces, tabs, form feed)
WS
    : [ \t\u000C]       // Space, tab, form feed - excludes newlines
    ;

// Normalized newline handling - treats all line ending styles uniformly
NL
    : LF | (CR LF?)     // Matches LF (\n) or CRLF (\r\n) or CR alone
    ;

// Combined rule for all hidden tokens (used by parser to skip these)
Hidden
    : DelimitedComment | LineComment | WS   // Matches comments and whitespace
    ;

// =============================================================================
// RESERVED SYMBOLS AND PUNCTUATION
// =============================================================================
// Core punctuation and reserved symbols used throughout the language

RESERVED
    : '...'         // Variadic/spread operator or placeholder
    ;
DOT
    : '.'           // Member access, decimal point
    ;
COMMA
    : ','           // Parameter/argument separator
    ;

// Paired delimiters for grouping and scope
LPAREN
    : '('           // Left parenthesis - function calls, grouping
    ;
RPAREN
    : ')'           // Right parenthesis
    ;
LSQUARE
    : '['           // Left square bracket - array/list indexing, annotations
    ;
RSQUARE
    : ']'           // Right square bracket
    ;
LCURL
    : '{'           // Left curly brace - code blocks, object literals
    ;
RCURL
    : '}'           // Right curly brace
    ;

// Special symbols
STAR
    : '*'           // Multiplication, import wildcard, pointer dereference
    ;
SUB
    : '_'           // Underscore - unused variables, number separators
    ;

// =============================================================================
// LOGICAL OPERATORS
// =============================================================================
// Boolean logic operators with both symbolic and word forms

CONJ
    : '&&'          // Logical AND (short-circuiting)
    | 'and'         // Alternative word form for logical AND
    ;
DISJ
    : '||'          // Logical OR (short-circuiting)
    | 'or'          // Alternative word form for logical OR
    ;

// =============================================================================
// NEGATION/EXCLUSION OPERATORS
// =============================================================================
// Different forms of negation based on whitespace context

EXCLUSION_WS
    : '!' Hidden    // Negation followed by whitespace (logical NOT)
    ;
EXCLUSION_NO_WS
    : '!'           // Negation without whitespace (may be part of compound operator)
    ;

// =============================================================================
// COLONS AND SEMICOLONS
// =============================================================================
// Various colon and semicolon forms for different syntactic purposes

COLON
    : ':'           // Type annotations, labels, case separators
    ;
SEMICOLON
    : ';'           // Statement terminator
    ;
DOUBLECOLON
    : '::'          // Scope resolution, class references
    ;
DOUBLESEMICOLON
    : ';;'          // Special statement separator (possibly for REPL)
    ;

// =============================================================================
// ASSIGNMENT AND ARROWS
// =============================================================================
// Assignment operators and arrow notation for lambdas/functions

ASSIGNMENT
    : '='           // Simple assignment
    ;
ARROW
    : '->'          // Lambda arrow, function types
    ;
DOUBLEARROW
    : '=>'          // Enhanced arrow (when expressions, case branches)
    ;

// =============================================================================
// RANGE AND SPECIAL SYMBOLS
// =============================================================================

RANGE
    : '..'          // Range operator (1..10)
    ;
HASH
    : '#'           // Hash symbol - possibly for annotations or special syntax
    ;

// =============================================================================
// AT SYMBOL VARIANTS
// =============================================================================
// Different @ symbol contexts for annotations and labels with whitespace sensitivity

AT_NO_WS
    : '@'           // @ without surrounding whitespace
    ;
AT_POST_WS
    : '@' (Hidden | NL)     // @ followed by whitespace
    ;
AT_PRE_WS
    : (Hidden | NL) '@'     // @ preceded by whitespace
    ;
AT_BOTH_WS
    : (Hidden | NL) '@' (Hidden | NL)   // @ surrounded by whitespace
    ;

// =============================================================================
// QUESTION MARK VARIANTS
// =============================================================================
// Nullable types and optional operations with whitespace sensitivity

QUEST_WS
    : '?' Hidden    // ? followed by whitespace (ternary operator start)
    ;
QUEST_NO_WS
    : '?'           // ? without whitespace (nullable type marker)
    ;

// =============================================================================
// COMPARISON OPERATORS
// =============================================================================
// Relational and equality operators

// Angle brackets - comparison and generic type parameters
LANGLE
    : '<'           // Less than, generic type parameter start
    ;
RANGLE
    : '>'           // Greater than, generic type parameter end
    ;
LE
    : '<='          // Less than or equal
    ;
GE
    : '>='          // Greater than or equal
    ;

// Equality and inequality operators
EXCLUSION_EQUALITY
    : '!='          // Not equal (value)
    ;
EXCLUSION_DOUBLEEQUALITY
    : '!=='         // Not identical (reference)
    ;
DOUBLEEQUALITY
    : '=='          // Equal (value comparison)
    ;
TRIPLEEQUALITY
    : '==='         // Identical (reference comparison)
    ;

// =============================================================================
// TYPE RELATIONSHIP OPERATORS
// =============================================================================

AS_SAFE
    : 'as?'         // Safe cast operator - returns null if cast fails
    ;
SUBTYPE
    : '<:'          // Subtype relationship
    ;
SUPERTYPE
    : ':>'          // Supertype relationship
    ;

// =============================================================================
// STRING DELIMITERS
// =============================================================================

SINGLEQUOTE
    : '\''          // Single quote - character literals
    ;
DOUBLEQUOTE
    : '"'           // Double quote - string literals
    ;

// =============================================================================
// CONTROL FLOW KEYWORDS
// =============================================================================

WHERE
    : 'where'       // Generic constraints, query conditions
    ;

// Labeled control flow - allows breaking/continuing/returning to specific labels
RETURN_AT
    : 'return@' IDENTIFIER      // Return to labeled scope
    ;
CONTINUE_AT
    : 'continue@' IDENTIFIER    // Continue to labeled loop
    ;
BREAK_AT
    : 'break@' IDENTIFIER       // Break from labeled loop
    ;
THIS_AT
    : 'this@' IDENTIFIER        // Reference to specific receiver
    ;
SUPER_AT
    : 'super@' IDENTIFIER       // Reference to specific superclass
    ;

// =============================================================================
// ANNOTATION TARGET KEYWORDS
// =============================================================================
// These specify where annotations should be applied

FILE
    : 'file'        // File-level annotations
    ;
FIELD
    : 'field'       // Field annotations (for properties)
    ;
PROPERTY
    : 'property'    // Property annotations
    ;
GET
    : 'get'         // Getter annotations
    ;
SET
    : 'set'         // Setter annotations
    ;
RECIEVER
    : 'reciever'    // Receiver parameter annotations
    ;
PARAM
    : 'param'       // Parameter annotations
    ;
SETPARAM
    : 'setparam'    // Setter parameter annotations
    ;
DELEGATE
    : 'delegate'    // Delegate annotations
    ;

// =============================================================================
// TOP-LEVEL DECLARATION KEYWORDS
// =============================================================================

PACKAGE
    : 'package'     // Package declaration
    ;
IMPORT
    : 'import'      // Import declaration
    ;
TYPE
    : 'type'        // Type declaration/alias
    ;
OPERATOR
    : 'operator'    // Operator overloading
    ;
FUN
    : 'fun'         // Function declaration
    ;

// =============================================================================
// MATHEMATICAL/FORMAL SYSTEM KEYWORDS
// =============================================================================
// Keywords for mathematical or formal reasoning constructs

CONTEXT
    : 'context'     // Context parameters/receivers
    ;
STRUCTURE
    : 'structure'   // Mathematical structure definition
    ;
AXIOM
    : 'axiom'       // Axiomatic definitions
    ;
RULE
    : 'rule'        // Inference or transformation rules
    ;
NOTATION
    : 'notation'    // Notation definitions
    ;
THEORY
    : 'theory'      // Theory definitions
    ;

// =============================================================================
// VARIABLE AND TYPE DECLARATION KEYWORDS
// =============================================================================

VAL
    : 'val'         // Immutable variable (value)
    ;
VAR
    : 'var'         // Mutable variable
    ;
TYPE_ALIAS
    : 'typealias'   // Type alias declaration
    ;
CONSTRUCTOR
    : 'constructor' // Constructor declaration
    ;
BY
    : 'by'          // Delegation keyword
    ;
COMPANION
    : 'companion'   // Companion object
    ;
INIT
    : 'init'        // Initialization block
    ;

// =============================================================================
// REFERENCE KEYWORDS
// =============================================================================

THIS
    : 'this'        // Current instance reference
    ;
SUPER
    : 'super'       // Parent class reference
    ;
TYPEOF
    : 'typeof'      // Type introspection
    ;

// =============================================================================
// CONTROL FLOW STATEMENTS
// =============================================================================

// Conditional statements
IF
    : 'if'          // Conditional statement
    ;
ELSE
    : 'else'        // Alternative branch
    ;
WHEN
    : 'when'        // Pattern matching/switch statement
    ;

// Exception handling
TRY
    : 'try'         // Exception handling block
    ;
CATCH
    : 'catch'       // Exception catch clause
    ;
FINALLY
    : 'finally'     // Final execution block
    ;

// Loop constructs
FOR
    : 'for'         // For loop
    ;
DO
    : 'do'          // Do-while loop
    ;
WHILE
    : 'while'       // While loop
    ;

// Control flow statements
THROW
    : 'throw'       // Throw exception
    ;
RETURN
    : 'return'      // Return from function
    ;
CONTINUE
    : 'continue'    // Continue loop iteration
    ;
BREAK
    : 'break'       // Break from loop
    ;

// =============================================================================
// TYPE CHECKING AND CASTING
// =============================================================================

AS
    : 'as'          // Type cast
    ;
IS
    : 'is'          // Type check
    ;
IN
    : 'in'          // Containment check, loop iteration
    ;
NOT_IS
    : '!is'         // Negated type check
    ;
NOT_IN
    : '!in'         // Negated containment check
    ;
OUT
    : 'out'         // Covariant generic parameter
    ;
DYNAMIC
    : 'dynamic'     // Dynamic typing
    ;

// =============================================================================
// VISIBILITY MODIFIERS
// =============================================================================

PUBLIC
    : 'public'      // Public visibility
    ;
PRIVATE
    : 'private'     // Private visibility
    ;
PROTECTED
    : 'protected'   // Protected visibility
    ;
INTERNAL
    : 'internal'    // Module-internal visibility
    ;

// =============================================================================
// CLASS AND INHERITANCE MODIFIERS
// =============================================================================

ENUM
    : 'enum'        // Enumeration class
    ;
SEALED
    : 'sealed'      // Sealed class (restricted inheritance)
    ;
ANNOTATION
    : 'annotation'  // Annotation class
    ;
DATA
    : 'data'        // Data class (automatic equals/hashCode/toString)
    ;
INNER
    : 'inner'       // Inner class (has reference to outer)
    ;

// =============================================================================
// FUNCTION MODIFIERS
// =============================================================================

TAILREC
    : 'tailrec'     // Tail-recursive function optimization
    ;
INLINE
    : 'inline'      // Inline function (code substitution)
    ;
EXTERNAL
    : 'external'    // External implementation (native/JS)
    ;
SUSPEND
    : 'suspend'     // Suspending function (coroutines)
    ;
OVERRIDE
    : 'override'    // Override parent member
    ;
ABSTRACT
    : 'abstract'    // Abstract member (no implementation)
    ;
FINAL
    : 'final'       // Cannot be overridden
    ;
OPEN
    : 'open'        // Can be overridden
    ;

// =============================================================================
// PROPERTY MODIFIERS
// =============================================================================

CONST
    : 'const'       // Compile-time constant
    ;
LATEINIT
    : 'lateinit'    // Late initialization (non-null but initialized later)
    ;
VARARG
    : 'vararg'      // Variable number of arguments
    ;

// =============================================================================
// INLINE FUNCTION MODIFIERS
// =============================================================================

NOINLINE
    : 'noinline'    // Don't inline this parameter
    ;
CROSSLINE
    : 'crossline'   // Allow non-local returns from inline lambda
    ;
REIFIED
    : 'reified'     // Reified type parameter (runtime type info preserved)
    ;

// =============================================================================
// MULTIPLATFORM KEYWORDS
// =============================================================================

EXCEPT
    : 'except'      // Platform exception/exclusion
    ;
ACTUAL
    : 'actual'      // Actual implementation in multiplatform code
    ;

// =============================================================================
// NUMERIC LITERALS
// =============================================================================
// Comprehensive number parsing with support for separators and different bases

// Decimal digit definitions
DECDIGITNOZERO
    : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'   // Non-zero decimal digits
    ;
DECDIGIT
    : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'   // All decimal digits
    ;

// Allow underscores as thousands separators in numbers
DECDIGITORSEPARATOR
    : DECDIGIT | '_'    // Digit or underscore separator
    ;

// Sequence of decimal digits with optional separators
DECDIGITS
    : DECDIGIT DECDIGITORSEPARATOR* DECDIGIT    // Multiple digits with separators
    | DECDIGIT                                  // Single digit
    ;

// Scientific notation exponent
DOUBLEEXPONENT
    : ('e' | 'E') ('+' | '-')? DECDIGIT    // E notation: e10, E-5, E+3
    ;

// Real number literals (floating-point)
REALLITERAL
    : FLOATLITERAL | DOUBLELITERAL    // Either float or double precision
    ;

// Single-precision floating point
FLOATLITERAL
    : DOUBLELITERAL ('F' | 'f')    // Double literal with F/f suffix
    | DECDIGIT ('F' | 'f')         // Integer with F/f suffix
    ;

// Double-precision floating point
DOUBLELITERAL
    : DECDIGIT? '.' DECDIGIT DOUBLEEXPONENT?    // Optional digits, dot, digits, optional exponent
    | DECDIGIT? DOUBLEEXPONENT?                 // Optional digits with optional exponent
    ;

// Integer literals in decimal
INTEGERLITERAL
    : DECDIGITNOZERO DECDIGITORSEPARATOR* DECDIGIT    // Multi-digit: starts with non-zero
    | DECDIGIT                                        // Single digit (including 0)
    ;

// Hexadecimal digit definitions
HEXDIGIT
    : DECDIGIT                              // 0-9
    | 'A' | 'B' | 'C' | 'D' | 'E' | 'F'    // A-F (uppercase)
    | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'    // a-f (lowercase)
    ;

HEXDIGITORSEPARETOR
    : HEXDIGIT | '_'    // Hex digit or underscore separator
    ;

// Hexadecimal literals (0x prefix)
HEXLITERAL
    : '0' ('X' | 'x') HEXDIGIT HEXDIGITORSEPARETOR HEXDIGIT    // Multi-digit hex
    | '0' ('X' | 'x') HEXDIGIT                                 // Single hex digit
    ;

// Binary digit definitions
BINARYDIGIT
    : '0' | '1'    // Binary digits
    ;

BINARYDIGITORSEPARATOR
    : BINARYDIGIT | '_'    // Binary digit or underscore separator
    ;

// Binary literals (0b prefix)
BINARYLITERAL
    : '0' ('B' | 'b') BINARYDIGIT BINARYDIGITORSEPARATOR* BINARYDIGIT    // Multi-digit binary
    | '0' ('b' | 'B') BINARYDIGIT                                        // Single binary digit
    ;

// Unsigned integer literals (U suffix)
UNSIGNEDLITERAL
    : (INTEGERLITERAL | HEXLITERAL | BINARYLITERAL) ('U' | 'u') 'L'?    // Unsigned with optional long
    ;

// Long integer literals (L suffix)
LONGLITERAL
    : (INTEGERLITERAL | HEXLITERAL | BINARYLITERAL) 'L'    // Any integer base with L suffix
    ;

// =============================================================================
// BOOLEAN AND NULL LITERALS
// =============================================================================

BOOLEANLITERAL
    : 'true' | 'false'    // Boolean constants
    ;

NULLLITERAL
    : 'null'    // Null reference
    ;

// =============================================================================
// CHARACTER LITERALS AND ESCAPE SEQUENCES
// =============================================================================

// Single character in quotes
CHARACTERLITERAL
    : SINGLEQUOTE (ESCAPESEQ | ~[\r\n'\\]) SINGLEQUOTE    // Character with escapes or any non-quote/backslash
    ;

// Unicode escape sequences
UNICHARACTERLITERAL
    : '\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT    // \uXXXX format
    ;

// Common escape sequences
ESCAPEDIDENTIFIER
    : '\\' ('t' | 'b' | 'r' | 'n' | SINGLEQUOTE | DOUBLEQUOTE | '\\' | '$')    // Standard escapes
    ;

// Combined escape sequence rule
ESCAPESEQ
    : UNICHARACTERLITERAL | ESCAPEDIDENTIFIER    // Unicode or standard escape
    ;

// =============================================================================
// IDENTIFIERS
// =============================================================================
// Unicode-aware identifier parsing with escape mechanisms

// Unicode letter categories for identifier start
LETTER
    : [\p{Lu}\p{Ll}\p{Lt}\p{Lm}\p{Lo}]    // Uppercase, lowercase, titlecase, modifier, other letters
    ;

// Unicode digits for identifiers
UNICODEDIGIT
    : [\p{Nd}]    // Decimal number category
    ;

// Valid identifier characters (including Unicode marks and connectors)
fragment IDENT_CHAR
    : [\p{Lu}\p{Ll}\p{Lt}\p{Lm}\p{Lo}\p{Nd}\p{Pc}\p{Mn}\p{Mc}]    // Letters, digits, marks, connectors
    ;

// Regular identifiers without escaping
IDENTIFIERNOESCAPE
    : (LETTER | UNICODEDIGIT | IDENT_CHAR | '_')+    // Unicode-aware identifier characters
    ;

// Escaped identifiers (backtick-quoted)
IDENTIFIER_ESCAPE
    : '`' IDENTIFIERNOESCAPE+ '`'    // Backtick-escaped identifier (allows keywords as identifiers)
    ;

// Combined identifier rule
IDENTIFIER
    : IDENTIFIER_ESCAPE | IDENTIFIERNOESCAPE    // Either escaped or regular identifier
    ;

// Soft keywords that can be used as identifiers in some contexts
IDENTIFIERORSOFTKEY
    : ABSTRACT | ANNOTATION | BY | CATCH | COMPANION | CONSTRUCTOR | CROSSLINE
    | DATA | DYNAMIC | ENUM | EXTERNAL | FINAL | FINALLY | IMPORT | INIT
    | INLINE | INNER | INTERNAL | LATEINIT | NOINLINE | OPEN | OPERATOR | OUT
    | IN | OVERRIDE | PRIVATE | PROTECTED | PUBLIC | REIFIED | SEALED | TAILREC
    | VARARG | WHERE | GET | SET | FIELD | PROPERTY | RECIEVER | PARAM | SETPARAM
    | DELEGATE | FILE | EXCEPT | ACTUAL | CONST | SUSPEND
    ;

// =============================================================================
// STRING INTERPOLATION TOKENS
// =============================================================================
// Support for string templates with embedded expressions

// Triple-quoted strings (multi-line, raw strings)
TRIPLEQUOTE
    : DOUBLEQUOTE DOUBLEQUOTE DOUBLEQUOTE    // """ for raw/multi-line strings
    ;

// String interpolation - field references
FIELDIDENTIFIER
    : '$' IDENTIFIERORSOFTKEY    // $identifier in strings
    ;

// String interpolation reference
LINESTRREF
    : FIELDIDENTIFIER    // Reference to field in string template
    ;

// Regular string content (not interpolation or escape)
LINESTRTEXT
    : ~["$\\]+ | '$'    // Any chars except quote, dollar, backslash; or lone dollar
    ;

// Escaped characters in strings
LINESTRESCAPEDCHAR
    : ESCAPEDIDENTIFIER | UNICHARACTERLITERAL    // Escape sequences in string literals
    ;

// Start of expression interpolation in strings
LINESTREXPRSTART
    : '${'    // ${expression} interpolation start
    ;