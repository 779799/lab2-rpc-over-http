package client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import lib.TranslationResponse;
import lib.TranslationRequest;
import lib.TranslatorGrpc.TranslatorBlockingStub;
import org.springframework.stereotype.Service;
import io.grpc.StatusRuntimeException;

@Service
class GrpcClientService {

    @GrpcClient("grpc-server")
     private lateinit var  simpleStub:TranslatorBlockingStub;

    fun lookup( input:String ):String {
        try {
            val response = this.simpleStub.translation(TranslationRequest.newBuilder()
					.setLangFrom("en").setLangTo("es").setInput(input).build());
            return "Result of translating [$input] is [${response.getTranslation()}]";
        } catch (  e: StatusRuntimeException) {
            return "Something wrong is happening with the the server. Error status:" + e.status;
        }
    }

}

