package com.hsm.Hospital.Management.System.Repository;

import com.hsm.Hospital.Management.System.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findBySpeciality(String speciality);
}
