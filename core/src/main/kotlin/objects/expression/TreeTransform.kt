package com.iskportal.dedukt.lang.objects.expression

// Tree transformation
interface TreeTransform {
    fun map(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, transform: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun mapValues(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, transform: (com.iskportal.dedukt.lang.objects.expression.Expression) -> com.iskportal.dedukt.lang.objects.expression.Expression): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun filter(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, predicate: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun prune(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, predicate: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun replace(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, target: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, replacement: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun replaceAll(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, replacements: Map<com.iskportal.dedukt.lang.objects.expression.ExpressionTree, com.iskportal.dedukt.lang.objects.expression.ExpressionTree>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun insertAt(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>, newNode: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun removeAt(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
}