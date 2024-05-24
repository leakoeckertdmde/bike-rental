package com.dmtech.bikerental

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "bikes")
data class Bike (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long = 0,

    var manufacturer: String? = null,
    var rimSize: Int = 0,
    var frameSize: Int = 0,
    var color: String? = null,
    var rented: Boolean = false,
)
