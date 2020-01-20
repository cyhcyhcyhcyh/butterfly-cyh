package com.cyh.thread.demo;

public class ThreadCyh {
    public synchronized static void addStatic() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("addStatic");
    }
    public synchronized static void addStatic1() {
        System.out.println("addStatic1");
    }
    public static void addStatic2() {
        System.out.println("addStatic2");
    }

    public synchronized void add() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("add");
    }

    public synchronized void add1() {
        System.out.println("add1," + Thread.currentThread().getName());
    }

    public void addMethod() {
        System.out.println("addMethod");

        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("addMethod static");
        }
    }

    public void addMethod1() {
        System.out.println("addMethod1");
        synchronized (this) {
            System.out.println("addMethod1 static");
        }
    }

    public synchronized void normalMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public synchronized void otherMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }


}
