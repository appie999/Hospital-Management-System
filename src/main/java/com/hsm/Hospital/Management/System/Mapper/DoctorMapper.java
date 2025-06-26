package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.DoctorDto;
import com.hsm.Hospital.Management.System.Entity.Doctor;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDTO(Doctor doctor);
    Doctor toEntity(DoctorDto dto);
}

