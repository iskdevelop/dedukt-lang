package com.iskportal.dedukt.lang.objects.expression

// Tree traversal and navigation
interface TreeTraversal {
    fun preOrder(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
    fun postOrder(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
    fun inOrder(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
    fun levelOrder(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
    fun depthFirst(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
    fun breadthFirst(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, action: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Unit)
}