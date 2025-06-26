package com.hsm.Hospital.Management.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO extends UserDto {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String medicalHistory;
}

