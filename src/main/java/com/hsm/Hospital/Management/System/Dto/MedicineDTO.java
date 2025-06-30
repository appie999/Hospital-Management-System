package com.hsm.Hospital.Management.System.Dto;



import java.time.LocalDate;


public class MedicineDTO {


        private Long id;
        private String name;
        private int quantity;
        private LocalDate expiryDate;
        private Long pharmacyId;

        public MedicineDTO(Long id, String name, int quantity, LocalDate expiryDate, Long pharmacyId) {
                this.id = id;
                this.name = name;
                this.quantity = quantity;
                this.expiryDate = expiryDate;
                this.pharmacyId = pharmacyId;
        }

        public MedicineDTO() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public LocalDate getExpiryDate() {
                return expiryDate;
        }

        public void setExpiryDate(LocalDate expiryDate) {
                this.expiryDate = expiryDate;
        }

        public Long getPharmacyId() {
                return pharmacyId;
        }

        public void setPharmacyId(Long pharmacyId) {
                this.pharmacyId = pharmacyId;
        }
}
