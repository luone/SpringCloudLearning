package io.github.luone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/10/13 4:55 下午
 * @description: TODO
 * @version: V1.0
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/say/{params}")
    public String say(@PathVariable("params") String params) {
        return "this is nacos server, serverPort: " + port + ", params:" + params;
    }
}
