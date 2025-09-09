package com.iskportal.dedukt.lang.sourcecode.body.declaration.operator

import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class OperatorDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: OperatorDeclarationContext

): Declaration {
    override val declarationType: DeclarationType = DeclarationType.NOTATION
}


