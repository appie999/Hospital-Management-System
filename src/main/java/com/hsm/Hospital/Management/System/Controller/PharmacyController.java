package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.PharmacyDTO;
import com.hsm.Hospital.Management.System.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @PostMapping("/")
    public PharmacyDTO savePharmacy(@RequestBody PharmacyDTO pharmacyDTO){
        return pharmacyService.savePharmacy(pharmacyDTO);
    }

    @GetMapping("/")
    public List<PharmacyDTO> getAllPharmacy(){
        return pharmacyService.findAllPharmacys();
    }

    @GetMapping("/{id}")
    public PharmacyDTO getPharmacyById(@PathVariable Long id){
        return pharmacyService.findPharmacyById(id);
    }

    @PutMapping("/{id}")
    public PharmacyDTO editPharmacy(@PathVariable Long id, @RequestBody PharmacyDTO pharmacyDTO){
        return pharmacyService.modifierPharmacy(id, pharmacyDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePharmacy(@PathVariable Long id){
        pharmacyService.deletePharmacy(id);
    }
}
