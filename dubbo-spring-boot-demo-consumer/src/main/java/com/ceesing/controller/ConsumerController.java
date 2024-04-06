package com.ceesing.controller;

import com.ceesing.dto.ProviderDTO;
import com.ceesing.dubbo.DemoService;
import com.ceesing.resp.ResultData;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 消费测试接口
 * @author zhang
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    /**
     * Dubbo远程调用注解
     * */
    @DubboReference
    private DemoService providerService;

    @GetMapping("/hello/{name}")
    public ResultData getList(@PathVariable("name") String name){
        String result = providerService.sayHello(name);
        return ResultData.success(result);
    }
}
