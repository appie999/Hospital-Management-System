package com.hsm.Hospital.Management.System.Dto;

import com.hsm.Hospital.Management.System.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

        private Long id;
        private String userName;
        private String email;
        private Role role;

}
