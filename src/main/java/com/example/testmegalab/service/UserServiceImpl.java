package com.example.testmegalab.service;

import com.example.testmegalab.dto.UserDtoRequest;
import com.example.testmegalab.entity.User;
import com.example.testmegalab.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void createUser(UserDtoRequest userDtoRequest) {
        User user = new User();

        user.setAge(userDtoRequest.getAge());
        user.setName(userDtoRequest.getName());
        user.setSurname(userDtoRequest.getSurname());
        user.setPassword(userDtoRequest.getPassword());

        userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public void updateUser(UserDtoRequest userDtoRequest, Long id) {
        Optional<User> user = userRepository.findById(id);

        user.get().setName(userDtoRequest.getName());
        user.get().setSurname(userDtoRequest.getSurname());
        user.get().setAge(userDtoRequest.getAge());
        user.get().setPassword(userDtoRequest.getPassword());

        userRepository.save(user.get());
    }

    @Override
    public void deleteUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.delete(user.get());
    }
}
