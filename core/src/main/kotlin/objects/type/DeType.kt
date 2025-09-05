package com.iskportal.dedukt.lang.objects.type


interface DeType {
    val name: String
    val upperBound: DeType
    val lowerBound: DeType
}


