package com.iskportal.dedukt.lang.objects.expression

// Tree analysis and metrics
interface TreeAnalyzer {
    fun complexity(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Int
    fun balance(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Double
    fun symmetry(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Double
    fun entropy(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Double
    fun signature(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): String
    fun fingerprint(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): ByteArray
    fun statistics(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.TreeStatistics
}