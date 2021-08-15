package io.github.luone.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/8/15 12:06 上午
 * @description: TODO
 * @version: V1.0
 */
@Configuration
public class MyConfig {
    /**
     * 配置一个 RestTemplate
     * 添加该注解后@LoadBalanced，可以使得 RestTemplate 拥有负载均衡能力
     *
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule();
//    }
}
