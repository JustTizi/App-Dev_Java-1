package fact.it.runner;

import fact.it.runner.model.Runner;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class RunnerApplicationTests {

    @Test
    public void testConstructor() {

        Runner runner = new Runner();
        assertNull(runner.getName());
        assertEquals(0, runner.getAge());
        assertEquals(0.01, runner.getBestPerformance(), 0.01);
    }




    @Test
    public void testSetName() {
        Runner runner = new Runner();
        runner.setName("Lemnis");
        assertEquals("Lemnis", runner.getName());
    }


    @Test
    public void testSetAge() {
        Runner runner = new Runner();
        runner.setAge(30);
        assertEquals(30, runner.getAge());
    }


    @Test
    public void testSetAgeNegatif() {
        Runner runner = new Runner();
        runner.setAge(-30);
        assertEquals(0, runner.getAge());
    }


    @Test
    public void testSetBestPerformance() {
        Runner runner = new Runner();
        runner.setBestPerformance(9.00);
        assertEquals(9.00, runner.getBestPerformance(), 0.01);
    }


    @Test
    public void testGetSpeed() {
        Runner runner = new Runner();
        runner.setAge(25);
        runner.setBestPerformance(9.69);
        assertEquals(37.15, runner.getSpeed(), 0.01);
    }


}
