package service;

import models.Appointment;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentService {
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void scheduleAppointment() {
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        appointments.add(new Appointment(patientName, doctorName, date));
        System.out.println("Appointment scheduled.");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment a : appointments) {
                System.out.println(a);
            }
        }
    }
}

