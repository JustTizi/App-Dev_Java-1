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

        for (int i = 0; i < allWords.length; i++) {
            if (i != allWords.length - 1) {
                pigSay += allWords[i].substring(1,allWords[i].length()) + allWords[i].substring(0,1) + "ay ";
            }
            else {
                pigSay += allWords[i].substring(1,allWords[i].length()) + allWords[i].substring(0,1) + "ay";
            }
        }
        return pigSay;
    }

    public int countLetters() {
        int letterCount = 0;

        for(int i = 0; i < this.text.length(); i++) {
            if(!Character.isDigit(this.text.charAt(i)) && this.text.charAt(i) != ' ') {
                letterCount++;
            }
        }

        return letterCount;
    }

    public int countDigits() {
        int digitCount = 0;

        for(int i = 0; i < this.text.length() - 1; i++) {
            if(Character.isDigit(this.text.charAt(i))) {
                digitCount++;
            }
        }
        
        return digitCount;
    }

    public TextAnalyzer() {
    }
}
