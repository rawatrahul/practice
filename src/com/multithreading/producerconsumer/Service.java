package com.multithreading.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Service {
    public static void main(String[] args) {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
}
