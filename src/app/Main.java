package app;

import java.util.List;
import java.util.Scanner;

import domain.Patient;
import exception.EntittyNotFoundException;
import repository.InMemoryPatientRepository;
import repository.PatientRepository;
import service.ClinicService;
import repository.InMemoryDoctorRepository;
import repository.DoctorRepository;

public class Main {
    public static void main(String[] args) {
        PatientRepository patientRepo = new InMemoryPatientRepository();
        DoctorRepository doctorRepo = new InMemoryDoctorRepository();
        ClinicService clinicService = new ClinicService(patientRepo, doctorRepo);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Clinic managing system");

        while (true) {
            System.out.println("\n1. Create patient's entry:");
            System.out.println("2. Read all patients:");
            System.out.println("3. Delete patient's entry");
            System.out.println("4. Find patient by name");
            System.out.println("5. Find patient by insurance number");
            System.out.println("6. Write medical history");
            System.out.println("7. Show medical history");
            System.out.println("8. Register doctor:");
            System.out.println("9. Read all doctors:");
            System.out.println("10. Book an appointment:");
            System.out.println("11. Show all appointments:");
            System.out.println("12. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Insurance Number: ");
                        String ins = scanner.nextLine();

                        clinicService.registerPatient(id, name, ins);
                        System.out.println("Successfully added");
                        break;
                    case 2:
                        System.out.println("List of patients:");
                        clinicService.getAllPatients().forEach(p -> System.out.println(p.getId() + ": " + p.getName()));
                        break;
                    case 3:
                        System.out.print("Write ID to delete: ");
                        int delId = scanner.nextInt();
                        clinicService.removePatient(delId);
                        System.out.println("Eliminated.");
                        break;
                    case 4:
                        System.out.print("Who to find? (Name): ");
                        String searchName = scanner.nextLine();
                        List<Patient> found = clinicService.findPatientsByName(searchName);
                        if (found.isEmpty()) {
                            System.out.println("No such entry.");
                        } else {
                            found.forEach(p -> System.out.println("Found: " + p.getName()));
                        }
                        break;
                    case 5:
                        System.out.print("Patient's insurance number: ");
                        String searchIns = scanner.nextLine();
                        List<Patient> foundIns = clinicService.findPatientsByInsuranceNumber(searchIns);
                        if (foundIns.isEmpty()) {
                            System.out.println("No such entry.");
                        } else {
                            foundIns.forEach(p -> System.out.println("Found: " + p.getName()));
                        }
                        break;
                    case 6:
                        System.out.print("Patient's ID: ");
                        int pId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Write diagnosis: ");
                        String diag = scanner.nextLine();
                        System.out.print("Date (dd,mm,yy.): ");
                        String date = scanner.nextLine();
                        System.out.print("Description: ");
                        String desc = scanner.nextLine();

                        clinicService.addMedicalRecord(pId, diag, date, desc);
                        System.out.println("Record added to medical history");
                        break;
                    case 7:
                        System.out.print("Patient's ID: ");
                        int viewId = scanner.nextInt();
                        Patient p = patientRepo.findById(viewId);
                        if (p != null) {
                            System.out.println("Patient's medical history: " + p.getName() + ":");
                            p.getMedicalHistory().forEach(System.out::println);
                        } else {
                            System.out.println("Patient not found.");
                        }
                        break;
                    case 8:
                        System.out.print("Doctor's ID: ");
                        int dId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Doctor's name: ");
                        String dName = scanner.nextLine();
                        System.out.print("Specialization: ");
                        String spec = scanner.nextLine();

                        clinicService.registerDoctor(dId, dName, spec);
                        System.out.println("Doctor successfully added to staff!");
                        break;
                    case 9:
                        System.out.println("List of doctors:");
                        clinicService.getAllDoctors().forEach(d -> System.out.println(d.getId() + ": " + d.getName()));
                        break;
                    case 10:
                        System.out.println("Appointment booking");
                        System.out.print("Appointment's ID: ");
                        int appId = scanner.nextInt();
                        System.out.print("Patient's ID: ");
                        int pSelId = scanner.nextInt();
                        System.out.print("Doctor's ID: ");
                        int dSelId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Date and time: ");
                        String dt = scanner.nextLine();

                        try {
                            clinicService.scheduleAppointment(appId, pSelId, dSelId, dt);
                            System.out.println("Appointment created!");
                        } catch (EntittyNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 11:
                        System.out.println("All appointments");
                        clinicService.getAllAppointments().forEach(System.out::println);
                        break;
                    case 12:
                        System.out.println("Shutting down...");
                        return;

                    default:
                        System.out.println("Invalid input!");
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
