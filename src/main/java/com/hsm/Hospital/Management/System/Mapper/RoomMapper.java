package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.RoomDTO;
import com.hsm.Hospital.Management.System.Entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    @Mapping(source = "assignedPatient.id", target = "assignedPatientId")
    RoomDTO toDTO(Room room);
    @Mapping(target = "assignedPatient.id", source = "assignedPatientId")
    Room toEntity(RoomDTO dto);
}

