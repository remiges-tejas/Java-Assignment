/* 07 :Extend program (5) to accept 3 inputs: “num1”, “num2” and “operation” where operation
could be “+”, “-”, “*” or “/” to represent sum, difference, multiplication or division. The output
will be output of “num1” <operation> “num2”. The output shall be “num1=<num1>
num2=<num2> <operation>=<result>” where “<operation>” will be replaced by the
operation name. Use “sum”, “difference”, “multiply” and “divide” as an operation name. */

// Importing Scanner class for user input
import java.util.Scanner;

import utilities.InputHandler.ArithmeticInputValidator;
import utilities.Opearation.ArithmaticOperation.ArithematicOpearation;

public class Question07 {
    // Consumer Responsibility

    // Method to display the available operations to the user
    public static void displayOperationGuide() {
        System.out.print(
                "Press + or sum : Addition\nPress - or sub : Subtraction\nPress * or mul : Multiplication\nPress / or div : Division\n ");
    }

    // Method to validate and return a double input from the user

    public static void main(String[] args) {
        // Creating an instance of Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // creating instace of ArithmaticInputHandler Class that handle the input
        ArithmeticInputValidator arithmaticInputHandler = new ArithmeticInputValidator();

        // Getting validated input from the user
        double num1 = arithmaticInputHandler.ValidatedDoubleInput(sc);
        double num2 = arithmaticInputHandler.ValidatedDoubleInput(sc);

        // Creeating instance of Arithmetic Opearartion

        ArithematicOpearation arithematicOpearation = new ArithematicOpearation(num1, num2);

        // Displaying the available operations to the user
        displayOperationGuide();

        // Prompting the user for the operation they want to perform
        System.out.println("Enter the operation:");
        String input = sc.nextLine();

        // Performing the operation based on user input
        switch (input) {
            case "+":
            case "sum":
                System.out
                        .println("num1 = " + num1 + ", num2 = " + num2 + " -> Result: " + arithematicOpearation.add());
                break;
            case "-":
            case "sub":
                System.out.println(
                        "num1 = " + num1 + ", num2 = " + num2 + " -> Result: " + arithematicOpearation.subtract());
                break;
            case "*":
            case "mul":
                System.out.println(
                        "num1 = " + num1 + ", num2 = " + num2 + " -> Result: " + arithematicOpearation.multiply());
                break;
            case "/":
            case "div":
                System.out.print(
                        "num1 = " + num1 + ", num2 = " + num2 + " -> Result: " + arithematicOpearation.divide());
                break;
            default:
                System.out.println("Invalid operation. Please enter a valid operation.");
                break;
        }

        // Closing the scanner to avoid resource leaks
        sc.close();
    }
}
