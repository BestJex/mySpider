package com.spider.demo.thread.test;

public class MyThread01 implements Runnable {

    private SyschronizeTest test;

    MyThread01(SyschronizeTest syschronizeTest){
        test = syschronizeTest;
    }

    @Override
    public void run(){
        try {
            System.out.println("Mythread01 进入线程名:"+Thread.currentThread().getName());
//            SyschronizeTest test = new SyschronizeTest();
            test.fun01();

//            System.out.println("线程执行完fun01 线程名:"+Thread.currentThread().getName());
//            SyschronizeTest.fun02();
//            System.out.println("线程执行完fun02  线程名:"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
