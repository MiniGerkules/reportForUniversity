fun main() {
    val testingString = "Very simple example"
    val testingSymbols = arrayListOf('a', 'm', 'e')
    val realResults = arrayListOf(1, 2, 3)

    for (i in 0 until testingSymbols.size)
        assert(testingString.countChar(testingSymbols[i]) == realResults[i])
}