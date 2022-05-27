package pl.edu.pwr.rsi.grpc.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

// aplikacja spring boot dla klienta grpc
// wewnatrz C:\Users\galar\gRPC-Java-SpringBoot-Maven-HelloWorld\grpc-client\target\classes znajduja sie dwie klasy wiec obie klasy zostaly wystartowane
@SpringBootApplication
public class AppClient {

    public static void main(String... args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AppClient.class);
        builder.headless(false);
        builder.run(args);
    }

}
