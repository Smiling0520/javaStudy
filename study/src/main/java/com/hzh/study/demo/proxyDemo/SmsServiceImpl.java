package com.hzh.study.demo.proxyDemo;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 静态代理模式
 */
public class SmsServiceImpl implements SmsService{

    @Override
    public void send() {
        System.out.println("send message!");
    }
}
