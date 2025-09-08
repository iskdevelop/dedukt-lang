package com.iskportal.dedukt.lang.sourcecode.header

interface ImportItem {
    val name: String
    val group: String
    val identifierList : List<String>
    val importAll: Boolean
}