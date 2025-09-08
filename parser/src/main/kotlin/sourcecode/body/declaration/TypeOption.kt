package com.iskportal.dedukt.lang.sourcecode.body.declaration

import com.iskportal.dedukt.lang.objects.type.DeType

interface TypeOption {
    val parameter: List<TypeParameter>?
    val subTypeOf: List<DeType>?
    val applicableTo: List<DeType>?

}