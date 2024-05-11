@file:Suppress("Unused")

package com.boxieapp.common.utils

fun <T, R : Comparable<R>> Iterable<T>.minOByOrDefault(defaultValue: T, selector: (T) -> R): T {
    return this.minByOrNull(selector) ?: defaultValue
}

fun <T, R : Comparable<R>> Iterable<T>.minOfOrDefault(defaultValue: R, selector: (T) -> R): R {
    return this.minOfOrNull(selector) ?: defaultValue
}

fun <T, R : Comparable<R>> Iterable<T>.maxByOrDefault(defaultValue: T, selector: (T) -> R): T {
    return this.maxByOrNull(selector) ?: defaultValue
}

fun <T, R : Comparable<R>> Iterable<T>.maxOfOrDefault(defaultValue: R, selector: (T) -> R): R {
    return this.maxOfOrNull(selector) ?: defaultValue
}
