package calculator;

/**
 * Calculator class for performing mathematical operations
 * Implements square root of division: result = sqrt(a/b)
 */
public class Calculator {
    /**
     * Calculates the square root of division of two integers
     * @param a the numerator
     * @param b the denominator
     * @return the square root of a/b
     * @throws IllegalArgumentException if b is zero
     */
    public double sqrtDivision(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative values are not supported for square root calculation");
        }
        double division = (double) a / b;
        return Math.sqrt(division);
    }
}
