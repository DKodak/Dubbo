package com.ht.gmall.service.impl;


import com.ht.gmall.bean.UserAddress;
import com.ht.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-05 -21:02
 * @Email:2270301642@qq.com
 *
 */
public class UserServiceImpl02 implements UserService {

    /**
     *   1 将服务提供者注册到注册中心（暴露服务）
     *       1）导入dubbo依赖并引入zookeeper的客户端（curator）
     *       2）配置服务提供者
     *
     *  2 让服务消费者去注册中心订阅提供者的ip地址
     * @param userId
     * @return
     */

    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl  new");
        System.out.println("用户id："+userId);
        UserAddress address1=new UserAddress(1,"江西赣州","1","kodak","15779797132","y");
        UserAddress address2=new UserAddress(2,"江西赣州","1","kodak","15779797132","y");
        return Arrays.asList(address1,address2);
    }
}
