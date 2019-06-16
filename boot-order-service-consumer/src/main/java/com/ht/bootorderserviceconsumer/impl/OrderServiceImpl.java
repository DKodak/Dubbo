package com.ht.bootorderserviceconsumer.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ht.gmall.bean.UserAddress;
import com.ht.gmall.service.OrderService;
import com.ht.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-13 -20:33
 * @Email:2270301642@qq.com
 */
@Service
public class OrderServiceImpl implements OrderService {

//    roundrobin 轮询算法
//    random 默认随机算法

    @Reference(loadbalance = "random")   //dubbo直连 (url = "127.0.0.1:20880")
    UserService userServicel;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId)  {
        System.out.println(userId+"       OrderServiceImpl");
       List<UserAddress> list= userServicel.getUserAddressList(userId);
       for(UserAddress userAddress:list){
           System.out.println(userAddress.getUserAddress());
       }
       return list;
    }


    public List<UserAddress> hello(String userId){
        return Arrays.asList(new UserAddress(10,"测试地址","1","测试","15779797132","y"));
    }
}
