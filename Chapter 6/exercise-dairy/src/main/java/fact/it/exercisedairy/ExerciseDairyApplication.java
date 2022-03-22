package fact.it.exercisedairy;

import fact.it.exercisedairy.model.Dairy;
import fact.it.exercisedairy.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseDairyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseDairyApplication.class, args);

        Product coffee = new Product(451278, "Coffee Douwe Egberts", 3.51);

        System.out.println(coffee);

        Dairy yoghurt = new Dairy(719970);
        yoghurt.setName("Yoghurt BioLine");
        yoghurt.setUnitPrice(2.36);
        yoghurt.setNumberOfDays(5);
        yoghurt.setSupplierCode('A');


        System.out.println("Before: " + yoghurt);
        yoghurt.lowerFreshness();
        yoghurt.fastSale(5);

        System.out.println("After: " + yoghurt);

        System.exit(0);

    }

}
