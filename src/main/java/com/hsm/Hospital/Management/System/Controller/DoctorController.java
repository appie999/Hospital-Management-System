package com.hsm.Hospital.Management.System.Controller;

import com.hsm.Hospital.Management.System.Dto.DoctorDto;
import com.hsm.Hospital.Management.System.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/")
    public DoctorDto saveDoctor(@RequestBody DoctorDto doctorDto){
        return doctorService.saveDoctor(doctorDto);
    }

    @GetMapping("/{id}")
    public DoctorDto getDoctorById(@PathVariable Long id){
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/")
    public List<DoctorDto> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PutMapping("/{id}")
    public DoctorDto editDoctor(@PathVariable Long id ,@RequestBody DoctorDto doctorDto){
        return doctorService.editDoctor(id, doctorDto);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
        doctorService.deleteDoctor(id);
    }
}
