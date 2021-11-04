package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GrpcClientController {

    @Autowired
        private lateinit var grpcClientService:GrpcClientService;

    @RequestMapping("/translation")
    fun printMessage(input: String): String {
        return grpcClientService.lookup(input);
    }

}
