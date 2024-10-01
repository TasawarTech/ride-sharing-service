package com.example.ride_sharing_service.passenger;
import org.springframework.web.bind.annotation.*;



@RestController

@RequestMapping("/passenger")


public class PassengerController {

    // 1. Search Ride
    @GetMapping("/search")
    public String searchRide() {
        return "Ride search functionality here";
    }

    // 2. Select Ride Type
    @PostMapping("/select")
    public String selectRideType() {
        return "Ride type selected";
    }

    // 3. Track Ride
    @GetMapping("/track")
    public String trackRide() {
        return "Ride tracking functionality here";
    }

    // 4. Confirm Ride
    @PostMapping("/confirm")
    public String confirmRide() {
        return "Ride confirmed!";
    }
}