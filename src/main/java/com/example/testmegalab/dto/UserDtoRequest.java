package com.example.testmegalab.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDtoRequest {
    private String name;
    private String password;
    private Integer age;
}
