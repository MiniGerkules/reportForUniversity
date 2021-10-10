/**
 * A class that implements some arithmetic operations
 * @param first the first number to calculate
 * @param second the second number to calculate
 * @author Katser Eugene
 */
class Calculator(val first: Int, val second: Int) {
    /**
     * The method performs the addition operation
     * @return the total of the <code>first</code> and <code>second</code>
     * @author Katser Eugene
     */
    fun add() = first + second

    /**
     * The method performs the addition operation
     * @return the difference of the <code>first</code> and <code>second</code>
     * @author Kater Eugene
     */
    fun subtract() = first - second

    /**
     * The method performs the multiply operation
     * @return the product of the <code>first</code> and <code>second</code>
     * @author Katser Eugene
     */
    fun multiply() = first * second

    /**
     * The method performs the addition operation
     * @return the quotient of the <code>first</code> and <code>second</code>
     * @author Katser Eugene
     */
    fun divide() = first / second
}