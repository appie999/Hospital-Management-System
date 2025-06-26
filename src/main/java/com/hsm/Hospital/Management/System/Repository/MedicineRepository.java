package com.hsm.Hospital.Management.System.Repository;

import com.hsm.Hospital.Management.System.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    List<Medicine> findByPharmacyId(Long pharmacyId);
}

