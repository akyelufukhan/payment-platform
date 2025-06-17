package com.akpay.mock_bank1_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    @PostMapping("/pay")
    public ResponseEntity<?> processPayment(@RequestBody Map<String, Object> paymentData) {
        // Gerçek banka entegrasyonu gibi davranırız
        return ResponseEntity.ok(Map.of(
            "status", "SUCCESS",
            "bank", "Mock Bank 1",
            "message", "Payment approved"
        ));
    }
}