package fact.it.exercisetextanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fact.it.exercisetextanalyzer.model.TextAnalyzer;

@SpringBootApplication
public class ExerciseTextAnalyzerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseTextAnalyzerApplication.class, args);

        TextAnalyzer myAnalyzer = new TextAnalyzer();

        myAnalyzer.setText("we should not allow more than 250 students in our school");

        System.out.println("The text is: " + myAnalyzer.getText());
        System.out.println("In piglatin: " + myAnalyzer.pigLatin() + "\n");

        System.out.println("Total number of letters in the text is: " + myAnalyzer.countLetters());
        System.out.println("Total number of digits in the text is: " + myAnalyzer.countDigits());


        System.exit(0);
    }

}
