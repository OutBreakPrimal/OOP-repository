package factory;

import domain.Doctor;

public class DoctorFactory {
    public static Doctor createDoctor(int id, String name, String specialization) {
        return new Doctor(id, name, specialization);
    }
}
