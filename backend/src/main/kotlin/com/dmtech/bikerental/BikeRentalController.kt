package com.dmtech.bikerental

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["http://localhost:3000"])
@RestController
@RequestMapping("/bikerental")
class BikeRentalController(var bikeRentalService: BikeRentalService) {

    @GetMapping("/bikes")
    fun getBikes(): List<Bike> {
        return bikeRentalService.getAllBikes()
    }

}