package com.example.demo.Threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car {

    Lock lock = new ReentrantLock();

    public void enter(){
        lock.lock();
        System.out.println(Thread.currentThread() + " entered into car");
        lock.unlock();
    }


    //this is same as locking and unlocking in above function
    public synchronized void drive() throws InterruptedException {
        for (int i=0;i<10000;i++)  {
            System.out.println(Thread.currentThread() + " driving the car");
        }

    }


}
