
// 06. Write a program same as (4) above, but accept floating point numbers. [Data types, 2

// importing the Scanner class
import java.util.Scanner;
import utilities.InputHandler.FloatNumberValidator;
import utilities.Opearation.ArithmaticOperation.ArithematicOpearation;

public class Question06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FloatNumberValidator floatNumberValidator = new FloatNumberValidator();

        // Input for the first floating-point number using validation
        double num1 = floatNumberValidator.validatefloatNumber(scanner);

        // Input for the second floating-point number using validation
        double num2 = floatNumberValidator.validatefloatNumber(scanner);

        // Creating an instance of ArithmaticOperation which consist method
        ArithematicOpearation arithematicOpearation = new ArithematicOpearation(num1, num2);

        // Perform addition
        double result = arithematicOpearation.add();

        // Output the result

        System.out.printf("num1=%.2f num2=%.2f sum=%.2f%n", num1, num2, result);
        scanner.close();
    }
}
