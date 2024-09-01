package utilities.InputHandler;
// Define class HandleInput that handles input

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleListValidator {
    // define list
    public List<Double> list = new ArrayList<>();

    // define the constructor
    public DoubleListValidator(List<Double> list) {
        this.list = list;
    }

    // define method that validate user input
    public List<Double> InputValidate(Scanner sc) {
        // defining a variable
        boolean isValid = true;
        String input = "";
        // print statemnt to take input
        System.out.println("Enter the Number [ Enter proceed to exit]");
        while (isValid) {
            try {
                input = sc.nextLine(); // take input from user
                if (input.equalsIgnoreCase("proceed")) { // logic that break the loop
                    isValid = false;
                } else {
                    list.add(Double.parseDouble(input)); // converting the string to Double
                }

                // handle input
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return list; // return the sum of elements
    }

}
