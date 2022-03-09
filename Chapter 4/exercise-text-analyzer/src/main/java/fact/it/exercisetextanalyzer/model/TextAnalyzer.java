package fact.it.exercisetextanalyzer.model;

public class TextAnalyzer {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String pigLatin() {
        String[] allWords = this.text.split(" ");
        String pigSay = "";

        for (int i = 0; i < allWords.length - 1; i++) {
            allWords[i] = allWords[i].substring(1,allWords[i].length()-1) + allWords[i].substring(0,1) + "ay";
            pigSay += allWords[i];

        }
        return pigSay;
    }

    public int countLetters() {

    }

    public int countDigits() {

    }

    public TextAnalyzer() {
    }
}
