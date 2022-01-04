package com.liuliu.hello.controller;

import com.liuliu.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @Author: liulei
 * @Time: 2022/1/4 14:40
 * @Description
 */
@RestController
@RequestMapping(path = "hello")
public class HelloController {

    @Autowired
    IHelloService helloService;

    @GetMapping(path = "/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloService.hello(name);
    }
}
