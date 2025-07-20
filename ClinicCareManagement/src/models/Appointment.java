package models;

public class Appointment {
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    public String toString() {
        return "Appointment: " + patientName + " with Dr. " + doctorName + " on " + date;
    }
}

