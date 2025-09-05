package com.iskportal.dedukt.lang.objects.expression

data class DiagnosticMessage(
    val level: com.iskportal.dedukt.lang.objects.expression.DiagnosticLevel,
    val path: List<Int>,
    val message: String
)