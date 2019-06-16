package com.ht.bootuserserviceprovider.config;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.registry.Registry;
import com.ht.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kodak
 * @company 宏图
 * @create 2019-06-15 -15:24
 * @Email:2270301642@qq.com
 */
@Configuration
public class MyDubboConfig {
    /**
     * 配置当前服务的应用名称
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig=new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

    /**
     * 配置注册中心的位置
     * @return
     */
    @Bean
    public RegistryConfig registryConfig(){
      RegistryConfig registryConfig=new RegistryConfig();
      registryConfig.setProtocol("zookeeper");
      registryConfig.setAddress("127.0.0.1:2181");
      return registryConfig;
    }


    /**
     * 配置指定通信规则
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
    return protocolConfig;
    }

    /**
     * 配置需要暴露的service服务
     * @param userService
     * @return
     */
    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig=new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("*");
        //配置每个method的信息
         MethodConfig methodConfig=   new MethodConfig();
         methodConfig.setName("getUserAddressList");
         methodConfig.setTimeout(1000);

//         将method的信息关联到service中
        List<MethodConfig> methodConfigList=new ArrayList();
        methodConfigList.add(methodConfig);
         serviceConfig.setMethods(methodConfigList);
       return serviceConfig;
    }

    /**
     * 配置统一设置的提供方规则
     * @return
     */
    @Bean
    public ProviderConfig ProviderConfig(){
        ProviderConfig providerConfig=new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }


    /**
     * 配置连接监控中心
     * @return
     */
    @Bean
    public  MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig=new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }
}
