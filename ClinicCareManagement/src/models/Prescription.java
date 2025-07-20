package models;

public class Prescription {
    private String patientName;
    private String medication;
    private String dosage;

    public Prescription(String patientName, String medication, String dosage) {
        this.patientName = patientName;
        this.medication = medication;
        this.dosage = dosage;
    }

    public String toString() {
        return patientName + " | Medication: " + medication + " | Dosage: " + dosage;
    }
}
