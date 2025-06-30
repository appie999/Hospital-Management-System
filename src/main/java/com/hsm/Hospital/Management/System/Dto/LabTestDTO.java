package com.hsm.Hospital.Management.System.Dto;





public class LabTestDTO {

        private Long id;
        private String testName;
        private String result;
        private Long patientId;

        public LabTestDTO(Long id, String testName, String result, Long patientId) {
                this.id = id;
                this.testName = testName;
                this.result = result;
                this.patientId = patientId;
        }

        public LabTestDTO() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTestName() {
                return testName;
        }

        public void setTestName(String testName) {
                this.testName = testName;
        }

        public String getResult() {
                return result;
        }

        public void setResult(String result) {
                this.result = result;
        }

        public Long getPatientId() {
                return patientId;
        }

        public void setPatientId(Long patientId) {
                this.patientId = patientId;
        }
}
