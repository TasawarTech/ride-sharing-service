package com.example.ride_sharing_service.driver;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/driver")
public class DriverController {

    // 1. Add Driver
    @PostMapping("/add")
    public String addDriver() {
        return "Driver added";
    }

    // 2. Update Driver Availability
    @PatchMapping("/availability")
    public String updateAvailability() {
        return "Driver availability updated";
    }

    // 3. Assign Ride to Driver
    @PostMapping("/assign")
    public String assignRide() {
        return "Ride assigned to driver";
    }
}