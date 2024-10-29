package generalprogramme;

import java.util.Scanner;

/**
 * 2. Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge_2 {


    // Calling static finMinMaxNumber method
    public static void main(String[] args) {
        findMinMaxNumber();
    }

    // Declaring method and get input from user using scanner
    public static void findMinMaxNumber() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // Initialize min to the highest possible value
        int max = Integer.MIN_VALUE; // Initialize max to the lowest possible value
        boolean num = true;

        while (num) {
            System.out.print("Enter number: ");

            // Check if the user input is an integer
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update minimum and maximum if needed
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                // Break the loop if input is invalid
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); // Clear the newline character
        }

        // Display min and max if at least one valid number was entered
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
