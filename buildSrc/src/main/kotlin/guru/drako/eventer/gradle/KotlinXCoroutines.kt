package guru.drako.eventer.gradle

import org.gradle.api.artifacts.dsl.DependencyHandler

const val KOTLINX_COROUTINES_VERSION = "1.1.1"

fun DependencyHandler.ktxCoroutines(module: String): String {
  return "org.jetbrains.kotlinx:kotlinx-coroutines-$module:$KOTLINX_COROUTINES_VERSION"
}
