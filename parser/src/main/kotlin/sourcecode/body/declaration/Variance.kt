package com.iskportal.dedukt.lang.sourcecode.body.declaration

interface Variance<T> {
    val type: T
    val varianceType: VarianceType
}