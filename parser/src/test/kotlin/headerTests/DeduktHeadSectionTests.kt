package headerTests

import com.iskportal.dedukt.lang.processor.DeduktASTProcessor
import kotlin.test.Test

class DeduktHeadSectionTests {

    /**
     * This test ensures that the package declaration is correctly parsed from the source code.
     */
    @Test
    fun `Package Declaration Test`() {
        val standardPackageDeclaration = "package com.iskportal.dedukt.abstract"
        val packageIdentifier = "com.iskportal.dedukt.abstract"
        val sourceCode = """
            $standardPackageDeclaration
            """
        // Parsing the source code
        val processor = DeduktASTProcessor()
        val packageDeclaration = processor.parse(sourceCode).packageDeclaration()
        val packageInfo = packageDeclaration.packageIdentifier()


        assert(packageInfo.text == packageIdentifier) {
            "Expected package identifier to be '$packageIdentifier' but found '${packageInfo.text}'"
        }

    }

    /**
     * This test ensures that keywords can be used in package names without causing parsing issues.
     */
    @Test
    fun `Assert Keywords are allowed in Package Names`() {
        val standardPackageDeclaration = "package com.iskportal.dedukt.type"
        val packageIdentifier = "com.iskportal.dedukt.type"
        val sourceCode = """
            $standardPackageDeclaration
            """
        // Parsing the source code
        val processor = DeduktASTProcessor()
        val packageDeclaration = processor.parse(sourceCode).packageDeclaration()
        val packageInfo = packageDeclaration.packageIdentifier()

        // Asserting the package identifier
        assert(packageInfo.text == packageIdentifier) {
            "Expected package identifier to be '$packageIdentifier' but found '${packageInfo.text}'"
        }
    }

    /**
     * This test ensures that import statements are correctly parsed from the source code.
     */
    fun `Import Statement Test`() {
        val importDeclarations = """
            package com.iskportal.dedukt.abstract
            
            import com.iskportal.dedukt.type.Type
            import com.iskportal.dedukt.type.*
            import com.iskportal.dedukt.type.Type
            """".trimIndent()
        val importIdentifier = "com.iskportal.dedukt.type.Type"
        val sourceCode = """
            $importDeclarations
            """
        // Some assumptions
        val numberOfImports = 3
        val numberOfUniqueImports = 2

        // Parsing the source code
        val processor = DeduktASTProcessor()
        val importList = processor.parse(sourceCode).importList().importStatement().toList()
        val importInfo = importDeclaration.

        // Asserting the import identifier
        assert(importInfo.text == importIdentifier) {
            "Expected import identifier to be '$importIdentifier' but found '${importInfo.text}'"
        }
    }
}
