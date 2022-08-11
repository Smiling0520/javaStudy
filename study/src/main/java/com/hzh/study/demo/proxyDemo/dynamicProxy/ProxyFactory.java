package com.hzh.study.demo.proxyDemo.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:11:37
 * @Description
 */
public class ProxyFactory {

    // 类加载器，用于加载代理对象。
    // 被代理类实现的一些接口；
    // 实现了 InvocationHandler 接口的对象
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new JdkProxyInterceptor(target));
    }
}
