plugins {
  // Apply the Kotlin JVM plugin to add support for Kotlin.
  id("org.jetbrains.kotlin.jvm") version "1.3.50"
  // Apply the java-library plugin for API and implementation separation.
  `java-library`
}

repositories {
  jcenter()
}

version = "1.0"

dependencies {
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
  //Biblioteca para o utilitário
  implementation("org.cups4j:cups4j:0.7.6")
  implementation("org.imgscalr:imgscalr-lib:4.2")
  implementation("khttp:khttp:1.0.0")
}
