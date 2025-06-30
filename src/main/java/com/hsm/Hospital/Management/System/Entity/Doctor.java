package com.hsm.Hospital.Management.System.Entity;


import jakarta.persistence.*;


import java.util.List;

@Entity

public class Doctor extends User {

    private String firstName;
    private String lastName;
    private String speciality;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    public Doctor(Long id, String userName, String passWord, String email, Role role, String firstName, String lastName, String speciality, List<Appointment> appointments) {
        super(id, userName, passWord, email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.appointments = appointments;
    }

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String speciality, List<Appointment> appointments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.appointments = appointments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
