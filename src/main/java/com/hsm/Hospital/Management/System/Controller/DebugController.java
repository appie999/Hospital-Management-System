package com.hsm.Hospital.Management.System.Controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DebugController {

    @GetMapping("/api/debug/me")
    public Map<String,Object> me() {
        var a = SecurityContextHolder.getContext().getAuthentication();
        Map<String,Object> m = new HashMap<>();
        m.put("principal", a != null ? a.getName() : null);
        m.put("authorities", a != null ? a.getAuthorities().toString() : null);
        return m;
    }
}
