package com.liuliu.hello.service.impl;

import com.liuliu.hello.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: liulei
 * @Time: 2022/1/4 14:40
 * @Description
 */

@Service
public class HelloService implements IHelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
