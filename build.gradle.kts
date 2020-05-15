plugins {
    kotlin("jvm") version "1.3.61"
    application
}

application {
    mainClassName = "main.kotlin.de.hopf.Calculator"
}

repositories {
    jcenter()
}

dependencies {
    //implementation(project(":list"))
    //implementation(project(":utilities"))
    implementation(kotlin("stdlib", "1.3.61"))
    testImplementation(kotlin("test-js"))
    implementation("junit:junit:4.12")
    testImplementation("junit:junit:4.12")
    testCompile("junit:junit:4.12")
    testCompile("org.jetbrains.kotlin:kotlin-test-junit:1.3.61")
}

