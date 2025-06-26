package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.LabTestDTO;
import com.hsm.Hospital.Management.System.Entity.LabTest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LabTestMapper {
    LabTestDTO toDTO(LabTest labTest);
    LabTest toEntity(LabTestDTO dto);
}

