package com.hsm.Hospital.Management.System.Dto;



import java.util.Date;



public class InvoiceDTO {

        private Long id;
        private Double amount;
        private Date date;
        private Long patientId;

        public InvoiceDTO(Long id, Double amount, Date date, Long patientId) {
                this.id = id;
                this.amount = amount;
                this.date = date;
                this.patientId = patientId;
        }

        public InvoiceDTO() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Double getAmount() {
                return amount;
        }

        public void setAmount(Double amount) {
                this.amount = amount;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }

        public Long getPatientId() {
                return patientId;
        }

        public void setPatientId(Long patientId) {
                this.patientId = patientId;
        }
}
