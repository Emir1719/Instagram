// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

allprojects {
    repositories {
        //maven { url = uri("https://jitpack.io") }
        //maven { url = uri("https://maven.google.com") }
    }
}