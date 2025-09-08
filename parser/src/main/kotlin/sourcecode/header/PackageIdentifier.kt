package com.iskportal.dedukt.lang.sourcecode.header

interface PackageIdentifier {
    val name: String
    val group: String
    val identifierList : List<String>
}