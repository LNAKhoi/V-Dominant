package com.vdominant.authservice.services.impl;

import com.vdominant.authservice.dtos.UserDto;
import com.vdominant.authservice.entities.User;
import com.vdominant.authservice.exceptions.AccountExistException;
import com.vdominant.authservice.exceptions.InvalidUserException;
import com.vdominant.authservice.mappers.UserMapper;
import com.vdominant.authservice.repositories.UserRepository;
import com.vdominant.authservice.services.AuthService;
import com.vdominant.authservice.validators.UserValidator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public AuthServiceImpl(PasswordEncoder passwordEncoder, UserRepository userRepository, UserMapper userMapper) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void register(UserDto userInfo) {
        var existedUser = userRepository.findByEmail(userInfo.getEmail());
        if (existedUser.isPresent()) {
            throw new AccountExistException("User already exists");
        } else if (!UserValidator.isValidUser(userInfo)) {
            throw new InvalidUserException("Invalid user");
        }
        var user = userMapper.toUser(userInfo);
        user.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void login(UserDto userInfo) {

    }
}
