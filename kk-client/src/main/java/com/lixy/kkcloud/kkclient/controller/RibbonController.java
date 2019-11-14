package com.lixy.kkcloud.kkclient.controller;

import com.lixy.kkcloud.kkclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：MR LIS，2019/11/13
 * Copyright(C) 2019 All rights reserved.
 */
@RestController
public class RibbonController {


    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    public String ribbon(@RequestParam String name) {
        System.out.println("进入service-feign服务的ribbon");
        return ribbonService.hiService(name);
    }
}
