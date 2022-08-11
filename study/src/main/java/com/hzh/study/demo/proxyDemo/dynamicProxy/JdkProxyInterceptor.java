package com.hzh.study.demo.proxyDemo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:07:25
 * @Description
 */
public class JdkProxyInterceptor implements InvocationHandler {

    private final Object target;

    public JdkProxyInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before send()");
        Object invoke = method.invoke(target, args);
        System.out.println("after send()");
        return invoke;
    }
}
