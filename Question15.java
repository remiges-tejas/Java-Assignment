/* 15. Extend (13) to print time in IST timezone.  */

// importing the packages
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import utilities.DisplayDate.PrintDate;

import java.time.ZoneId;

//define the class
public class Question15 {
    public static void main(String[] args) {

        // define the zonedatetime
        ZonedDateTime istNow = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // creating instance of PrintDate
        PrintDate printDate = new PrintDate();

        // calling method that print the date in all format
        printDate.printDateFormat(istNow);
    }
}
