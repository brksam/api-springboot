package com.example.demo.controller;

import com.example.demo.service.FipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fipe")
public class FipController {
    private final FipService fipService;

    public FipController(FipService fipService) {
        this.fipService = fipService;
    }

    @GetMapping("/carros/marcas")
    public String getCarBrands() {
        return fipService.getCarBrands();
    }

    @GetMapping("/motos/marcas")
    public String getMotorcycleBrands() {
        return fipService.getMotorcycleBrands();
    }

    @GetMapping("/caminhoes/marcas")
    public String getTruckBrands() {
        return fipService.getTruckBrands();
    }
}
