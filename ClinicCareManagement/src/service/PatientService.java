package service;

import models.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientService {
    private ArrayList<Patient> patients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        patients.add(new Patient(name, age, gender));
        System.out.println("Patient added successfully.");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }
}
