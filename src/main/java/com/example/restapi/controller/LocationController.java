package com.example.restapi.controller;

import com.example.restapi.dto.LocationResponseDTO;
import com.example.restapi.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/by-country")
    public List<LocationResponseDTO> getLocationsByCountry(@RequestParam String country) {
        return locationService.getLocationsByCountry(country);
    }
}
