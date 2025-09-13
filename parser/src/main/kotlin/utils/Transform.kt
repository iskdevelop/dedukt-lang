package com.iskportal.dedukt.lang.utils

fun <T,U> T.transform(transformer: (T) -> U) : U {
    return transformer(this)
}