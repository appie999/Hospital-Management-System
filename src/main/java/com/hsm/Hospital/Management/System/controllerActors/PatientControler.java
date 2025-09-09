package com.hsm.Hospital.Management.System.controllerActors;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/patient")
@PreAuthorize("hasRole('PATIENT')")
public class PatientControler {

    @GetMapping("/dashboard")
    public Map<String, Object> dashboard() {
        return Map.of("title","Patient Dashboard","nextVisit","18/03 10:30");
    }

    @GetMapping("/prescriptions")
    public List<Map<String,String>> prescriptions() {
        return List.of(
                Map.of("name","Amoxicilline 500mg","status","Active"),
                Map.of("name","Ibuprofène 400mg","status","Expirée")
        );
    }
}
