package fact.it.exline.model;

public class Line {
    private int thickness;
    private int beginningX;
    private int beginningY;
    private int endX;
    private int endY;

    public Line() {
        this.thickness = 1;
        this.beginningX = 0;
        this.beginningY = 0;
        this.endX = 1;
        this.endY = 1;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getBeginningX() {
        return beginningX;
    }

    public void setBeginningX(int beginningX) {
        this.beginningX = beginningX;
    }

    public int getBeginningY() {
        return beginningY;
    }

    public void setBeginningY(int beginningY) {
        this.beginningY = beginningY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void makeThinner() {
        this.thickness -= 1;
    }

    public void makeThicker() {
        this.thickness += 1;
    }

    public String showCharacteristics() {
        return "Line starts at (" + this.beginningX + "," + this.beginningY + "), line ends at (" + this.endX + "," + this.endY + ") and the thickness is: " + this.thickness;
    }
}
