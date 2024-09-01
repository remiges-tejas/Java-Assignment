
/* 17. Write a program to accept two dates (any of the formats supported in the earlier problem)
and print a difference in human readable format e.g. “1 year 2 day 32 minutes”. */

// Import necessary packages
import java.time.LocalDateTime;
import java.util.Scanner;
// importing custom package that handle the date operation
import utilities.InputHandler.DateInputParser;
import utilities.Opearation.CalenderOperation.CalenderOperation;

// Define the class
public class Question17 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);
        // class is responsible for validating input date
        DateInputParser dateParser = new DateInputParser();

        System.out.println("Enter the first date (yyyy-MM-dd HH:mm):");
        String inputDate1 = scanner.nextLine();
        LocalDateTime date1 = dateParser.parseDateTime(inputDate1);
        if (date1 == null)
            return;

        System.out.println("Enter the second date (yyyy-MM-dd HH:mm):");
        String inputDate2 = scanner.nextLine();
        LocalDateTime date2 = dateParser.parseDateTime(inputDate2);
        if (date2 == null)
            return;

        // Create an instance of calenderOperation
        CalenderOperation calenderOperation = new CalenderOperation(date1, date2);
        // calling method that calculate the date difference
        String difference = calenderOperation.calculateDateDifference();
        System.out.println("The difference between the two dates is: " + difference);

        // avoid the resource leaks
        scanner.close();

    }
}
