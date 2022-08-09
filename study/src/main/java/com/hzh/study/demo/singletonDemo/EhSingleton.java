package com.hzh.study.demo.singletonDemo;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 饿汉模式
 */
public class EhSingleton {

    private static EhSingleton ehSingleton = new EhSingleton();

    // 无参构造私有化
    private EhSingleton () {};

    public static EhSingleton getInstance() {
        return ehSingleton;
    }
}
