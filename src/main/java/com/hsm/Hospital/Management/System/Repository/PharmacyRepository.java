package com.hsm.Hospital.Management.System.Repository;

import com.hsm.Hospital.Management.System.Entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}

