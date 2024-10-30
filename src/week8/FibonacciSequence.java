package week8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciSequence {
    public void printFibonacci() {
        int first = 1;  // First Fibonacci number
        int second = 1; // Second Fibonacci number

        // Print the first two Fibonacci numbers
       // System.out.print(first + " " + second + " "); // Output: 1 1

        // Loop to generate and print the next 6 Fibonacci numbers
        for (int i = 3; i <= 8; i++) {
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next number

            // Update the first and second numbers for the next iteration
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        // Create an instance of FibonacciSequence
        FibonacciSequence fibonacci = new FibonacciSequence();

        // Call the method to print the Fibonacci sequence
        fibonacci.printFibonacci(); // Output: 1 1 2 3 5 8 13 21
    }
}
