package com.example.restapi.service;

import com.example.restapi.dto.LocationResponseDTO;
import com.example.restapi.dto.LocationResponseDTO.CityDTO;
import com.example.restapi.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<LocationResponseDTO> getLocationsByCountry(String country) {
        return locationRepository.findByCountryIgnoreCase(country)
                .stream()
                .map(loc -> new LocationResponseDTO(
                        loc.getId(),
                        loc.getState(),
                        loc.getCities().stream()
                                .map(city -> new CityDTO(city.getName(), city.getZipcode(), city.getPopulation()))
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }
}
