package com.hzh.study.demo.reflectionDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 反射
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取 User 类的 Class 对象并且创建 User 类实例
         */
        Class<?> targetClass = Class.forName("com.hzh.study.demo.reflectionDemo.User");
        User user = (User) targetClass.newInstance();

        /**
         * 获取 TargetObject 类中定义的所有方法
         */
        Method[] declaredMethods = targetClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method printUserName = targetClass.getDeclaredMethod("printUserName", String.class);
        printUserName.invoke(user, "刘文俊");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field age = targetClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user, 60);

        /**
         * 调用 private 方法
         */
        Method printAge = targetClass.getDeclaredMethod("printAge");
        printAge.setAccessible(true);
        printAge.invoke(user);
    }
}
