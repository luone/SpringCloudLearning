package io.github.luone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/say/{params}")
    public String say(@PathVariable("params") String params) {
        return "this is nacos client, serverPort: " + port + ", params:" + params;
    }

    /**
     * 访问server中的say接口。
     * @param params
     * @return
     */
    @GetMapping(value = "/say/server/{params}")
    public String sayServer(@PathVariable("params") String params) {
        String url = "http://springcloud-nacos-server/say/" + params;
        return restTemplate.getForObject(url, String.class);
    }
}
