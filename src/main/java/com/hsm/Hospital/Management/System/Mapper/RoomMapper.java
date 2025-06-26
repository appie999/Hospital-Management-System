package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.RoomDTO;
import com.hsm.Hospital.Management.System.Entity.Room;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomMapper {
    RoomDTO toDTO(Room room);
    Room toEntity(RoomDTO dto);
}

