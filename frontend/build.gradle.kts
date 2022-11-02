plugins {
    id("org.siouan.frontend-jdk11") version "6.0.0"
    id("java")
}

group = "com.github.eugene-grb"
version = "0.0.1-SNAPSHOT"

java {
    targetCompatibility = JavaVersion.VERSION_11
}

buildscript {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

frontend {
    nodeVersion.set("18.12.0")
    cleanScript.set("run clean")
    installScript.set("install")
    assembleScript.set("run build")
}

tasks.named("jar", Jar::class) {
    dependsOn("assembleFrontend")
    from("$buildDir/dist")
    into("static")
}
