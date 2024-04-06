package com.ceesing.service;

import com.ceesing.dubbo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

//@DubboService 注解，通过这个配置可以基于 Spring Boot 去发布 Dubbo 服务
@DubboService
public class ProviderServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello\t" + name;
    }
}
