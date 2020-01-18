package com.cyh.springboot.demo;

import java.util.logging.Logger;

public class Super {

    static Logger logger = Logger.getLogger("Super");

    // 同步方法
    @SuppressWarnings("static-access")
    public synchronized void testMothed() {
        try {
            Thread.currentThread().sleep(5000);//休眠5秒。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(Thread.currentThread().getName() + "," + this);
    }

}