/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.controller;

import com.blockchainlove.vow.domain.HelloWorldEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zhangyu
 * @version $Id: HelloWorldController.java, v 0.1 2018年04月30日 上午7:58 zhangyu Exp $
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public HelloWorldEntity index() {
        HelloWorldEntity model = new HelloWorldEntity();
        model.setUserName("Hellp World!!!");
        model.setPassword("asdasdasd");
        return model;
    }
}