package service;

import models.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class DoctorService {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter specialty: ");
        String specialty = scanner.nextLine();

        doctors.add(new Doctor(name, specialty));
        System.out.println("Doctor added successfully.");
    }

    public void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor d : doctors) {
                System.out.println(d);
            }
        }
    }
}
