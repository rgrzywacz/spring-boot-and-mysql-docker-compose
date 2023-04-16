package com.grzywacz.springbootandmysqldockercompose.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers() {
        return userRepository.findAll().stream().map(u -> new UserDto(u.firstName + " " +u.lastName)).toList();
    }
}
