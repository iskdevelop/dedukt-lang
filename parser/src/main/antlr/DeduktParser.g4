// =============================================================================
// DeduKt Language Grammar file
// =============================================================================
// The following file is the main grammar definition for DeduKt language.
// This is being used to create the parser and lexer.
parser grammar DeduktParser;

options {
    tokenVocab=DeduktLexer;
}
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
    : Package SpaceOrTab* packageIdentifier NL*
    ;

/**
 * Hierarchical package identifier using dot notation
 * Allows nested package structures for better organization
 *
 * Examples: std, math.algebra, com.example.utils
 */

packageIdentifier
    : packageIdentifierNode (Dot packageIdentifierNode )*
    ;

packageIdentifierNode
    : SimpleIdentifier
    | Package | Import | Type | Where | If | Else | Case | Default | When | Gaurd | For | While | Do | Break | BreakAt
    | Continue | ContinueAt | Return | ReturnAt | Jump | Val | Var | Const | Throw | Catch | Finally | Try | Assert
    | Debug | Context | Notation | Axiom | Fun | Operator | Structure | Theory | Rule | Abstract ;


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
    : Import SpaceOrTab* packageIdentifier (Dot Star)? NL*
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
    ;
// =============================================================================
// Declaration - Declaration statements
// =============================================================================
declaration
    : typeDeclaration
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
    : Type identifier typeOptions? (Assignment typeContext)?
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


/**
 * Type-specific context - contains type-related definitions
 * May include type constraints, relationships, and properties
 */
typeContext
    : LBrace statement* RBrace
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
 *
 */
identifier
    : LatexStyleIdentifier
    | SimpleIdentifier
    | MathematicalUnicodeFamily
    ;
// TODO: Literals should contains Strings, Numbers and Identifiers
literal
    : identifier
    ;
