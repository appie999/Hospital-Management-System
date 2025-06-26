package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.PatientDTO;
import com.hsm.Hospital.Management.System.Entity.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toDTO(Patient patient);
    Patient toEntity(PatientDTO dto);
}
