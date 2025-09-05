package com.iskportal.dedukt.lang.objects.expression

data class TreeStatistics(
    val nodeCount: Int,
    val leafCount: Int,
    val maxDepth: Int,
    val averageDepth: Double,
    val branchingFactor: Double,
    val uniqueValues: Int
)