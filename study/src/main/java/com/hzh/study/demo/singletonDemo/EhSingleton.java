package com.hzh.study.demo.singletonDemo;

/**
 * 饿汉模式
 */
public class EhSingleton {

    private static EhSingleton ehSingleton = new EhSingleton();

    private EhSingleton () {};

    public static EhSingleton getInstance() {
        return ehSingleton;
    }
}
