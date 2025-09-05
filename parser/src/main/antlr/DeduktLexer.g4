lexer grammar DeduktLexer;

// Whitespace and Comments
Hidden: (LF | CR | SpaceOrTab | LineComment | MultiLineComment | NL) -> channel(HIDDEN);
LF: [\n];
CR: [\r];
NL: [\r\n]+;
SpaceOrTab: [ \t]+;
LineComment: '//' ~[\n\r]*;
MultiLineComment: '/*' .*? '*/';


// Keywords
Package: 'package';
Import: 'import';
Type : 'type';
Where: 'where';
If: 'if';
Else: 'else';
Case: 'case';
Default: 'default';
When: 'when';
Gaurd: 'guard';
For: 'for';
While: 'while';
Do: 'do';
Break: 'break';
BreakAt: 'break@';
Continue: 'continue';
ContinueAt: 'continue@';
Return: 'return';
ReturnAt: 'return@';
Jump: 'jump';
Val: 'val';
Var: 'var';
Const: 'const';
Throw: 'throw';
Catch: 'catch';
Finally: 'finally';
Try: 'try';
Assert: 'assert';
Debug: 'debug';
Context: 'context';
Notation: 'notation';
Axiom: 'axiom';
Fun: 'fun';
Operator: 'operator';
Structure: 'structure';
Theory: 'theory';
Rule: 'rule';
Abstract: 'abstract';

LatexStyleIdentifier
    : '\\' [a-zA-Z_][a-zA-Z0-9_]*
    ;
MathematicalUnicodeFamily
    : [+\-*/!^]       // ASCII operators
    | [\u2200-\u22FF]    // Unicode math operators
    ;

SimpleIdentifier
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

IdentifierOrSoftKeyword
    : SimpleIdentifier
    | Package
    | Import
    | Type
    | Where
    | If
    | Else
    | Case
    | Default
    | When
    | Gaurd
    | For
    | While
    | Do
    | Break
    | BreakAt
    | Continue
    | ContinueAt
    | Return
    | ReturnAt
    | Jump
    | Val
    | Var
    | Const
    | Throw
    | Catch
    | Finally
    | Try
    | Assert
    | Debug
    | Context
    | Notation
    | Axiom
    | Fun
    | Operator
    | Structure
    | Theory
    | Rule
    | Abstract
    ;
// Symbols
Vert : '|';
At: '@';
Annotation: At IdentifierOrSoftKeyword;
LParen: '(';
RParen: ')';
LBrace: '{';
RBrace: '}';
LBracket: '[';
RBracket: ']';
LAngle: '<';
RAngle: '>';
SemiColon: ';';
Colon: ':';
Dot: '.';
Star: '*';
Comma: ',';
SubType : '<:';
SuperType : ':>';
DoubleColon : '::';
Arrow : '->';
QuestionMark : '?';
Assignment : '=';
Number: [0-9]+ ;
DecimalNumber : Number Dot Number;
StringLiteral
    : '"' ( ~["\\] | '\\' . )* '"'
    | '\'' ( ~['\\] | '\\' . )* '\''
    ;