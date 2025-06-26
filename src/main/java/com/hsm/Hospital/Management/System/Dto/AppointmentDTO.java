package com.hsm.Hospital.Management.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    private Long id;
    private LocalDate date;
    private String status;
    private Long patientId;
    private Long doctorId;
}

