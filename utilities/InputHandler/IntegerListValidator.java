package utilities.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerListValidator {

   public List<Integer> list = new ArrayList<>();

    public IntegerListValidator(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> takeInputAndValidate(Scanner sc) {
        boolean isValid = true;
        System.out.println("Enter numbers. Type 'proceed' to finish.");
        while (isValid) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("proceed")) {
                isValid = false;
            } else {
                try {
                    list.add(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }
        }
        return list;
    }

}
