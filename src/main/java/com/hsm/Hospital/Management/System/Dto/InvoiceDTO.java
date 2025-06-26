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

public class InvoiceDTO {

        private Long id;
        private Double amount;
        private Date date;
        private Long patientId;

}
