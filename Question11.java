/* 11. Extend (9) to support “countodd” and “counteven” operations to respectively print number of
times odd numbers and number of even numbers found within the list. */

// import package
import java.util.*;
import utilities.InputHandler.IntegerListValidator;
import utilities.Opearation.StatisticalOperation.StatisticalOperation;

// Define the class
public class Question11 {
    public static void displayMethodGuide() {
        System.out.println(
                "To perform an operation:\nPress 'countodd': Count Odd Elements\nPress 'counteven': Count Even Elements\nPress 'sort': Sorting Elements\nPress 'count': Count Elements\nPress 'min': Find Minimum Element\nPress 'max': Find Maximum Element\nPress 'max': Find Maximum Element\nPress 'mean': Find Mean of Elements\nPress 'all' : exexute all above  methods");
    }

    public static void main(String[] args) {

        // Creating an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // Define the list
        List<Integer> list = new ArrayList<>();

        // creating instace of Validate11 class
        IntegerListValidator integerListValidator = new IntegerListValidator(list);
        integerListValidator.takeInputAndValidate(sc);

        // Creating Instance Of StasticalOpearation that Consist Methods Implementation
        StatisticalOperation statisticalOperation = new StatisticalOperation(integerListValidator);

        displayMethodGuide(); // display the operation

        // taking opearation input from the user
        System.out.println("Enter the method name to perform:");
        String methodInput = sc.nextLine();

        // calling method that user enter through input
        switch (methodInput.toLowerCase()) {
            case "counteven":
                System.out.println("Even Element Count is :" + statisticalOperation.countEvenElements());
                break;
            case "countodd":
                System.out.println("Odd Element Count is :" + statisticalOperation.countOddElements());
                break;
            case "count":
                System.out.println(" Total Element Count is: " + statisticalOperation.getCount());
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
                System.out.println("Even Element Count is :" + statisticalOperation.countEvenElements());
                System.out.println("Odd Element Count is :" + statisticalOperation.countOddElements());
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
