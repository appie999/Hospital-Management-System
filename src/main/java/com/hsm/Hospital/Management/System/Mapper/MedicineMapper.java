package com.hsm.Hospital.Management.System.Mapper;

import com.hsm.Hospital.Management.System.Dto.MedicineDTO;
import com.hsm.Hospital.Management.System.Entity.Medicine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicineMapper {
    MedicineDTO toDTO(Medicine medicine);
    Medicine toEntity(MedicineDTO dto);
}

