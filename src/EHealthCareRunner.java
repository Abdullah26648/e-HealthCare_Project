import java.util.Scanner;

public class EHealthCareRunner {
    public static void main(String[] args) {
        EHealthCareSystem eHealthCareSystem = new EHealthCareSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nE-Health Care System Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    eHealthCareSystem.addPatient();
                    break;
                case 2:
                    eHealthCareSystem.viewPatients();
                    break;
                case 3:
                    eHealthCareSystem.searchPatient();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}