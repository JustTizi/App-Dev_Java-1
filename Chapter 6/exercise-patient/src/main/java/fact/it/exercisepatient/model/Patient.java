package fact.it.exercisepatient.model;

public class Patient extends Person {
    private String nationalNumber;

    public Patient(String name, String nationalNumber) {
        super(name);
        this.nationalNumber = nationalNumber;
    }

    public Patient(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " (national number: " + this.nationalNumber + ")";
    }
}
