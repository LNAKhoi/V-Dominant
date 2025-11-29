package com.vdominant.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @GetMapping("/health")
    public String health() {
        return "user-service is up";
    }
}
