package com.vdominant.authservice.validators;

import com.vdominant.authservice.dtos.UserDto;
import org.springframework.util.StringUtils;


public class UserValidator {
    public static boolean isValidUser(UserDto user){
        return StringUtils.hasText(user.getEmail()) && StringUtils.hasText(user.getPassword()) &&
                StringUtils.hasText(user.getFirstName()) && StringUtils.hasText(user.getLastName());
    }
}
