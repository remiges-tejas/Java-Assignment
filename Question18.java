/* 18. Write a program to accept a date and print whether the date falls into a leap year. Accept a
date in any format supported in one of the previous problems. */

// importing the package
import java.util.Scanner;
import java.time.LocalDate;

// importing custom package
import utilities.InputHandler.DateInputParser;
import utilities.Opearation.CalenderOperation.CalenderOperation;

// Define the class
public class Question18 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Creating the instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        // Creating an instance of DateInputParser that validates the date
        DateInputParser dateInputParser = new DateInputParser();

        // creating instance of calenderOpearation class

        CalenderOperation calenderOperation = new CalenderOperation();
        // Taking date as input
        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String dateInput = sc.nextLine();

        // Validating and parsing the input
        LocalDate parsedDate = dateInputParser.parseDate(dateInput);
        if (parsedDate == null) {
            // If parsing fails, exit the program
            return;
        }

        // Check if the year is a leap year
        if (calenderOperation.isLeapYear(parsedDate.getYear())) {
            System.out.println(parsedDate.getYear() + " is a leap year.");
        } else {
            System.out.println(parsedDate.getYear() + " is not a leap year.");
        }

        // To avoid resource leak
        sc.close();
    }

}