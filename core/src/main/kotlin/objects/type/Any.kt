package com.iskportal.dedukt.lang.objects.type

import kotlin.Any

object Any : DeType, Any() {
    override val name: String = "Any"
    override val upperBound: DeType = this
    override val lowerBound: DeType = Nothing
}