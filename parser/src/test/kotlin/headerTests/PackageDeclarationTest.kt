package headerTests

import com.iskportal.dedukt.lang.processor.DeduKtASTProcessor
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class PackageDeclarationTest {
    private lateinit var exampleDeduKtCode1: String
    private lateinit var processor : DeduKtASTProcessor
    @BeforeTest
    fun `Load Dedukt source example`() {
        // Read resource into a String
        exampleDeduKtCode1 = object {}.javaClass
            .getResourceAsStream("/example1.dedukt")
            ?.bufferedReader()
            ?.use { it.readText() }
            ?: error("Resource not found: /example1.dedukt")
        processor = DeduKtASTProcessor(exampleDeduKtCode1)
    }

    @Test
    fun `Package Declaration Test`() {
        val packageInfo = processor.sourceCodePackageDeclaration()

        assertTrue {
            packageInfo.packageName == "com.iskportal.dedukt.abstract"
        }
    }

    @Test
    fun `Import Statements Test`() {
    }
}
