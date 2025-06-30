package com.hsm.Hospital.Management.System.Dto;



import java.time.LocalDate;



public class AppointmentDTO {
    private Long id;
    private LocalDate date;
    private String status;
    private Long patientId;
    private Long doctorId;

    public AppointmentDTO(Long id, LocalDate date, String status, Long patientId, Long doctorId) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public AppointmentDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
}

