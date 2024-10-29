package generalprogramme;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */
public class DiamondPattern_14 {

    static int rows = 7; // The total number of rows for the upper half (including the middle)
    static int i = 1; // Starting row

    // Calling both methods for print diamond
    public static void main(String[] args) {
        upperHalfOfDiamond();
        lowerHalfOfDiamond();
    }


    // Crating method for print upper half part of diamond
    public static void upperHalfOfDiamond() {
        // Print upper half of the diamond

        while (i <= rows) {
            // Print leading spaces
            int spaces = rows - i; // Calculate the number of spaces
            int j = 1;
            while (j <= spaces) {
                System.out.print(" "); // Print spaces
                j++;
            }

            // Print stars
            int stars = 2 * i - 1; // Calculate the number of stars
            j = 1;
            while (j <= stars) {
                System.out.print("*"); // Print stars
                j++;
            }

            System.out.println(); // Move to the next line
            i++; // Move to the next row
        }
    }

    // Crating method for print upper lower half of diamond
    public static void lowerHalfOfDiamond() {
        // Print lower half of the diamond
        i = rows - 1; // Start from the row before the middle
        while (i >= 1) {
            // Print leading spaces
            int spaces = rows - i; // Calculate the number of spaces
            int j = 1;
            while (j <= spaces) {
                System.out.print(" "); // Print spaces
                j++;
            }

            // Print stars
            int stars = 2 * i - 1; // Calculate the number of stars
            j = 1;
            while (j <= stars) {
                System.out.print("*"); // Print stars
                j++;
            }

            System.out.println(); // Move to the next line
            i--; // Move to the previous row
        }
    }
}
