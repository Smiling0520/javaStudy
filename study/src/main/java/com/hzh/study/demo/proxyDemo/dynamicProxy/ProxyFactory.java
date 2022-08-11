package com.hzh.study.demo.proxyDemo.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:11:37
 * @Description
 */
public class ProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new JdkProxyInterceptor(target));
    }
}
