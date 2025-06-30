package com.hsm.Hospital.Management.System.Dto;

import com.hsm.Hospital.Management.System.Entity.Role;




public class UserDto {

        private Long id;
        private String userName;
        private String passWord;
        private String email;
        private Role role;


        public UserDto(Long id, String userName, String passWord, String email, Role role) {
                this.id = id;
                this.userName = userName;
                this.passWord = passWord;
                this.email = email;
                this.role = role;
        }

        public UserDto() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Role getRole() {
                return role;
        }

        public void setRole(Role role) {
                this.role = role;
        }
}
