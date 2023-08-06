plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "org.adtado.vsfe"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_20
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("jakarta.validation:jakarta.validation-api:3.0.2")
	testImplementation("org.openjdk.jmh:jmh-core:1.37")
	testImplementation("org.openjdk.jmh:jmh-generator-annprocess:1.37")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
