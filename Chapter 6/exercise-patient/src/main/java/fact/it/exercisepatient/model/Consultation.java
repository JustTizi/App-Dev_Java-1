package fact.it.exercisepatient.model;

import java.time.LocalDate;

public class Consultation {
    private Doctor doctor;
    private Patient patient;

    public Consultation(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String toString() {
        LocalDate now = LocalDate.now();
        return "Doctor: " + this.doctor + "\nPatient: " + this.patient + "\nConsultation: " + now;
    }
}
