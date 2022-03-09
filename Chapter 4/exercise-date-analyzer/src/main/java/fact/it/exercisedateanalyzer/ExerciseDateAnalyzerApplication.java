package fact.it.exercisedateanalyzer;

import fact.it.exercisedateanalyzer.model.DateAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseDateAnalyzerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseDateAnalyzerApplication.class, args);

        DateAnalyzer myDateA = new DateAnalyzer("1/9/2003");

        System.out.println("You were born on: " + myDateA.getDate());
        System.out.println("Day of the month: " + myDateA.getNumberedDayOfTheMonth());
        System.out.println("Day of year: " + myDateA.getNumberedDayOfTheYear());
        System.out.println("Weekday: " + myDateA.getDayOfWeek());
        System.out.println("Month: " + myDateA.getMonth());
        System.out.println("On that day you were 100 days old: " + myDateA.get100DaysOld());
        System.out.println("On that day you were 10 months old: " + myDateA.get10MonthsOld());


        System.exit(0);
    }

}
