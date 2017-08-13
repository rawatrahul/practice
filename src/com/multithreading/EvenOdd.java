package com.multithreading.producerconsumer;

public class EvenOdd {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread e = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i += 2)
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }

            }
        }, "Even");
        Thread o = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Odd");
                for (int i = 1; i < 50; i += 2)
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                        try {
                            lock.notify();
                            if (i == 49) break;
                            lock.wait();
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }

            }
        }, "Odd");
        e.start();
        o.start();
    }
}