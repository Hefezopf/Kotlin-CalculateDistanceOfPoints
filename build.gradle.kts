plugins {
    kotlin("jvm") version "1.3.61"
    application
}

application {
    mainClassName = "de.hopf.App"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", "1.3.61"))
    testImplementation(kotlin("test-js"))
    implementation("junit:junit:4.12")
    testImplementation("junit:junit:4.12")
    testCompile("junit:junit:4.12")
    testCompile("org.jetbrains.kotlin:kotlin-test-junit:1.3.61")
}

