package com.iskportal.dedukt.lang.sourcecode.body.declaration.annotation

import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.TypeOption

data class AnnotationDeclaration(
    override val identifier: String,
    override val declarationType: DeclarationType = DeclarationType.ANNOTATION,
    override val context: AnnotationDeclarationContext
): Declaration {
    override val typeOption: TypeOption? = null
}

