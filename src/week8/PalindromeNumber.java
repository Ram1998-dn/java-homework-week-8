package week8;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 *
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int number){

        int originalNumber = number; // Store the original number for comparison
        int reverse = 0;

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Reverse the number
        while (number > 0){
            int lastDigit = number % 10;         // Extract the last digit
            reverse = reverse * 10 + lastDigit;  // Build the reverse number
            number /= 10;                       // Remove the last digit


        }
        // Check if the original number (absolute value) matches the reversed number
        return Math.abs(originalNumber) == reverse;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method with various inputs
        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221)); // Expected: true
        System.out.println("isPalindrome(2002): " + isPalindrome(2002));     // Expected: true
        System.out.println("isPalindrome(11212): " + isPalindrome(11212)); // Expected: false
        System.out.println("isPalindrome(12321): " + isPalindrome(12321)); // Expected: true
        System.out.println("isPalindrome(-123565321): " + isPalindrome(-12321));
        System.out.println("is Palindrome(-5647657) :" +isPalindrome(-56465));// Expected: true
    }
}
