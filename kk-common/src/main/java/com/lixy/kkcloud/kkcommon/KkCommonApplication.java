package com.lixy.kkcloud.kkcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KkCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkCommonApplication.class, args);
    }

}
