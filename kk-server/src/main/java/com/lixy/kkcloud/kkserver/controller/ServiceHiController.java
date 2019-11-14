package com.lixy.kkcloud.kkserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：MR LIS，2019/11/12
 * Copyright(C) 2019 All rights reserved.
 */
@RestController
public class ServiceHiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("进入service-hi服务的home");
        return "hi " + name + ",i am from port:" + port;
    }
}

