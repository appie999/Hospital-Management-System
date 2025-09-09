package com.hsm.Hospital.Management.System.controllerActors;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/doctor")
@PreAuthorize("hasRole('DOCTOR')")
public class DoctorControler {

    @GetMapping("/dashboard")
    public Map<String, Object> dashboard() {
        return Map.of("title","Doctor Dashboard","todayAppointments", 7);
    }

    @GetMapping("/appointments")
    public List<Map<String,String>> appointments() {
        return List.of(
                Map.of("time","10:00","patient","Jean Dupont"),
                Map.of("time","10:30","patient","Sophia Bernard")
        );
    }
}
