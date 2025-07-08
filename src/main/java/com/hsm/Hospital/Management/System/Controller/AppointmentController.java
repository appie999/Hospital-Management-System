package com.hsm.Hospital.Management.System.Controller;

import com.hsm.Hospital.Management.System.Dto.AppointmentDTO;
import com.hsm.Hospital.Management.System.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public AppointmentDTO saveAppointment(@RequestBody AppointmentDTO dto){
        return service.saveAppointment(dto);
    }

    @GetMapping("/{id}")
    public AppointmentDTO getAppointmentById(@PathVariable Long id){
        return service.getAppointmentById(id);
    }

    @GetMapping
    public List<AppointmentDTO> getAllAppointment(){
        return service.getAllAppointment();
    }

    @PutMapping("/{id}")
    public AppointmentDTO editAppointment(@PathVariable Long id,@RequestBody AppointmentDTO dto){
        return service.editAppointment(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        service.deleteAppointment(id);
    }

}
