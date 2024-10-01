package com.example.ride_sharing_service.billing;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    // 1. Calculate Fare
    @PostMapping("/calculate")
    public String calculateFare() {
        return "Fare calculated!";
    }

    // 2. Process Payment
    @PostMapping("/payment")
    public String processPayment() {
        return "Payment processed!";
    }

    // 3. View Payment History
    @GetMapping("/history")
    public String paymentHistory() {
        return "Payment history here";
    }
}