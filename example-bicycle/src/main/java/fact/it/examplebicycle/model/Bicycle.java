package fact.it.examplebicycle.model;

public class Bicycle {
    private String type;
    private int year;
    private double rentalPrice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void increasePrice() {
        rentalPrice += 0.5;
    }

    public double getPricePerYear() {
        double pricePerYear = rentalPrice * 12;
        if (year < 2014) {
            pricePerYear *= 0.95;
        }
        return pricePerYear;
    }

    public Bicycle() {
        type = "not defined";
    }
}
