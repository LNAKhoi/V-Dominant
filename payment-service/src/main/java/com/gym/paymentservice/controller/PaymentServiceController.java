package com.vdominant.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {
    @GetMapping("/health")
    public String health() {
        return "payment-service is up";
    }
}
