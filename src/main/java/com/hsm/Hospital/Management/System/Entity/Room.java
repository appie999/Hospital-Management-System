package com.hsm.Hospital.Management.System.Entity;

import jakarta.persistence.*;


@Entity

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private Long roomNumber;
    private Boolean isOccupied;

    @OneToOne
    private Patient assignedPatient;


    public Room(Long id, Long roomNumber, Boolean isOccupied, Patient assignedPatient) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
        this.assignedPatient = assignedPatient;
    }

    public Room() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Patient getAssignedPatient() {
        return assignedPatient;
    }

    public void setAssignedPatient(Patient assignedPatient) {
        this.assignedPatient = assignedPatient;
    }
}
