package com.hsm.Hospital.Management.System.Dto;


import com.hsm.Hospital.Management.System.Entity.Role;



public class DoctorDto extends UserDto {

        private String firstName;
        private String lastName;
        private String speciality;

        public DoctorDto(Long id, String userName, String passWord, String email, Role role, String firstName, String lastName, String speciality) {
                super(id, userName, passWord, email, role);
                this.firstName = firstName;
                this.lastName = lastName;
                this.speciality = speciality;
        }

        public DoctorDto(String firstName, String lastName, String speciality) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.speciality = speciality;
        }

        public DoctorDto() {

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
}
