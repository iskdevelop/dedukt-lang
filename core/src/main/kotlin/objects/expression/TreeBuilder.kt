package com.iskportal.dedukt.lang.objects.expression

// Tree construction and manipulation
interface TreeBuilder {
    fun leaf(value: com.iskportal.dedukt.lang.objects.expression.Expression): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun node(value: com.iskportal.dedukt.lang.objects.expression.Expression, children: List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun copy(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun merge(trees: List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>, combiner: (List<com.iskportal.dedukt.lang.objects.expression.Expression>) -> com.iskportal.dedukt.lang.objects.expression.Expression): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
    fun graft(trunk: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, branch: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun flatten(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, levels: Int = 1): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
}