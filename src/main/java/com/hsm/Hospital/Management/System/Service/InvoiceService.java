package com.hsm.Hospital.Management.System.Service;

import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Mapper.InvoiceMapper;
import com.hsm.Hospital.Management.System.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceMapper mapper;

    @Autowired
    private InvoiceRepository repository;

    public InvoiceDTO saveInvoice(InvoiceDTO dto){
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }
}
