import com.ummaaack.multimodule_study.App
import com.ummaaack.multimodule_study.Dep


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = App.compileSdk
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = App.pacakageName
        minSdk = App.minSdk
        targetSdk = App.targetSdk
        versionCode = App.versionCode
        versionName = App.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    implementation(Dep.Coroutine.core)
    implementation(Dep.Coroutine.android)
    testImplementation(Dep.Coroutine.test)

    implementation(Dep.Android.core)
    implementation(Dep.Android.appcompat)
    implementation(Dep.Android.material)
    implementation(Dep.Android.constraintLayout)
    implementation(Dep.Android.fragment)

    implementation(Dep.Lifecycle.viewModel)
    implementation(Dep.Lifecycle.runtime)
    implementation(Dep.Lifecycle.savedState)
    implementation(Dep.Lifecycle.livedata)

    implementation(Dep.Dagger.hiltAndroid)
    kapt(Dep.Dagger.hiltCompiler)

    implementation(Dep.OkHttp.core)
    implementation(Dep.OkHttp.loggingInterceptor)
    implementation(Dep.OkHttp.mockWebServer)
    implementation(Dep.Retrofit.core)
    implementation(Dep.Retrofit.converterMoshi)
    implementation(Dep.Moshi.core)
    implementation(Dep.Moshi.kotlin)

    /*  implementation platform (Dep.Firebase.bom)
      implementation(Dep.Firebase.analytics)
      implementation(Dep.Firebase.messaging)

      implementation(Dep.naver_sdk)*/

    implementation(Dep.timber)

    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.AndroidTest.core)
    androidTestImplementation(Dep.AndroidTest.rules)
    androidTestImplementation(Dep.AndroidTest.runner)
    androidTestImplementation(Dep.AndroidTest.junitExt)

}