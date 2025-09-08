package com.iskportal.dedukt.lang.processor

import DeduktLexer
import DeduktParser
import com.iskportal.dedukt.lang.sourcecode.SourceCode

interface Processor {
    val name: String
    val version: String
    val parser: DeduktParser
    val lexer: DeduktLexer

    // A method to parse input and return a parser and lexer pair
    fun parse(input: String): Pair<DeduktParser, DeduktLexer>

    // A method to process the parsed input
    fun process(): SourceCode

}