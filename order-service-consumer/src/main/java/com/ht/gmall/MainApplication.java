package com.ht.gmall;

import com.ht.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-14 -9:43
 * @Email:2270301642@qq.com
 */
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService=  applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成");
        System.in.read();
    }
}
