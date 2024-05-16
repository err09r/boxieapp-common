@file:Suppress("Unused")

package com.boxieapp.common.models

import kotlinx.serialization.Serializable

@Serializable
data class ParcelRecipient(
    val title: String,
    val phoneNumber: String,
    val email: String,
)
