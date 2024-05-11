@file:Suppress("Unused")

package com.boxieapp.common.dto

import kotlinx.serialization.Serializable

@Serializable
sealed interface OtpVerificationResponse {

    @Serializable
    data class Success(val authResponse: AuthResponse) : OtpVerificationResponse

    @Serializable
    data class Failure(val error: String) : OtpVerificationResponse
}
