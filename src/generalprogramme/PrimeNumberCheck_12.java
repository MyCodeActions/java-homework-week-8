package generalprogramme;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,17.. are the prime numbers.)
 */
public class PrimeNumberCheck_12 {

    // calling method to check number is prime or not
    public static void main(String[] args) {
        checkingIsPrime();
    }

    // Creating boolean method to check given number is prime or not
    public static boolean isPrime(int number) {
        // Check if number is less than 2, which are not prime numbers
        if (number <= 1) {
            return false;
        }

        // Check divisors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { // If number is divisible by i, it is not prime
                return false;
            }
        }
        return true; // Number is prime if no divisors found
    }

    // Getting input from user to check prime number
    public static void checkingIsPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
