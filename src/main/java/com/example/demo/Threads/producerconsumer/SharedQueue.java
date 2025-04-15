package com.example.demo.Threads.producerconsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedQueue {
    Queue<Integer> queue = new ArrayDeque<>(5);

    public synchronized void produce(int val){
        while (queue.size() == 5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("produced value" + val);
        queue.offer(val);
        notify();
    }

    public synchronized int consume(){
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int val = queue.remove();
        System.out.println("consumed val"+val);
        notify();
        return val;
    }

}
