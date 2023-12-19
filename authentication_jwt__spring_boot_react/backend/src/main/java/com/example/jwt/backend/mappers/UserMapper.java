package com.example.jwt.backend.mappers;

import com.example.jwt.backend.dto.SignUpDto;
import com.example.jwt.backend.dto.UserDto;
import com.example.jwt.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);

    @Mapping(target = "password",  ignore = true)
    User signUpToUser(SignUpDto useDto);
}
