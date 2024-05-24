package com.dmtech.bikerental

import org.springframework.stereotype.Service

@Service
class BikeRentalService(var bikeRepository: BikeRepository) {

    /**
     * Retrieves all bikes from the repository.
     *
     * @return A list of all bikes.
     */
    fun getAllBikes(): List<Bike> {
        return bikeRepository.findAll()
    }
}