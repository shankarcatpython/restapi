package com.example.restapi.dto;

import java.time.LocalDate;

public class InvoiceDTO {

    private String clientName;
    private String departmentName;
    private LocalDate invoiceMonth;
    private Double billedAmount;
    private Double paidAmount;
    private Double outstandingAmount;

    public InvoiceDTO() {
    }

    public InvoiceDTO(String clientName, String departmentName, LocalDate invoiceMonth,
                      Double billedAmount, Double paidAmount, Double outstandingAmount) {
        this.clientName = clientName;
        this.departmentName = departmentName;
        this.invoiceMonth = invoiceMonth;
        this.billedAmount = billedAmount;
        this.paidAmount = paidAmount;
        this.outstandingAmount = outstandingAmount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public LocalDate getInvoiceMonth() {
        return invoiceMonth;
    }

    public void setInvoiceMonth(LocalDate invoiceMonth) {
        this.invoiceMonth = invoiceMonth;
    }

    public Double getBilledAmount() {
        return billedAmount;
    }

    public void setBilledAmount(Double billedAmount) {
        this.billedAmount = billedAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(Double outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
}
