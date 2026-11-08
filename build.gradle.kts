plugins {
    kotlin("jvm") version "2.4.21"
    application
}

group = "de.seuhd"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(25)
}

application {
    // Run another example with -PmainClass, e.g., gradle run -PmainClass=de.seuhd.teaching.intro.kotlin.BasicsKt
    mainClass = providers.gradleProperty("mainClass").orElse("de.seuhd.teaching.intro.Main")
}
