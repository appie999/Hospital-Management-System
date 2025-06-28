package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.PatientDTO;
import com.hsm.Hospital.Management.System.Entity.Patient;
import com.hsm.Hospital.Management.System.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/")
    public PatientDTO savePatient(@RequestBody PatientDTO patientDTO){
        return patientService.savePatient(patientDTO);
    }

    @GetMapping("/")
    public List<PatientDTO> getAllPatients(){
        return patientService.getAllPatient();
    }

    @GetMapping("/{id}")
    public PatientDTO getPatientById(@PathVariable Long id){
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public PatientDTO editPatient(@PathVariable Long id, @RequestBody PatientDTO patientDTO){
        return patientService.editPatient(id, patientDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(Long id){
        patientService.deletePatient(id);
    }

}
