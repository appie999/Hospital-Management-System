package com.hsm.Hospital.Management.System.Dto;

import com.hsm.Hospital.Management.System.Entity.Role;


import java.util.Date;



public class PatientDTO extends UserDto {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String medicalHistory;

    public PatientDTO(Long id, String userName, String passWord, String email, Role role, String firstName, String lastName, Date dateOfBirth, String medicalHistory) {
        super(id, userName, passWord, email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.medicalHistory = medicalHistory;
    }

    public PatientDTO(String firstName, String lastName, Date dateOfBirth, String medicalHistory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.medicalHistory = medicalHistory;
    }

    public PatientDTO() {
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
}

