package com.ht.gmall.service;



import com.ht.gmall.bean.UserAddress;

import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-05 -21:01
 * @Email:2270301642@qq.com
 */
public interface UserService {

    /**
     * 根据用户id返回所有的用户地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
