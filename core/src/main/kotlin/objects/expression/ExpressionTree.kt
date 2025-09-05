package com.iskportal.dedukt.lang.objects.expression

// Core tree structure
interface ExpressionTree {
    val children: List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>?
    val value: com.iskportal.dedukt.lang.objects.expression.Expression
}