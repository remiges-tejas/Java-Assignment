/* 05: Write a program to prompt the user for 2 inputs: num1 and num2 and generate a sum of two
numbers as output. The program must accept only whole numbers (positive or negative) or
throw an error. The output shall be “num1=<num1> num2=<num2> sum=<result>” where
“<num1>”, “<num2>” and “<result>” will be replaced with actual value.  */

import java.util.Scanner;
import utilities.InputHandler.WholeNumberValidator;
import utilities.Opearation.ArithmaticOperation.ArithematicOpearation;

public class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WholeNumberValidator wholeNumberValidator = new WholeNumberValidator();

        System.out.println("Enter a whole number 1:");
        // Input for the first whole number using validation
        int num1 = wholeNumberValidator.validateWholeNumber(scanner);

        System.out.println("Enter a whole number 2 :");
        // Input for the second whole number using validation
        int num2 = wholeNumberValidator.validateWholeNumber(scanner);

        // Creating an instance of ArithmaticOperation which consist wholenumberadd
        ArithematicOpearation arithematicOpearation = new ArithematicOpearation(num1, num2);

        // Perform addition
        int result = arithematicOpearation.addWholeNumber();

        // Output the result
        System.out.printf("num1=%d num2=%d sum=%d%n", num1, num2, result);

        scanner.close();
    }
}
