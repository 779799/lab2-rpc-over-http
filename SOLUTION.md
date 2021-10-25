# Web Engineering 2021-2022 / Lab2 RPC over HTTP (Primary goal)

## System deployment
### Server
- To **check** the server:

    ```sh
    ./gradlew :server:check
    ```

- To **compile** and **build** the server:

    ```sh
    ./gradlew :server:build
    ```

- To **run** the server:

    ```sh
    ./gradlew :server:bootRun
    ```
	
### Client
Before deploying the client, the server shoud be launched.

- To **check** the client:

    ```sh
    ./gradlew :client:check
    ```

- To **compile** and **build** the client:

    ```sh
    ./gradlew :client:build
    ```

- To **run** the client:

    ```sh
    ./gradlew :client:bootRun
    ```

## Fixing the server

- Without modify anything, the client didn't receive the response from the server and showed the message:
    ```
    Something wrong is happening with the the server; fix it!
    ```
- To fix it, it's need to complete the code of the function ```translation()``` in 
      ```\lab2-rpc-over-http\server\src\main\kotlin\translator\Server.kt```:
    ```
    fun translation(@RequestPayload request: TranslationRequest): TranslationResponse = 
      TranslationResponse().apply{
              translation = "¡Tradúceme!"
          }    
    ```
- After that, the client showed :
    ```
    Result of translating [Translate me!] is [¡Tradúceme!]    
    ```
