package com.example.restapi.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id", nullable = false)
    private UUID clientId;

    @Column(name = "department_id", nullable = false)
    private String departmentId;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "posted_timestamp", nullable = false)
    private LocalDateTime postedTimestamp;

    @Column(name = "active_inactive_record", nullable = false)
    private Boolean activeInactiveRecord;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @Column(name = "department_address")
    private String departmentAddress;

    @Column(name = "invoice_preference")
    private String invoicePreference;

    @Column(name = "attention_name")
    private String attentionName;

    @Column(name = "attention_email_id")
    private String attentionEmailId;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getPostedTimestamp() {
        return postedTimestamp;
    }

    public void setPostedTimestamp(LocalDateTime postedTimestamp) {
        this.postedTimestamp = postedTimestamp;
    }

    public Boolean getActiveInactiveRecord() {
        return activeInactiveRecord;
    }

    public void setActiveInactiveRecord(Boolean activeInactiveRecord) {
        this.activeInactiveRecord = activeInactiveRecord;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getInvoicePreference() {
        return invoicePreference;
    }

    public void setInvoicePreference(String invoicePreference) {
        this.invoicePreference = invoicePreference;
    }

    public String getAttentionName() {
        return attentionName;
    }

    public void setAttentionName(String attentionName) {
        this.attentionName = attentionName;
    }

    public String getAttentionEmailId() {
        return attentionEmailId;
    }

    public void setAttentionEmailId(String attentionEmailId) {
        this.attentionEmailId = attentionEmailId;
    }
}
