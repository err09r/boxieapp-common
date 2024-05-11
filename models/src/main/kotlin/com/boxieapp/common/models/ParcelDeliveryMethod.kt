@file:Suppress("Unused")

package com.boxieapp.common.models

import kotlinx.serialization.Serializable

@Serializable
sealed interface ParcelDeliveryMethod {

    @Serializable
    data class LockerToLocker(val lockerCode: Int) : ParcelDeliveryMethod

    @Serializable
    data class LockerToHome(
        val country: String,
        val postcode: Int,
        val city: String,
        val address: String
    ) : ParcelDeliveryMethod
}
