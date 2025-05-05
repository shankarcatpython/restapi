package com.example.restapi.controller;

import com.example.restapi.dto.InvoiceDTO;
import com.example.restapi.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public ResponseEntity<List<InvoiceDTO>> getInvoices(
            @RequestParam UUID clientId,
            @RequestParam LocalDate fromDate
    ) {
        List<InvoiceDTO> invoices = invoiceService.getInvoices(clientId, fromDate);
        return ResponseEntity.ok(invoices);
    }
}
