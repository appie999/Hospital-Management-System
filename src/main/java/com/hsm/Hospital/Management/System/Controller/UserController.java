package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.UserDto;
import com.hsm.Hospital.Management.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @GetMapping("/")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PutMapping("/{id}")
    public UserDto editUser(@PathVariable Long id,@RequestBody UserDto userDto){
        return userService.modifierUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(Long id){
        userService.deleteUser(id);
    }

}
