package fact.it.exline;

import fact.it.exline.model.Line;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExLineApplication.class, args);
        // write code starting after this line
        Line myLine = new Line();
        Line mySecondLine = new Line();

        myLine.makeThicker();
        mySecondLine.makeThinner();

        System.out.println("1st Line: " + myLine.showCharacteristics());
        System.out.println("2nd Line: " + mySecondLine.showCharacteristics());

        System.exit(0);
    }

}
