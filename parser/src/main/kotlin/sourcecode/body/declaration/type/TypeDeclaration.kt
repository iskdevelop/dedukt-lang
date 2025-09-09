package com.iskportal.dedukt.lang.sourcecode.body.declaration.type

import com.iskportal.dedukt.lang.sourcecode.body.Context
import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class TypeDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: TypeDeclarationContext
): Declaration {
    override val declarationType: DeclarationType = DeclarationType.TYPE
}