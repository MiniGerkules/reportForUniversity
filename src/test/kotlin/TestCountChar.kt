import org.junit.Assert
import org.junit.Test

class TestCountChar {
    @Test
    fun testCountChar() {
        val testingString = "Very simple example"
        val testingSymbols = arrayListOf('a', 'm', 'e')
        val realResults = arrayListOf(1, 2, 4)

        for (i in 0 until testingSymbols.size)
            Assert.assertTrue(testingString.countChar(testingSymbols[i]) == realResults[i])
    }
}