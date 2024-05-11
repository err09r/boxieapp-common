@file:Suppress("Unused")

package com.boxieapp.common.dto

import com.boxieapp.common.models.ParcelStatus
import kotlinx.serialization.Serializable

@Serializable
data class ParcelDto(
    val id: String,
    val lockerCode: String,
    val number: String,
    val sender: String,
    val status: ParcelStatus
)
