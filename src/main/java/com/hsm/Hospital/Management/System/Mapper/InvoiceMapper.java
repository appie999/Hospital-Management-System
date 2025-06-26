package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Entity.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceDTO toDTO(Invoice invoice);
    Invoice toEntity(InvoiceDTO dto);
}

