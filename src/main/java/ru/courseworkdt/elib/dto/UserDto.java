package ru.courseworkdt.elib.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Date expiredLicense_date;
}
