package com.iskportal.dedukt.lang.sourcecode.body.declaration

import com.iskportal.dedukt.lang.objects.type.DeType

interface
TypeParameter {
    val name: String
    val dependent: Boolean
    val dependencyType: List<DeType>?
    val variance: List<Variance<DeType>>?
    val toSuperType: Boolean
}