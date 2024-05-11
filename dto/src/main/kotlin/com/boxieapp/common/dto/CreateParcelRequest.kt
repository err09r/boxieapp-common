@file:Suppress("Unused")

package com.boxieapp.common.dto

import com.boxieapp.common.models.ParcelDeliveryMethod
import com.boxieapp.common.models.ParcelRecipient
import com.boxieapp.common.models.ParcelSize
import kotlinx.serialization.Serializable

@Serializable
data class CreateParcelRequest(
    val sender: String,
    val recipient: ParcelRecipient,
    val deliveryMethod: ParcelDeliveryMethod,
    val size: ParcelSize
)
