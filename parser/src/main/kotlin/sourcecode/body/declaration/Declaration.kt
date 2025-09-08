package com.iskportal.dedukt.lang.sourcecode.body.declaration

import com.iskportal.dedukt.lang.sourcecode.body.Context

interface Declaration {
    val identifier: String
    val declarationType: DeclarationType
    val typeOption: TypeOption?
    val context: Context
}