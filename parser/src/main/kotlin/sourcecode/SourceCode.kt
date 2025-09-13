package com.iskportal.dedukt.lang.sourcecode

/**
 * This class is the root abstraction of a single Dedukt source code.
 */
class SourceCode {
    /**
     * Header of a dedukt source code consists of a package declaration and an import list.
     */
    val header: Header

    /**
     * Body of a dedukt source code consists of declaration statements and application statements.
     */
    val body : Body

    constructor(header: Header, body: Body) {
        this.header = header
        this.body = body
    }
}

class Header()
class Body()