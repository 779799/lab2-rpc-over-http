plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter")
	implementation ("net.devh:grpc-server-spring-boot-starter:2.12.0.RELEASE")
	implementation(project(":interface"))
}