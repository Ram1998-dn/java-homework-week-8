package week8;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class SharedDigitChecker {
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if both numbers are within the range of 10 to 99
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false; // Return false if out of range
        }

        // Extract digits from the first number
        int firstDigitNum1 = num1 / 10; // Tens place of num1
        int secondDigitNum1 = num1 % 10; // Units place of num1

        // Extract digits from the second number
        int firstDigitNum2 = num2 / 10; // Tens place of num2
        int secondDigitNum2 = num2 % 10; // Units place of num2

        // Check for shared digits
        return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 ||
                secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == secondDigitNum2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // Expected: true (2 is shared)
        System.out.println(hasSharedDigit(12, 34)); // Expected: false (no shared digit)
        System.out.println(hasSharedDigit(15, 51)); // Expected: true (5 is shared)
        System.out.println(hasSharedDigit(99, 59)); // Expected: true (9 is shared)
        System.out.println(hasSharedDigit(9, 23));  // Expected: false (9 is out of range)
        System.out.println(hasSharedDigit(12, 105)); //Expected: false (105 is out of range)
        System.out.println(hasSharedDigit(49,79 ));// Expected: true (9 is shared)
    }
}
