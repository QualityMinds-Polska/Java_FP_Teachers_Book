plugins {
    id("java")
}

group = "pl.qualityminds"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.assertj/assertj-core
    implementation("org.assertj:assertj-core:3.24.2")
}
