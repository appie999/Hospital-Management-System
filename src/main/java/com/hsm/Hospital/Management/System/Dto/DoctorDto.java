package com.hsm.Hospital.Management.System.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto extends UserDto {

        private String firstName;
        private String lastName;
        private String speciality;


}
