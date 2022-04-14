// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version by extra("1.5.0-release-764")
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")

    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.google.gms:google-services:4.3.10")
      //  classpath("com.google.dagger:hilt-android:2.40.5")
        /*    classpath("com.google.firebase:firebase-crashlytics-gradle:2.8.1")

            classpath(Dep.Plugins.androidGradlePlugin)
            classpath(Dep.Plugins.kotlin)
            classpath(Dep.Plugins.hilt)*/
        //   classpath(Dep.Plugins.googleService)
        //   classpath(Dep.Plugins.spotless)

    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}