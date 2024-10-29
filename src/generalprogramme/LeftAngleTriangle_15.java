package generalprogramme;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 */
public class LeftAngleTriangle_15 {

    // Calling method to print triangle
    public static void main(String[] args) {
        triangleMethod();
    }

    // Getting input from user and using for loop created logic to print no. of lines
    public static void triangleMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number that line you want to print triangle : ");
        int rows = scanner.nextInt();


        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print '*'
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
