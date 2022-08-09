package com.hzh.study.demo.singletonDemo;

/**
 * 懒汉模式
 */
public class LhSingleton {

    private static LhSingleton lhSingleton = null;

    // 无参构造私有化
    private LhSingleton() {};

    public static LhSingleton getInstance() {
        if (lhSingleton == null) {
            lhSingleton = new LhSingleton();
        }
        return lhSingleton;
    }
}
