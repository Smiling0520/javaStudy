package com.hzh.study.demo.proxyDemo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-11 23:07:25
 * @Description 在 Java 动态代理机制中 InvocationHandler 接口和 Proxy 类是核心。
 */
public class JdkProxyInterceptor implements InvocationHandler {

    private final Object target;

    public JdkProxyInterceptor(Object target) {
        this.target = target;
    }

    /*
     * @description:你通过Proxy 类的 newProxyInstance() 创建的代理对象在调用方法的时候，
     * 实际会调用到实现InvocationHandler 接口的类的 invoke()方法。 你可以在 invoke() 方法中自定义处理逻辑，比如在方法执行前后做什么事情
     * @author: huzhenhua
     * @date: 2022/8/11 23:40 
     * @param proxy 动态生成的代理类
     * @param method 与代理类对象调用的方法相对应
     * @param args 当前 method 方法的参数
     * @return: java.lang.Object
     **/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before send()");
        Object invoke = method.invoke(target, args);
        System.out.println("after send()");
        return invoke;
    }
}
