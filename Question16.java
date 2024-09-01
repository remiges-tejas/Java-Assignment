
/* 16. Extend (14) to print supported timezones, and accept a valid timezone as input and print
time as per the time zone selected by an end user. */

// importing package
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

import utilities.DisplayDate.PrintDate;
import utilities.Opearation.CalenderOperation.CalenderOperation;

// define the class
public class Question16 {
    public static void main(String[] args) {
        // creating instace of scanner class
        Scanner sc = new Scanner(System.in);

        // define the set
        Set<String> zonesIds = new HashSet<>();

        CalenderOperation calenderOperation = new CalenderOperation(zonesIds);
        PrintDate printDate = new PrintDate();

        // displying all the zone
        calenderOperation.DisplayTimeZone();

        // taking input zone
        System.out.print("Please enter a Valid timezone: ");
        String selectedZone = sc.nextLine();

        try {
            // finding the timzone for zoneid
            ZonedDateTime timeInSelectedZone = ZonedDateTime.now(ZoneId.of(selectedZone));
            // calling method that print the date in various format
            printDate.printDateFormat(timeInSelectedZone);

        } catch (Exception e) {
            System.out.println("Invalid timezone entered.");
        } finally {
            sc.close();
        }
    }
}
