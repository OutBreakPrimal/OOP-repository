package domain;

public class Appointment {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String dateTime;

    public Appointment(int id, Patient patient, Doctor doctor, String dateTime) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return String.format("Appointment №%d: Patient %s -> Doctor %s (%s) at %s",
                id, patient.getName(), doctor.getName(), doctor.getSpecialization(), dateTime);
    }
}
