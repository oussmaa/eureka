package com.example.eurokaserverregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurokaServerRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurokaServerRegisterApplication.class, args);
    }

}
