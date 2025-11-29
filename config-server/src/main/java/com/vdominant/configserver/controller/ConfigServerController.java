package com.vdominant.configserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerController {
    @GetMapping("/health")
    public String health() {
        return "config-server is up";
    }
}
