package models;

public class Doctor {
    private String name;
    private String specialty;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String toString() {
        return name + " | Specialty: " + specialty;
    }
}
