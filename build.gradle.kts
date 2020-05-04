plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    //implementation(project(":list"))
    //implementation(project(":utilities"))
    //implementation(kotlin("stdlib", "1.3.61"))
    testImplementation(kotlin("test-js"))
    testImplementation("junit:junit:4.12")
}


