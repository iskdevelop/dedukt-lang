package com.iskportal.dedukt.lang.objects.expression

// Tree structure queries
interface TreeStructure {
    fun depth(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Int
    fun nodeCount(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Int
    fun leafCount(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Int
    fun isLeaf(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun isRoot(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, root: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun parent(node: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, root: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun siblings(node: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, root: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>
    fun ancestors(node: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, root: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>
    fun descendants(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>
    fun subtreeAt(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, path: List<Int>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun pathTo(target: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, root: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<Int>?
}