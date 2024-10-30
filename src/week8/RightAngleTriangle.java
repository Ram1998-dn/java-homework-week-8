package week8;
/**
 * Display right angle triangle of @ using nested for loops
 */

import java.util.Scanner;

public class RightAngleTriangle {
    // Method to display the right-angle triangle
    public void displayTriangle(int rows) {
        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the '@' symbols for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print '@' without a new line
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt(); // Read the number of rows

        // Create an instance of RightAngleTriangle class
        RightAngleTriangle triangle = new RightAngleTriangle();

        // Call the method to display the triangle
        triangle.displayTriangle(rows);

        scanner.close(); // Close the scanner
    }
}
