package fact.it.exrefuelling;

import fact.it.exrefuelling.model.Refuelling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExRefuellingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExRefuellingApplication.class, args);
        // write code starting after this line
        Refuelling myRefuel = new Refuelling(12150, 12975, 55.8);

        System.out.println("Your fuel consumption was " + myRefuel.getFuelConsumption() + " liters.");



        System.exit(0);

    }

}
