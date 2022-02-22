package fact.it.student.model;

public class Student {

    private String name;
    private char level;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        if (level == 'S' || level == 'M' || level == 'E'){
            this.level = level;
        }
        else {
            this.level = 'S';
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <= 6 && grade >= 1) {
            this.grade = grade;
        }
        else {
            this.grade = 1;
        }
    }

    public void increaseGrade() {
        if (this.getGrade() < 6) {
            this.grade++;
        }
    }

    public String getLevelExplained() {
        if (this.getLevel() == 'S') {
            return "Starting level";
        }
        else if (this.getLevel() == 'M') {
            return "Middle level";
        }
        else {
            return "End level";
        }
    }

    public Student() {
    }
}
