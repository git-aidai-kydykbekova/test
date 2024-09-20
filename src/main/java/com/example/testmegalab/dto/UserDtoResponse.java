package com.example.testmegalab.dto;

import lombok.Getter;
import lombok.Setter;


public class UserDtoResponse {
    private Long id;
    private String name;
    private String surname;
    private Integer age;

    public Long getId() {
        return id;
    }

    public UserDtoResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDtoResponse setName(String name) {
        this.name = name;
        return this;
    }


    public Integer getAge() {
        return age;
    }

    public UserDtoResponse setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDtoResponse setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
