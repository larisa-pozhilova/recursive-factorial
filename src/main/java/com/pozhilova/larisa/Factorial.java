package com.pozhilova.larisa;

/**
 * A class to compute the factorial of a non-negative integer using recursion.
 *
 * <p>
 * The factorial of a number (n!) is defined as the product of all positive integers less than
 * or equal to the number. For example:
 * <ul>
 * <li>0! = 1</li>
 * <li>1! = 1</li>
 * <li>4! = 4 × 3 × 2 × 1 = 24</li>
 * </ul>
 * </p>
 *
 * <p>
 * <strong>Note on limitations:</strong>
 * This implementation uses the {@code long} data type, which can store values up to
 * {@code 2^63 - 1} (approximately 9.2 × 10^18). Factorials grow very quickly, and the
 * factorial of numbers greater than 20 will exceed the range of {@code long}, causing
 * an integer overflow and incorrect (often negative) results.
 * </p>
 */
public class Factorial {

    /**
     * Calculates the factorial of a given non-negative integer.
     *
     * <p>
     * This method uses recursion to compute the factorial. It handles inputs of 0 and 1 correctly,
     * returning 1 in those cases. For inputs greater than 20, the result will overflow the range
     * of {@code long}, leading to incorrect results.
     * </p>
     *
     * @param n the non-negative integer for which the factorial is to be calculated.
     * @return the factorial of the given number as a {@code long}.
     * @throws IllegalArgumentException if the input is negative.
     */
    private static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        return n == 1 || n == 0 ? 1 : n * factorial(n - 1);
    }

    /**
     * The main method to test the factorial calculation.
     *
     * <p>
     * This method demonstrates the calculation of the factorial for a sample input value (4 in
     * this case) and prints the result to the console.
     * </p>
     *
     * <p>
     * <strong>Note:</strong> To handle factorials of numbers greater than 20 without overflow,
     * consider using the {@link java.math.BigInteger} class instead of {@code long}.
     * </p>
     *
     * @param args command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        System.out.println(factorial(4)); // Expected output: 24
    }
}
