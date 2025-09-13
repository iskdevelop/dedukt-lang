package com.iskportal.dedukt.lang.processor

import DeduktLexer
import DeduktParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

/**
 * Enhanced source code processor for DeduKt language with powerful AST querying capabilities
 */
class DeProcessor {

    /**
     * Generates source code data class
     */
    fun toSourceCode() : SourceCode {

    }

    /**
     * Returns the parser of Dedukt.
     */
    fun parse(input: String): DeduktParser {
        val inputStream = CharStreams.fromString(input)
        val lexer = DeduktLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DeduktParser(tokens)
        return parser
    }

    fun version(): String {
        return "0.0.2" // Example version
    }

}