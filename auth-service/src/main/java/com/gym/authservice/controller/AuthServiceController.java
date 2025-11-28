package com.gym.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthServiceController {
    @GetMapping("/health")
    public String health() {
        return "auth-service is up";
    }
}
