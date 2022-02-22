package fact.it.lamp;

import fact.it.lamp.model.Lamp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class LampApplicationTests {

    @Test
    public void testConstructor() {
        Lamp lamp = new Lamp();
        assertNull(lamp.getBrand());
        assertEquals(0, lamp.getPower());
    }


    @Test
    public void testSetBrand() {
        Lamp lamp = new Lamp();

        lamp.setBrand("Lemnis");
        assertEquals("Lemnis", lamp.getBrand());
    }


    @Test
    public void testSetPower() {
        Lamp lamp = new Lamp();

        lamp.setPower(25);
        assertEquals(25, lamp.getPower());
    }

    @Test
    public void testShowPowerInTermsOfSTars(){
        Lamp lamp = new Lamp();

        lamp.setPower(5);
        assertEquals("*****", lamp.showPowerInTermsOfStars());

    }

}
