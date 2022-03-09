package fact.it.exerciserandomgenerator.model;

import java.util.Random;

public class RandomGenerator {
    private int smallest;
    private int number;

    public int getSmallest() {
        return smallest;
    }

    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRandom() {
        Random rand = new Random();
        return rand.nextInt(this.smallest, (this.number + this.smallest));
    }

    public RandomGenerator() {
        this.smallest = 1;
        this.number = 5;
    }

    public RandomGenerator(int smallest, int number) {
        this.smallest = smallest;
        this.number = number;
    }
}
