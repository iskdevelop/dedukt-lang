package com.iskportal.dedukt.lang.objects.expression

// Tree validation and invariants
interface TreeValidator {
    fun validate(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, rules: List<com.iskportal.dedukt.lang.objects.expression.ValidationRule>): com.iskportal.dedukt.lang.objects.expression.ValidationResult
    fun isWellFormed(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): Boolean
    fun checkInvariants(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree, invariants: List<(com.iskportal.dedukt.lang.objects.expression.ExpressionTree) -> Boolean>): Boolean
    fun diagnose(tree: com.iskportal.dedukt.lang.objects.expression.ExpressionTree): List<com.iskportal.dedukt.lang.objects.expression.DiagnosticMessage>
}