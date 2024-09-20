package com.example.testmegalab.controller;

import com.example.testmegalab.dto.UserDtoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/create")
    public void createUser(@RequestBody UserDtoRequest userDtoRequest) {

    }
}
