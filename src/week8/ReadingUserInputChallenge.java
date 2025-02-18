package week8;

import java.util.Scanner;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers
 * Use hasNextInt() method from the scanner to check if the user entered  an int value
 * if hasNextInt() returns false, print the message "Invalid number", continue reading until you have read 10 numbers
 *
 * Before the user enter each number, print the message "Enter number #X:" where X represent the count 1, 2, 3 ...
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        while(count <= 10) {
            System.out.println("Enter number #" + count +" : ");

            boolean validateNumber = scanner.hasNextInt();
            // Check if the user input is an integer
            if(validateNumber) {
                int number = scanner.nextInt();
                sum += number; //Add the valid integer to the sum
                count++;  // Move to the next count for valid input
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        // Close the scanner
        scanner.close();





    }
}
