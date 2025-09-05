package com.iskportal.dedukt.lang.objects.expression

// Composite interface for complete tree operations
interface SymbolicTreeOperations :
    com.iskportal.dedukt.lang.objects.expression.TreeTraversal,
    com.iskportal.dedukt.lang.objects.expression.TreeStructure,
    com.iskportal.dedukt.lang.objects.expression.TreeMatcher,
    com.iskportal.dedukt.lang.objects.expression.TreeTransform,
    com.iskportal.dedukt.lang.objects.expression.TreeBuilder,
    com.iskportal.dedukt.lang.objects.expression.TreeComparison,
    com.iskportal.dedukt.lang.objects.expression.TreeValidator,
    com.iskportal.dedukt.lang.objects.expression.TreeSerializer,
    com.iskportal.dedukt.lang.objects.expression.TreeAnalyzer