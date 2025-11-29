package com.vdominant.authservice.services;

import com.vdominant.authservice.dtos.UserDto;

public interface AuthService {
    void register(UserDto userInfo);
    void login(UserDto userInfo);
}
