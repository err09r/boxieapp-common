@file:Suppress("ConstPropertyName")

import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

object Config {
    const val group = "com.boxieapp.common.dev"
    val javaVersion = JavaVersion.VERSION_1_8
    val jvmTarget = JvmTarget.JVM_1_8
}
