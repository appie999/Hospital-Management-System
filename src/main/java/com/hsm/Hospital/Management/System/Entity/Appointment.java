package com.hsm.Hospital.Management.System.Entity;


import jakarta.persistence.*;


import java.time.LocalDate;

@Entity

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private LocalDate date;
    private String status;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Appointment(Long id, LocalDate date, String status, Patient patient, Doctor doctor) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.patient = patient;
        this.doctor = doctor;
    }

    public Appointment() {
    }
}
