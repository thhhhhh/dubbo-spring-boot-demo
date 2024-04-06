package com.ceesing;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//指定dubbo扫描的包
@EnableDubbo(scanBasePackages = "com.ceesing.service")
public class ProviderApplication9000 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication9000.class, args);
    }
}