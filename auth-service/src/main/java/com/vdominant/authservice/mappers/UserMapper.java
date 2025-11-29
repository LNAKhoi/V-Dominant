package com.vdominant.authservice.mappers;

import com.vdominant.authservice.dtos.UserDto;
import com.vdominant.authservice.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "password", ignore = true)
    User toUser(UserDto userInfo);

    UserDto toUserDto(User user);
}