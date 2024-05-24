package com.dmtech.bikerental

import org.springframework.data.jpa.repository.JpaRepository

interface BikeRepository: JpaRepository<Bike, Long>
