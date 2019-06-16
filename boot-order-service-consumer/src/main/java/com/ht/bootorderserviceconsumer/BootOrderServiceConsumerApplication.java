package com.ht.bootorderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo //开启dubbo注解
@EnableHystrix //开启服务熔错
public class BootOrderServiceConsumerApplication {
    /**
     * consumer 消费者
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }

}
