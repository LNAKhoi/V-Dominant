package com.vdominant.analyticsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsServiceController {
    @GetMapping("/health")
    public String health() {
        return "analytics-service is up";
    }
}
