package com.hzh.study.demo.proxyDemo;

public class Main {

    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        ProxySmsServiceImpl proxySmsService = new ProxySmsServiceImpl(smsService);
        proxySmsService.send();
    }
}
