package com.hsm.Hospital.Management.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PharmacyDTO {

        private Long id;
        private List<Long> medicineIds;

}
