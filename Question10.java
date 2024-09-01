// 10. Extend (8) to support “sort” operation. Use an in-built function call for sorting numbers.

// importing the util package
import java.util.*;

import utilities.InputHandler.IntegerListValidator;
import utilities.Opearation.StatisticalOperation.StatisticalOperation;

// Define the class
public class Question10 {

    public static void displayMethodGuide() {
        System.out.println(
                "To perform an operation:\nPress 'sort': Sorting Elements\nPress 'count': Count Elements\nPress 'min': Find Minimum Element\nPress 'max': Find Maximum Element\nPress 'max': Find Maximum Element\nPress 'mean': Find Mean of Elements\nPress 'all' : exexute all above  methods");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        // creating object of IntegerListValidator That Validate the Input
        IntegerListValidator integerListValidator = new IntegerListValidator(list);
        integerListValidator.takeInputAndValidate(sc); // Validate Input

        // Creating Instance Of StasticalOpearation that Consist Methods Implementation
        StatisticalOperation statisticalOperation = new StatisticalOperation(integerListValidator);

        displayMethodGuide(); // display the Operation Information

        // taking input from the user
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
            case "sort":
                System.out.print("Sorted List is : " + statisticalOperation.sortList());
                break;
            case "all":
                System.out.println("Count is: " + statisticalOperation.getCount());
                System.out.println("Maximum Element is: " + statisticalOperation.findMax());
                System.out.println("Minimum Element is: " + statisticalOperation.findMin());
                System.out.printf("Mean is: %.2f ", statisticalOperation.getMean());
                System.out.println();
                System.out.println("Sorted Elements are : " + statisticalOperation.sortList());
                break;
            default:
                System.out.println("Invalid method name. Please enter a valid option.");
        }

    }
}
