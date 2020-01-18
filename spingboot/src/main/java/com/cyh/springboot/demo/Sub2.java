package com.cyh.springboot.demo;

public class Sub2 extends Super {
    // 重写父类的同步方法，但不加synchronized。

    @SuppressWarnings("static-access")
    public void testMothed() {
        try {
            Thread.currentThread().sleep(3000);//为区别与父类中休眠时间，改为3秒。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(Thread.currentThread().getName() + "," + this);
    }
}
