package week8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class ArmstrongNumberChecker {
    // Method to check if a number is an Armstrong number
    public boolean isArmstrong(int number) {
        int originalNumber = number; // Store the original number
        int sum = 0;
        int digits = String.valueOf(number).length(); // Calculate the number of digits

        // Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power of digits
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Create an instance of ArmstrongNumberChecker
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();

        // Check if the number is an Armstrong number and print the result
        if (checker.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close(); // Close the scanner
    }
}
