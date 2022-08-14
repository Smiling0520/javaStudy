package com.hzh.study.demo.singletonDemo;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 懒汉模式
 */
public class LhSingleton {

    private static LhSingleton lhSingleton = null;

    // 无参构造私有化
    private LhSingleton() {};

    public static LhSingleton getInstance() {
        if (lhSingleton == null) {
            synchronized (LhSingleton.class) {
                if (lhSingleton == null) {
                    lhSingleton = new LhSingleton();
                }
            }
        }
        return lhSingleton;
    }
}
