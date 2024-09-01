package utilities.DisplayDate;

import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class PrintDate {

    // DateTime format Constant
    public static DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd MMM yyyy");
    public static DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
    public static DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DateTimeFormatter format4 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
    public static DateTimeFormatter format5 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

    public void printDateFormat(ZonedDateTime date) {
        // printing the date and time according to the format
        System.out.println(date.format(format1));
        System.out.println(date.format(format2));
        System.out.println(date.format(format3));
        System.out.println(date.format(format4));
        System.out.println(date.format(format5));
    }

}
