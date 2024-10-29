package generalprogramme;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitSum_11 {

    // Calling getEvenDigitSum method
    public static void main(String[] args) {
        // Test cases for getEvenDigitSum method
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    // Creating method for even digit sum
    public static int getEvenDigitSum(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        // Loop through each digit in the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            if (digit % 2 == 0) {    // Check if the digit is even
                sum = sum + digit;        // Add the even digit to the sum
            }
            number = number / 10; // Remove the last digit
        }
        return sum;
    }
}
