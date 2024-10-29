package generalprogramme;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class VowelConsonant_3 {

    // Calls findVovelOrConsonant method to check if input is a vowel or consonant
    public static void main(String[] args) {
        findVovelOrConsonant();
    }

    // Creating static method and get input from user
    public static void findVovelOrConsonant() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        // Check if the input is a single character and a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for consistency

            // Check if the character is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            // Print error message if input is not a single alphabet letter
            System.out.println("Error: Please enter a single alphabet letter.");
        }

        scanner.close();
    }
}
