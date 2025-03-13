package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FipService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1";

    public FipService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCarBrands() {
        String url = BASE_URL + "/carros/marcas";
        return restTemplate.getForObject(url, String.class);
    }

    public String getMotorcycleBrands() {
        String url = BASE_URL + "/motos/marcas";
        return restTemplate.getForObject(url, String.class);
    }

    public String getTruckBrands() {
        String url = BASE_URL + "/caminhoes/marcas";
        return restTemplate.getForObject(url, String.class);
    }
}
