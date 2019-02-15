package guru.drako.eventer.gradle

import org.gradle.api.artifacts.dsl.DependencyHandler

enum class AndroidX(val version: String) {
  APPCOMPAT(version = "1.0.2"),
  CONSTRAINTLAYOUT(version = "1.1.3"),
  CORE_KTX(version = "1.0.1");
}

fun DependencyHandler.androidX(module: AndroidX) = with(module) {
  val artifact = name.toLowerCase().replace('_', '-')
  val group = "androidx." + artifact.substringBefore('-')
  return@with "$group:$artifact:$version"
}
