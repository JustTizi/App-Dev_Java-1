package fact.it.exercisecircle.model;

public class Circle {
    private double radius;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void enlargeRadius(double amount) {
        this.radius += amount;
    }

    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    public double getArea() {
        return Math.PI *  Math.pow(this.radius, 2);
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
