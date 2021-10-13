package io.github.luone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/10/13 7:07 下午
 * @description: TODO
 * @version: V1.0
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${user.name}")
    private String name;

    @Value("${user.password}")
    private String password;

    @GetMapping(value = "/say/config")
    public String say() {
        return "springcloud-nacos-config, name:" + name + ", password:" + password;
    }
}
