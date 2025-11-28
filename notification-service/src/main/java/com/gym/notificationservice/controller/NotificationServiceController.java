package com.gym.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationServiceController {
    @GetMapping("/health")
    public String health() {
        return "notification-service is up";
    }
}
