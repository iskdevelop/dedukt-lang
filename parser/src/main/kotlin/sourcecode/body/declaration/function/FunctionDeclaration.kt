package com.iskportal.dedukt.lang.sourcecode.body.declaration.function

import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration
import com.iskportal.dedukt.lang.sourcecode.body.declaration.DeclarationType
import com.iskportal.dedukt.lang.sourcecode.body.declaration.FunctionTypeOption

data class FunctionDeclaration(
    override val identifier: String,
    override val context: FunctionDeclarationContext,
    override val typeOption: FunctionTypeOption
): Declaration {
    override val declarationType: DeclarationType = DeclarationType.FUNCTION
}


