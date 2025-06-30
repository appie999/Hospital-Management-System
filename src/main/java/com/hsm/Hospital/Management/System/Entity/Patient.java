package com.hsm.Hospital.Management.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


import java.util.Date;
import java.util.List;

@Entity

public class Patient extends User{

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String medicalHistory;


    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "patient")
    private List<LabTest> labTests;

    @OneToOne(mappedBy = "assignedPatient")
    private Room room;

    public Patient(Long id, String userName, String passWord, String email, Role role, String firstName, String lastName, Date dateOfBirth, String medicalHistory, List<Appointment> appointments, List<Invoice> invoices, List<LabTest> labTests, Room room) {
        super(id, userName, passWord, email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.medicalHistory = medicalHistory;
        this.appointments = appointments;
        this.invoices = invoices;
        this.labTests = labTests;
        this.room = room;
    }

    public Patient(String firstName, String lastName, Date dateOfBirth, String medicalHistory, List<Appointment> appointments, List<Invoice> invoices, List<LabTest> labTests, Room room) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.medicalHistory = medicalHistory;
        this.appointments = appointments;
        this.invoices = invoices;
        this.labTests = labTests;
        this.room = room;
    }

    public Patient(Long id, String userName, String passWord, String email, Role role) {
        super(id, userName, passWord, email, role);
    }

    public Patient() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<LabTest> getLabTests() {
        return labTests;
    }

    public void setLabTests(List<LabTest> labTests) {
        this.labTests = labTests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
