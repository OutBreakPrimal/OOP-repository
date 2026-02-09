package repository;

import java.util.List;

import domain.Doctor;

public interface DoctorRepository {
    void add(Doctor doctor);

    Doctor findById(int id);

    List<Doctor> findAll();

    void delete(int id);
}
