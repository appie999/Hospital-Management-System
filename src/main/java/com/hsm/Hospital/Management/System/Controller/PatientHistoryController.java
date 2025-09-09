// patient/PatientHistoryController.java
package com.hsm.Hospital.Management.System.Controller;

import com.hsm.Hospital.Management.System.Dto.PatientHistoryDto;
import com.hsm.Hospital.Management.System.Repository.InvoiceRepository;
import com.hsm.Hospital.Management.System.Repository.LabTestRepository;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import com.hsm.Hospital.Management.System.security.AuthUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/patient/history")
@RequiredArgsConstructor
public class PatientHistoryController {

    private final PatientRepository patientRepo;
    private final LabTestRepository labRepo;
    private final InvoiceRepository invoiceRepo;

    @PreAuthorize("hasRole('PATIENT')")
    @GetMapping
    public PatientHistoryDto history() {
        var email = AuthUtils.currentUserEmail();
        var p = patientRepo.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.FORBIDDEN, "Patient introuvable"));

        var labs = labRepo != null ? labRepo.findByPatientId(p.getId()) : java.util.List.of();
        var invoices = invoiceRepo != null ? invoiceRepo.findByPatientId(p.getId()) : java.util.List.of();

        return new PatientHistoryDto(
                p.getFirstName(), p.getLastName(),
                p.getMedicalHistory(), labs, invoices
        );
    }
}
