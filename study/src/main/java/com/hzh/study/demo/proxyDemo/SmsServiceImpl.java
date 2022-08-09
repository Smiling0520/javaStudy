package com.hzh.study.demo.proxyDemo;

public class SmsServiceImpl implements SmsService{

    @Override
    public void send() {
        System.out.println("send message!");
    }
}
