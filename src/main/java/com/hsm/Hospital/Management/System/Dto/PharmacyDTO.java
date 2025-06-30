package com.hsm.Hospital.Management.System.Dto;

import com.hsm.Hospital.Management.System.Entity.Medicine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



public class PharmacyDTO {

        private Long id;
        private List<Medicine> medicineIds;

        public PharmacyDTO(List<Medicine> medicineIds, Long id) {
                this.medicineIds = medicineIds;
                this.id = id;
        }

        public PharmacyDTO() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public List<Medicine> getMedicineIds() {
                return medicineIds;
        }

        public void setMedicineIds(List<Medicine> medicineIds) {
                this.medicineIds = medicineIds;
        }
}
