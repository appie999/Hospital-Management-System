package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.DoctorDto;
import com.hsm.Hospital.Management.System.Entity.Doctor;
import com.hsm.Hospital.Management.System.Mapper.DoctorMapper;
import com.hsm.Hospital.Management.System.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DoctorMapper doctorMapper;


    public DoctorDto getDoctorById(Long id){
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Doctor not found"));
        return doctorMapper.toDTO(doctor);
    }

    public List<DoctorDto> getAllDoctors(){
        return doctorRepository.findAll().stream().map(doctor -> doctorMapper.toDTO(doctor)).toList();
    }

    public DoctorDto saveDoctor(DoctorDto doctorDto){
        return doctorMapper.toDTO(doctorRepository.save(doctorMapper.toEntity(doctorDto)));
    }

    public DoctorDto editDoctor(Long id, DoctorDto doctorDto){
        Doctor doctor = doctorRepository.findById(id).get();
        doctor.setUserName(doctorDto.getUserName());
        doctor.setPassWord(doctorDto.getUserName());
        doctor.setEmail(doctorDto.getEmail());
        doctor.setRole(doctorDto.getRole());
        doctor.setFirstName(doctorDto.getFirstName());
        doctor.setLastName(doctorDto.getLastName());
        doctor.setSpeciality(doctorDto.getSpeciality());

        return doctorMapper.toDTO(doctorRepository.save(doctor));
    }

    public void deleteDoctor(Long id){
        doctorRepository.deleteById(id);
    }
}
