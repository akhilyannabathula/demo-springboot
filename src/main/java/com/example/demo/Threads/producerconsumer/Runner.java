package com.example.demo.Threads.producerconsumer;

public class Runner {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();
        Consumer consumer = new Consumer(sharedQueue);
        Producer producer = new Producer(sharedQueue);

        producer.start();
        consumer.start();
    }
}
