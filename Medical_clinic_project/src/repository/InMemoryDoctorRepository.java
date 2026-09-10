package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Doctor;

public class InMemoryDoctorRepository implements DoctorRepository {
    private Map<Integer, Doctor> doctors = new HashMap<>();

    @Override
    public void add(Doctor doctor) {
        doctors.put(doctor.getId(), doctor);
    }

    @Override
    public Doctor findById(int id) {
        return doctors.get(id);
    }

    @Override
    public List<Doctor> findAll() {
        return new ArrayList<>(doctors.values());
    }

    @Override
    public void delete(int id) {
        doctors.remove(id);
    }
}
