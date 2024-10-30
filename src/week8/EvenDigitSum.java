package week8;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1; // Return -1 for invalid (negative) values
        }

        int sum = 0; // Initialize sum of even digits

        // Process each digit of the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit

            // Check if the digit is even
            if (digit % 2 == 0) {
                sum += digit; // Add even digit to the sum
            }

            number /= 10; // Remove the last digit
        }

        return sum; // Return the sum of even digits
    }

    public static void main(String[] args) {
        // Test the getEvenDigitSum method with various inputs
        System.out.println("Sum of even digits in 123456: " + getEvenDigitSum(123456)); // Expected: 12 (2 + 4 + 6)
        System.out.println("Sum of even digits in 24680: " + getEvenDigitSum(24680));   // Expected: 20 (2 + 4 + 6 + 8 + 0)
        System.out.println("Sum of even digits in 13579: " + getEvenDigitSum(13579));   // Expected: 0 (no even digits)
        System.out.println("Sum of even digits in -123: " + getEvenDigitSum(-123));     // Expected: -1 (invalid input)
        System.out.println("Sum of even digits in -0: " + getEvenDigitSum(-0));           // Expected: 0 (0 is even)
    }
}
