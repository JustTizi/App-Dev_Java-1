package fact.it.exerciselesson;

import fact.it.exerciselesson.model.Lesson;
import fact.it.exerciselesson.model.TimeSlot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseLessonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseLessonApplication.class, args);

        TimeSlot timeSlot = new TimeSlot("Thursday", 3);
        Lesson myLesson = new Lesson("IOT Essentials", "P108Z", timeSlot);

        System.out.println("Course name: " + myLesson.getCourseName());
        System.out.println("Where: " + myLesson.getRoom());
        System.out.println("When: " + myLesson.getTimeSlot().showTimeSlot());

        System.exit(0);
    }

}
