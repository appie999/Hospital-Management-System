package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.PharmacyDTO;
import com.hsm.Hospital.Management.System.Entity.Pharmacy;
import com.hsm.Hospital.Management.System.Mapper.PharmacyMapper;
import com.hsm.Hospital.Management.System.Repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyService {

    @Autowired
    private PharmacyMapper pharmacyMapper;

    @Autowired
    private PharmacyRepository pharmacyRepository;

    public PharmacyDTO savePharmacy(PharmacyDTO pharmacyDTO){
        return pharmacyMapper.toDTO(pharmacyRepository.save(pharmacyMapper.toEntity(pharmacyDTO)));
    }

    public PharmacyDTO findPharmacyById(Long id){
        return pharmacyMapper.toDTO(pharmacyRepository.findById(id).orElseThrow(()->new RuntimeException("Pharmacy not found")));
    }

    public List<PharmacyDTO> findAllPharmacys(){
        return pharmacyRepository.findAll().stream().map(pharmacy -> pharmacyMapper.toDTO(pharmacy)).toList();
    }

    public PharmacyDTO modifierPharmacy(Long id, PharmacyDTO pharmacyDTO){
        Pharmacy pharmacy = pharmacyRepository.findById(id).get();
        pharmacy.setMedicines(pharmacyDTO.getMedicineIds());
        return pharmacyMapper.toDTO(pharmacyRepository.save(pharmacy));
    }

    public void deletePharmacy(Long id){
        pharmacyRepository.deleteById(id);
    }
}
