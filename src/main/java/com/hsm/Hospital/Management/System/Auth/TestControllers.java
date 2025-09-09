// src/main/java/.../test/TestControllers.java
package com.hsm.Hospital.Management.System.Auth;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestControllers {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("ok","true");
    }

    @GetMapping("/secure")
    public Map<String, String> secure() {
        return Map.of("secure","ok");
    }
}
