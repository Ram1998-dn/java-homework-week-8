package week8;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class DiamondPattern {
    public static void printDiamond(int rows) {
        int i = 0;

        // Print the upper part of the diamond
        while (i < rows) {
            // Print leading spaces
            int spaces = rows - i - 1; // Number of leading spaces
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            j = 0; // Reset inner loop counter for stars
            while (j < (2 * i + 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i++;
        }

        // Print the lower part of the diamond
        i = rows - 2; // Start from the second last row of the upper part
        while (i >= 0) {
            // Print leading spaces
            int spaces = rows - i - 1; // Number of leading spaces
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            j = 0; // Reset inner loop counter for stars
            while (j < (2 * i + 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i--;
        }
    }

    public static void main(String[] args) {
        int rows = 7; // You can change this value for different sizes
        printDiamond(rows); // Call the method to print the diamond pattern
    }
}
