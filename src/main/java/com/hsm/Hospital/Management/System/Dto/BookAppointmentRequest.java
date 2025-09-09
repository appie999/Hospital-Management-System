package com.hsm.Hospital.Management.System.Dto;

import java.time.LocalDate;

public class BookAppointmentRequest {
    private Long doctorId;
    private LocalDate date;

    public BookAppointmentRequest(Long doctorId, LocalDate date) {
        this.doctorId = doctorId;
        this.date = date;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
