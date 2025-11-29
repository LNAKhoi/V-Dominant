package com.vdominant.membershipservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembershipServiceController {
    @GetMapping("/health")
    public String health() {
        return "membership-service is up";
    }
}
