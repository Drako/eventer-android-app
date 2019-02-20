package guru.drako.eventer.gradle

import org.jetbrains.dokka.gradle.DokkaAndroidTask
import org.jetbrains.dokka.gradle.LinkMapping

fun DokkaAndroidTask.linkMapping(configure: LinkMapping.() -> Unit) {
  linkMappings.add(LinkMapping().apply(configure))
}
