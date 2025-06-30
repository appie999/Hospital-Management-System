package com.hsm.Hospital.Management.System.Entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity

public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private Double amount;
    private Date date;

    @ManyToOne
    private Patient patient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Invoice(Long id, Double amount, Date date, Patient patient) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.patient = patient;
    }

    public Invoice() {
    }
}
