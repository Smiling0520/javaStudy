package com.hzh.study.demo.proxyDemo.dynamicProxy;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:18:46
 * @Description JDK动态代理模式
 */
public class Main {

    public static void main(String[] args) {
        SmsService smsService = (SmsService) ProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("刘总是个憨批！");
    }
}
