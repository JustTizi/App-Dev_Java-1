package fact.it.exercisestudent;

import fact.it.exercisestudent.model.DormStudent;
import fact.it.exercisestudent.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseStudentApplication.class, args);

        Student laura = new Student("Laura Wilkens", "r0689478");
        laura.setMajor("Applied Informatics");
        laura.setAddress("Veldstraat 4 - 2200 Herentals");

        DormStudent ben = new DormStudent("Ben Lievens", "r075163", "Hoofdstraat 33 - 2440 Geel");
        ben.setMajor("Electronics-ICT");
        ben.setAddress("Langstraat 9 - 2150 Borsbeek");
        ben.setDormLandlord("Maurice Geuns");

        System.out.println(laura);
        System.out.println(ben);

        System.exit(0);

    }

}
