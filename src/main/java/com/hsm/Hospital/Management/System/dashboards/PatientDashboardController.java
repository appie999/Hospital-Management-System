package com.hsm.Hospital.Management.System.dashboards;

import com.hsm.Hospital.Management.System.Dto.AppointmentDTO;
import com.hsm.Hospital.Management.System.Repository.AppointmentRepository;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import com.hsm.Hospital.Management.System.security.AuthUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/patient/dashboard")
@RequiredArgsConstructor
public class PatientDashboardController {

    private final PatientRepository patientRepo;
    private final AppointmentRepository appointmentRepo;

    private Long currentPatientId() {
        String email = AuthUtils.currentUserEmail();
        if (email == null) throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
        return patientRepo.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.FORBIDDEN, "Patient introuvable"))
                .getId();
    }

    @PreAuthorize("hasRole('PATIENT')")
    @GetMapping("/summary")
    public Map<String, Object> summary() {
        Long pid = currentPatientId();

        var all   = appointmentRepo.findByPatientIdOrderByDateDesc(pid);
        long today = appointmentRepo.countByPatientIdAndDate(pid, LocalDate.now());

        List<AppointmentDTO> latest = all.stream()
                .limit(3)
                .map(a -> new AppointmentDTO(
                        a.getId(),
                        a.getDate(),
                        a.getStatus(),
                        a.getPatient() != null ? a.getPatient().getId() : null,
                        a.getDoctor()  != null ? a.getDoctor().getId()  : null
                ))
                .toList();

        Map<String, Object> res = new HashMap<>();
        res.put("totalAppointments", all.size());
        res.put("todayAppointments", today);
        res.put("latest", latest);
        return res;
    }

    @PreAuthorize("hasRole('PATIENT')")
    @GetMapping("/appointments")
    public List<AppointmentDTO> myAppointments() {
        Long pid = currentPatientId();
        return appointmentRepo.findByPatientIdOrderByDateDesc(pid)
                .stream()
                .map(a -> new AppointmentDTO(
                        a.getId(),
                        a.getDate(),
                        a.getStatus(),
                        a.getPatient() != null ? a.getPatient().getId() : null,
                        a.getDoctor()  != null ? a.getDoctor().getId()  : null
                ))
                .toList();
    }
}
