/**
 * The function counts the number of characters that match <code>symbol</code>
 * @author Katser Eugene
 * @param symbol the character to be counted
 */
fun String.countChar(symbol: Char): Int {
    var numberOfSymbol = 0
    this.forEach { curSym -> if (curSym == symbol) ++numberOfSymbol }
    return numberOfSymbol
}

/**
 * The function implements reverse indexing of strings
 * @author Katser Eugene
 * @param index the negative index of the desired character
 * @exception IllegalArgumentException if the index is out of bounds of the
 * string, an exception is thrown
 * @return The symbol at position <code>String.length + index - 1</code>
 */
fun String.revInd(index: Int): Char {
    if ((index + this.length - 1 < 0) || (index > 0))
        throw IllegalArgumentException("Out of bounds")

    return this[index + this.length - 1]
}

/**
 * The function divides a string into pairs of characters. If there is not
 * enough character for the last pair, the character '_' is added
 * @author Katser Eugene
 * @return the list of strings consisting of a pair of characters
 */
fun String.splitToPair(): MutableList<String> {
    val toReturn = mutableListOf<String>()
    val fullString = if (this.length % 2 != 0) this + "_" else this

    for (i: Int in this.indices step 2)
        toReturn.add(fullString[i].toString() + fullString[i + 1])

    return toReturn
}