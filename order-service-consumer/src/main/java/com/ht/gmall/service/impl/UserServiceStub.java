package com.ht.gmall.service.impl;

import com.ht.gmall.bean.UserAddress;
import com.ht.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Kodak
 * @company 宏图
 * @create 2019-06-15 -15:03
 * @Email:2270301642@qq.com
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    /**
     * 传入的userService是远程的代理对象
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub  本地存根   ");
       if (!StringUtils.isEmpty(userId)){
           return userService.getUserAddressList(userId);
       }
       return null;
    }
}
