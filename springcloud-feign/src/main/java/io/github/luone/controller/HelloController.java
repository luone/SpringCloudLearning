package io.github.luone.controller;

import io.github.luone.service.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/9/25 10:37 下午
 * @description: TODO
 * @version: V1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloFeignClient helloFeignClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloFeignClient.hello();
    }
}
