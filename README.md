# Web Engineering 2021-2022 / Lab2 RPC over HTTP (gRPC)

1. First **compile** the translator.proto file to generate the message class TranslatorGrpc used by the server and the client:
    ```sh
    ./gradlew :interface:generateProto
    ```
	
2. **Compile** and **run** the server:
    ```sh
    ./gradlew :server:build
	./gradlew :server:bootRun
    ```
	
3. **Compile** and **run** the client:
    ```sh
    ./gradlew :client:build
	./gradlew :client:bootRun
    ```
	
4. Go to http://localhost:8080/translation?input=Hello to see the result.