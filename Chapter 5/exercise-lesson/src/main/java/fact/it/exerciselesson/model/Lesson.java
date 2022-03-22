package fact.it.exerciselesson.model;


public class Lesson {
    private String courseName;
    private String room;
    private TimeSlot timeSlot;

    public Lesson(String courseName, String room, TimeSlot timeSlot) {
        this.courseName = courseName;
        this.room = room;
        this.timeSlot = timeSlot;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String showLesson() {
        return this.timeSlot.showTimeSlot() + ": " + this.courseName + " in room " + this.room;
    }
}
