package fact.it.exercisedateanalyzer.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAnalyzer {
    private LocalDate date;

    public int getNumberedDayOfTheYear() {
        return this.date.getDayOfYear();
    }

    public int getNumberedDayOfTheMonth() {
        return this.date.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.from(this.date);
    }

    public Month getMonth() {
        return Month.from(this.date);
    }

    public String get100DaysOld() {
        return this.date.plusDays(100).format(DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    public String get10MonthsOld() {
        return this.date.plusMonths(10).format(DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    public String getDate() {
        return this.date.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    public DateAnalyzer(String date) {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/yyyy"));
    }
}
