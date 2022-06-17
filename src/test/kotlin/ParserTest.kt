import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ParserTest {
    @Test
    fun testAddition_1() {
        assertEquals(parseExpression("5+5"), "10")
    }

    @Test
    fun testAddition_2() {
        assertEquals(parseExpression("5+3+2+4"), "14")
    }

    @Test
    fun testAddition_3() {
        assertEquals(parseExpression("19+38+234+212+123"), "626")
    }

    @Test
    fun testAddition_4() {
        assertEquals(parseExpression("12+23+343+23+2131+122+12333+1122+11+1+1+11"), "16133")
    }

    @Test
    fun testAddition_5() {
        assertEquals(parseExpression("1+0+1+2+0+3"), "7")
    }

    @Test
    fun testAddition_6() {
        assertEquals(parseExpression("1000000+1000000+1000000+1000000+1000000+1000000+1000000+1000000+1000000+1000000"), "10000000")
    }

    @Test
    fun testAddition_7() {
        assertEquals(parseExpression("999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999+999"), "425574")
    }

    @Test
    fun testAddition_8() {
        assertEquals(parseExpression("1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1"), "768")
    }

    @Test
    fun testAddition_9() {
        assertEquals(parseExpression("5+3+2+12+4+31+43+123+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4+4+5+3+2+12+4+31+43+123+4"), "10387")
    }

    @Test
    fun testAddition_10() {
        assertEquals(parseExpression("439934+1+234+343+33+3"), "440548")
    }

    @Test
    fun testAddition_11() {
        assertEquals(parseExpression("84+132+431+132+1+1+4393+2134834+2391+1"), "2142400")
    }

    @Test
    fun testAddition_12() {
        assertEquals(parseExpression("3+1"), "4")
    }

    @Test
    fun testAddition_13() {
        assertEquals(parseExpression("2234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+1134+2234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+1134+2234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+1134+2234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+11342234+1323+343+3432+23421+1+1+1+9+343+2+2+1+1+3492+88+33+55+66+89+99+224+221+224+1134"), "68401586")
    }

    @Test
    fun testAddition_14() {
        assertEquals(parseExpression("12+3483+212+331+34+1+1+38943+1343+1+39843+123+9943+385853+234921+1343+1+1+1+1+1+1+1+3433"), "719827")
    }

    @Test
    fun testAddition_15() {
        assertEquals(parseExpression("39043+32+324+321+1+1+22+22"), "39766")
    }

    @Test
    fun testSubtraction_1() {
        assertEquals(parseExpression("5-5"), "0")
    }

    @Test
    fun testSubtraction_2() {
        assertEquals(parseExpression("15-88-34-34-22-1-1-4585-23-2-1-9-7-5-4-3-2-1-3-5-5-5-6-6-7-7-7-7-224"), "-5089")
    }

    @Test
    fun testSubtraction_3() {
        assertEquals(parseExpression("99999999-2-3-1000-22-2-2-2-2-1-1-0-1-0-0-0-1111-13-64"), "99997773")
    }

    @Test
    fun testSubtraction_4() {
        assertEquals(parseExpression("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0"), "0")
    }

    @Test
    fun testSubtraction_5() {
        assertEquals(parseExpression("1432-3243-3186-4985-134-14-143985-134-1432-32434"), "-188115")
    }

    @Test
    fun testSubtraction_6() {
        assertEquals(parseExpression("1000000-1000000-1000000-1000000-1000000-1000000-1000000-1000000-1000000-1000000"), "-8000000")
    }

    @Test
    fun testSubtraction_7() {
        assertEquals(parseExpression("88-9-31-34-5-6-7-345-3-2"), "-354")
    }

    @Test
    fun testSubtraction_8() {
        assertEquals(parseExpression("1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1"), "-36")
    }

    @Test
    fun testSubtraction_9() {
        assertEquals(parseExpression("5-34-44-4"), "-77")
    }

    @Test
    fun testSubtraction_10() {
        assertEquals(parseExpression("123-456-789"), "-1122")
    }

    @Test
    fun testSubtraction_11() {
        assertEquals(parseExpression("999999-0"), "999999")
    }

    @Test
    fun testSubtraction_12() {
        assertEquals(parseExpression("0-0-0-99"), "-99")
    }

    @Test
    fun testSubtraction_13() {
        assertEquals(parseExpression("2234-35-4-4-5-5-5-5-2-24-453-234-4"), "1454")
    }

    @Test
    fun testSubtraction_14() {
        assertEquals(parseExpression("3433-2"), "3431")
    }

    @Test
    fun testSubtraction_15() {
        assertEquals(parseExpression("88-9909-988"), "-10809")
    }
}
