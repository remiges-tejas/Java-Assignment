/* 08 Write a program to prompt for one number at a time, till the user enters “proceed”. Upon
receiving “proceed”, the program shall calculate the sum of all numbers and produce an
output. Ensure that only valid numbers are considered as an input. */

// Importing the Scanner Class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilities.InputHandler.DoubleListValidator; // importing Inputhandler Package
import utilities.Opearation.StatisticalOperation.StatisticalOperation; // Class that consist Statistical Opearation

// Define the class which contains the main method
public class Question08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // define the list
        List<Double> list = new ArrayList<>();

        // Create an instance of checkInputList
        DoubleListValidator doubleListValidator = new DoubleListValidator(list);

        // Call inputValidate method
        doubleListValidator.InputValidate(sc);

        // creating instance of StatisticalOperation to call method which inside it
        StatisticalOperation statisticalOperation = new StatisticalOperation(doubleListValidator);

        // Print the total sum of elements
        System.out.println("Total Sum is :" + statisticalOperation.calculateSum());

        // Close the scanner
        sc.close();
    }
}
