package com.example.testmegalab.controller;

import com.example.testmegalab.dto.UserDtoRequest;
import com.example.testmegalab.dto.UserDtoResponse;
import com.example.testmegalab.mapper.UserMapper;
import com.example.testmegalab.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    @PostMapping("/create")
    public void createUser(@RequestBody UserDtoRequest userDtoRequest) {
        userService.createUser(userDtoRequest);
    }

    @GetMapping("/{id}")
    public UserDtoResponse getUserById(@RequestHeader Long id) {
       return userMapper.entityToDto(userService.getUserById(id));
    }

    @PutMapping("/update/{id}")
    public void updateUser(@RequestBody UserDtoRequest userDtoRequest, @RequestHeader Long id){
        userService.updateUser(userDtoRequest,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@RequestHeader Long id){
        userService.deleteUserById(id);
    }
}
