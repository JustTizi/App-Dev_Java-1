package fact.it.spell.model;

public class Spell {
    private String text;
    private int numberOperations;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberOperations() {
        return numberOperations;
    }

    public void echo() {
        this.text += this.getText();
        this.numberOperations = 1 + this.getNumberOperations();
    }

    public void completeWith(String word) {
        this.text = this.getText() + word;
        this.numberOperations = 1 + this.getNumberOperations();
    }

    public void addAt(String word, char location) {
        switch (location) {
            case 'b':
                this.text = this.getText() + word;
                this.numberOperations = 1 + this.getNumberOperations();
                break;
            case 'f':
                this.text = word + this.getText();
                this.numberOperations = 1 + this.getNumberOperations();
                break;
            case 's':
                this.text = word + this.getText() + word;
                this.numberOperations = 1 + this.getNumberOperations();
                break;
            default:
                break;
        }
    }

    public Spell() {

    }
}
