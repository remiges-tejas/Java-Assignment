package utilities.InputHandler;

import java.util.Scanner;

public class FloatNumberValidator {

    public double validatefloatNumber(Scanner sc) {
        double input = 0.0;
        while (true) {
            System.out.println("Enter the Number:");
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                break; // Exit loop after valid input
            } else {
                System.out.println("Please Enter a Valid Number.");
                sc.next(); // Consume the invalid input
            }
        }
        return input;
    }

}
