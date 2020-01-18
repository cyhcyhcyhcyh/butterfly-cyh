package com.cyh.thread.demo;

public class ThreadCyhChild extends ThreadCyh {

    @Override
    public synchronized void add1() {
        System.out.println("child add1");
    }
    public synchronized void add2() {
        System.out.println("child add2");
    }
    public void add3() {
        Thread[] threads = new Thread[10];
        Thread.enumerate(threads);
        for(Thread thread : threads) {
            System.out.println(thread.getName());
        }
        System.out.println("child add3");
    }
}
