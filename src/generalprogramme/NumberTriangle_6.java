package generalprogramme;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg. Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class NumberTriangle_6 {

    // Calling printTriangleByNumber method
    public static void main(String[] args) {
        printTriangleByNumber();
    }

    // Getting input from user for print rows for triangle
    public static void printTriangleByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        scanner.close();

        // Outer loop to iterate over each row
        for (int i = 1; i <= rows; i++) {

            // Inner loop to print numbers from 1 up to the current row number i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
