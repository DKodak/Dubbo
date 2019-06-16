package com.ht.gmall.service.impl;

import com.ht.gmall.bean.UserAddress;
import com.ht.gmall.service.OrderService;
import com.ht.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-13 -20:33
 * @Email:2270301642@qq.com
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userServicel;

    @Override
    public List<UserAddress> initOrder(String userId) throws InterruptedException {
        System.out.println(userId+"       OrderServiceImpl old");
       List<UserAddress> list= userServicel.getUserAddressList(userId);
        Thread.sleep(4000);
       return list;
    }
}
