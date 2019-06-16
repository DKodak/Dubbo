package com.ht.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-06-13 -21:03
 * @Email:2270301642@qq.com
 */
public class Mainapplication {

    @SuppressWarnings("resources")
    public static void main(String[] args) throws Exception {

       ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider.xml");
       System.in.read(); // 按任意键退出
    }
}

