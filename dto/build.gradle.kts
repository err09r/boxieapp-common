plugins {
    id("com.boxieapp.common.kotlin-publish")
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    api(projects.models)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.core.jvm)
}
