package com.iskportal.dedukt.lang.interpreter.type

// Dedukt type object
interface Type {
    fun isApplicableTo(other: Type)
}

// True
fun Type.isSubtypeOf(other: Type): Boolean {
    return true
}

// True
fun Type.isSuperTypeOf(other: Type): Boolean {
    return true
}
