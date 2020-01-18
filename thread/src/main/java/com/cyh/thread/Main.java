package com.cyh.thread;

import com.cyh.thread.demo.ThreadCyh;
import com.cyh.thread.demo.ThreadCyhChild;

public class Main {
    static ThreadCyh threadCyh = new ThreadCyh();
    static ThreadCyhChild threadCyhChild = new ThreadCyhChild();
    static ThreadGroup threadGroup = new ThreadGroup("thread group");
    public static void main(String[] args) {
        new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.normalMethod();
            }
        }, "normalMethod").start();

        new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.otherMethod();
            }
        }, "otherMethod").start();


    }

    static void thread() {
        new Thread(new Runnable() {
            public void run() {
                ThreadCyh.addStatic();
            }
        }).start();
    }

    static void thread1() {
        new Thread(new Runnable() {
            public void run() {
                ThreadCyh.addStatic1();
            }
        }).start();
    }

    static void thread2() {
        new Thread(new Runnable() {
            public void run() {
                threadCyh.add();
            }
        }).start();
    }

    static void thread3() {
        new Thread(new Runnable() {
            public void run() {
                threadCyh.add1();
            }
        }).start();
    }

    static void thread4() {
        new Thread(new Runnable() {
            public void run() {
                threadCyh.addMethod();
            }
        }).start();
    }

    static void thread5() {
        new Thread(new Runnable() {
            public void run() {
                threadCyh.addMethod();
            }
        }).start();
    }

    static void thread6() {
        new Thread(new Runnable() {
            public void run() {
                threadCyh.addMethod1();
            }
        }).start();
    }

    static void thread7() {
        new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.add();
            }
        }).start();
    }

    static void thread8() {
        Thread t = new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.add1();
            }
        });
        t.setPriority(10);
        t.start();
    }

    static void thread9() {
        Thread t = new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.add2();
            }
        });
        t.setPriority(1);
        t.start();
    }

    static void thread10() {
        new Thread(threadGroup, new Runnable() {
            public void run() {
                threadCyhChild.add3();
            }
        }).start();
    }
}
