import com.google.protobuf.gradle.*

val protobufVersion = "3.14.0"
val protobufPluginVersion = "0.8.14"
val gRPCVersion = "1.35.0"

plugins {
    id("java-library")
    id("com.google.protobuf")
	
}

dependencies {
    implementation ("io.grpc:grpc-netty-shaded:$gRPCVersion")
    implementation ("io.grpc:grpc-protobuf:$gRPCVersion")
    implementation ("io.grpc:grpc-stub:$gRPCVersion")
    if (JavaVersion.current().isJava9Compatible()) {
        implementation ("jakarta.annotation:jakarta.annotation-api")
    }
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:${protobufVersion}"
	}
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:${gRPCVersion}"
		}
		generateProtoTasks {
			all().forEach {
				it.plugins {
					id("grpc")
				}
			}
		}
	}
}
