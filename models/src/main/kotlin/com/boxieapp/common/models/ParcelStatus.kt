@file:Suppress("Unused")

package com.boxieapp.common.models

enum class ParcelStatus {
    Undefined,

    // Normal flow
    Created,
    PreparedBySender,
    PickedUpFromSender,
    ReceivedAtSortingCenter,
    DispatchedFromSortingCenter,
    ReceivedAtDepartment,
    ReadyForDelivery,
    ReadyForPickUp,
    Delivered,

    // Return flow
    ReturnedToDepartment,
    ReturnedToSender
}
