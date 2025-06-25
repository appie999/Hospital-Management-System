package com.hsm.Hospital.Management.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
