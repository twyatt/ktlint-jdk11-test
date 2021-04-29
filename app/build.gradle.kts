plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jmailen.kotlinter")
}

android {
    applyDefaults()

    defaultConfig {
        targetSdkVersion(AndroidSdk.target)
        applicationId = "com.example.ktlint.jdk11"
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(androidx.appcompat())
    implementation(kotlinx.coroutines("android"))
}
