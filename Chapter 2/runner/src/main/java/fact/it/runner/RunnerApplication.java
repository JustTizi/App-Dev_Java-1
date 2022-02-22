package fact.it.runner;

import org.springframework.boot.SpringApplication;
import fact.it.runner.model.Runner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args);
        // write code starting after this line

        Runner myRunner = new Runner();
        myRunner.setName("Tyson Gay");
        myRunner.setAge(37);
        myRunner.setBestPerformance(9.58);

        System.out.println("You created a Runner-object with the following values:");
        System.out.println(myRunner.getName() + " (" + myRunner.getAge() + " years), best performance on the 100m = " + myRunner.getBestPerformance());
        System.out.println("this runner achieved " + myRunner.getSpeed() + "km/h on the 100 m sprint");
        System.exit(0);
    }

}
