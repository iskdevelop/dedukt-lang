package com.iskportal.dedukt.lang.processor.head

import DeduktParser

/**
 * Information about package declarations
 */
data class PackageDeclarationInfo(
    val packageDeclaration: DeduktParser.PackageDeclarationContext
) {
    val packageName: String = packageDeclaration.packageIdentifier().text
    val parts: List<String> = packageDeclaration.packageIdentifier().packageIdentifierNode().map { it.text }
}