/* 09. Extend (7) to accept statistical operation instead of “proceed”. Valid values for “<operation>”
are count (to count number of valid numbers), mean value, minimum value (minimum of all
numbers input), maximum value (maximum of all numbers input). */

import java.util.*;

import utilities.InputHandler.IntegerListValidator;
import utilities.Opearation.StatisticalOperation.StatisticalOperation;

public class Question09 {

    public static void displayMethodGuide() {
        System.out.println(
                "To perform an operation:\nPress 'count': Count Elements\nPress 'min': Find Minimum Element\nPress 'max': Find Maximum Element\nPress 'max': Find Maximum Element\nPress 'mean': Find Mean of Elements\nPress 'all' : exexute all above  methods");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating instace of scanner

        List<Integer> list = new ArrayList<>(); // define list

        // creating the instace of class and calling input validation method that take
        // input
        IntegerListValidator integerListValidator = new IntegerListValidator(list);
        integerListValidator.takeInputAndValidate(sc);

        // creating the instance of class that consisit method implementation
        StatisticalOperation statisticalOperation = new StatisticalOperation(integerListValidator);

        // creating the instance of opearation class and calling different method
        displayMethodGuide();

        System.out.println("Enter the method name to perform:");
        String input = sc.nextLine();

        switch (input.toLowerCase()) {
            case "count":
                System.out.println("Count is: " + statisticalOperation.getCount());
                break;
            case "max":
                System.out.println("Maximum Element is: " + statisticalOperation.findMax());
                break;
            case "min":
                System.out.println("Minimum Element is: " + statisticalOperation.findMin());
                break;
            case "mean":
                System.out.println("Mean is: " + statisticalOperation.getMean());
                break;
            case "all":
                System.out.println("Count is: " + statisticalOperation.getCount());
                System.out.println("Maximum Element is: " + statisticalOperation.findMax());
                System.out.println("Minimum Element is: " + statisticalOperation.findMin());
                System.out.printf("Mean is: %.2f ", statisticalOperation.getMean());
                break;
            default:
                System.out.println("Invalid method name. Please enter a valid option.");
        }

        sc.close();
    }
}
