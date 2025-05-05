package com.example.restapi.service;

import com.example.restapi.dto.InvoiceDTO;
import com.example.restapi.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<InvoiceDTO> getInvoices(UUID clientId, LocalDate startDate) {
        return invoiceRepository.findInvoices(clientId, startDate);
    }
}
