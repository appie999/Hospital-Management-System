package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.InvoiceDTO;
import com.hsm.Hospital.Management.System.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping
    public InvoiceDTO saveInvoice(@RequestBody InvoiceDTO dto){
        return service.saveInvoice(dto);
    }

    @GetMapping("/{id}")
    public InvoiceDTO getInvoiceById(@PathVariable Long id){
        return service.getInvoiceById(id);
    }

    @GetMapping
    public List<InvoiceDTO> getAllVoices(){
        return service.getAllInvoices();
    }

    @PutMapping("/{id}")
    public InvoiceDTO editInvoice(@PathVariable Long id, @RequestBody InvoiceDTO dto){
        return service.editInvoice(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteInvoice(@PathVariable Long id){
        service.deleteInvoice(id);
    }
}
