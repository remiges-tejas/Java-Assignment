
/* 19. Write a program to accept two dates (any of the supported period) and print an output
whether date1 and date2 are equal, date1 is earlier than date2 or date1 is later than date2. */

// Import necessary packages
import java.time.LocalDate;
import java.util.Scanner;

import utilities.InputHandler.DateInputParser;

// Define the class
public class Question19 {
    public static void main(String[] args) {
        // Creating an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);

        // creating instance of DateInputParser classs that validate date
        DateInputParser dateInputParser = new DateInputParser();

        // taking inputs from the user
        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String inputDate1 = scanner.nextLine();
        LocalDate date1 = dateInputParser.parseDate(inputDate1);
        if (date1 == null)
            return;

        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String inputDate2 = scanner.nextLine();
        LocalDate date2 = dateInputParser.parseDate(inputDate2);
        if (date2 == null)
            return;

        // comparing the two date
        int result = date1.compareTo(date2);
        if (result == 0) {
            System.out.println("The dates are equal.");
        } else if (result < 0) {
            System.out.println("Date1 is earlier than Date2.");
        } else {
            System.out.println("Date1 is later than Date2.");
        }

        scanner.close();
    }
}
