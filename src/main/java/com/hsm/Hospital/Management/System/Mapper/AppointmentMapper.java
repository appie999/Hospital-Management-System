package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.AppointmentDTO;
import com.hsm.Hospital.Management.System.Entity.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
    AppointmentDTO toDTO(Appointment appointment);
    Appointment toEntity(AppointmentDTO dto);
}

