package com.iskportal.dedukt.lang.processor.head

import DeduktParser

/**
 * Information about import statements
 */
data class ImportInfo(
    val importStatement: DeduktParser.ImportStatementContext
) {
    val packageName: String = importStatement.packageIdentifier().text
    val isWildcard: Boolean = importStatement.Star() != null
    val parts: List<String> = importStatement.packageIdentifier().packageIdentifierNode().map { it.text }
}