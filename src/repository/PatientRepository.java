package repository;

import java.util.List;

import domain.Patient;

public interface PatientRepository {
    void add(Patient patient);

    Patient findById(int id);

    List<Patient> findAll();

    void delete(int id);
}
