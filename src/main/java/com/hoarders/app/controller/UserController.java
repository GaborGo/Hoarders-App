package com.hoarders.app.controller;

import com.hoarders.app.model.dto.UserDto;
import com.hoarders.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody UserDto getUser(@PathVariable String id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/{id}/reviews")
    public @ResponseBody UserDto getUserReviews(@PathVariable String id) {
        return userService.findById(id);
    }
    @PostMapping
    public @ResponseBody UserDto createUser(@RequestBody UserDto user){
        return userService.createUser(user);
    }

}
