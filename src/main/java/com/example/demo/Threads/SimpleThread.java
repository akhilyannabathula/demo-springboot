package com.example.demo.Threads;

public class SimpleThread extends Thread{

    @Override
    public void run(){
        System.out.println("thread starts");
        try {
            this.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread() + " ends");
    }
}
