@file:Suppress("Unused")

package com.boxieapp.common.dto

import kotlinx.serialization.Serializable

@Serializable
data class OtpVerificationRequest(
    val phoneNumber: String,
    val otp: String,
    val timestamp: Long
)
