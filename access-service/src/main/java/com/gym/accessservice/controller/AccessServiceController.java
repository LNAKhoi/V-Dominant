package com.gym.accessservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessServiceController {
    @GetMapping("/health")
    public String health() {
        return "access-service is up";
    }
}
