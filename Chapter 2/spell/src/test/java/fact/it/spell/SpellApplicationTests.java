package fact.it.spell;

import fact.it.spell.model.Spell;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class SpellApplicationTests {

    @Test
    public void testConstructor() {

        Spell spell = new Spell();
        assertNull(spell.getText());
        assertEquals(0, spell.getNumberOperations());

    }


    @Test
    public void testEcho() {
        Spell spell = new Spell();
        spell.setText("hallo");

        spell.echo();
        assertEquals("hallohallo", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }

    @Test
    public void testEchoTwice() {
        Spell spell = new Spell();
        spell.setText("hallo");

        spell.echo();
        spell.echo();
        assertEquals("hallohallohallohallo", spell.getText());
        assertEquals(2, spell.getNumberOperations());
    }
    @Test
    public void testCompleteWith() {
        Spell spell = new Spell();
        spell.setText("hallo");

        spell.completeWith("student");
        assertEquals("hallostudent", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }


    @Test
    public void testaddAt_String() {
        Spell spell = new Spell();
        spell.setText("hallo");
        spell.completeWith("nieuw");
        assertEquals("hallonieuw", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }


    @Test
    public void testaddAt_String_char_b() {
        Spell spell = new Spell();
        spell.setText("hallo");
        spell.addAt("nieuw", 'b');
        assertEquals("hallonieuw", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }


    @Test
    public void testaddAt_String_char_f() {
        Spell spell = new Spell();
        spell.setText("hallo");
        spell.addAt("nieuw", 'f');
        assertEquals("nieuwhallo", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }


    @Test
    public void testaddAt_String_char_s() {
        Spell spell = new Spell();
        spell.setText("hallo");
        spell.addAt("nieuw", 's');
        assertEquals("nieuwhallonieuw", spell.getText());
        assertEquals(1, spell.getNumberOperations());
    }

}
