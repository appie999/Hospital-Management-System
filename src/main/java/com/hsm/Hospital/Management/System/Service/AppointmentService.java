package com.hsm.Hospital.Management.System.Service;

import com.hsm.Hospital.Management.System.Dto.AppointmentDTO;
import com.hsm.Hospital.Management.System.Entity.Appointment;
import com.hsm.Hospital.Management.System.Mapper.AppointmentMapper;
import com.hsm.Hospital.Management.System.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {


    @Autowired
    private AppointmentMapper mapper;

    @Autowired
    private AppointmentRepository repository;

    public AppointmentDTO saveAppointment(AppointmentDTO appointmentDTO){
        return mapper.toDTO(repository.save(mapper.toEntity(appointmentDTO)));
    }

    public AppointmentDTO getAppointmentById(Long id){
        Appointment appointment = repository.findById(id).orElseThrow(()->new RuntimeException("appointment not found"));
        return mapper.toDTO(appointment);
    }

    public List<AppointmentDTO> getAllAppointment(){
        return repository.findAll().stream().map(appointment -> mapper.toDTO(appointment)).toList();
    }

    public AppointmentDTO editAppointment(Long id, AppointmentDTO dto){
        Appointment appointment = repository.findById(id).get();
        appointment.setId(dto.getId());
        appointment.setDate(dto.getDate());
        appointment.setStatus(dto.getStatus());
        return mapper.toDTO(repository.save(appointment));
    }

    public void deleteAppointment(Long id){
        repository.deleteById(id);
    }
}
