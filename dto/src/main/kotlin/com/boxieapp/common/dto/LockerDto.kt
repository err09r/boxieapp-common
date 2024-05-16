@file:Suppress("Unused")

package com.boxieapp.common.dto

import kotlinx.serialization.Serializable

@Serializable
data class LockerDto(
    val deviceId: String,
    val code: Int,
    val name: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
)
