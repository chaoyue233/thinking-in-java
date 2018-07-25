package com.chaoyue.test.local;

public class TestThread implements Runnable {
    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (this) {          //这里的 this 为 t1
            this.notify();
        }
        System.out.println(this.name);
    }
}
