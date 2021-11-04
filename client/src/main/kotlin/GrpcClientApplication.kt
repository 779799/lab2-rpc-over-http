package client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
class GrpcClientApplication
    @Autowired
    private lateinit var grpcClientService:GrpcClientService;

fun main(args: Array<String>) {
    runApplication<GrpcClientApplication>(*args)
}


