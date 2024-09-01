package utilities.Opearation.StatisticalOperation;

import java.util.Collections;
import java.util.List;

import utilities.InputHandler.DoubleListValidator;
import utilities.InputHandler.IntegerListValidator;;

public class StatisticalOperation {

    // Creating instance of DoubleListValidator
    DoubleListValidator doubleListValidator;

    public StatisticalOperation(DoubleListValidator doubleListValidator) {
        this.doubleListValidator = doubleListValidator;

    }

    // Method to caluculate the sum
    public double calculateSum() {
        double sum = 0.0;
        sum = doubleListValidator.list.stream().mapToDouble(Double::doubleValue).sum();
        return sum;
    }

    // Creating instance of IntegerListValidator
    IntegerListValidator integerListValidator;

    // Constructor to initialize the list
    public StatisticalOperation(IntegerListValidator integerListValidator) {
        this.integerListValidator = integerListValidator;
    }

    // Method to Calculate Maximum Element
    public int findMax() {
        return integerListValidator.list.isEmpty() ? 0 : Collections.max(integerListValidator.list);
    }

    // Method to Calculate Minumum Element
    public int findMin() {
        return integerListValidator.list.isEmpty() ? 0 : Collections.min(integerListValidator.list);
    }

    // Method for Counting Element
    public long getCount() {
        return integerListValidator.list.size();
    }

    // Method To Calculate Mean
    public double getMean() {
        if (integerListValidator.list.isEmpty()) {
            return 0;
        }
        double sum = integerListValidator.list.stream().mapToInt(Integer::intValue).sum();
        return sum / integerListValidator.list.size();
    }

    // Method For Sort the List
    public List<Integer> sortList() {
        Collections.sort(integerListValidator.list);
        return integerListValidator.list;
    }

    // Method for counting even elements
    public long countEvenElements() {
        return integerListValidator.list.stream()
                .filter(n -> n % 2 == 0).count(); // Filter to keep only even numbers
    }

    // Method for counting odd elements and returning
    public long countOddElements() {
        return integerListValidator.list.stream()
                .filter(n -> n % 2 != 0).count(); // Filter to keep only odd numbers
    }

}
