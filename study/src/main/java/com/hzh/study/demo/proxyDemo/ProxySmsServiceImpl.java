package com.hzh.study.demo.proxyDemo;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 静态代理模式
 */
public class ProxySmsServiceImpl implements SmsService{

    private final SmsService smsService;

    public ProxySmsServiceImpl (SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send() {
        System.out.println("before method send()");
        smsService.send();
        System.out.println("after method send()");
    }
}
