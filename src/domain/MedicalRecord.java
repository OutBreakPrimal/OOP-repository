package domain;

public class MedicalRecord {
    private String diagnosis;
    private String date;
    private String description;

    public MedicalRecord(String diagnosis, String date, String description) {
        this.diagnosis = diagnosis;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[" + date + "] Diagnosis: " + diagnosis + " (Description: " + description + ")";
    }
}