/* 20. Write a program to accept two dates and print the count of week-end days (Consider
Saturdays and Sundays as week-ends). */

// importing package
import java.time.LocalDate;
import java.util.Scanner;

import utilities.InputHandler.DateInputParser;
import utilities.Opearation.CalenderOperation.CalenderOperation;

//define class
public class Question20 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateInputParser dateInputParser = new DateInputParser();

        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String inputStartDate = scanner.nextLine();
        LocalDate startDate = dateInputParser.parseDate(inputStartDate);
        if (startDate == null)
            return;

        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String inputEndDate = scanner.nextLine();
        LocalDate endDate = dateInputParser.parseDate(inputEndDate);
        if (endDate == null)
            return;

        // creating the obejct of calender Opearation
        CalenderOperation calenderOperation = new CalenderOperation(startDate, endDate);

        // Ensure startDate is before endDate
        if (startDate.isAfter(endDate)) {
            System.out.println("Start date must be before end date.");
            return;
        }

        // Count weekend days
        int weekendDays = calenderOperation.countWeekendDays(startDate, endDate);

        System.out.println("Number of weekend days (Saturdays and Sundays) between " + startDate + " and " + endDate
                + ": " + weekendDays);

        scanner.close();

    }
}
