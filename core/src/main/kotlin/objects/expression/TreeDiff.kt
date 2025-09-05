package com.iskportal.dedukt.lang.objects.expression

// Supporting data structures
data class TreeDiff(
    val operation: com.iskportal.dedukt.lang.objects.expression.DiffOperation,
    val path: List<Int>,
    val oldValue: com.iskportal.dedukt.lang.objects.expression.ExpressionTree?,
    val newValue: com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
)