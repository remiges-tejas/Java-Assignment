package utilities.InputHandler;

import java.util.Scanner;

public class ArithmeticInputValidator {

    public double ValidatedDoubleInput(Scanner sc) {
        double num;
        while (true) {
            System.out.print("Please enter a number (integer or double): ");
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                sc.nextLine(); // Clear the newline character from the buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Clear the invalid input
            }
        }
        return num;
    }

}
