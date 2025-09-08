package com.iskportal.dedukt.lang.sourcecode.body.declaration

import com.iskportal.dedukt.lang.objects.type.DeType

interface FunctionTypeOption: TypeOption {
    val parameters: List<Pair<String, DeType>>
    val returnType: DeType?
    val extensionReceiverType: DeType?
}