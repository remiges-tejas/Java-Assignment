package utilities.Opearation.CalenderOperation;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;

import java.time.DayOfWeek;

import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;

public class CalenderOperation {

    private LocalDateTime date1;
    private LocalDateTime date2;

    private LocalDate startDate;
    private LocalDate endDate;

    Set<String> zoneIds = new HashSet<>();

    public CalenderOperation(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // define the default constructor
    public CalenderOperation() {
    }

    // Constructor to initialize dates
    public CalenderOperation(LocalDateTime date1, LocalDateTime date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    // Constructor to initialize dates
    public CalenderOperation(Set<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    // Method to calculate the difference between the two dates
    public String calculateDateDifference() {
        Duration duration = Duration.between(date1, date2);
        long years = duration.toDays() / 365;
        long days = duration.toDays() % 365;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;

        // for Storing the result
        StringBuilder result = new StringBuilder();

        if (years > 0) {
            result.append(years).append(" year").append(years > 1 ? "s" : "").append(" ");
        }
        if (days > 0) {
            result.append(days).append(" day").append(days > 1 ? "s" : "").append(" ");
        }
        if (hours > 0) {
            result.append(hours).append(" hour").append(hours > 1 ? "s" : "").append(" ");
        }
        if (minutes > 0) {
            result.append(minutes).append(" minute").append(minutes > 1 ? "s" : "");
        }
        return result.toString();
    }

    // Method that Display the time Zone
    public void DisplayTimeZone() {
        System.out.println("Available timezones:");
        zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);
    }

    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to Count Weekdays
    public int countWeekendDays(LocalDate startDate, LocalDate endDate) {
        int weekendCount = 0;
        LocalDate date = startDate;

        while (!date.isAfter(endDate)) {
            if (date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7) {
                weekendCount++;
            }
            date = date.plusDays(1);
        }
        return weekendCount;
    }

}
