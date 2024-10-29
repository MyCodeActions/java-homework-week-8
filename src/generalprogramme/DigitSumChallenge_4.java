package generalprogramme;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */
public class DigitSumChallenge_4 {

    public static void main(String[] args) {
        // Test cases for sumDigits method
        System.out.println("Sum of digits in 125: " + sumDigits(125));
        System.out.println("Sum of digits in 1: " + sumDigits(1));
        System.out.println("Sum of digits in 0: " + sumDigits(0));
        System.out.println("Sum of digits in 999: " + sumDigits(999));
        System.out.println("Sum of digits in -123: " + sumDigits(-123));
    }

    // Creating static method
    public static int sumDigits(int number) {
        // Check if number is less than 10 or negative
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // Process each digit and add it to the sum
        while (number > 0) {

            sum = sum + number % 10; // Extract the last digit and add it to sum
            number = number / 10;       // Remove the last digit from number
        }

        return sum;
    }
}

