import org.junit.Assert
import org.junit.Test

/**
 * The main testing class
 */
class TestStringExtensions {
    /**
     * The method tests the function countChar
     * @see countChar
     */
    @Test
    fun `test function countChart`() {
        val testingString = "Very simple example"
        val testingSymbols = arrayListOf('a', 'm', 'e')
        val realResults = arrayListOf(1, 2, 4)

        for (i in 0 until testingSymbols.size)
            Assert.assertTrue(testingString.countChar(testingSymbols[i]) == realResults[i])
    }

    /**
     * The method tests the function revInd on correct data
     * @see revInd
     */
    @Test
    fun `test function revInd without exception`() {
        val testingString = "0123456789"

        for (i in testingString.indices)
            Assert.assertEquals((9 - i).digitToChar(), testingString.revInd(-i))
    }

    /**
     * The method tests the function revInd on incorrect data
     * @see revInd
     */
    @Test(expected = IllegalArgumentException::class)
    fun `test1 function revInd with exception`() {
        val testingString = "0123456789"

        testingString.revInd(-20)
    }

    /**
     * The method tests the function revInd on incorrect data
     * @see revInd
     */
    @Test
    fun `test2 function revInd with exception`() {
        val testingString = "0123456789"

        try {
            testingString.revInd(2)
            Assert.fail()
        } catch (error: IllegalArgumentException) {
            Assert.assertTrue(error.message!!.isNotEmpty())
        }
    }

    /**
     * The method tests the function <code>splitToPair</code>
     * @see splitToPair
     */
    @Test
    fun `test function splitToPair`() {
        val testingArray = arrayOf("abcd", "abcde", "abcdef", "abcdefg")
        val haveUnderscore = arrayOf(false, true, false, true)
        val resultLengthArray = arrayOf(2, 3, 3, 4)

        for (i in testingArray.indices) {
            val splittingString = testingArray[i].splitToPair()

            Assert.assertEquals(resultLengthArray[i], splittingString.size)
            Assert.assertTrue((splittingString.last().last() == '_') == haveUnderscore[i])
        }
    }
}