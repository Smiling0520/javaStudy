package com.hzh.study.demo.proxyDemo.dynamicProxy;


/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 静态代理模式
 */
public class SmsServiceImpl implements SmsService {

    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
