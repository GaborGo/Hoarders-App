package com.hoarders.app.service;

import com.hoarders.app.model.dto.UserDto;
import com.hoarders.app.model.mapper.UserMapper;
import com.hoarders.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public UserDto findById(String id) {
       return mapper.userToDto(userRepository.findById(id).orElseThrow());
    }
}
