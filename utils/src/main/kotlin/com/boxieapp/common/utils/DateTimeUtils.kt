@file:Suppress("Unused")

package com.boxieapp.common.utils

import java.time.format.DateTimeFormatter
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toJavaLocalDateTime
import kotlinx.datetime.toLocalDateTime

fun LocalDateTime.Companion.now(): LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())

fun LocalDateTime.toDuration(): Duration = this.toEpochMilliseconds().milliseconds

fun LocalDateTime.toEpochMilliseconds(): Long = this.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()

fun LocalDateTime.format(formatter: DateTimeFormatter): String = this.toJavaLocalDateTime().format(formatter)
