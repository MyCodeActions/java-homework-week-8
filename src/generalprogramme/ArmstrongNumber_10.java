package generalprogramme;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class ArmstrongNumber_10 {

    // Getting input from user and check number is armstrong or not using calling method inside if-else
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }

    // Creating static boolean method
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the cubes of each digit
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum = sum + digit * digit * digit; // Add cube of the digit to sum
            number = number / 10; // Remove the last digit
        }

        // Check if the sum of cubes of digits equals the original number
        return sum == originalNumber;
    }
}
