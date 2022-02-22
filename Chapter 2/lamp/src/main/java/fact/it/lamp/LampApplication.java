package fact.it.lamp;

import org.springframework.boot.SpringApplication;
import fact.it.lamp.model.Lamp;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LampApplication {

    public static void main(String[] args) {
        SpringApplication.run(LampApplication.class, args);
        // write code starting after this line

        Lamp myLamp = new Lamp();
        myLamp.setBrand("Osram");
        myLamp.setPower(8);

        System.out.println("You created a Lamp-object with following values:");
        System.out.println(myLamp.getBrand() + " - " + myLamp.getPower() + " Watt(" + myLamp.showPowerInTermsOfStars()+")");


        System.exit(0);
    }

}
