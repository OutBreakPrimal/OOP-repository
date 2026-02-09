package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Patient;

public class InMemoryPatientRepository implements PatientRepository {
    private Map<Integer, Patient> patients = new HashMap<>();

    @Override
    public void add(Patient patient) {
        patients.put(patient.getId(), patient);
    }

    @Override
    public Patient findById(int id) {
        return patients.get(id);
    }

    @Override
    public List<Patient> findAll() {
        return new ArrayList<>(patients.values());
    }

    @Override
    public void delete(int id) {
        patients.remove(id);
    }
}
