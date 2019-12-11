package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.converters.UserConverter;
import ru.courseworkdt.elib.converters.dto.UserDtoConverter;
import ru.courseworkdt.elib.dto.UserDto;
import ru.courseworkdt.elib.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    private UserConverter userConverter;
    private UserDtoConverter userDtoConverter;

    @GetMapping("/users")
    public List<User> userAll() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public UserDto addUser(@RequestBody UserDto userDto) {
        User user = userConverter.convert(userDto);
        return userDtoConverter.convert(userService.create(user));
    }

    @PutMapping("/user")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        User user = userConverter.convert(userDto);
        return userDtoConverter.convert(userService.update(user));
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return  "delete";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoConverter(UserDtoConverter userDtoConverter) {
        this.userDtoConverter = userDtoConverter;
    }

    @Autowired
    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }
}
