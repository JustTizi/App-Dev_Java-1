package fact.it.spell;

import org.springframework.boot.SpringApplication;
import fact.it.spell.model.Spell;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpellApplication.class, args);
        // write code starting after this line

        Spell mySpell = new Spell();
        mySpell.setText("pass");

        mySpell.echo();
        mySpell.echo();

        System.out.println("You created a Spell-object with the following values:");
        System.out.println("The text = " + mySpell.getText() + " and " + mySpell.getNumberOperations() + " operations were performed on it");

        System.exit(0);
    }

}
