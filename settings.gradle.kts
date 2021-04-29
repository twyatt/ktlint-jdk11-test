pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.namespace) {
                "com.android" -> useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}

include(":app")
