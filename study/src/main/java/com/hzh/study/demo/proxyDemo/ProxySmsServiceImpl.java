package com.hzh.study.demo.proxyDemo;

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
