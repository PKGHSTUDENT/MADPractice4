
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainKtTest {

    @Test
    fun countDifferentDigitsUseNullArrayTest() {
        var rows = 4
        var columns = 3
        val table = Array(rows) { IntArray(columns) }
        val expected = 0
        assertEquals(countDifferentDigits(table, rows, columns), expected)
    }

    @Test
    fun countDifferentDigitsUseZeroRowsColumnsArrayTest() {
        var rows = 0
        var columns = 0
        val table = Array(rows) { IntArray(columns) }
        val expected = 0
        assertEquals(countDifferentDigits(table, rows, columns), expected)
    }

    @Test
    fun countDifferentDigitsUseOneDifferenceNumberTest() {
        var rows = 3
        var columns = 4
        var inputIntArray: IntArray = intArrayOf()
        val table = arrayOf(
            intArrayOf(111, 111111, 111, 111),
            intArrayOf(111, 111, 111111, 111),
            intArrayOf(111111, 111, 111111, 111)
        )
        val expected = 1
        assertEquals(countDifferentDigits(table, rows, columns), expected)
    }

    @Test
    fun countDifferentDigitsUseFiveDifferenceNumbersTest() {
        var rows = 3
        var columns = 4
        var inputIntArray: IntArray = intArrayOf()
        val table = arrayOf(
            intArrayOf(100, 951, 101, 950),
            intArrayOf(519, 999, 155, 501),
            intArrayOf(510, 911, 144, 554)
        )
        val expected = 5
        assertEquals(countDifferentDigits(table, rows, columns), expected)
    }

    @Test
    fun countDifferentDigitsUseNineDifferenceNumbersTest() {
        var rows = 3
        var columns = 4
        var inputIntArray: IntArray = intArrayOf()
        val table = arrayOf(
            intArrayOf(123, 345, 101, 950),
            intArrayOf(519, 999, 155, 501),
            intArrayOf(510, 911, 678, 554)
        )
        val expected = 10
        assertEquals(countDifferentDigits(table, rows, columns), expected)
    }

    @Test
    fun isSymmetricalNullArrayTest() {
        val inputIntArray = Array(0) { IntArray(0) }
        val expected = false
        assertEquals(isSymmetrical(inputIntArray), expected)
    }
    @Test
    fun isSymmetricalTrueTest() {
        val inputIntArray = arrayOf(
            intArrayOf(5, 9, 6, 7, 2),
            intArrayOf(9, 8, 4, 5, 3),
            intArrayOf(6, 4, 3, 8, 7),
            intArrayOf(7, 5, 8, 4, 8),
            intArrayOf(2, 3, 7, 8, 1)
        )
        val expected = true
        assertEquals(isSymmetrical(inputIntArray), expected)
    }

    @Test
    fun isSymmetricalFalseTest() {

        val inputIntArray = arrayOf(
            intArrayOf(5, 9, 6, 7, 2),
            intArrayOf(8, 8, 4, 5, 3),
            intArrayOf(6, 4, 3, 8, 7),
            intArrayOf(7, 5, 1, 4, 8),
            intArrayOf(2, 3, 7, 4, 1)
        )
        val expected = false
        assertEquals(isSymmetrical(inputIntArray), expected)
    }
}