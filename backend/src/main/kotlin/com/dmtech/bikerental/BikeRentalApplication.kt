package com.dmtech.bikerental

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BikeRentalApplication

fun main(args: Array<String>) {
	runApplication<BikeRentalApplication>(*args)
}
