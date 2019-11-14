package com.lixy.kkcloud.kkeureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkEurekaApplication.class, args);
    }

}
