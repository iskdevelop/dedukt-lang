package com.iskportal.dedukt.lang.sourcecode.body.declaration.rule

import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class RuleDeclaration(
    override val identifier: String,
    override val typeOption: TypeOption?,
    override val context: RuleDeclarationContext

): Declaration {
    override val declarationType: DeclarationType = DeclarationType.RULE
}