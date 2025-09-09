package com.iskportal.dedukt.lang.sourcecode.body.declaration.structure

import com.iskportal.dedukt.lang.sourcecode.body.Context
import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class StructureDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: StructureDeclarationContext

): Declaration {

    override val declarationType: DeclarationType = DeclarationType.STRUCTURE
}