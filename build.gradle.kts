plugins {
    id("com.android.application") apply false
    kotlin("android") version "1.4.32" apply false
    id("org.jmailen.kotlinter") version "3.4.3"
    id("net.mbonnin.one.eight") version "0.2"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    withPluginWhenEvaluated("org.jmailen.kotlinter") {
        kotlinter {
            reporters = arrayOf("plain", "html")
        }
    }
}
