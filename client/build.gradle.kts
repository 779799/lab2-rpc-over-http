plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
	implementation ("net.devh:grpc-client-spring-boot-starter:2.12.0.RELEASE")
	implementation(project(":interface"))
}