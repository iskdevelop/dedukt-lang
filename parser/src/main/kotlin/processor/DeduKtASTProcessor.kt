package com.iskportal.dedukt.lang.processor

import DeduktLexer
import DeduktParser
import com.iskportal.dedukt.lang.processor.head.ImportList
import com.iskportal.dedukt.lang.processor.head.PackageDeclarationInfo
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

/**
 * Enhanced source code processor for DeduKt language with powerful AST querying capabilities
 */
class DeduKtASTProcessor {
    val lexer: DeduktLexer
    val parser: DeduktParser
    val tree: DeduktParser.DeduktSourceCodeContext

    /**
     * A Constructor that generates an internal parser and lexer for the language
     */
    constructor(input: String) {
        lexer = DeduktLexer(CharStreams.fromString(input))
        parser = DeduktParser(CommonTokenStream(lexer))
        tree = parser.deduktSourceCode()
    }

    /**
     * Parse source code and return the AST root
     */
    fun parseSourceCode(input: String): DeduktParser.DeduktSourceCodeContext? {
        val inputStream = CharStreams.fromString(input)
        val lexer = DeduktLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DeduktParser(tokens)
        return parser.deduktSourceCode()
    }

    fun sourceCodePackageDeclaration(): PackageDeclarationInfo {
        return PackageDeclarationInfo(parser.packageDeclaration())
    }

    fun sourceCodeImports(): ImportList {
        return ImportList(parser.importList())
    }
}