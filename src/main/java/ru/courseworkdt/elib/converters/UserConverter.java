package ru.courseworkdt.elib.converters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.dto.UserDto;

@Component
public class UserConverter implements Converter<UserDto, User> {

    @Override
    public User convert(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());
        user.setEmail(userDto.getEmail());
        user.setExpiredLicense_date(userDto.getExpiredLicense_date());
        user.setId(userDto.getId());
        return user;
    }


}
