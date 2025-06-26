package com.hsm.Hospital.Management.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class LabTestDTO {

        private Long id;
        private String testName;
        private String result;
        private Long patientId;

}
