group = "com.adrianrafo"
version = "0.0.1"

repositories {
  mavenCentral()
}

plugins {
  kotlin("jvm") version "1.3.11"
  kotlin("konan") version "1.3.11"
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
}

konan.targets = mutableListOf("linux_x64", "raspberrypi")

konanArtifacts {
  program("hello-$version") {
    enableOptimizations(true)
  }
}

