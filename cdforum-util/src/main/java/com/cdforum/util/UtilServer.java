package com.cdforum.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UtilServer {
    public static void main(String[] args) {
        SpringApplication.run(UtilServer.class);
    }
}
