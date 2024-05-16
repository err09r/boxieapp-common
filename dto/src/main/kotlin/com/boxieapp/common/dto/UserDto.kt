@file:Suppress("Unused")

package com.boxieapp.common.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: String,
    val username: String,
    val email: String?,
    val phoneNumber: String?,
    val firstName: String?,
    val lastName: String?,
    val totalSent: Int,
    val totalReceived: Int,
)
