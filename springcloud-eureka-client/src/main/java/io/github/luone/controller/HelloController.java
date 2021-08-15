package io.github.luone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/8/14 8:21 下午
 * @description: TODO
 * @version: V1.0
 */
@RestController
public class HelloController {
    /**
     * 当前服务的端口
     */
    @Value("${server.port}")
    private int serverPort;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world,当前服务端口：serverPort:" + serverPort;
    }
}
