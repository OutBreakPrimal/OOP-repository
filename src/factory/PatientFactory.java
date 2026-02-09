package factory;

import domain.Patient;

public class PatientFactory {
    public static Patient createPatient(int id, String name, String insuranceNumber) {
        return new Patient(id, name, insuranceNumber);
    }
}
