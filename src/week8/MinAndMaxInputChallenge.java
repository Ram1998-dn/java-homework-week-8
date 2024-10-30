package week8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        checkMinAndMaxInputChallenge();
    }

    public static void checkMinAndMaxInputChallenge() {

        Scanner scanner = new Scanner(System.in);
        Integer min = null; // Initialize min as null to handle first input properly
        Integer max = null; // Initialize max as null to handle first input properly

        while (true) {
            System.out.print("Enter number: ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update min and max based on the first valid input
                if (min == null || number < min) {
                    min = number;
                }
                if (max == null || number > max) {
                    max = number;
                }
            } else {
                // If input is invalid, break out of the loop
                System.out.println("Invalid number.");
                break;
            }

            scanner.nextLine(); // Clear the scanner buffer
        }

        // Display min and max values if they were set
        if (min != null && max != null) {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        } else {
            System.out.println("No valid numbers entered.");
        }

        scanner.close(); // Close the scanner
    }
}

