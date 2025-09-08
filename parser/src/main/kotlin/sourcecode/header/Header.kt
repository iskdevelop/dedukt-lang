package com.iskportal.dedukt.lang.sourcecode.header

interface Header {
    val packageName: PackageIdentifier
    val imports: List<ImportItem>
}

