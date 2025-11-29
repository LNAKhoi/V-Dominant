package com.vdominant.authservice.mappers;

import com.vdominant.authservice.dtos.UserDto;
import com.vdominant.authservice.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-29T22:46:17+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserDto userInfo) {
        if ( userInfo == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( userInfo.getEmail() );
        user.setFirstName( userInfo.getFirstName() );
        user.setLastName( userInfo.getLastName() );

        user.setCreatedAt( java.time.LocalDateTime.now() );

        return user;
    }

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setPassword( user.getPassword() );
        userDto.setEmail( user.getEmail() );

        return userDto;
    }
}
