rootProject.name = "eventer-android"

val knownPlugins = mapOf(
  "com.android.application" to "com.android.tools.build:gradle",
  "com.android.library" to "com.android.tools.build:gradle"
)

pluginManagement {
  repositories {
    @Suppress("UnstableApiUsage")
    gradlePluginPortal()
    google()
  }
  resolutionStrategy {
    eachPlugin {
      knownPlugins["${requested.id}"]?.let { module ->
        useModule("$module:${requested.version}")
      }
    }
  }
}
