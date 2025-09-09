package com.iskportal.dedukt.lang.sourcecode.body.declaration

enum class DeclarationType {
    TYPE,
    FUNCTION,
    NOTATION,
    AXIOM,
    OPERATOR,
    STRUCTURE,
    THEORY,
    ANNOTATION,
    RULE,
    CONTEXT;
    fun isType() = this == TYPE
    fun isFunction() = this == FUNCTION
    fun isNotation() = this == NOTATION
    fun isAxiom() = this == AXIOM
    fun isOperator() = this == OPERATOR
    fun isStructure() = this == STRUCTURE
    fun isTheory() = this == THEORY
    fun isAnnotation() = this == ANNOTATION
    fun isContext() = this == CONTEXT
    fun isRule() = this == RULE

    override fun toString(): String {
        return when (this) {
            TYPE -> "type"
            FUNCTION -> "function"
            NOTATION -> "notation"
            AXIOM -> "axiom"
            OPERATOR -> "operator"
            STRUCTURE -> "structure"
            THEORY -> "theory"
            ANNOTATION -> "annotation"
            CONTEXT -> "context"
            RULE -> "rule"
        }
    }
}