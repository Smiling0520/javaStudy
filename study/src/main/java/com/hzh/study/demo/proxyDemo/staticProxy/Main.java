package com.hzh.study.demo.proxyDemo.staticProxy;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:18:46
 * @Description 静态代理模式
 */
public class Main {

    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        ProxySmsServiceImpl proxySmsService = new ProxySmsServiceImpl(smsService);
        proxySmsService.send();
    }
}
