package week8;

/**
 * Display left angle triangle of * using nested for loops
 */
public class LeftAngleTriangle {
    // Method to print a left-angle triangle pattern
    public static void printLeftAngleTriangle(int rows) {
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // Adjust spaces to align the stars
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }

    public static void main(String[] args) {
        int rows = 5; // You can change this value for a larger or smaller triangle
        printLeftAngleTriangle(rows); // Call the method to print the triangle
    }
}
