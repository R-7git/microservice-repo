package org.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MicroserviceApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8099"));
        app.run(args);
    }
}
