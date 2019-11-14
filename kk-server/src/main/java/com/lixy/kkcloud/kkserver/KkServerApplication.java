package com.lixy.kkcloud.kkserver;

import com.lixy.kkcloud.kktools.utils.RegexUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class KkServerApplication {

    public static void main(String[] args) {
        boolean flag = RegexUtils.validateDate("2014-11-11");
        SpringApplication.run(KkServerApplication.class, args);
    }
}
