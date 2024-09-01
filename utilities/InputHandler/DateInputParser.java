package utilities.InputHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Class responsible for parsing date strings
public class DateInputParser {
    // Taking DateTime Format For Question 17

    private static final DateTimeFormatter DATETIMEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Taking DateTime Format For Question 18
    private static final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Method to parse date string into LocalDate
    public LocalDate parseDate(String dateInput) {
        try {
            return LocalDate.parse(dateInput, DATEFORMATTER);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use 'dd-MM-yyyy'.");
            return null;
        }
    }

    // Method to parse date string into LocalDate
    public LocalDateTime parseDateTime(String dateInput) {
        try {
            return LocalDateTime.parse(dateInput, DATETIMEFORMATTER);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use 'dd-MM-yyyy'.");
            return null;
        }
    }
}