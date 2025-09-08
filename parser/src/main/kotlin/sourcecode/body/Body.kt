package com.iskportal.dedukt.lang.sourcecode.body

import com.iskportal.dedukt.lang.sourcecode.body.application.Application
import com.iskportal.dedukt.lang.sourcecode.body.declaration.Declaration

interface Body {
    val declaration: List<Declaration>
    val application: List<Application>
}

