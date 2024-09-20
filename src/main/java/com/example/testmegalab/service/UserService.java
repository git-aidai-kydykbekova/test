package com.example.testmegalab.service;

import com.example.testmegalab.dto.UserDtoRequest;
import com.example.testmegalab.entity.User;

public interface UserService {
    void createUser(UserDtoRequest userDtoRequest);

    User getUserById(Long id);

    void updateUser(UserDtoRequest userDtoRequest, Long id);

    void deleteUserById(Long id);
}
