package com.hsm.Hospital.Management.System.Repository;

import com.hsm.Hospital.Management.System.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByLastName(String lastName);
}

