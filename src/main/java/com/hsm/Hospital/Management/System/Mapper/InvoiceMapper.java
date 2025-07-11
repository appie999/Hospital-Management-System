package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {

    @Mapping(source = "patient.id", target = "patientId")
    InvoiceDTO toDTO(Invoice invoice);

    @Mapping(target = "patient.id", source = "patientId")
    Invoice toEntity(InvoiceDTO dto);
}

