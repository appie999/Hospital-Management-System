package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.LabTestDTO;
import com.hsm.Hospital.Management.System.Service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labtest")
public class LabTestController {

    @Autowired
    private LabTestService service;

    @PostMapping("/")
    public LabTestDTO saveLabTest(@RequestBody LabTestDTO labTestDTO){
        return service.saveLabTest(labTestDTO);
    }

    @GetMapping("/")
    public List<LabTestDTO> getAllTests(){
        return service.getAllLabTests();
    }

    @GetMapping("/{id}")
    public LabTestDTO getTestById(@PathVariable Long id){
        return service.getLabTestById(id);
    }

    @PutMapping("{id}")
    public LabTestDTO editLabTest(@PathVariable Long id, @RequestBody LabTestDTO labTestDTO){
        return service.editLabTest(id, labTestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteLabTest(Long id){
        service.deleteLabTest(id);
    }
}
