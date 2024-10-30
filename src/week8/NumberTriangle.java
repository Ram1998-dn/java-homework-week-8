package week8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 */
public class NumberTriangle {
    public void displayTrianglePattern(int rows) {
        for (int i = 1; i <= rows; i++) {     // Loop through each row
            for (int j = 1; j <= i; j++) {     // Loop through each column in the row
                System.out.print(j);           // Print the current number
            }
            System.out.println();              // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Create an instance of the NumberTriangle class
        NumberTriangle triangle = new NumberTriangle();

        // Call the instance method to display the triangle pattern
        triangle.displayTrianglePattern(rows);

        scanner.close();
    }
}
