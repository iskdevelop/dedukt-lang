package com.iskportal.dedukt.lang.sourcecode.body.declaration.notation

import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class NotationDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: NotationDeclarationContext

): Declaration {
    override val declarationType: DeclarationType = DeclarationType.NOTATION
}


