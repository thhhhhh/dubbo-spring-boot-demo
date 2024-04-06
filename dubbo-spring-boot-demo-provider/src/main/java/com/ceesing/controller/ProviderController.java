package com.ceesing.controller;

import com.ceesing.dubbo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ProviderController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("provider say hello");
        return demoService.sayHello(name);
    }
}
