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
    fun testCountChar() {
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
    fun testRevIndWithoutException() {
        val testingString = "0123456789"

        for (i in testingString.indices)
            Assert.assertEquals((-i + 9).digitToChar(), testingString.revInd(-i))
    }

    /**
     * The method tests the function revInd on incorrect data
     * @see revInd
     */
    @Test(expected = IllegalArgumentException::class)
    fun testRevIndWithException1() {
        val testingString = "0123456789"

        testingString.revInd(-20)
    }

    /**
     * The method tests the function revInd on incorrect data
     * @see revInd
     */
    @Test
    fun testRevIndWithException2() {
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
    fun testSplitToPair() {
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