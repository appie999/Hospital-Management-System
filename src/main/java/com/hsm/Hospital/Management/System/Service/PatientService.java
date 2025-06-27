package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.PatientDTO;
import com.hsm.Hospital.Management.System.Entity.Patient;
import com.hsm.Hospital.Management.System.Mapper.PatientMapper;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private PatientRepository patientRepository;

    public PatientDTO savePatient(PatientDTO patientDTO){
        return patientMapper.toDTO(patientRepository.save(patientMapper.toEntity(patientDTO)));
    }

    public PatientDTO getPatientById(Long id){
        return patientMapper.toDTO(patientRepository.findById(id).orElseThrow(()->new RuntimeException("patient not found")));
    }

    public List<PatientDTO> getAllPatient(){
        return patientRepository.findAll().stream().map(patient->patientMapper.toDTO(patient)).toList();
    }

    public PatientDTO editPatient(Long id , PatientDTO patientDTO){
        Patient patient = patientRepository.findById(id).get();
        patient.setId(patientDTO.getId());
        patient.setUserName(patientDTO.getUserName());
        patient.setPassWord(patientDTO.getPassWord());
        patient.setEmail(patientDTO.getEmail());
        patient.setRole(patientDTO.getRole());
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());
        patient.setDateOfBirth(patientDTO.getDateOfBirth());
        patient.setMedicalHistory(patientDTO.getMedicalHistory());

        return patientMapper.toDTO(patientRepository.save(patient));
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }
}
