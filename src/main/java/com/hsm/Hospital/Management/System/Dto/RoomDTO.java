package com.hsm.Hospital.Management.System.Dto;


public class RoomDTO {
    private Long id;
    private Long roomNumber;
    private Boolean isOccupied;
    private Long assignedPatientId;

    public RoomDTO(Long assignedPatientId, Boolean isOccupied, Long roomNumber, Long id) {
        this.assignedPatientId = assignedPatientId;
        this.isOccupied = isOccupied;
        this.roomNumber = roomNumber;
        this.id = id;
    }

    public RoomDTO() {
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

    public Long getAssignedPatientId() {
        return assignedPatientId;
    }

    public void setAssignedPatientId(Long assignedPatientId) {
        this.assignedPatientId = assignedPatientId;
    }
}
