package com.cyh.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

    static Logger logger = Logger.getLogger("DemoApp");
    public static void main(String[] args) {
        ThreadMXBean threadMXBean  = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo info : threadInfos) {
            System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
        }
        System.out.println("*******active threads count:" + Thread.activeCount());
    }

}
