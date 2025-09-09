package com.iskportal.dedukt.lang.sourcecode.body.declaration.theory

import com.iskportal.dedukt.lang.sourcecode.body.Context
import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class TheoryDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: TheoryDeclarationContext

): Declaration {
    override val declarationType: DeclarationType = DeclarationType.THEORY
}