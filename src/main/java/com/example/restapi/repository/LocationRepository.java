package com.example.restapi.repository;

import com.example.restapi.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findByCountryIgnoreCase(String country);
}
