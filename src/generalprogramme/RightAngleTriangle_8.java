package generalprogramme;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class RightAngleTriangle_8 {

    // Declaring static variable
    static int rows = 5;

    // Calling triangle method for printing triangle
    public static void main(String[] args) {
        triangle();
    }

    // Creating method for printing triagle
    public static void triangle() {

        for (int i = 1; i <= rows; i++) { // Outer loop for each row
            for (int j = 1; j <= i; j++) { // Inner loop for printing '@'
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
