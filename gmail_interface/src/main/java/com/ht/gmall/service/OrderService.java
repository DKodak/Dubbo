package com.ht.gmall.service;

import com.ht.gmall.bean.UserAddress;

import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-13 -20:32
 * @Email:2270301642@qq.com
 */
public interface OrderService {
    public List<UserAddress> initOrder(String userId) throws InterruptedException;
}
