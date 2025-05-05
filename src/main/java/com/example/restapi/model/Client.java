package com.example.restapi.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "client_id", nullable = false)
    private UUID clientId;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "posted_timestamp", nullable = false)
    private LocalDateTime postedTimestamp;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "address")
    private String address;

    @Column(name = "active_inactive_record", nullable = false)
    private Integer activeInactiveRecord;

    // Getters and Setters

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
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

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getActiveInactiveRecord() {
        return activeInactiveRecord;
    }

    public void setActiveInactiveRecord(Integer activeInactiveRecord) {
        this.activeInactiveRecord = activeInactiveRecord;
    }
}
