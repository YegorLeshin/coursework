package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.dto.UserDto;

@Component
public class UserDtoConverter implements Converter<User, UserDto> {
    @Override
    public UserDto convert(User user) {
        UserDto userDto =new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setId(user.getId());
        userDto.setExpiredLicense_date(user.getExpiredLicense_date());
        return userDto;
    }
}
