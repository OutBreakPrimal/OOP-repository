package service;

import java.util.ArrayList;
import java.util.List;

import domain.Appointment;
import domain.Doctor;
import domain.MedicalRecord;
import domain.Patient;
import exception.EntittyNotFoundException;
import factory.PatientFactory;
import factory.DoctorFactory;
import repository.DoctorRepository;
import repository.PatientRepository;

public class ClinicService {
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public ClinicService(PatientRepository patientRepository, DoctorRepository doctorRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    public void registerDoctor(int id, String name, String spec) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Doctor's name cannot be empty");
        }
        Doctor doctor = DoctorFactory.createDoctor(id, name, spec);
        doctorRepository.add(doctor);
    }

    public void registerPatient(int id, String name, String insurance) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Patient's name cannot be empty");
        }
        Patient patient = PatientFactory.createPatient(id, name, insurance);
        patientRepository.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public void removePatient(int id) throws EntittyNotFoundException {
        if (patientRepository.findById(id) == null) {
            throw new EntittyNotFoundException("Patient", id);
        }
        patientRepository.delete(id);
    }

    public void removeDoctor(int id) throws EntittyNotFoundException {
        if (doctorRepository.findById(id) == null) {
            throw new EntittyNotFoundException("Doctor", id);
        }
        doctorRepository.delete(id);
    }

    public List<Patient> findPatientsByName(String name) {
        return patientRepository.findAll().stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public List<Patient> findPatientsByInsuranceNumber(String insuranceNumber) {
        return patientRepository.findAll().stream()
                .filter(p -> p.getInsuranceNumber().toLowerCase().contains(insuranceNumber.toLowerCase()))
                .toList();
    }

    public List<Doctor> findDoctorsByName(String name) {
        return doctorRepository.findAll().stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public void addMedicalRecord(int patientId, String diagnosis, String date, String desc)
            throws EntittyNotFoundException {
        Patient patient = patientRepository.findById(patientId);
        if (patient == null) {
            throw new EntittyNotFoundException("Patient", patientId);
        }
        patient.addRecord(new MedicalRecord(diagnosis, date, desc));
    }

    private final List<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(int appId, int patientId, int doctorId, String dateTime)
            throws EntittyNotFoundException {
        Patient patient = patientRepository.findById(patientId);
        Doctor doctor = doctorRepository.findById(doctorId);

        if (patient == null)
            throw new EntittyNotFoundException("Patient", patientId);
        if (doctor == null)
            throw new EntittyNotFoundException("Doctor", doctorId);

        Appointment appointment = new Appointment(appId, patient, doctor, dateTime);
        appointments.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}
