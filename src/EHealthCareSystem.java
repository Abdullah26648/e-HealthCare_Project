import java.util.ArrayList;
import java.util.Scanner;

class EHealthCareSystem {
    private ArrayList<Patient> patients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        System.out.print("Enter patient ID:");
        String id = scanner.next();

        System.out.print("Enter patient name:");
        String name = scanner.next();

        System.out.print("Enter patient age:");
        int age = scanner.nextInt();

        Patient newPatient = new Patient(id, name, age);
        patients.add(newPatient);
        System.out.println("Patient added successfully.");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    public void searchPatient() {
        System.out.print("Enter patient ID to search:");
        String searchId = scanner.next();

        for (Patient patient : patients) {
            if (patient.getId().equals(searchId)) {
                System.out.println("Patient found:\n" + patient);
                return;
            }
        }

        System.out.println("Patient not found.");
    }
}