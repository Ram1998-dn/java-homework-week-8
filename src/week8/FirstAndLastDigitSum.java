package week8;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum {
    // Method to calculate the sum of the first and last digit of the number
    public static int sumFirstAndLastDigit(int number){
        // Check if the number is negative
        if (number < 0) {
            return -1; // Return -1 for invalid (negative) values
        }

        // Convert the number to a positive number if it's 0
        if (number == 0) {
            return 0; // Both first and last digit are 0
        }

        // Find the last digit
        int lastDigit = number % 10;

        // Find the first digit by dividing the number
        while (number >= 10) {
            number /= 10; // Reduce the number by removing the last digit
        }

        // At this point, 'number' is now the first digit
        int firstDigit = number;

        // Return the sum of the first and last digit
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        // Test the sumFirstAndLastDigit method with various inputs
        System.out.println("sumFirstAndLastDigit(252): " + sumFirstAndLastDigit(252)); // Expected: 4
        System.out.println("sumFirstAndLastDigit(257): " + sumFirstAndLastDigit(257)); // Expected: 9
        System.out.println("sumFirstAndLastDigit(0): " + sumFirstAndLastDigit(0));     // Expected: 0
        System.out.println("sumFirstAndLastDigit(5): " + sumFirstAndLastDigit(5));     // Expected: 10
        System.out.println("sumFirstAndLastDigit(-1010): " + sumFirstAndLastDigit(-1010)); // Expected: -1
    }


}
