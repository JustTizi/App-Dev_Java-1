package fact.it.student;

import fact.it.student.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class StudentApplicationTests {

    @Test
    public void testConstructor() {

        Student student = new Student();

        assertNull(student.getName());
        assertEquals(0, student.getGrade());
        // assertEquals('', student.getLevel());

    }


    @Test
    public void testSetGrade() {
        Student student = new Student();
        student.setGrade(5);
        assertEquals(5, student.getGrade());

    }


    @Test
    public void testSetGradeTooLow() {
        Student student = new Student();
        student.setGrade(-1);
        assertEquals(1, student.getGrade());

    }


    @Test
    public void testSetGradeTooHigh() {
        Student student = new Student();
        student.setGrade(7);
        assertEquals(1, student.getGrade());

    }


    @Test
    public void testSetName() {
        Student student = new Student();
        student.setName("Lemnis");
        assertEquals("Lemnis", student.getName());
    }


    @Test
    public void testSetLevel() {
        Student student = new Student();
        student.setLevel('E');
        assertEquals('E', student.getLevel());
    }


    @Test
    public void testSetLevelWrong() {
        Student student = new Student();
        student.setLevel('Q');
        assertEquals('S', student.getLevel());
    }


    @Test
    public void testIncreaseGrade() {
        Student student = new Student();
        student.setGrade(2);
        student.increaseGrade();
        assertEquals(3, student.getGrade());
        student.increaseGrade();
        assertEquals(4, student.getGrade());
    }


    @Test
    public void testIncreaseGradeTooHigh() {
        Student student = new Student();
        student.setGrade(5);
        student.increaseGrade();
        assertEquals(6, student.getGrade());
    }


    @Test
    public void testGetLevelExplainedS() {
        Student student = new Student();
        student.setLevel('S');
        assertEquals("Starting level", student.getLevelExplained());
    }
    @Test
    public void testGetLevelExplainedM() {
        Student student = new Student();
        student.setLevel('M');
        assertEquals("Middle level", student.getLevelExplained());
    }
    @Test
    public void testGetLevelExplainedE() {
        Student student = new Student();
        student.setLevel('E');
        assertEquals("End level", student.getLevelExplained());
    }

    @Test
    public void testGetLevelExplainedFout() {
        Student student = new Student();
        student.setLevel('X');
        assertEquals("Starting level", student.getLevelExplained());
    }


}

