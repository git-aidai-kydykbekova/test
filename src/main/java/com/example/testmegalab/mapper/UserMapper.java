package com.example.testmegalab.mapper;

import com.example.testmegalab.dto.UserDtoResponse;
import com.example.testmegalab.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDtoResponse entityToDto(User user) {
        return new UserDtoResponse()
                .setId(user.getId())
                .setName(user.getName())
                .setAge(user.getAge());
    }
}
