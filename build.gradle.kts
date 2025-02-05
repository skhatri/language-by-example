tasks.wrapper {
    gradleVersion = "8.12"
}

repositories {
    mavenCentral()
}


plugins {
    id("idea")
    id("java")
    id("jacoco")
    kotlin("jvm") version "2.1.10"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

configurations {
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.9.0")
    implementation("org.yaml:snakeyaml:2.3")
    testImplementation("org.mockito:mockito-core:5.15.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.4")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.4")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.4")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.11.4")

    testImplementation("org.junit.platform:junit-platform-commons:1.11.4")
    testImplementation("org.junit.platform:junit-platform-runner:1.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-engine:1.11.4")
}

tasks.test {
    useJUnitPlatform()
}

task("runApp", JavaExec::class) {
    mainClass = "lang.${project.ext["name"]}"
    classpath = sourceSets["main"].runtimeClasspath
    jvmArgs = listOf(
        "-Xms512m", "-Xmx512m"
    )
}

