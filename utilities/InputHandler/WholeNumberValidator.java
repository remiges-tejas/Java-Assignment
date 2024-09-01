package utilities.InputHandler;

import java.util.Scanner;

public class WholeNumberValidator {

    public int validateWholeNumber(Scanner sc) {
        int input = 0;
        while (true) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                break; // Exit loop after valid input
            } else {
                System.out.println("Please enter a valid Whole number.");
                sc.next(); // Consume the invalid input
            }
        }
        return input;
    }

}
