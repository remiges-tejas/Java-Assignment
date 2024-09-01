package utilities.Opearation.ArithmaticOperation;

public class ArithematicOpearation {

    // Declaring double instance variables to hold the numbers
    private double num1;
    private double num2;

    // Declaring double instance variables to hold the numbers
    private int number1;
    private int number2;

    // Constructor to initialize the Calculator with two numbers
    public ArithematicOpearation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Constuctor Overloading for int value
    public ArithematicOpearation(int number1, int number2) {
        this.number1 = number1;
        this.num2 = number2;
    }

    // // Method to add the two numbers
    public int addWholeNumber() {
        return number1 + number2;
    }

    // Method to perform addition
    public double add() {
        return num1 + num2;
    }

    // Method to perform subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Method to perform multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Method to perform division, handling divide-by-zero errors
    public double divide() {
        try {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

}
