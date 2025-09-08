package com.iskportal.dedukt.lang.sourcecode


import com.iskportal.dedukt.lang.sourcecode.body.Body
import com.iskportal.dedukt.lang.sourcecode.header.Header

interface SourceCode {
    val head: Header
    val body: Body
}