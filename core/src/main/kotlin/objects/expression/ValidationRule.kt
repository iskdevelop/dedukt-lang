package com.iskportal.dedukt.lang.objects.expression

interface ValidationRule {
    val name: String
    fun check(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>): Boolean
    fun message(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>): String
}