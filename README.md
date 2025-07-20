# 🏥 ClinicCare Console - Java SE Project

## 📌 Overview

**ClinicCare Console** is a simple Java SE (Standard Edition) console application designed for small clinic environments. It helps clinic staff manage patients, doctors, and appointments directly from the terminal without the need for a graphical interface.

This system is ideal for educational purposes and showcases the application of Object-Oriented Programming (OOP), Java Collections, File I/O, and Exception Handling in a real-world scenario.

---

## 🎯 Features

- ✅ Register New Patients  
- 📋 View Patient Records  
- 🗓 Schedule and View Appointments  
- 👨‍⚕️ Manage Doctor Profiles  
- 💊 Add Prescriptions (optional)  
- 📄 Basic Billing System (optional)  
- 💾 Data Persistence via File I/O  

---

## 🏗 Project Structure

ClinicCare/
│
├── Main.java
├── models/
│ ├── Patient.java
│ ├── Doctor.java
│ ├── Appointment.java
│ └── Prescription.java
├── services/
│ ├── PatientService.java
│ ├── DoctorService.java
│ ├── AppointmentService.java
│ └── BillingService.java
├── utils/
│ └── FileUtils.java
└── data/
├── patients.txt
├── doctors.txt
└── appointments.txt
