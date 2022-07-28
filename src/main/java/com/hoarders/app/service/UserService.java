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

    public UserDto createUser(UserDto user) {
        if (userRepository.existsByUsername(user.getUsername()))
            //FIXME: Add an exception advice to the controllers to translate runtime errors in coresponding http codes and error messages (not internal server error)
            throw new RuntimeException("A user with this username already exists. Please choose a different username.");
        return mapper.userToDto(userRepository.save(mapper.dtoToUser(user)));
    }
}
