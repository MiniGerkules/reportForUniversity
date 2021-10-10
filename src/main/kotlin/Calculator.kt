/**
 * A class that implements some arithmetic operations
 * @author Katser Eugene
 */
class Calculator {
    companion object {
        /**
         * The method performs the addition operation
         * @return the total of the <code>first</code> and <code>second</code>
         * @param first the first number to calculate
         * @param second the second number to calculate
         * @author Katser Eugene
         */
        fun add(first: Int, second: Int) = first + second

        /**
         * The method performs the addition operation
         * @return the difference of the <code>first</code> and <code>second</code>
         * @param first the first number to calculate
         * @param second the second number to calculate
         * @author Kater Eugene
         */
        fun subtract(first: Int, second: Int) = first - second

        /**
         * The method performs the multiply operation
         * @return the product of the <code>first</code> and <code>second</code>
         * @param first the first number to calculate
         * @param second the second number to calculate
         * @author Katser Eugene
         */
        fun multiply(first: Int, second: Int) = first * second

        /**
         * The method performs the addition operation
         * @return the quotient of the <code>first</code> and <code>second</code>
         * @param first the first number to calculate
         * @param second the second number to calculate
         * @author Katser Eugene
         */
        fun divide(first: Int, second: Int) = first / second
    }
}