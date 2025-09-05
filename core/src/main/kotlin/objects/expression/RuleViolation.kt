package com.iskportal.dedukt.lang.objects.expression

data class RuleViolation(
    val rule: com.iskportal.dedukt.lang.objects.expression.ValidationRule,
    val path: List<Int>,
    val message: String
)