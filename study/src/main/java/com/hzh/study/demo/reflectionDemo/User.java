package com.hzh.study.demo.reflectionDemo;

public class User {

    private String userName;

    private Integer age = 55;

    public void printUserName(String userName) {
        System.out.println(userName);
    }

    private void printAge() {
        System.out.println("刘文俊" + age + "岁了");
    }
}
