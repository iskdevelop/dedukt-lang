package com.iskportal.dedukt.lang.objects.expression

// Pattern matching and searching
interface TreeMatcher {
    fun find(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, predicate: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean): List<com.iskportal.dedukt.lang.objects.expression.ExpressionTree>
    fun findFirst(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, predicate: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun contains(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, predicate: (com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean): Boolean
    fun matches(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, pattern: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, bindings: MutableMap<String, com.iskportal.dedukt.lang.objects.expression.ExpressionTree> = mutableMapOf()): Boolean
    fun findMatches(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, pattern: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<Map<String, com.iskportal.dedukt.lang.objects.expression.ExpressionTree>>
    fun substitute(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, bindings: Map<String, com.iskportal.dedukt.lang.objects.expression.ExpressionTree>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree
}