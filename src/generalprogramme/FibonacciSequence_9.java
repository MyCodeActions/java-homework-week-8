package generalprogramme;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciSequence_9 {

    // Calling method to generate a Fibonacci sequence based on user input
    public static void main(String[] args) {
        fibonacciSequenceByUserInput();
    }

    // Creating method for the Fibonacci sequence
    public static void fibonacciSequenceByUserInput() {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Variables to store the previous two numbers in the sequence
        int first = 1, second = 1;

        System.out.print("Fibonacci Sequence: ");

        // Generate the Fibonacci sequence up to n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}
