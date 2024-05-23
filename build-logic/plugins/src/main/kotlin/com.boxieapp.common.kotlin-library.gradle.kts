plugins {
    `java-library`
    kotlin("jvm")
}

group = Config.group
version = project.property("artifactVersion").toString()

java {
    withSourcesJar()
    withJavadocJar()

    sourceCompatibility = Config.javaVersion
    targetCompatibility = Config.javaVersion
}

kotlin {
    compilerOptions {
        jvmTarget.set(Config.jvmTarget)
    }
}
