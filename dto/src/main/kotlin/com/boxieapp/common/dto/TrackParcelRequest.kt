@file:Suppress("Unused")

package com.boxieapp.common.dto

import kotlinx.serialization.Serializable

@Serializable
data class TrackParcelRequest(
    val number: String
)
