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
public class MedicineDTO {


        private Long id;
        private String name;
        private int quantity;
        private LocalDate expiryDate;
        private Long pharmacyId;



}
