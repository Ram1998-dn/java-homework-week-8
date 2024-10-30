package week8;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of
 all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them;
 * also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 */
public class DigitSumChallenge {
    // Method to calculate the sum of the digits of the number
    public static int sumDigit(int number){
        // Check if number is valid (greater than or equal to 10)
        if(number <= 10){
            return -1;   // Return -1 for invalid numbers

        }
        int sum =0;
        while (number >0){
            sum += number%10;  // Add the last digit to the sum
            number /= 10;      // Remove the last digit from the number(Removing the last digit from number by dividing it by 10)

        }
        return sum;

    }

    public static void main(String[] args) {
        // Test the sumDigits method with various inputs
        System.out.println("Sum of digits in 125: " + sumDigit(125));  // Expected output: 8
        System.out.println("Sum of digits in 1: " + sumDigit(1));      // Expected output: -1
        System.out.println("Sum of digits in 100: " + sumDigit(100));  // Expected output: 1
        System.out.println("Sum of digits in -10: " + sumDigit(-10));  // Expected output: -1
        System.out.println("Sum of digits in 654: " + sumDigit(654));  // Expected output: 15
        System.out.println("Sum of digits is 897: " +sumDigit(897));   // Expected output: 24
    }
}
