fun String.countChar(symbol: Char) : Int {
    var numberOfSymbol = 0
    this.forEach { curSym -> if (curSym == symbol) ++numberOfSymbol }

    return numberOfSymbol
}