import service.AppointmentService;
import service.BillingService;
import service.DoctorService;
import service.PatientService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService();
        BillingService billingService = new BillingService();

        while (true) {
            System.out.println("\n=== ClinicCare Main Menu ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Schedule Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Generate Bill");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> patientService.addPatient();
                case 2 -> patientService.viewPatients();
                case 3 -> doctorService.addDoctor();
                case 4 -> doctorService.viewDoctors();
                case 5 -> appointmentService.scheduleAppointment();
                case 6 -> appointmentService.viewAppointments();
                case 7 -> {
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter consultation fee: R");
                    double consultFee = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter medication cost: R");
                    double meds = Double.parseDouble(scanner.nextLine());
                    billingService.generateBill(name, consultFee, meds);
                }
                case 8 -> {
                    System.out.println("Exiting application.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}