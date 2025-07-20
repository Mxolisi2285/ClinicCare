package service;

public class BillingService {
    public void generateBill(String patientName, double consultationFee, double medicationCost) {
        double total = consultationFee + medicationCost;
        System.out.println("\n=== Billing Summary ===");
        System.out.println("Patient: " + patientName);
        System.out.println("Consultation Fee: R" + consultationFee);
        System.out.println("Medication Cost: R" + medicationCost);
        System.out.println("Total Due: R" + total);
    }
}
