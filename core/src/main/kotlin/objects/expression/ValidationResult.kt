package com.iskportal.dedukt.lang.objects.expression

data class ValidationResult(
    val isValid: Boolean,
    val violations: List<com.iskportal.dedukt.lang.objects.expression.RuleViolation>
)