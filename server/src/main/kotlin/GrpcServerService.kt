package server;

import io.grpc.stub.StreamObserver;
import lib.TranslationResponse;
import lib.TranslationRequest;
import lib.TranslatorGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
class GrpcServerService : TranslatorGrpc.TranslatorImplBase() {

    override
    fun translation( req:TranslationRequest, responseObserver:StreamObserver<TranslationResponse>) {
        val reply = TranslationResponse.newBuilder().setTranslation("Hola").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
