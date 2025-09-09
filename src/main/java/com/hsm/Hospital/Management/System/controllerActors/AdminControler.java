package com.hsm.Hospital.Management.System.controllerActors;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('ADMIN')") // كلشي داخل هاد الكنترولر خاص ADMIN
public class AdminControler {

    @GetMapping("/dashboard")
    public Map<String, Object> dashboard() {
        return Map.of("title","Admin Dashboard","users", 120, "doctors", 12);
    }
}
