package io.github.luone.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description
 *
 * @author luone
 * @createTime: 2021/9/25 10:32 下午
 * @description: TODO
 * @version: V1.0
 */
@FeignClient("springcloud-eureka-client")
public interface HelloFeignClient {
    /**
     * 调用hello接口
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
