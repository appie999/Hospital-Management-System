package com.hsm.Hospital.Management.System.Dto;

import java.util.List;

public class PatientHistoryDto {
    private String firstName;
    private String lastName;
    private String medicalHistory;
    private List<?> labTests;  // نرجّعهم كما هم بشكل بسيط
    private List<?> invoices;

    public PatientHistoryDto(String firstName, String lastName, String medicalHistory, List<?> labTests, List<?> invoices) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalHistory = medicalHistory;
        this.labTests = labTests;
        this.invoices = invoices;
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

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<?> getLabTests() {
        return labTests;
    }

    public void setLabTests(List<?> labTests) {
        this.labTests = labTests;
    }

    public List<?> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<?> invoices) {
        this.invoices = invoices;
    }
}
