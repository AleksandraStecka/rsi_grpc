package pl.edu.pwr.rsi.grpc.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

// aplikacja spring boot dla serwera grpc
// wewnatrz C:\Users\galar\gRPC-Java-SpringBoot-Maven-HelloWorld\grpc-server\target\classes znajduja sie dwie klasy wiec obie klasy zostaly wystartowane
@SpringBootApplication
public class AppServer {

    public static void main(String... args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AppServer.class);
        builder.headless(false);
        builder.run(args);
    }
}

// po starcie serwera:
// lista dostepnych serwisow: grpcurl --plaintext localhost:9090 list
// lista dostepnych metod dla serwisu: grpcurl --plaintext localhost:9090 list pl.edu.pwr.rsi.grpc.interface.MyService
