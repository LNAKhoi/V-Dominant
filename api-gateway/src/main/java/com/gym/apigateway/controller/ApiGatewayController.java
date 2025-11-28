package com.gym.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {
    @GetMapping("/health")
    public String health() {
        return "api-gateway is up";
    }
}
