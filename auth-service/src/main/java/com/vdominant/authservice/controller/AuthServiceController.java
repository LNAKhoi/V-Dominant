package com.vdominant.authservice.controller;

import com.vdominant.authservice.dtos.UserDto;
import com.vdominant.authservice.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class AuthServiceController {
    private final AuthService authService;

    public AuthServiceController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody UserDto payload) {
        authService.register(payload);
        return ResponseEntity.ok().build();
    }
}
