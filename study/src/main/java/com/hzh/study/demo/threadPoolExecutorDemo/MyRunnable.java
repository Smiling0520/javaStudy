package com.hzh.study.demo.threadPoolExecutorDemo;

import java.util.Date;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-14 16:52:03
 * @Description
 */
public class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "开始执行任务" + name + ". Time: " + new Date());
        process();
        System.out.println("线程" + Thread.currentThread().getName() + "结束执行任务" + name + ". Time: " + new Date());
    }

    private void process() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
