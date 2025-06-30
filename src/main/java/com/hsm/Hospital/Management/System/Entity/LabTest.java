package com.hsm.Hospital.Management.System.Entity;


import jakarta.persistence.*;


@Entity

public class LabTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String testName;
    private String result;

    @ManyToOne
    private Patient patient;

    public LabTest(Long id, String testName, String result, Patient patient) {
        this.id = id;
        this.testName = testName;
        this.result = result;
        this.patient = patient;
    }

    public LabTest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
