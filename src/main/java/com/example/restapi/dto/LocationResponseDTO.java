package com.example.restapi.dto;

import java.util.List;

public class LocationResponseDTO {
    private Integer id;
    private String state;
    private List<CityDTO> cities;

    public LocationResponseDTO() {
    }

    public LocationResponseDTO(Integer id, String state, List<CityDTO> cities) {
        this.id = id;
        this.state = state;
        this.cities = cities;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public List<CityDTO> getCities() { return cities; }
    public void setCities(List<CityDTO> cities) { this.cities = cities; }

    public static class CityDTO {
        private String name;
        private String zipcode;
        private Integer population;

        public CityDTO() {}

        public CityDTO(String name, String zipcode, Integer population) {
            this.name = name;
            this.zipcode = zipcode;
            this.population = population;
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getZipcode() { return zipcode; }
        public void setZipcode(String zipcode) { this.zipcode = zipcode; }

        public Integer getPopulation() { return population; }
        public void setPopulation(Integer population) { this.population = population; }
    }
}
