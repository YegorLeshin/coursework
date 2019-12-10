package ru.courseworkdt.elib.controller;

import lombok.Data;



@Data
public class UserDto {
    private Long Id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private boolean active;
}
