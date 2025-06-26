package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.PharmacyDTO;
import com.hsm.Hospital.Management.System.Entity.Pharmacy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PharmacyMapper {
    PharmacyDTO toDTO(Pharmacy pharmacy);
    Pharmacy toEntity(PharmacyDTO dto);
}

