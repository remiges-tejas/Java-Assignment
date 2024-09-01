
/* Write a program to print current date/time in following formats (one line per format) in UTC
time e.g. “16 Mar 2022” “Mar 16, 2022” “2022-03-16” “2022-03-16T15:52:00Z” “Tuesday, 16
March 2022” */

// Importing packages
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import utilities.DisplayDate.PrintDate;

// Define the class
public class Question14 {
    public static void main(String[] args) {

        // Get the current UTC date and time
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);

        // creating instance of PrintDate
        PrintDate printDate = new PrintDate();

        // calling method that print the date in all format
        printDate.printDateFormat(utcNow);

    }
}
