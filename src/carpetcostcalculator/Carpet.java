package carpetcostcalculator;

/**
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 */
public class Carpet {

    private double cost;

    // Declaring Constructor with parameter and use ternary operator
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    // Method to get the cost
    public double getCost() {
        return cost;
    }
}
