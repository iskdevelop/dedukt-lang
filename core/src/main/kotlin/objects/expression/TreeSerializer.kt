package com.iskportal.dedukt.lang.objects.expression

// Tree serialization and representation
interface
TreeSerializer {
    fun serialize(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): String
    fun deserialize(data: String): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun toList(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<Any>
    fun fromList(data: List<Any>): com.iskportal.dedukt.lang.objects.expression.ExpressionTree?
    fun prettyPrint(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, indent: String = "  "): String
    fun toGraph(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): com.iskportal.dedukt.lang.objects.expression.GraphRepresentation
}