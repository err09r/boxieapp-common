plugins {
    id("com.boxieapp.common.kotlin-library")
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = project.name
            groupId = project.group.toString()
            version = project.version.toString()

            from(components["kotlin"])
        }
    }
}
