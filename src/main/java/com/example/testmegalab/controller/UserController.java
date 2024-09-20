package com.example.testmegalab.controller;

import com.example.testmegalab.dto.UserDtoRequest;
import com.example.testmegalab.dto.UserDtoResponse;
import com.example.testmegalab.entity.User;
import com.example.testmegalab.mapper.UserMapper;
import com.example.testmegalab.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    @PostMapping(value = "/create")
    public void createUser(@RequestBody UserDtoRequest userDtoRequest) {
        userService.createUser(userDtoRequest);
    }

    @GetMapping(value = "/{id}")
    public UserDtoResponse getUserById(@PathVariable Long id) {
       return userMapper.entityToDto(userService.getUserById(id));
    }
    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable  Long id) {
        return userService.getUserById(id);
    }

    @PutMapping(value = "/update/{id}")
    public void updateUser(@PathVariable  UserDtoRequest userDtoRequest, @RequestHeader Long id){
        userService.updateUser(userDtoRequest,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@RequestHeader Long id){
        userService.deleteUserById(id);
    }
}
