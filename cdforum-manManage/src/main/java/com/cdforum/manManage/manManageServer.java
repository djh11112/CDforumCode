package com.cdforum.manManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class manManageServer {
    public static void main(String[] args) {
        SpringApplication.run(manManageServer.class);
    }
}
