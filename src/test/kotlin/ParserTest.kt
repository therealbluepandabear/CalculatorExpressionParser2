import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ParserTest {
    @Test
    fun testAddition_1() {
        assertEquals(parseExpression("5+5"), "10")
    }
}