package fact.it.lamp.model;

public class Lamp {
    private String brand;
    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String showPowerInTermsOfStars() {
        String stars = "";
        for (int i = 0; i < this.getPower(); i++) {
            stars += "*";
        }
        return stars;
    }

    public Lamp() {

    }
}
