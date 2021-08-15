package io.github.luone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/8/15 12:23 上午
 * @description: TODO
 * @version: V1.0
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForEntity("http://SPRINGCLOUD-EUREKA-CLIENT/hello", String.class).getBody();
    }
}
