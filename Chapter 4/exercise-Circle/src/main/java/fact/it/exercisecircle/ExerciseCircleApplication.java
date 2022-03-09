package fact.it.exercisecircle;

import fact.it.exercisecircle.model.Circle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseCircleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseCircleApplication.class, args);

        Circle myCircle = new Circle(4.3);

        System.out.println("The circle with radius: " + myCircle.getRadius() +" has\n" + String.format("area = %.2f", myCircle.getArea()) + "\n" + String.format("circumference = %.2f", myCircle.getCircumference()));



        System.exit(0);
    }

}
