package fact.it.exthermostat;

import fact.it.exthermostat.model.Thermostat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExThermostatApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExThermostatApplication.class, args);
        // write code starting after this line
        Thermostat myThermostat = new Thermostat(20, 13, 27, 1);
        myThermostat.warmer();
        myThermostat.warmer();

        System.out.println(myThermostat.getTemperature());

        myThermostat.setIncrement(5);
        myThermostat.colder();
        System.out.println(myThermostat.getTemperature());

        myThermostat.warmer(3);
        System.out.println(myThermostat.getTemperature());

        myThermostat.colder(10);
        System.out.println(myThermostat.getTemperature());

        System.exit(0);
    }

}
