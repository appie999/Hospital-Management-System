package com.hsm.Hospital.Management.System.Entity;


import jakarta.persistence.*;


import java.util.List;

@Entity

public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @OneToMany(mappedBy = "pharmacy")
    private List<Medicine> medicines;

    public Pharmacy(Long id, List<Medicine> medicines) {
        this.id = id;
        this.medicines = medicines;
    }

    public Pharmacy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }
}
