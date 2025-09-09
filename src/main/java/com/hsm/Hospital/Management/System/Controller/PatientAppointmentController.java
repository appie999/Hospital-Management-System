// patient/PatientAppointmentController.java
package com.hsm.Hospital.Management.System.Controller;

import com.hsm.Hospital.Management.System.Dto.AppointmentDTO;
import com.hsm.Hospital.Management.System.Dto.BookAppointmentRequest;
import com.hsm.Hospital.Management.System.Entity.Appointment;
import com.hsm.Hospital.Management.System.Repository.AppointmentRepository;
import com.hsm.Hospital.Management.System.Repository.DoctorRepository;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import com.hsm.Hospital.Management.System.security.AuthUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/patient/appointments")
@RequiredArgsConstructor
public class PatientAppointmentController {

    private final PatientRepository patientRepo;
    private final DoctorRepository doctorRepo;
    private final AppointmentRepository appointmentRepo;

    private Long currentPatientId() {
        String email = AuthUtils.currentUserEmail();
        return patientRepo.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.FORBIDDEN, "Patient introuvable"))
                .getId();
    }

    // حجز موعد
    @PreAuthorize("hasRole('PATIENT')")
    @PostMapping
    public AppointmentDTO book(@RequestBody BookAppointmentRequest req) {
        if (req.getDoctorId() == null || req.getDate() == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "doctorId & date requis");

        if (req.getDate().isBefore(LocalDate.now()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La date doit être >= aujourd'hui");

        var pid = currentPatientId();
        var doctor = doctorRepo.findById(req.getDoctorId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Docteur introuvable"));

        var a = new Appointment();
        a.setDate(req.getDate());
        a.setStatus("PENDING");
        a.setPatient(patientRepo.findById(pid).orElseThrow());
        a.setDoctor(doctor);

        a = appointmentRepo.save(a);
        return new AppointmentDTO(a.getId(), a.getDate(), a.getStatus(), a.getPatient().getId(), a.getDoctor().getId());
    }

    @PreAuthorize("hasRole('PATIENT')")
    @GetMapping
    public List<AppointmentDTO> myAppointments() {
        var pid = currentPatientId();
        return appointmentRepo.findByPatientIdOrderByDateDesc(pid)
                .stream()
                .map(a -> new AppointmentDTO(a.getId(), a.getDate(), a.getStatus(),
                        a.getPatient()!=null?a.getPatient().getId():null,
                        a.getDoctor()!=null?a.getDoctor().getId():null))
                .toList();
    }

    @PreAuthorize("hasRole('PATIENT')")
    @DeleteMapping("/{id}")
    public void cancel(@PathVariable Long id) {
        var pid = currentPatientId();
        var a = appointmentRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (a.getPatient()==null || !a.getPatient().getId().equals(pid))
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        appointmentRepo.deleteById(id);
    }
}
