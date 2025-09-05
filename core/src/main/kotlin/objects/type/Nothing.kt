package com.iskportal.dedukt.lang.objects.type

object Nothing : DeType {
    override val name: String = "Nothing"
    override val upperBound: DeType = Any
    override val lowerBound: DeType = this
}