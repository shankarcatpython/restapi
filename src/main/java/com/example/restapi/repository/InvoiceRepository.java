package com.example.restapi.repository;


import com.example.restapi.model.Invoice;
import com.example.restapi.repository.custom.CustomInvoiceRepository;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>, CustomInvoiceRepository {
}
