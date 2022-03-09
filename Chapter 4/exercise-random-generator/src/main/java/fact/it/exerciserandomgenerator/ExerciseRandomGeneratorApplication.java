package fact.it.exerciserandomgenerator;

import fact.it.exerciserandomgenerator.model.RandomGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseRandomGeneratorApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseRandomGeneratorApplication.class, args);

        RandomGenerator myNumberGen = new RandomGenerator(-50, 100);
        System.out.println("Random numbers between -50 and 50");
        for (int i = 0; i < 10; i++) {
            System.out.print(myNumberGen.getRandom() + " ");
        }

        System.exit(0);
    }

}
