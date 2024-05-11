import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    alias(libs.plugins.gradleVersions)
}

tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    rejectVersionIf { isNonStable(candidate.version) }
    checkForGradleUpdate = true
    outputFormatter = "html"
    outputDir = "build/dependencyUpdates"
    reportfileName = "report"
}

private fun isNonStable(version: String): Boolean {
    return listOf("alpha", "beta", "rc", "dev").any {
        version.contains(it, ignoreCase = true)
    }
}
