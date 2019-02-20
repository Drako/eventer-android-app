plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  @Suppress("UnstableApiUsage")
  gradlePluginPortal()
}

dependencies {
  implementation("org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.17")
}
