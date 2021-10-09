fun String.countChar(symbol: Char): Int {
    var numberOfSymbol = 0
    this.forEach { curSym -> if (curSym == symbol) ++numberOfSymbol }
    return numberOfSymbol
}

fun String.revInd(index: Int): Char {
    if ((index + this.length - 1 < 0) || (index > 0))
        throw IllegalArgumentException("Out of bounds")

    return this[index + this.length - 1]
}

fun String.splitToPair(): MutableList<String> {
        val toReturn: MutableList<String> = mutableListOf()
        val fullString: String = this + "_"

        for (i: Int in this.indices step 2)
            toReturn.add(fullString[i].toString() + fullString[i + 1])

        return toReturn
}