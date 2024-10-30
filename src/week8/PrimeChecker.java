package week8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeChecker {
    public boolean isPrime(int number) {
        // Check for numbers less than 2
        if (number <= 1) {
            return false; // Numbers less than 2 are not prime
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }

        return true; // If no factors found, it is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Create an instance of PrimeChecker
        PrimeChecker checker = new PrimeChecker();

        // Check if the number is prime and print the result
        if (checker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close(); // Close the scanner
    }
}
