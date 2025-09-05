package com.iskportal.dedukt.lang.objects.expression

import com.iskportal.dedukt.lang.objects.type.DeType

interface Expression : DeType {
    val tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree
}

