plugins {
    id("com.boxieapp.common.kotlin-publish")
//    id("com.boxieapp.common.kotlin-test")
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.core.jvm)
}
