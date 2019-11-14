package com.lixy.kkcloud.kkclient.controller;

import com.lixy.kkcloud.kkclient.service.RibbonService;
import com.lixy.kkcloud.kkclient.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：MR LIS，2019/11/12
 * Copyright(C) 2019 All rights reserved.
 * feign client
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;


    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        System.out.println("进入service-feign服务的sayHi");
        return schedualServiceHi.sayHiFromClientOne(name);
    }




}
