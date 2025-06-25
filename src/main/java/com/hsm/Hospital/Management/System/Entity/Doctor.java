package com.hsm.Hospital.Management.System.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends User {

    private String firstName;
    private String lastName;
    private String speciality;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
