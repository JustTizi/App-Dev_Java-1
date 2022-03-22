package fact.it.exerciselesson.model;

public class TimeSlot {
    private String day;
    private int block;

    public TimeSlot() {
        this.day = "Monday";
        this.block = 1;
    }

    public TimeSlot(String day, int block) {
        this.day = day;
        this.block = block;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public String showTimeSlot() {
        return this.day + ", block " + this.block;
    }
}
