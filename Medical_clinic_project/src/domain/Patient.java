package domain;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private String insuranceNumber;
    private List<MedicalRecord> medicalHistory;

    public Patient(int id, String name, String insuranceNumber) {
        super(id, name);
        this.insuranceNumber = insuranceNumber;
        this.medicalHistory = new ArrayList<>();
    }

    public void addRecord(MedicalRecord record) {
        this.medicalHistory.add(record);
    }

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
}
