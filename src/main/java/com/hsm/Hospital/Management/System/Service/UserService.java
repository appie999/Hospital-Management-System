package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.UserDto;
import com.hsm.Hospital.Management.System.Entity.User;
import com.hsm.Hospital.Management.System.Mapper.UserMapper;
import com.hsm.Hospital.Management.System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserDto saveUser(UserDto userDto){
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(userDto)));
    }

    public List<UserDto> getAllUsers(){
        return userRepository.findAll().stream().map(user -> userMapper.toDTO(user)).toList();
    }

    public UserDto findUserById(Long id){
        return userMapper.toDTO(userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found")));
    }

    public UserDto modifierUser(Long id, UserDto userDto){
        User user = userRepository.findById(id).get();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPassWord(userDto.getPassWord());
        user.setRole(userDto.getRole());

        return userMapper.toDTO(userRepository.save(user));
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
