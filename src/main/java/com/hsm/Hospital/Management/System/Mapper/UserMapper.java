package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.DoctorDto;
import com.hsm.Hospital.Management.System.Dto.UserDto;
import com.hsm.Hospital.Management.System.Entity.Doctor;
import com.hsm.Hospital.Management.System.Entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDTO(User user);
    User toEntity(UserDto dto);

}
