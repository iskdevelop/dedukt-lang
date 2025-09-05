package com.iskportal.dedukt.lang.objects.expression

// Tree comparison and equivalence
interface TreeComparison {
    fun structuralEquals(tree1: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, tree2: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun valueEquals(tree1: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, tree2: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun isomorphic(tree1: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, tree2: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun similar(tree1: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, tree2: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, threshold: Double): Boolean
    fun diff(tree1: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, tree2: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<com.iskportal.dedukt.lang.objects.expression.TreeDiff>
}