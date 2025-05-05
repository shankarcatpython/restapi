package com.example.restapi.repository.custom;

import com.example.restapi.dto.InvoiceDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface CustomInvoiceRepository {
    List<InvoiceDTO> findInvoices(UUID clientId, LocalDate startDate);
}
