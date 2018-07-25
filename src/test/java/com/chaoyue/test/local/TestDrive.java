package com.chaoyue.test.local;

public class TestDrive {
    public static void main(String[] args) {
        TestThread t1 = new TestThread("t1");
        TestThread t2 = new TestThread("t2");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        synchronized (thread1) {
            try {
                thread1.start();
                thread1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
