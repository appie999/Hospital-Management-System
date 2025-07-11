package com.hsm.Hospital.Management.System.Service;

import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Entity.Invoice;
import com.hsm.Hospital.Management.System.Entity.Patient;
import com.hsm.Hospital.Management.System.Mapper.InvoiceMapper;
import com.hsm.Hospital.Management.System.Repository.InvoiceRepository;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import com.hsm.Hospital.Management.System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {


    private final InvoiceMapper invoiceMapper;

    private final InvoiceRepository repository;
    private final UserRepository userRepository;
    private final PatientRepository patientRepository;

    public InvoiceService(InvoiceMapper invoiceMapper, InvoiceRepository repository, UserRepository userRepository, PatientRepository patientRepository) {
        this.invoiceMapper = invoiceMapper;
        this.repository = repository;
        this.userRepository = userRepository;
        this.patientRepository = patientRepository;
    }

    public InvoiceDTO saveInvoice(InvoiceDTO dto){
        Patient patient =
                patientRepository.findById(dto.getPatientId()).get();
        var invoice = invoiceMapper.toEntity(dto);
        invoice.setPatient(patient);
        return invoiceMapper.toDTO(repository.save(invoice));
    }

    public InvoiceDTO getInvoiceById(Long id){
        Invoice invoice = repository.findById(id).orElseThrow(()->new RuntimeException("invoice not found"));
        return invoiceMapper.toDTO(invoice);
    }

    public List<InvoiceDTO> getAllInvoices(){
        return repository.findAll().stream().map(invoiceMapper::toDTO).toList();
    }

    public InvoiceDTO editInvoice(Long id, InvoiceDTO dto){
        Invoice invoice = repository.findById(id).get();
        invoice.setId(dto.getId());
        invoice.setDate(dto.getDate());
        invoice.setAmount(dto.getAmount());
        return invoiceMapper.toDTO(repository.save(invoice));
    }

    public void deleteInvoice(Long id){
        repository.deleteById(id);
    }
}
