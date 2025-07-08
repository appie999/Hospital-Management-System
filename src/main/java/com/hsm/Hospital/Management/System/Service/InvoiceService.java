package com.hsm.Hospital.Management.System.Service;

import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Entity.Invoice;
import com.hsm.Hospital.Management.System.Mapper.InvoiceMapper;
import com.hsm.Hospital.Management.System.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceMapper mapper;

    @Autowired
    private InvoiceRepository repository;

    public InvoiceDTO saveInvoice(InvoiceDTO dto){
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }

    public InvoiceDTO getInvoiceById(Long id){
        Invoice invoice = repository.findById(id).orElseThrow(()->new RuntimeException("invoice not found"));
        return mapper.toDTO(invoice);
    }

    public List<InvoiceDTO> getAllInvoices(){
        return repository.findAll().stream().map(invoice -> mapper.toDTO(invoice)).toList();
    }

    public InvoiceDTO editInvoice(Long id, InvoiceDTO dto){
        Invoice invoice = repository.findById(id).get();
        invoice.setId(dto.getId());
        invoice.setDate(dto.getDate());
        invoice.setAmount(dto.getAmount());
        return mapper.toDTO(repository.save(invoice));
    }

    public void deleteInvoice(Long id){
        repository.deleteById(id);
    }
}
