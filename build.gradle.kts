import guru.drako.eventer.gradle.*

plugins {
  id("com.android.application") version "3.1.0"
  kotlin("android") version "1.3.21"
  kotlin("android.extensions") version "1.3.21"
  id("eu.t-systems-mms.git-semver") version "0.1.0"
  id("org.jetbrains.dokka-android")
}

group = "guru.drako.eventer"

repositories {
  mavenCentral()
  jcenter()
  google()
  kotlinx()
}

dependencies {
  implementation(kotlinArtifact("stdlib-jdk7"))
  implementation(kotlinArtifact("reflect"))

  implementation(androidX(AndroidX.APPCOMPAT))
  implementation(androidX(AndroidX.CONSTRAINTLAYOUT))
  implementation(androidX(AndroidX.CORE_KTX))
  implementation(androidX(AndroidX.FRAGMENT_KTX))
  implementation(androidX(AndroidX.PREFERENCE_KTX))

  implementation(ktxCoroutines("core"))
  implementation(ktxCoroutines("android"))
}

android {
  compileSdkVersion(28)

  defaultConfig {
    minSdkVersion(17)
    targetSdkVersion(28)
    applicationId = "guru.drako.eventer.app"
    vectorDrawables.generatedDensities("hdpi", "xxhdpi")
  }

  sequenceOf("main", "test").forEach {
    sourceSets[it].java.srcDir("src/$it/kotlin")
  }

  buildTypes {
    getByName("debug") {
      isPseudoLocalesEnabled = true
    }
  }
}

tasks {
  "wrapper"(Wrapper::class) {
    gradleVersion = "5.2"
  }

  dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/../docs/"
    jdkVersion = 7
    linkMapping {
      dir = "src/main/kotlin"
      url = "https://github.com/Drako/eventer-android-app/blob/master/src/main/kotlin"
      suffix = "#L"
    }
  }
}
