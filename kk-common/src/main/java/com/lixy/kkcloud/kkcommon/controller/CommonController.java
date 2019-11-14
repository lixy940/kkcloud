package com.lixy.kkcloud.kkcommon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：MR LIS，2019/11/12
 * Copyright(C) 2019 All rights reserved.
 */
@RestController
public class CommonController {
    @Value("${server.port}")
    String port;

    @GetMapping("/commonHi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}

