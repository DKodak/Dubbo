package com.ht.bootorderserviceconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ht.gmall.bean.UserAddress;
import com.ht.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-14 -11:32
 * @Email:2270301642@qq.com
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid")String userId) throws InterruptedException {
         return orderService.initOrder(userId);
    }
}
