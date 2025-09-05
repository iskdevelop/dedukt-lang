package com.iskportal.dedukt.lang.objects.expression

interface GraphRepresentation {
    val nodes: List<com.iskportal.dedukt.lang.objects.expression.GraphNode>
    val edges: List<com.iskportal.dedukt.lang.objects.expression.GraphEdge>
}