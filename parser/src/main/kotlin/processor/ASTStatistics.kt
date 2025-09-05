package com.iskportal.dedukt.lang.processor

/**
 * Statistics about the AST
 */
data class ASTStatistics(
    val totalNodes: Int,
    val declarations: Int,
    val typeDeclarations: Int,
    val functionDeclarations: Int,
    val applications: Int,
    val functionCalls: Int,
    val identifiers: Int,
    val literals: Int,
    val statements: Int,
)