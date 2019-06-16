package com.ht.bootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDubbo //开启基于注解的dubbo服务
//@ImportResource("classpath:provider.xml")
@EnableDubbo(scanBasePackages = "com.ht.bootuserserviceprovider")
@EnableHystrix //开启服务熔错
public class BootUserServiceProviderApplication {
    /**
     * 1 导入依赖
     *      1）导入 dubbo-statter
     *      2）导入dubbo其他依赖
     *  2 springboot与dubbo整合
     *      1）导入dubbo-starter，在applications.properties配置dubbo属性 使用@Service【暴露服务】和@referenc【引用服务】
     *      2）保留xml文件格式
     *          导入dubbo-starter  启动类@ImportResource("classpath:provider.xml")  service不需要@service
     *       3）使用注解API的方式手动创建到容器中
     *              将每一个主键手动创建到容器中
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
